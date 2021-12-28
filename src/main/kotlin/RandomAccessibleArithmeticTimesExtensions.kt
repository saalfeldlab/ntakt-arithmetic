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
import net.imglib2.type.operators.Mul
import net.imglib2.RandomAccessible as RA

@JvmName(name = "times_1")
operator fun <T> RA<T>.times(that: RA<T>): RA<T> where T : Type<T>, T : Mul<T> {
  return convert(that, type, BiConverterTimes.instance<T>())
}

@JvmName(name = "times_2")
operator fun RA<RealType<*>>.times(that: RA<RealType<*>>): RA<RealType<*>> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as? RA<RealType<*>> ?:
    error("Arithmetic operator * (times) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "times_3")
operator fun RA<DoubleType>.times(that: RA<FloatType>): RA<DoubleType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<DoubleType>

@JvmName(name = "times_4")
operator fun RA<FloatType>.times(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<DoubleType>

@JvmName(name = "times_5")
operator fun RA<DoubleType>.times(that: RA<LongType>): RA<DoubleType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<DoubleType>

@JvmName(name = "times_6")
operator fun RA<LongType>.times(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<DoubleType>

@JvmName(name = "times_7")
operator fun RA<DoubleType>.times(that: RA<IntType>): RA<DoubleType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<DoubleType>

@JvmName(name = "times_8")
operator fun RA<IntType>.times(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<DoubleType>

@JvmName(name = "times_9")
operator fun RA<DoubleType>.times(that: RA<ShortType>): RA<DoubleType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<DoubleType>

@JvmName(name = "times_10")
operator fun RA<ShortType>.times(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<DoubleType>

@JvmName(name = "times_11")
operator fun RA<DoubleType>.times(that: RA<ByteType>): RA<DoubleType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<DoubleType>

@JvmName(name = "times_12")
operator fun RA<ByteType>.times(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<DoubleType>

@JvmName(name = "times_13")
operator fun RA<DoubleType>.times(that: RA<UnsignedLongType>): RA<DoubleType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<DoubleType>

@JvmName(name = "times_14")
operator fun RA<UnsignedLongType>.times(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<DoubleType>

@JvmName(name = "times_15")
operator fun RA<DoubleType>.times(that: RA<UnsignedIntType>): RA<DoubleType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<DoubleType>

@JvmName(name = "times_16")
operator fun RA<UnsignedIntType>.times(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<DoubleType>

@JvmName(name = "times_17")
operator fun RA<DoubleType>.times(that: RA<UnsignedShortType>): RA<DoubleType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<DoubleType>

@JvmName(name = "times_18")
operator fun RA<UnsignedShortType>.times(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<DoubleType>

@JvmName(name = "times_19")
operator fun RA<DoubleType>.times(that: RA<UnsignedByteType>): RA<DoubleType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<DoubleType>

@JvmName(name = "times_20")
operator fun RA<UnsignedByteType>.times(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<DoubleType>

@JvmName(name = "times_21")
operator fun RA<FloatType>.times(that: RA<LongType>): RA<FloatType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<FloatType>

@JvmName(name = "times_22")
operator fun RA<LongType>.times(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<FloatType>

@JvmName(name = "times_23")
operator fun RA<FloatType>.times(that: RA<IntType>): RA<FloatType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<FloatType>

@JvmName(name = "times_24")
operator fun RA<IntType>.times(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<FloatType>

@JvmName(name = "times_25")
operator fun RA<FloatType>.times(that: RA<ShortType>): RA<FloatType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<FloatType>

@JvmName(name = "times_26")
operator fun RA<ShortType>.times(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<FloatType>

@JvmName(name = "times_27")
operator fun RA<FloatType>.times(that: RA<ByteType>): RA<FloatType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<FloatType>

@JvmName(name = "times_28")
operator fun RA<ByteType>.times(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<FloatType>

@JvmName(name = "times_29")
operator fun RA<FloatType>.times(that: RA<UnsignedLongType>): RA<FloatType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<FloatType>

@JvmName(name = "times_30")
operator fun RA<UnsignedLongType>.times(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<FloatType>

@JvmName(name = "times_31")
operator fun RA<FloatType>.times(that: RA<UnsignedIntType>): RA<FloatType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<FloatType>

@JvmName(name = "times_32")
operator fun RA<UnsignedIntType>.times(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<FloatType>

@JvmName(name = "times_33")
operator fun RA<FloatType>.times(that: RA<UnsignedShortType>): RA<FloatType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<FloatType>

@JvmName(name = "times_34")
operator fun RA<UnsignedShortType>.times(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<FloatType>

@JvmName(name = "times_35")
operator fun RA<FloatType>.times(that: RA<UnsignedByteType>): RA<FloatType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<FloatType>

@JvmName(name = "times_36")
operator fun RA<UnsignedByteType>.times(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<FloatType>

@JvmName(name = "times_37")
operator fun RA<LongType>.times(that: RA<IntType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_38")
operator fun RA<IntType>.times(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_39")
operator fun RA<LongType>.times(that: RA<ShortType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_40")
operator fun RA<ShortType>.times(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_41")
operator fun RA<LongType>.times(that: RA<ByteType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_42")
operator fun RA<ByteType>.times(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_43")
operator fun RA<LongType>.times(that: RA<UnsignedLongType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_44")
operator fun RA<UnsignedLongType>.times(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_45")
operator fun RA<LongType>.times(that: RA<UnsignedIntType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_46")
operator fun RA<UnsignedIntType>.times(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_47")
operator fun RA<LongType>.times(that: RA<UnsignedShortType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_48")
operator fun RA<UnsignedShortType>.times(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_49")
operator fun RA<LongType>.times(that: RA<UnsignedByteType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_50")
operator fun RA<UnsignedByteType>.times(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_51")
operator fun RA<IntType>.times(that: RA<ShortType>): RA<IntType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<IntType>

@JvmName(name = "times_52")
operator fun RA<ShortType>.times(that: RA<IntType>): RA<IntType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<IntType>

@JvmName(name = "times_53")
operator fun RA<IntType>.times(that: RA<ByteType>): RA<IntType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<IntType>

@JvmName(name = "times_54")
operator fun RA<ByteType>.times(that: RA<IntType>): RA<IntType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<IntType>

@JvmName(name = "times_55")
operator fun RA<IntType>.times(that: RA<UnsignedLongType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_56")
operator fun RA<UnsignedLongType>.times(that: RA<IntType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_57")
operator fun RA<IntType>.times(that: RA<UnsignedIntType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_58")
operator fun RA<UnsignedIntType>.times(that: RA<IntType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_59")
operator fun RA<IntType>.times(that: RA<UnsignedShortType>): RA<IntType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<IntType>

@JvmName(name = "times_60")
operator fun RA<UnsignedShortType>.times(that: RA<IntType>): RA<IntType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<IntType>

@JvmName(name = "times_61")
operator fun RA<IntType>.times(that: RA<UnsignedByteType>): RA<IntType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<IntType>

@JvmName(name = "times_62")
operator fun RA<UnsignedByteType>.times(that: RA<IntType>): RA<IntType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<IntType>

@JvmName(name = "times_63")
operator fun RA<ShortType>.times(that: RA<ByteType>): RA<ShortType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<ShortType>

@JvmName(name = "times_64")
operator fun RA<ByteType>.times(that: RA<ShortType>): RA<ShortType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<ShortType>

@JvmName(name = "times_65")
operator fun RA<ShortType>.times(that: RA<UnsignedLongType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_66")
operator fun RA<UnsignedLongType>.times(that: RA<ShortType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_67")
operator fun RA<ShortType>.times(that: RA<UnsignedIntType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_68")
operator fun RA<UnsignedIntType>.times(that: RA<ShortType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_69")
operator fun RA<ShortType>.times(that: RA<UnsignedShortType>): RA<IntType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<IntType>

@JvmName(name = "times_70")
operator fun RA<UnsignedShortType>.times(that: RA<ShortType>): RA<IntType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<IntType>

@JvmName(name = "times_71")
operator fun RA<ShortType>.times(that: RA<UnsignedByteType>): RA<ShortType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<ShortType>

@JvmName(name = "times_72")
operator fun RA<UnsignedByteType>.times(that: RA<ShortType>): RA<ShortType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<ShortType>

@JvmName(name = "times_73")
operator fun RA<ByteType>.times(that: RA<UnsignedLongType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_74")
operator fun RA<UnsignedLongType>.times(that: RA<ByteType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_75")
operator fun RA<ByteType>.times(that: RA<UnsignedIntType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_76")
operator fun RA<UnsignedIntType>.times(that: RA<ByteType>): RA<LongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<LongType>

@JvmName(name = "times_77")
operator fun RA<ByteType>.times(that: RA<UnsignedShortType>): RA<IntType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<IntType>

@JvmName(name = "times_78")
operator fun RA<UnsignedShortType>.times(that: RA<ByteType>): RA<IntType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<IntType>

@JvmName(name = "times_79")
operator fun RA<ByteType>.times(that: RA<UnsignedByteType>): RA<ShortType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<ShortType>

@JvmName(name = "times_80")
operator fun RA<UnsignedByteType>.times(that: RA<ByteType>): RA<ShortType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<ShortType>

@JvmName(name = "times_81")
operator fun RA<UnsignedLongType>.times(that: RA<UnsignedIntType>): RA<UnsignedLongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<UnsignedLongType>

@JvmName(name = "times_82")
operator fun RA<UnsignedIntType>.times(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<UnsignedLongType>

@JvmName(name = "times_83")
operator fun RA<UnsignedLongType>.times(that: RA<UnsignedShortType>): RA<UnsignedLongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<UnsignedLongType>

@JvmName(name = "times_84")
operator fun RA<UnsignedShortType>.times(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<UnsignedLongType>

@JvmName(name = "times_85")
operator fun RA<UnsignedLongType>.times(that: RA<UnsignedByteType>): RA<UnsignedLongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<UnsignedLongType>

@JvmName(name = "times_86")
operator fun RA<UnsignedByteType>.times(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<UnsignedLongType>

@JvmName(name = "times_87")
operator fun RA<UnsignedIntType>.times(that: RA<UnsignedShortType>): RA<UnsignedIntType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<UnsignedIntType>

@JvmName(name = "times_88")
operator fun RA<UnsignedShortType>.times(that: RA<UnsignedIntType>): RA<UnsignedIntType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<UnsignedIntType>

@JvmName(name = "times_89")
operator fun RA<UnsignedIntType>.times(that: RA<UnsignedByteType>): RA<UnsignedIntType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<UnsignedIntType>

@JvmName(name = "times_90")
operator fun RA<UnsignedByteType>.times(that: RA<UnsignedIntType>): RA<UnsignedIntType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<UnsignedIntType>

@JvmName(name = "times_91")
operator fun RA<UnsignedShortType>.times(that: RA<UnsignedByteType>): RA<UnsignedShortType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<UnsignedShortType>

@JvmName(name = "times_92")
operator fun RA<UnsignedByteType>.times(that: RA<UnsignedShortType>): RA<UnsignedShortType> =
    RandomAccessibleArithmeticTimesExtensionsJava.times(this, that) as RA<UnsignedShortType>
