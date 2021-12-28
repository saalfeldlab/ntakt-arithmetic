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
import net.imglib2.type.operators.Div
import net.imglib2.RandomAccessible as RA

@JvmName(name = "div_1")
operator fun <T> RA<T>.div(that: RA<T>): RA<T> where T : Type<T>, T : Div<T> {
  return convert(that, type, BiConverterDiv.instance<T>())
}

@JvmName(name = "div_2")
operator fun RA<RealType<*>>.div(that: RA<RealType<*>>): RA<RealType<*>> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as? RA<RealType<*>> ?:
    error("Arithmetic operator / (div) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "div_3")
operator fun RA<DoubleType>.div(that: RA<FloatType>): RA<DoubleType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<DoubleType>

@JvmName(name = "div_4")
operator fun RA<FloatType>.div(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<DoubleType>

@JvmName(name = "div_5")
operator fun RA<DoubleType>.div(that: RA<LongType>): RA<DoubleType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<DoubleType>

@JvmName(name = "div_6")
operator fun RA<LongType>.div(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<DoubleType>

@JvmName(name = "div_7")
operator fun RA<DoubleType>.div(that: RA<IntType>): RA<DoubleType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<DoubleType>

@JvmName(name = "div_8")
operator fun RA<IntType>.div(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<DoubleType>

@JvmName(name = "div_9")
operator fun RA<DoubleType>.div(that: RA<ShortType>): RA<DoubleType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<DoubleType>

@JvmName(name = "div_10")
operator fun RA<ShortType>.div(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<DoubleType>

@JvmName(name = "div_11")
operator fun RA<DoubleType>.div(that: RA<ByteType>): RA<DoubleType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<DoubleType>

@JvmName(name = "div_12")
operator fun RA<ByteType>.div(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<DoubleType>

@JvmName(name = "div_13")
operator fun RA<DoubleType>.div(that: RA<UnsignedLongType>): RA<DoubleType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<DoubleType>

@JvmName(name = "div_14")
operator fun RA<UnsignedLongType>.div(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<DoubleType>

@JvmName(name = "div_15")
operator fun RA<DoubleType>.div(that: RA<UnsignedIntType>): RA<DoubleType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<DoubleType>

@JvmName(name = "div_16")
operator fun RA<UnsignedIntType>.div(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<DoubleType>

@JvmName(name = "div_17")
operator fun RA<DoubleType>.div(that: RA<UnsignedShortType>): RA<DoubleType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<DoubleType>

@JvmName(name = "div_18")
operator fun RA<UnsignedShortType>.div(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<DoubleType>

@JvmName(name = "div_19")
operator fun RA<DoubleType>.div(that: RA<UnsignedByteType>): RA<DoubleType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<DoubleType>

@JvmName(name = "div_20")
operator fun RA<UnsignedByteType>.div(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<DoubleType>

@JvmName(name = "div_21")
operator fun RA<FloatType>.div(that: RA<LongType>): RA<FloatType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<FloatType>

@JvmName(name = "div_22")
operator fun RA<LongType>.div(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<FloatType>

@JvmName(name = "div_23")
operator fun RA<FloatType>.div(that: RA<IntType>): RA<FloatType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<FloatType>

@JvmName(name = "div_24")
operator fun RA<IntType>.div(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<FloatType>

@JvmName(name = "div_25")
operator fun RA<FloatType>.div(that: RA<ShortType>): RA<FloatType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<FloatType>

@JvmName(name = "div_26")
operator fun RA<ShortType>.div(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<FloatType>

@JvmName(name = "div_27")
operator fun RA<FloatType>.div(that: RA<ByteType>): RA<FloatType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<FloatType>

@JvmName(name = "div_28")
operator fun RA<ByteType>.div(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<FloatType>

@JvmName(name = "div_29")
operator fun RA<FloatType>.div(that: RA<UnsignedLongType>): RA<FloatType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<FloatType>

@JvmName(name = "div_30")
operator fun RA<UnsignedLongType>.div(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<FloatType>

@JvmName(name = "div_31")
operator fun RA<FloatType>.div(that: RA<UnsignedIntType>): RA<FloatType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<FloatType>

@JvmName(name = "div_32")
operator fun RA<UnsignedIntType>.div(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<FloatType>

@JvmName(name = "div_33")
operator fun RA<FloatType>.div(that: RA<UnsignedShortType>): RA<FloatType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<FloatType>

@JvmName(name = "div_34")
operator fun RA<UnsignedShortType>.div(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<FloatType>

@JvmName(name = "div_35")
operator fun RA<FloatType>.div(that: RA<UnsignedByteType>): RA<FloatType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<FloatType>

@JvmName(name = "div_36")
operator fun RA<UnsignedByteType>.div(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<FloatType>

@JvmName(name = "div_37")
operator fun RA<LongType>.div(that: RA<IntType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_38")
operator fun RA<IntType>.div(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_39")
operator fun RA<LongType>.div(that: RA<ShortType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_40")
operator fun RA<ShortType>.div(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_41")
operator fun RA<LongType>.div(that: RA<ByteType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_42")
operator fun RA<ByteType>.div(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_43")
operator fun RA<LongType>.div(that: RA<UnsignedLongType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_44")
operator fun RA<UnsignedLongType>.div(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_45")
operator fun RA<LongType>.div(that: RA<UnsignedIntType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_46")
operator fun RA<UnsignedIntType>.div(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_47")
operator fun RA<LongType>.div(that: RA<UnsignedShortType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_48")
operator fun RA<UnsignedShortType>.div(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_49")
operator fun RA<LongType>.div(that: RA<UnsignedByteType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_50")
operator fun RA<UnsignedByteType>.div(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_51")
operator fun RA<IntType>.div(that: RA<ShortType>): RA<IntType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<IntType>

@JvmName(name = "div_52")
operator fun RA<ShortType>.div(that: RA<IntType>): RA<IntType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<IntType>

@JvmName(name = "div_53")
operator fun RA<IntType>.div(that: RA<ByteType>): RA<IntType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<IntType>

@JvmName(name = "div_54")
operator fun RA<ByteType>.div(that: RA<IntType>): RA<IntType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<IntType>

@JvmName(name = "div_55")
operator fun RA<IntType>.div(that: RA<UnsignedLongType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_56")
operator fun RA<UnsignedLongType>.div(that: RA<IntType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_57")
operator fun RA<IntType>.div(that: RA<UnsignedIntType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_58")
operator fun RA<UnsignedIntType>.div(that: RA<IntType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_59")
operator fun RA<IntType>.div(that: RA<UnsignedShortType>): RA<IntType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<IntType>

@JvmName(name = "div_60")
operator fun RA<UnsignedShortType>.div(that: RA<IntType>): RA<IntType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<IntType>

@JvmName(name = "div_61")
operator fun RA<IntType>.div(that: RA<UnsignedByteType>): RA<IntType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<IntType>

@JvmName(name = "div_62")
operator fun RA<UnsignedByteType>.div(that: RA<IntType>): RA<IntType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<IntType>

@JvmName(name = "div_63")
operator fun RA<ShortType>.div(that: RA<ByteType>): RA<ShortType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<ShortType>

@JvmName(name = "div_64")
operator fun RA<ByteType>.div(that: RA<ShortType>): RA<ShortType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<ShortType>

@JvmName(name = "div_65")
operator fun RA<ShortType>.div(that: RA<UnsignedLongType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_66")
operator fun RA<UnsignedLongType>.div(that: RA<ShortType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_67")
operator fun RA<ShortType>.div(that: RA<UnsignedIntType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_68")
operator fun RA<UnsignedIntType>.div(that: RA<ShortType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_69")
operator fun RA<ShortType>.div(that: RA<UnsignedShortType>): RA<IntType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<IntType>

@JvmName(name = "div_70")
operator fun RA<UnsignedShortType>.div(that: RA<ShortType>): RA<IntType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<IntType>

@JvmName(name = "div_71")
operator fun RA<ShortType>.div(that: RA<UnsignedByteType>): RA<ShortType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<ShortType>

@JvmName(name = "div_72")
operator fun RA<UnsignedByteType>.div(that: RA<ShortType>): RA<ShortType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<ShortType>

@JvmName(name = "div_73")
operator fun RA<ByteType>.div(that: RA<UnsignedLongType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_74")
operator fun RA<UnsignedLongType>.div(that: RA<ByteType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_75")
operator fun RA<ByteType>.div(that: RA<UnsignedIntType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_76")
operator fun RA<UnsignedIntType>.div(that: RA<ByteType>): RA<LongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<LongType>

@JvmName(name = "div_77")
operator fun RA<ByteType>.div(that: RA<UnsignedShortType>): RA<IntType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<IntType>

@JvmName(name = "div_78")
operator fun RA<UnsignedShortType>.div(that: RA<ByteType>): RA<IntType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<IntType>

@JvmName(name = "div_79")
operator fun RA<ByteType>.div(that: RA<UnsignedByteType>): RA<ShortType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<ShortType>

@JvmName(name = "div_80")
operator fun RA<UnsignedByteType>.div(that: RA<ByteType>): RA<ShortType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<ShortType>

@JvmName(name = "div_81")
operator fun RA<UnsignedLongType>.div(that: RA<UnsignedIntType>): RA<UnsignedLongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<UnsignedLongType>

@JvmName(name = "div_82")
operator fun RA<UnsignedIntType>.div(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<UnsignedLongType>

@JvmName(name = "div_83")
operator fun RA<UnsignedLongType>.div(that: RA<UnsignedShortType>): RA<UnsignedLongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<UnsignedLongType>

@JvmName(name = "div_84")
operator fun RA<UnsignedShortType>.div(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<UnsignedLongType>

@JvmName(name = "div_85")
operator fun RA<UnsignedLongType>.div(that: RA<UnsignedByteType>): RA<UnsignedLongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<UnsignedLongType>

@JvmName(name = "div_86")
operator fun RA<UnsignedByteType>.div(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<UnsignedLongType>

@JvmName(name = "div_87")
operator fun RA<UnsignedIntType>.div(that: RA<UnsignedShortType>): RA<UnsignedIntType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<UnsignedIntType>

@JvmName(name = "div_88")
operator fun RA<UnsignedShortType>.div(that: RA<UnsignedIntType>): RA<UnsignedIntType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<UnsignedIntType>

@JvmName(name = "div_89")
operator fun RA<UnsignedIntType>.div(that: RA<UnsignedByteType>): RA<UnsignedIntType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<UnsignedIntType>

@JvmName(name = "div_90")
operator fun RA<UnsignedByteType>.div(that: RA<UnsignedIntType>): RA<UnsignedIntType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<UnsignedIntType>

@JvmName(name = "div_91")
operator fun RA<UnsignedShortType>.div(that: RA<UnsignedByteType>): RA<UnsignedShortType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<UnsignedShortType>

@JvmName(name = "div_92")
operator fun RA<UnsignedByteType>.div(that: RA<UnsignedShortType>): RA<UnsignedShortType> =
    RandomAccessibleArithmeticDivExtensionsJava.div(this, that) as RA<UnsignedShortType>
