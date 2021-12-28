/**
 * Copyright (c) 2020, Saalfeld Lab, HHMI Janelia
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

// auto-generated, do not modify!

@file:Suppress("UNCHECKED_CAST")

package org.ntakt

import kotlin.Suppress
import kotlin.jvm.JvmName
import net.imglib2.type.Type
import net.imglib2.type.numeric.NumericType
import net.imglib2.type.numeric.RealType
import net.imglib2.type.numeric.integer.ByteType
import net.imglib2.type.numeric.integer.IntType
import net.imglib2.type.numeric.integer.LongType
import net.imglib2.type.numeric.integer.ShortType
import net.imglib2.type.numeric.integer.UnsignedByteType
import net.imglib2.type.numeric.integer.UnsignedIntType
import net.imglib2.type.numeric.integer.UnsignedLongType
import net.imglib2.type.numeric.integer.UnsignedShortType
import net.imglib2.type.numeric.real.DoubleType
import net.imglib2.type.numeric.real.FloatType
import net.imglib2.type.operators.Sub
import net.imglib2.RealRandomAccessible as RRA

operator fun <T : NumericType<T>> RRA<T>.unaryMinus() =
    convert(type) { s, t -> t.set(s); t.mul(-1.0) }

@JvmName(name = "minus_1")
operator fun <T> RRA<T>.minus(that: RRA<T>): RRA<T> where T : Type<T>, T : Sub<T> {
  return convert(that, type, BiConverterMinus.instance<T>())
}

@JvmName(name = "minus_2")
operator fun RRA<RealType<*>>.minus(that: RRA<RealType<*>>): RRA<RealType<*>> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as? RRA<RealType<*>> ?:
    error("Arithmetic operator - (minus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "minus_3")
operator fun RRA<DoubleType>.minus(that: RRA<FloatType>): RRA<DoubleType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<DoubleType>

@JvmName(name = "minus_4")
operator fun RRA<FloatType>.minus(that: RRA<DoubleType>): RRA<DoubleType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<DoubleType>

@JvmName(name = "minus_5")
operator fun RRA<DoubleType>.minus(that: RRA<LongType>): RRA<DoubleType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<DoubleType>

@JvmName(name = "minus_6")
operator fun RRA<LongType>.minus(that: RRA<DoubleType>): RRA<DoubleType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<DoubleType>

@JvmName(name = "minus_7")
operator fun RRA<DoubleType>.minus(that: RRA<IntType>): RRA<DoubleType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<DoubleType>

@JvmName(name = "minus_8")
operator fun RRA<IntType>.minus(that: RRA<DoubleType>): RRA<DoubleType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<DoubleType>

@JvmName(name = "minus_9")
operator fun RRA<DoubleType>.minus(that: RRA<ShortType>): RRA<DoubleType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<DoubleType>

@JvmName(name = "minus_10")
operator fun RRA<ShortType>.minus(that: RRA<DoubleType>): RRA<DoubleType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<DoubleType>

@JvmName(name = "minus_11")
operator fun RRA<DoubleType>.minus(that: RRA<ByteType>): RRA<DoubleType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<DoubleType>

@JvmName(name = "minus_12")
operator fun RRA<ByteType>.minus(that: RRA<DoubleType>): RRA<DoubleType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<DoubleType>

@JvmName(name = "minus_13")
operator fun RRA<DoubleType>.minus(that: RRA<UnsignedLongType>): RRA<DoubleType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<DoubleType>

@JvmName(name = "minus_14")
operator fun RRA<UnsignedLongType>.minus(that: RRA<DoubleType>): RRA<DoubleType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<DoubleType>

@JvmName(name = "minus_15")
operator fun RRA<DoubleType>.minus(that: RRA<UnsignedIntType>): RRA<DoubleType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<DoubleType>

@JvmName(name = "minus_16")
operator fun RRA<UnsignedIntType>.minus(that: RRA<DoubleType>): RRA<DoubleType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<DoubleType>

@JvmName(name = "minus_17")
operator fun RRA<DoubleType>.minus(that: RRA<UnsignedShortType>): RRA<DoubleType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<DoubleType>

@JvmName(name = "minus_18")
operator fun RRA<UnsignedShortType>.minus(that: RRA<DoubleType>): RRA<DoubleType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<DoubleType>

@JvmName(name = "minus_19")
operator fun RRA<DoubleType>.minus(that: RRA<UnsignedByteType>): RRA<DoubleType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<DoubleType>

@JvmName(name = "minus_20")
operator fun RRA<UnsignedByteType>.minus(that: RRA<DoubleType>): RRA<DoubleType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<DoubleType>

@JvmName(name = "minus_21")
operator fun RRA<FloatType>.minus(that: RRA<LongType>): RRA<FloatType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<FloatType>

@JvmName(name = "minus_22")
operator fun RRA<LongType>.minus(that: RRA<FloatType>): RRA<FloatType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<FloatType>

@JvmName(name = "minus_23")
operator fun RRA<FloatType>.minus(that: RRA<IntType>): RRA<FloatType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<FloatType>

@JvmName(name = "minus_24")
operator fun RRA<IntType>.minus(that: RRA<FloatType>): RRA<FloatType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<FloatType>

@JvmName(name = "minus_25")
operator fun RRA<FloatType>.minus(that: RRA<ShortType>): RRA<FloatType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<FloatType>

@JvmName(name = "minus_26")
operator fun RRA<ShortType>.minus(that: RRA<FloatType>): RRA<FloatType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<FloatType>

@JvmName(name = "minus_27")
operator fun RRA<FloatType>.minus(that: RRA<ByteType>): RRA<FloatType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<FloatType>

@JvmName(name = "minus_28")
operator fun RRA<ByteType>.minus(that: RRA<FloatType>): RRA<FloatType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<FloatType>

@JvmName(name = "minus_29")
operator fun RRA<FloatType>.minus(that: RRA<UnsignedLongType>): RRA<FloatType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<FloatType>

@JvmName(name = "minus_30")
operator fun RRA<UnsignedLongType>.minus(that: RRA<FloatType>): RRA<FloatType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<FloatType>

@JvmName(name = "minus_31")
operator fun RRA<FloatType>.minus(that: RRA<UnsignedIntType>): RRA<FloatType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<FloatType>

@JvmName(name = "minus_32")
operator fun RRA<UnsignedIntType>.minus(that: RRA<FloatType>): RRA<FloatType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<FloatType>

@JvmName(name = "minus_33")
operator fun RRA<FloatType>.minus(that: RRA<UnsignedShortType>): RRA<FloatType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<FloatType>

@JvmName(name = "minus_34")
operator fun RRA<UnsignedShortType>.minus(that: RRA<FloatType>): RRA<FloatType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<FloatType>

@JvmName(name = "minus_35")
operator fun RRA<FloatType>.minus(that: RRA<UnsignedByteType>): RRA<FloatType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<FloatType>

@JvmName(name = "minus_36")
operator fun RRA<UnsignedByteType>.minus(that: RRA<FloatType>): RRA<FloatType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<FloatType>

@JvmName(name = "minus_37")
operator fun RRA<LongType>.minus(that: RRA<IntType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_38")
operator fun RRA<IntType>.minus(that: RRA<LongType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_39")
operator fun RRA<LongType>.minus(that: RRA<ShortType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_40")
operator fun RRA<ShortType>.minus(that: RRA<LongType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_41")
operator fun RRA<LongType>.minus(that: RRA<ByteType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_42")
operator fun RRA<ByteType>.minus(that: RRA<LongType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_43")
operator fun RRA<LongType>.minus(that: RRA<UnsignedLongType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_44")
operator fun RRA<UnsignedLongType>.minus(that: RRA<LongType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_45")
operator fun RRA<LongType>.minus(that: RRA<UnsignedIntType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_46")
operator fun RRA<UnsignedIntType>.minus(that: RRA<LongType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_47")
operator fun RRA<LongType>.minus(that: RRA<UnsignedShortType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_48")
operator fun RRA<UnsignedShortType>.minus(that: RRA<LongType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_49")
operator fun RRA<LongType>.minus(that: RRA<UnsignedByteType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_50")
operator fun RRA<UnsignedByteType>.minus(that: RRA<LongType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_51")
operator fun RRA<IntType>.minus(that: RRA<ShortType>): RRA<IntType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<IntType>

@JvmName(name = "minus_52")
operator fun RRA<ShortType>.minus(that: RRA<IntType>): RRA<IntType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<IntType>

@JvmName(name = "minus_53")
operator fun RRA<IntType>.minus(that: RRA<ByteType>): RRA<IntType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<IntType>

@JvmName(name = "minus_54")
operator fun RRA<ByteType>.minus(that: RRA<IntType>): RRA<IntType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<IntType>

@JvmName(name = "minus_55")
operator fun RRA<IntType>.minus(that: RRA<UnsignedLongType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_56")
operator fun RRA<UnsignedLongType>.minus(that: RRA<IntType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_57")
operator fun RRA<IntType>.minus(that: RRA<UnsignedIntType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_58")
operator fun RRA<UnsignedIntType>.minus(that: RRA<IntType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_59")
operator fun RRA<IntType>.minus(that: RRA<UnsignedShortType>): RRA<IntType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<IntType>

@JvmName(name = "minus_60")
operator fun RRA<UnsignedShortType>.minus(that: RRA<IntType>): RRA<IntType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<IntType>

@JvmName(name = "minus_61")
operator fun RRA<IntType>.minus(that: RRA<UnsignedByteType>): RRA<IntType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<IntType>

@JvmName(name = "minus_62")
operator fun RRA<UnsignedByteType>.minus(that: RRA<IntType>): RRA<IntType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<IntType>

@JvmName(name = "minus_63")
operator fun RRA<ShortType>.minus(that: RRA<ByteType>): RRA<ShortType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<ShortType>

@JvmName(name = "minus_64")
operator fun RRA<ByteType>.minus(that: RRA<ShortType>): RRA<ShortType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<ShortType>

@JvmName(name = "minus_65")
operator fun RRA<ShortType>.minus(that: RRA<UnsignedLongType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_66")
operator fun RRA<UnsignedLongType>.minus(that: RRA<ShortType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_67")
operator fun RRA<ShortType>.minus(that: RRA<UnsignedIntType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_68")
operator fun RRA<UnsignedIntType>.minus(that: RRA<ShortType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_69")
operator fun RRA<ShortType>.minus(that: RRA<UnsignedShortType>): RRA<IntType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<IntType>

@JvmName(name = "minus_70")
operator fun RRA<UnsignedShortType>.minus(that: RRA<ShortType>): RRA<IntType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<IntType>

@JvmName(name = "minus_71")
operator fun RRA<ShortType>.minus(that: RRA<UnsignedByteType>): RRA<ShortType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<ShortType>

@JvmName(name = "minus_72")
operator fun RRA<UnsignedByteType>.minus(that: RRA<ShortType>): RRA<ShortType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<ShortType>

@JvmName(name = "minus_73")
operator fun RRA<ByteType>.minus(that: RRA<UnsignedLongType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_74")
operator fun RRA<UnsignedLongType>.minus(that: RRA<ByteType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_75")
operator fun RRA<ByteType>.minus(that: RRA<UnsignedIntType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_76")
operator fun RRA<UnsignedIntType>.minus(that: RRA<ByteType>): RRA<LongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<LongType>

@JvmName(name = "minus_77")
operator fun RRA<ByteType>.minus(that: RRA<UnsignedShortType>): RRA<IntType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<IntType>

@JvmName(name = "minus_78")
operator fun RRA<UnsignedShortType>.minus(that: RRA<ByteType>): RRA<IntType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<IntType>

@JvmName(name = "minus_79")
operator fun RRA<ByteType>.minus(that: RRA<UnsignedByteType>): RRA<ShortType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<ShortType>

@JvmName(name = "minus_80")
operator fun RRA<UnsignedByteType>.minus(that: RRA<ByteType>): RRA<ShortType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<ShortType>

@JvmName(name = "minus_81")
operator fun RRA<UnsignedLongType>.minus(that: RRA<UnsignedIntType>): RRA<UnsignedLongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<UnsignedLongType>

@JvmName(name = "minus_82")
operator fun RRA<UnsignedIntType>.minus(that: RRA<UnsignedLongType>): RRA<UnsignedLongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<UnsignedLongType>

@JvmName(name = "minus_83")
operator fun RRA<UnsignedLongType>.minus(that: RRA<UnsignedShortType>): RRA<UnsignedLongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<UnsignedLongType>

@JvmName(name = "minus_84")
operator fun RRA<UnsignedShortType>.minus(that: RRA<UnsignedLongType>): RRA<UnsignedLongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<UnsignedLongType>

@JvmName(name = "minus_85")
operator fun RRA<UnsignedLongType>.minus(that: RRA<UnsignedByteType>): RRA<UnsignedLongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<UnsignedLongType>

@JvmName(name = "minus_86")
operator fun RRA<UnsignedByteType>.minus(that: RRA<UnsignedLongType>): RRA<UnsignedLongType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<UnsignedLongType>

@JvmName(name = "minus_87")
operator fun RRA<UnsignedIntType>.minus(that: RRA<UnsignedShortType>): RRA<UnsignedIntType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<UnsignedIntType>

@JvmName(name = "minus_88")
operator fun RRA<UnsignedShortType>.minus(that: RRA<UnsignedIntType>): RRA<UnsignedIntType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<UnsignedIntType>

@JvmName(name = "minus_89")
operator fun RRA<UnsignedIntType>.minus(that: RRA<UnsignedByteType>): RRA<UnsignedIntType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<UnsignedIntType>

@JvmName(name = "minus_90")
operator fun RRA<UnsignedByteType>.minus(that: RRA<UnsignedIntType>): RRA<UnsignedIntType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<UnsignedIntType>

@JvmName(name = "minus_91")
operator fun RRA<UnsignedShortType>.minus(that: RRA<UnsignedByteType>): RRA<UnsignedShortType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<UnsignedShortType>

@JvmName(name = "minus_92")
operator fun RRA<UnsignedByteType>.minus(that: RRA<UnsignedShortType>): RRA<UnsignedShortType> =
    RealRandomAccessibleArithmeticMinusExtensionsJava.minus(this, that) as RRA<UnsignedShortType>
