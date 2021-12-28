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
import net.imglib2.RealRandomAccessibleRealInterval as RRARI

@JvmName(name = "times_1")
operator fun <T> RRARI<T>.times(that: RRARI<T>): RRARI<T> where T : Type<T>, T : Mul<T> {
  return convert(that, type, BiConverterTimes.instance<T>())
}

@JvmName(name = "times_2")
operator fun RRARI<RealType<*>>.times(that: RRARI<RealType<*>>): RRARI<RealType<*>> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as?
    RRARI<RealType<*>> ?:
    error("Arithmetic operator * (times) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "times_3")
operator fun RRARI<DoubleType>.times(that: RRARI<FloatType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<DoubleType>

@JvmName(name = "times_4")
operator fun RRARI<FloatType>.times(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<DoubleType>

@JvmName(name = "times_5")
operator fun RRARI<DoubleType>.times(that: RRARI<LongType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<DoubleType>

@JvmName(name = "times_6")
operator fun RRARI<LongType>.times(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<DoubleType>

@JvmName(name = "times_7")
operator fun RRARI<DoubleType>.times(that: RRARI<IntType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<DoubleType>

@JvmName(name = "times_8")
operator fun RRARI<IntType>.times(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<DoubleType>

@JvmName(name = "times_9")
operator fun RRARI<DoubleType>.times(that: RRARI<ShortType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<DoubleType>

@JvmName(name = "times_10")
operator fun RRARI<ShortType>.times(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<DoubleType>

@JvmName(name = "times_11")
operator fun RRARI<DoubleType>.times(that: RRARI<ByteType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<DoubleType>

@JvmName(name = "times_12")
operator fun RRARI<ByteType>.times(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<DoubleType>

@JvmName(name = "times_13")
operator fun RRARI<DoubleType>.times(that: RRARI<UnsignedLongType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<DoubleType>

@JvmName(name = "times_14")
operator fun RRARI<UnsignedLongType>.times(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<DoubleType>

@JvmName(name = "times_15")
operator fun RRARI<DoubleType>.times(that: RRARI<UnsignedIntType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<DoubleType>

@JvmName(name = "times_16")
operator fun RRARI<UnsignedIntType>.times(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<DoubleType>

@JvmName(name = "times_17")
operator fun RRARI<DoubleType>.times(that: RRARI<UnsignedShortType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<DoubleType>

@JvmName(name = "times_18")
operator fun RRARI<UnsignedShortType>.times(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<DoubleType>

@JvmName(name = "times_19")
operator fun RRARI<DoubleType>.times(that: RRARI<UnsignedByteType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<DoubleType>

@JvmName(name = "times_20")
operator fun RRARI<UnsignedByteType>.times(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<DoubleType>

@JvmName(name = "times_21")
operator fun RRARI<FloatType>.times(that: RRARI<LongType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<FloatType>

@JvmName(name = "times_22")
operator fun RRARI<LongType>.times(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<FloatType>

@JvmName(name = "times_23")
operator fun RRARI<FloatType>.times(that: RRARI<IntType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<FloatType>

@JvmName(name = "times_24")
operator fun RRARI<IntType>.times(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<FloatType>

@JvmName(name = "times_25")
operator fun RRARI<FloatType>.times(that: RRARI<ShortType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<FloatType>

@JvmName(name = "times_26")
operator fun RRARI<ShortType>.times(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<FloatType>

@JvmName(name = "times_27")
operator fun RRARI<FloatType>.times(that: RRARI<ByteType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<FloatType>

@JvmName(name = "times_28")
operator fun RRARI<ByteType>.times(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<FloatType>

@JvmName(name = "times_29")
operator fun RRARI<FloatType>.times(that: RRARI<UnsignedLongType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<FloatType>

@JvmName(name = "times_30")
operator fun RRARI<UnsignedLongType>.times(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<FloatType>

@JvmName(name = "times_31")
operator fun RRARI<FloatType>.times(that: RRARI<UnsignedIntType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<FloatType>

@JvmName(name = "times_32")
operator fun RRARI<UnsignedIntType>.times(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<FloatType>

@JvmName(name = "times_33")
operator fun RRARI<FloatType>.times(that: RRARI<UnsignedShortType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<FloatType>

@JvmName(name = "times_34")
operator fun RRARI<UnsignedShortType>.times(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<FloatType>

@JvmName(name = "times_35")
operator fun RRARI<FloatType>.times(that: RRARI<UnsignedByteType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<FloatType>

@JvmName(name = "times_36")
operator fun RRARI<UnsignedByteType>.times(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<FloatType>

@JvmName(name = "times_37")
operator fun RRARI<LongType>.times(that: RRARI<IntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_38")
operator fun RRARI<IntType>.times(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_39")
operator fun RRARI<LongType>.times(that: RRARI<ShortType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_40")
operator fun RRARI<ShortType>.times(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_41")
operator fun RRARI<LongType>.times(that: RRARI<ByteType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_42")
operator fun RRARI<ByteType>.times(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_43")
operator fun RRARI<LongType>.times(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_44")
operator fun RRARI<UnsignedLongType>.times(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_45")
operator fun RRARI<LongType>.times(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_46")
operator fun RRARI<UnsignedIntType>.times(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_47")
operator fun RRARI<LongType>.times(that: RRARI<UnsignedShortType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_48")
operator fun RRARI<UnsignedShortType>.times(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_49")
operator fun RRARI<LongType>.times(that: RRARI<UnsignedByteType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_50")
operator fun RRARI<UnsignedByteType>.times(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_51")
operator fun RRARI<IntType>.times(that: RRARI<ShortType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<IntType>

@JvmName(name = "times_52")
operator fun RRARI<ShortType>.times(that: RRARI<IntType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<IntType>

@JvmName(name = "times_53")
operator fun RRARI<IntType>.times(that: RRARI<ByteType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<IntType>

@JvmName(name = "times_54")
operator fun RRARI<ByteType>.times(that: RRARI<IntType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<IntType>

@JvmName(name = "times_55")
operator fun RRARI<IntType>.times(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_56")
operator fun RRARI<UnsignedLongType>.times(that: RRARI<IntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_57")
operator fun RRARI<IntType>.times(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_58")
operator fun RRARI<UnsignedIntType>.times(that: RRARI<IntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_59")
operator fun RRARI<IntType>.times(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<IntType>

@JvmName(name = "times_60")
operator fun RRARI<UnsignedShortType>.times(that: RRARI<IntType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<IntType>

@JvmName(name = "times_61")
operator fun RRARI<IntType>.times(that: RRARI<UnsignedByteType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<IntType>

@JvmName(name = "times_62")
operator fun RRARI<UnsignedByteType>.times(that: RRARI<IntType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<IntType>

@JvmName(name = "times_63")
operator fun RRARI<ShortType>.times(that: RRARI<ByteType>): RRARI<ShortType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<ShortType>

@JvmName(name = "times_64")
operator fun RRARI<ByteType>.times(that: RRARI<ShortType>): RRARI<ShortType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<ShortType>

@JvmName(name = "times_65")
operator fun RRARI<ShortType>.times(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_66")
operator fun RRARI<UnsignedLongType>.times(that: RRARI<ShortType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_67")
operator fun RRARI<ShortType>.times(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_68")
operator fun RRARI<UnsignedIntType>.times(that: RRARI<ShortType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_69")
operator fun RRARI<ShortType>.times(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<IntType>

@JvmName(name = "times_70")
operator fun RRARI<UnsignedShortType>.times(that: RRARI<ShortType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<IntType>

@JvmName(name = "times_71")
operator fun RRARI<ShortType>.times(that: RRARI<UnsignedByteType>): RRARI<ShortType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<ShortType>

@JvmName(name = "times_72")
operator fun RRARI<UnsignedByteType>.times(that: RRARI<ShortType>): RRARI<ShortType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<ShortType>

@JvmName(name = "times_73")
operator fun RRARI<ByteType>.times(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_74")
operator fun RRARI<UnsignedLongType>.times(that: RRARI<ByteType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_75")
operator fun RRARI<ByteType>.times(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_76")
operator fun RRARI<UnsignedIntType>.times(that: RRARI<ByteType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<LongType>

@JvmName(name = "times_77")
operator fun RRARI<ByteType>.times(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<IntType>

@JvmName(name = "times_78")
operator fun RRARI<UnsignedShortType>.times(that: RRARI<ByteType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<IntType>

@JvmName(name = "times_79")
operator fun RRARI<ByteType>.times(that: RRARI<UnsignedByteType>): RRARI<ShortType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<ShortType>

@JvmName(name = "times_80")
operator fun RRARI<UnsignedByteType>.times(that: RRARI<ByteType>): RRARI<ShortType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<ShortType>

@JvmName(name = "times_81")
operator fun RRARI<UnsignedLongType>.times(that: RRARI<UnsignedIntType>): RRARI<UnsignedLongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<UnsignedLongType>

@JvmName(name = "times_82")
operator fun RRARI<UnsignedIntType>.times(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<UnsignedLongType>

@JvmName(name = "times_83")
operator fun RRARI<UnsignedLongType>.times(that: RRARI<UnsignedShortType>): RRARI<UnsignedLongType>
    = RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<UnsignedLongType>

@JvmName(name = "times_84")
operator fun RRARI<UnsignedShortType>.times(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType>
    = RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<UnsignedLongType>

@JvmName(name = "times_85")
operator fun RRARI<UnsignedLongType>.times(that: RRARI<UnsignedByteType>): RRARI<UnsignedLongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<UnsignedLongType>

@JvmName(name = "times_86")
operator fun RRARI<UnsignedByteType>.times(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<UnsignedLongType>

@JvmName(name = "times_87")
operator fun RRARI<UnsignedIntType>.times(that: RRARI<UnsignedShortType>): RRARI<UnsignedIntType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<UnsignedIntType>

@JvmName(name = "times_88")
operator fun RRARI<UnsignedShortType>.times(that: RRARI<UnsignedIntType>): RRARI<UnsignedIntType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<UnsignedIntType>

@JvmName(name = "times_89")
operator fun RRARI<UnsignedIntType>.times(that: RRARI<UnsignedByteType>): RRARI<UnsignedIntType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<UnsignedIntType>

@JvmName(name = "times_90")
operator fun RRARI<UnsignedByteType>.times(that: RRARI<UnsignedIntType>): RRARI<UnsignedIntType> =
    RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<UnsignedIntType>

@JvmName(name = "times_91")
operator fun RRARI<UnsignedShortType>.times(that: RRARI<UnsignedByteType>): RRARI<UnsignedShortType>
    = RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<UnsignedShortType>

@JvmName(name = "times_92")
operator fun RRARI<UnsignedByteType>.times(that: RRARI<UnsignedShortType>): RRARI<UnsignedShortType>
    = RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava.times(this, that) as
    RRARI<UnsignedShortType>
