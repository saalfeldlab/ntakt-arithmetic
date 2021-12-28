import com.squareup.javapoet.*
import net.imglib2.type.numeric.RealType
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import javax.lang.model.element.Modifier

fun generateArithmeticExtensionsJava(`as`: String, className: String, operator: arithmetics.Operator): JavaFile {
    val container = containersClasses[`as`] ?: error("Key `$`as`' not present in $containersClasses")
    val containerSimpleName = container.java.simpleName


    val method = MethodSpec
        .methodBuilder(operator.name)
        .makeArithmeticMethod(container.java, operator)
        .build()
    val javaClass = TypeSpec
        .classBuilder(className)
        .addModifiers(Modifier.PUBLIC)
        .addMethod(method)
        .build()
    return JavaFile
        .builder(packageName, javaClass)
        .addStaticImport(ClassName.get(packageName, "${containerSimpleName}ExtensionsKt"), "getType")
        .addStaticImport(ClassName.get(packageName, "${containerSimpleName}ConverterExtensionsKt"), "asType")
        .addStaticImport(ClassName.get(packageName, "${containerSimpleName}Arithmetic${operator.name.capitalize()}ExtensionsKt"), "${operator.name}_1")
        .build()
}

fun MethodSpec.Builder.makeArithmeticMethod(container: Class<*>, operator: arithmetics.Operator): MethodSpec.Builder {
    val realTypeClassName = ClassName.get(RealType::class.java)
    val realTypeWildCard = WildcardTypeName.subtypeOf(RealType::class.java)
    val containerClassName = ClassName.get(container)
    val containerSimpleName = container.simpleName
    val parameterizedContainerName = ParameterizedTypeName.get(containerClassName, realTypeWildCard)
    fun makeContainerSpec(name: String) = ParameterSpec.builder(parameterizedContainerName, name, Modifier.FINAL).build()

    val thiz = "thiz"
    val that = "that"
    val getType = "getType"
    val asType = "asType"
    val operation = "${operator.operation}_1"

    addModifiers(Modifier.PUBLIC, Modifier.STATIC)
    addParameter(makeContainerSpec(thiz))
    addParameter(makeContainerSpec(that))
    returns(parameterizedContainerName)
    val codeBlock = CodeBlock
        .builder()
        .add("final \$T rt1 = $getType($thiz);\n", realTypeClassName)
        .add("final \$T rt2 = $getType($that);\n", realTypeClassName)
        .add("final \$T resultType = ArithmeticTypes.ResultType.get(rt1, rt2);\n", realTypeClassName)
        .add("return $operation($asType(thiz, resultType), $asType(that, resultType));\n\n")
        .build()
    return this.addCode(codeBlock)
}

fun JavaFile.writeSourceFile(header: String?) {
    val sourceString = StringBuilder().also { sb -> header?.let { sb.append(it) }; this.writeTo(sb) }.toString()
    val file = getFilePathFor(typeSpec.name)
    Files.createDirectories(file.parent)
    Files.write(file, sourceString.toByteArray(Charsets.UTF_8))
}

fun getFilePathFor(className: String): Path {
    val packageComponents = packageName.split(literalDotRegex).toTypedArray()
    val targetDirectory = Paths.get(outputDirJava.absolutePath, *packageComponents)
    return targetDirectory.resolve("$className.java")
}

private val literalDotRegex ="\\.".toRegex()