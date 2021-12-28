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
import net.imglib2.RandomAccessibleInterval as RAI

@JvmName(name = "times_1")
operator fun <T> RAI<T>.times(that: RAI<T>): RAI<T> where T : Type<T>, T : Mul<T> {
  return convert(that, type, BiConverterTimes.instance<T>())
}

@JvmName(name = "times_2")
operator fun RAI<RealType<*>>.times(that: RAI<RealType<*>>): RAI<RealType<*>> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as? RAI<RealType<*>> ?:
    error("Arithmetic operator * (times) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "times_3")
operator fun RAI<DoubleType>.times(that: RAI<FloatType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<DoubleType>

@JvmName(name = "times_4")
operator fun RAI<FloatType>.times(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<DoubleType>

@JvmName(name = "times_5")
operator fun RAI<DoubleType>.times(that: RAI<LongType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<DoubleType>

@JvmName(name = "times_6")
operator fun RAI<LongType>.times(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<DoubleType>

@JvmName(name = "times_7")
operator fun RAI<DoubleType>.times(that: RAI<IntType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<DoubleType>

@JvmName(name = "times_8")
operator fun RAI<IntType>.times(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<DoubleType>

@JvmName(name = "times_9")
operator fun RAI<DoubleType>.times(that: RAI<ShortType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<DoubleType>

@JvmName(name = "times_10")
operator fun RAI<ShortType>.times(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<DoubleType>

@JvmName(name = "times_11")
operator fun RAI<DoubleType>.times(that: RAI<ByteType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<DoubleType>

@JvmName(name = "times_12")
operator fun RAI<ByteType>.times(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<DoubleType>

@JvmName(name = "times_13")
operator fun RAI<DoubleType>.times(that: RAI<UnsignedLongType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<DoubleType>

@JvmName(name = "times_14")
operator fun RAI<UnsignedLongType>.times(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<DoubleType>

@JvmName(name = "times_15")
operator fun RAI<DoubleType>.times(that: RAI<UnsignedIntType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<DoubleType>

@JvmName(name = "times_16")
operator fun RAI<UnsignedIntType>.times(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<DoubleType>

@JvmName(name = "times_17")
operator fun RAI<DoubleType>.times(that: RAI<UnsignedShortType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<DoubleType>

@JvmName(name = "times_18")
operator fun RAI<UnsignedShortType>.times(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<DoubleType>

@JvmName(name = "times_19")
operator fun RAI<DoubleType>.times(that: RAI<UnsignedByteType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<DoubleType>

@JvmName(name = "times_20")
operator fun RAI<UnsignedByteType>.times(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<DoubleType>

@JvmName(name = "times_21")
operator fun RAI<FloatType>.times(that: RAI<LongType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<FloatType>

@JvmName(name = "times_22")
operator fun RAI<LongType>.times(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<FloatType>

@JvmName(name = "times_23")
operator fun RAI<FloatType>.times(that: RAI<IntType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<FloatType>

@JvmName(name = "times_24")
operator fun RAI<IntType>.times(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<FloatType>

@JvmName(name = "times_25")
operator fun RAI<FloatType>.times(that: RAI<ShortType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<FloatType>

@JvmName(name = "times_26")
operator fun RAI<ShortType>.times(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<FloatType>

@JvmName(name = "times_27")
operator fun RAI<FloatType>.times(that: RAI<ByteType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<FloatType>

@JvmName(name = "times_28")
operator fun RAI<ByteType>.times(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<FloatType>

@JvmName(name = "times_29")
operator fun RAI<FloatType>.times(that: RAI<UnsignedLongType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<FloatType>

@JvmName(name = "times_30")
operator fun RAI<UnsignedLongType>.times(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<FloatType>

@JvmName(name = "times_31")
operator fun RAI<FloatType>.times(that: RAI<UnsignedIntType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<FloatType>

@JvmName(name = "times_32")
operator fun RAI<UnsignedIntType>.times(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<FloatType>

@JvmName(name = "times_33")
operator fun RAI<FloatType>.times(that: RAI<UnsignedShortType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<FloatType>

@JvmName(name = "times_34")
operator fun RAI<UnsignedShortType>.times(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<FloatType>

@JvmName(name = "times_35")
operator fun RAI<FloatType>.times(that: RAI<UnsignedByteType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<FloatType>

@JvmName(name = "times_36")
operator fun RAI<UnsignedByteType>.times(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<FloatType>

@JvmName(name = "times_37")
operator fun RAI<LongType>.times(that: RAI<IntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_38")
operator fun RAI<IntType>.times(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_39")
operator fun RAI<LongType>.times(that: RAI<ShortType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_40")
operator fun RAI<ShortType>.times(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_41")
operator fun RAI<LongType>.times(that: RAI<ByteType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_42")
operator fun RAI<ByteType>.times(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_43")
operator fun RAI<LongType>.times(that: RAI<UnsignedLongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_44")
operator fun RAI<UnsignedLongType>.times(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_45")
operator fun RAI<LongType>.times(that: RAI<UnsignedIntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_46")
operator fun RAI<UnsignedIntType>.times(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_47")
operator fun RAI<LongType>.times(that: RAI<UnsignedShortType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_48")
operator fun RAI<UnsignedShortType>.times(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_49")
operator fun RAI<LongType>.times(that: RAI<UnsignedByteType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_50")
operator fun RAI<UnsignedByteType>.times(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_51")
operator fun RAI<IntType>.times(that: RAI<ShortType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<IntType>

@JvmName(name = "times_52")
operator fun RAI<ShortType>.times(that: RAI<IntType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<IntType>

@JvmName(name = "times_53")
operator fun RAI<IntType>.times(that: RAI<ByteType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<IntType>

@JvmName(name = "times_54")
operator fun RAI<ByteType>.times(that: RAI<IntType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<IntType>

@JvmName(name = "times_55")
operator fun RAI<IntType>.times(that: RAI<UnsignedLongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_56")
operator fun RAI<UnsignedLongType>.times(that: RAI<IntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_57")
operator fun RAI<IntType>.times(that: RAI<UnsignedIntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_58")
operator fun RAI<UnsignedIntType>.times(that: RAI<IntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_59")
operator fun RAI<IntType>.times(that: RAI<UnsignedShortType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<IntType>

@JvmName(name = "times_60")
operator fun RAI<UnsignedShortType>.times(that: RAI<IntType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<IntType>

@JvmName(name = "times_61")
operator fun RAI<IntType>.times(that: RAI<UnsignedByteType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<IntType>

@JvmName(name = "times_62")
operator fun RAI<UnsignedByteType>.times(that: RAI<IntType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<IntType>

@JvmName(name = "times_63")
operator fun RAI<ShortType>.times(that: RAI<ByteType>): RAI<ShortType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<ShortType>

@JvmName(name = "times_64")
operator fun RAI<ByteType>.times(that: RAI<ShortType>): RAI<ShortType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<ShortType>

@JvmName(name = "times_65")
operator fun RAI<ShortType>.times(that: RAI<UnsignedLongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_66")
operator fun RAI<UnsignedLongType>.times(that: RAI<ShortType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_67")
operator fun RAI<ShortType>.times(that: RAI<UnsignedIntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_68")
operator fun RAI<UnsignedIntType>.times(that: RAI<ShortType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_69")
operator fun RAI<ShortType>.times(that: RAI<UnsignedShortType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<IntType>

@JvmName(name = "times_70")
operator fun RAI<UnsignedShortType>.times(that: RAI<ShortType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<IntType>

@JvmName(name = "times_71")
operator fun RAI<ShortType>.times(that: RAI<UnsignedByteType>): RAI<ShortType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<ShortType>

@JvmName(name = "times_72")
operator fun RAI<UnsignedByteType>.times(that: RAI<ShortType>): RAI<ShortType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<ShortType>

@JvmName(name = "times_73")
operator fun RAI<ByteType>.times(that: RAI<UnsignedLongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_74")
operator fun RAI<UnsignedLongType>.times(that: RAI<ByteType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_75")
operator fun RAI<ByteType>.times(that: RAI<UnsignedIntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_76")
operator fun RAI<UnsignedIntType>.times(that: RAI<ByteType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<LongType>

@JvmName(name = "times_77")
operator fun RAI<ByteType>.times(that: RAI<UnsignedShortType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<IntType>

@JvmName(name = "times_78")
operator fun RAI<UnsignedShortType>.times(that: RAI<ByteType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<IntType>

@JvmName(name = "times_79")
operator fun RAI<ByteType>.times(that: RAI<UnsignedByteType>): RAI<ShortType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<ShortType>

@JvmName(name = "times_80")
operator fun RAI<UnsignedByteType>.times(that: RAI<ByteType>): RAI<ShortType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<ShortType>

@JvmName(name = "times_81")
operator fun RAI<UnsignedLongType>.times(that: RAI<UnsignedIntType>): RAI<UnsignedLongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<UnsignedLongType>

@JvmName(name = "times_82")
operator fun RAI<UnsignedIntType>.times(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<UnsignedLongType>

@JvmName(name = "times_83")
operator fun RAI<UnsignedLongType>.times(that: RAI<UnsignedShortType>): RAI<UnsignedLongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<UnsignedLongType>

@JvmName(name = "times_84")
operator fun RAI<UnsignedShortType>.times(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<UnsignedLongType>

@JvmName(name = "times_85")
operator fun RAI<UnsignedLongType>.times(that: RAI<UnsignedByteType>): RAI<UnsignedLongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<UnsignedLongType>

@JvmName(name = "times_86")
operator fun RAI<UnsignedByteType>.times(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<UnsignedLongType>

@JvmName(name = "times_87")
operator fun RAI<UnsignedIntType>.times(that: RAI<UnsignedShortType>): RAI<UnsignedIntType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<UnsignedIntType>

@JvmName(name = "times_88")
operator fun RAI<UnsignedShortType>.times(that: RAI<UnsignedIntType>): RAI<UnsignedIntType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<UnsignedIntType>

@JvmName(name = "times_89")
operator fun RAI<UnsignedIntType>.times(that: RAI<UnsignedByteType>): RAI<UnsignedIntType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<UnsignedIntType>

@JvmName(name = "times_90")
operator fun RAI<UnsignedByteType>.times(that: RAI<UnsignedIntType>): RAI<UnsignedIntType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as RAI<UnsignedIntType>

@JvmName(name = "times_91")
operator fun RAI<UnsignedShortType>.times(that: RAI<UnsignedByteType>): RAI<UnsignedShortType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RAI<UnsignedShortType>

@JvmName(name = "times_92")
operator fun RAI<UnsignedByteType>.times(that: RAI<UnsignedShortType>): RAI<UnsignedShortType> =
    RandomAccessibleIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RAI<UnsignedShortType>
