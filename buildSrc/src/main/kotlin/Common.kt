import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import net.imglib2.*
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.integer.*
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import net.imglib2.type.operators.Add
import net.imglib2.type.operators.Div
import net.imglib2.type.operators.Mul
import net.imglib2.type.operators.Sub
import org.gradle.api.tasks.OutputFile
import java.io.File
import kotlin.reflect.KClass

val packageName = "org.ntakt"

val primitiveTypes = arrayOf(
        Byte::class,
        Short::class,
        Int::class,
        Long::class,
        Float::class,
        Double::class
)

val outputDir = File("src/main/kotlin")
val outputDirJava = File("src/main/java")

val accessibles = listOf(
    RandomAccessible::class,
    RandomAccessibleInterval::class,
    RealRandomAccessible::class,
    RealRandomAccessibleRealInterval::class
//    IterableInterval::class
)

val containersClasses = accessibles.associateBy { it.simpleName!!.filter { n -> n.isUpperCase() } }

val containers = containersClasses.mapValues { it.value.asTypeName() }

val extensionTypes = accessibles.map { it.simpleName!! }

val abbreviationToExtensionTypeMapping = extensionTypes.associateBy({ it.filter { n -> n.isUpperCase() } }, { it })

fun getTypeFileMapping(extensionIdentifier: String) = abbreviationToExtensionTypeMapping
        .mapValues { "${it.value}${extensionIdentifier}Extensions" }
        .mapValues { (it.value to outputDir.resolve("${it.value}.kt")) }

object arithmetics {
    enum class Operator(val operation: String, val operatorName: String, val type: KClass<*>) {
        PLUS("plus", "+", Add::class),
        MINUS("minus", "-", Sub::class),
        TIMES("times", "*", Mul::class),
        DIV("div", "/", Div::class);

        operator fun component1() = operation
        operator fun component2() = operatorName
        operator fun component3() = type
    }
}

fun TypeVariableName.recursiveGeneric(vararg type: KClass<*>) = recursiveGeneric(*type.map { it.asTypeName() }.toTypedArray())
fun TypeVariableName.recursiveGeneric(vararg type: ClassName) = TypeVariableName(name, type.map { it.parameterizedBy(this) })
fun String.genericAndBounded(vararg type: KClass<*>) = genericAndBounded(*type.map { it.asTypeName() }.toTypedArray())
fun String.genericAndBounded(vararg type: ClassName) = TypeVariableName(this).let { it to it.recursiveGeneric(*type) }

fun typedFuncSpecBuilder(name: String, receiver: TypeName, vararg typeVariable: TypeVariableName)
        = FunSpec.builder(name).receiver(receiver).addTypeVariables(typeVariable.map { it })