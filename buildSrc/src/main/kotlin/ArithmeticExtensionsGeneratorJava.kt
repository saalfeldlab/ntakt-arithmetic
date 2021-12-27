import com.squareup.javapoet.*
import net.imglib2.type.numeric.RealType
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import javax.lang.model.element.Modifier

fun generateArithmeticExtensionsJava(`as`: String, className: String, operator: arithmetics.OperatorName): JavaFile {
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
//    kotlinFile.addAliasedImport(container, `as`)
//    kotlinFile.addUnaryPlusMinus(container, operator.name)
//    val (name, operatorName, type) = operator
//    var index = 0
//    kotlinFile.addFunction(generatePlusSameGenericTypes(name = name, operator = operatorName, container = container, t = type, jvmName = "${name}_${++index}"))
//    kotlinFile.addFunction(generateArithmeticOperatorStarProjection(name, operatorName, container, jvmName = "${name}_${++index}"))
//    return StringBuilder().also { sb -> kotlinFile.build().writeTo(sb) }.toString()
}

fun MethodSpec.Builder.makeArithmeticMethod(container: Class<*>, operator: arithmetics.OperatorName): MethodSpec.Builder {
    val realTypeWildCard = WildcardTypeName.subtypeOf(RealType::class.java)
    val containerClassName = ClassName.get(container)
    val containerSimpleName = container.simpleName
    val parameterizedContainerName = ParameterizedTypeName.get(containerClassName, realTypeWildCard)
    fun makeContainerSpec(name: String) = ParameterSpec.builder(parameterizedContainerName, name, Modifier.FINAL).build()

    addModifiers(Modifier.PUBLIC, Modifier.STATIC)
    addParameter(makeContainerSpec("thiz"))
    addParameter(makeContainerSpec("that"))
    returns(parameterizedContainerName)
    val getType = "getType" // "${containerSimpleName}ExtensionsKt.getType"
    val asType = "asType" // "${containerSimpleName}ExtensionsKt.asType"
    val operation = "${operator.name}_1" // "${containerSimpleName}Arithmetic${operator.name.capitalize()}ExtensionsKt.${operator.name}"
    val codeBlock = CodeBlock
        .builder()
        .also { cb ->
            for (t1 in arithmeticTypes.map { it.first })
                for (t2 in arithmeticTypes.map { it.first }) {
                    val o = arithmeticTypeCombinationsMap[t1 to t2] ?: run { require(t1 == t2); t1 }
                    cb.add(
                        "if ($getType(thiz) instanceof \$T && $getType(that) instanceof \$T) return $operation($asType(thiz, new \$T()), $asType(that, new \$T()));\n",
                        t1.java,
                        t2.java,
                        o.java,
                        o.java
                    )
                }
            cb.add("return null;")
        }
        .add("\n\n")
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