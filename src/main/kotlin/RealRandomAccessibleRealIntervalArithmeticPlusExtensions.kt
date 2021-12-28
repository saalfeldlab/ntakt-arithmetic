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
import net.imglib2.type.operators.Add
import net.imglib2.RealRandomAccessibleRealInterval as RRARI

operator fun <T : NumericType<T>> RRARI<T>.unaryPlus() = this

@JvmName(name = "plus_1")
operator fun <T> RRARI<T>.plus(that: RRARI<T>): RRARI<T> where T : Type<T>, T : Add<T> {
  return convert(that, type, BiConverterPlus.instance<T>())
}

@JvmName(name = "plus_2")
operator fun RRARI<RealType<*>>.plus(that: RRARI<RealType<*>>): RRARI<RealType<*>> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as?
    RRARI<RealType<*>> ?:
    error("Arithmetic operator + (plus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "plus_3")
operator fun RRARI<DoubleType>.plus(that: RRARI<FloatType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "plus_4")
operator fun RRARI<FloatType>.plus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "plus_5")
operator fun RRARI<DoubleType>.plus(that: RRARI<LongType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "plus_6")
operator fun RRARI<LongType>.plus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "plus_7")
operator fun RRARI<DoubleType>.plus(that: RRARI<IntType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "plus_8")
operator fun RRARI<IntType>.plus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "plus_9")
operator fun RRARI<DoubleType>.plus(that: RRARI<ShortType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "plus_10")
operator fun RRARI<ShortType>.plus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "plus_11")
operator fun RRARI<DoubleType>.plus(that: RRARI<ByteType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "plus_12")
operator fun RRARI<ByteType>.plus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "plus_13")
operator fun RRARI<DoubleType>.plus(that: RRARI<UnsignedLongType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "plus_14")
operator fun RRARI<UnsignedLongType>.plus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "plus_15")
operator fun RRARI<DoubleType>.plus(that: RRARI<UnsignedIntType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "plus_16")
operator fun RRARI<UnsignedIntType>.plus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "plus_17")
operator fun RRARI<DoubleType>.plus(that: RRARI<UnsignedShortType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "plus_18")
operator fun RRARI<UnsignedShortType>.plus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "plus_19")
operator fun RRARI<DoubleType>.plus(that: RRARI<UnsignedByteType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "plus_20")
operator fun RRARI<UnsignedByteType>.plus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "plus_21")
operator fun RRARI<FloatType>.plus(that: RRARI<LongType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<FloatType>

@JvmName(name = "plus_22")
operator fun RRARI<LongType>.plus(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<FloatType>

@JvmName(name = "plus_23")
operator fun RRARI<FloatType>.plus(that: RRARI<IntType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<FloatType>

@JvmName(name = "plus_24")
operator fun RRARI<IntType>.plus(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<FloatType>

@JvmName(name = "plus_25")
operator fun RRARI<FloatType>.plus(that: RRARI<ShortType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<FloatType>

@JvmName(name = "plus_26")
operator fun RRARI<ShortType>.plus(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<FloatType>

@JvmName(name = "plus_27")
operator fun RRARI<FloatType>.plus(that: RRARI<ByteType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<FloatType>

@JvmName(name = "plus_28")
operator fun RRARI<ByteType>.plus(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<FloatType>

@JvmName(name = "plus_29")
operator fun RRARI<FloatType>.plus(that: RRARI<UnsignedLongType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<FloatType>

@JvmName(name = "plus_30")
operator fun RRARI<UnsignedLongType>.plus(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<FloatType>

@JvmName(name = "plus_31")
operator fun RRARI<FloatType>.plus(that: RRARI<UnsignedIntType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<FloatType>

@JvmName(name = "plus_32")
operator fun RRARI<UnsignedIntType>.plus(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<FloatType>

@JvmName(name = "plus_33")
operator fun RRARI<FloatType>.plus(that: RRARI<UnsignedShortType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<FloatType>

@JvmName(name = "plus_34")
operator fun RRARI<UnsignedShortType>.plus(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<FloatType>

@JvmName(name = "plus_35")
operator fun RRARI<FloatType>.plus(that: RRARI<UnsignedByteType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<FloatType>

@JvmName(name = "plus_36")
operator fun RRARI<UnsignedByteType>.plus(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<FloatType>

@JvmName(name = "plus_37")
operator fun RRARI<LongType>.plus(that: RRARI<IntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_38")
operator fun RRARI<IntType>.plus(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_39")
operator fun RRARI<LongType>.plus(that: RRARI<ShortType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_40")
operator fun RRARI<ShortType>.plus(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_41")
operator fun RRARI<LongType>.plus(that: RRARI<ByteType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_42")
operator fun RRARI<ByteType>.plus(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_43")
operator fun RRARI<LongType>.plus(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_44")
operator fun RRARI<UnsignedLongType>.plus(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_45")
operator fun RRARI<LongType>.plus(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_46")
operator fun RRARI<UnsignedIntType>.plus(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_47")
operator fun RRARI<LongType>.plus(that: RRARI<UnsignedShortType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_48")
operator fun RRARI<UnsignedShortType>.plus(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_49")
operator fun RRARI<LongType>.plus(that: RRARI<UnsignedByteType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_50")
operator fun RRARI<UnsignedByteType>.plus(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_51")
operator fun RRARI<IntType>.plus(that: RRARI<ShortType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<IntType>

@JvmName(name = "plus_52")
operator fun RRARI<ShortType>.plus(that: RRARI<IntType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<IntType>

@JvmName(name = "plus_53")
operator fun RRARI<IntType>.plus(that: RRARI<ByteType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<IntType>

@JvmName(name = "plus_54")
operator fun RRARI<ByteType>.plus(that: RRARI<IntType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<IntType>

@JvmName(name = "plus_55")
operator fun RRARI<IntType>.plus(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_56")
operator fun RRARI<UnsignedLongType>.plus(that: RRARI<IntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_57")
operator fun RRARI<IntType>.plus(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_58")
operator fun RRARI<UnsignedIntType>.plus(that: RRARI<IntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_59")
operator fun RRARI<IntType>.plus(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<IntType>

@JvmName(name = "plus_60")
operator fun RRARI<UnsignedShortType>.plus(that: RRARI<IntType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<IntType>

@JvmName(name = "plus_61")
operator fun RRARI<IntType>.plus(that: RRARI<UnsignedByteType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<IntType>

@JvmName(name = "plus_62")
operator fun RRARI<UnsignedByteType>.plus(that: RRARI<IntType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<IntType>

@JvmName(name = "plus_63")
operator fun RRARI<ShortType>.plus(that: RRARI<ByteType>): RRARI<ShortType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<ShortType>

@JvmName(name = "plus_64")
operator fun RRARI<ByteType>.plus(that: RRARI<ShortType>): RRARI<ShortType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<ShortType>

@JvmName(name = "plus_65")
operator fun RRARI<ShortType>.plus(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_66")
operator fun RRARI<UnsignedLongType>.plus(that: RRARI<ShortType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_67")
operator fun RRARI<ShortType>.plus(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_68")
operator fun RRARI<UnsignedIntType>.plus(that: RRARI<ShortType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_69")
operator fun RRARI<ShortType>.plus(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<IntType>

@JvmName(name = "plus_70")
operator fun RRARI<UnsignedShortType>.plus(that: RRARI<ShortType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<IntType>

@JvmName(name = "plus_71")
operator fun RRARI<ShortType>.plus(that: RRARI<UnsignedByteType>): RRARI<ShortType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<ShortType>

@JvmName(name = "plus_72")
operator fun RRARI<UnsignedByteType>.plus(that: RRARI<ShortType>): RRARI<ShortType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<ShortType>

@JvmName(name = "plus_73")
operator fun RRARI<ByteType>.plus(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_74")
operator fun RRARI<UnsignedLongType>.plus(that: RRARI<ByteType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_75")
operator fun RRARI<ByteType>.plus(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_76")
operator fun RRARI<UnsignedIntType>.plus(that: RRARI<ByteType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<LongType>

@JvmName(name = "plus_77")
operator fun RRARI<ByteType>.plus(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<IntType>

@JvmName(name = "plus_78")
operator fun RRARI<UnsignedShortType>.plus(that: RRARI<ByteType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as RRARI<IntType>

@JvmName(name = "plus_79")
operator fun RRARI<ByteType>.plus(that: RRARI<UnsignedByteType>): RRARI<ShortType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<ShortType>

@JvmName(name = "plus_80")
operator fun RRARI<UnsignedByteType>.plus(that: RRARI<ByteType>): RRARI<ShortType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<ShortType>

@JvmName(name = "plus_81")
operator fun RRARI<UnsignedLongType>.plus(that: RRARI<UnsignedIntType>): RRARI<UnsignedLongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<UnsignedLongType>

@JvmName(name = "plus_82")
operator fun RRARI<UnsignedIntType>.plus(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<UnsignedLongType>

@JvmName(name = "plus_83")
operator fun RRARI<UnsignedLongType>.plus(that: RRARI<UnsignedShortType>): RRARI<UnsignedLongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<UnsignedLongType>

@JvmName(name = "plus_84")
operator fun RRARI<UnsignedShortType>.plus(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<UnsignedLongType>

@JvmName(name = "plus_85")
operator fun RRARI<UnsignedLongType>.plus(that: RRARI<UnsignedByteType>): RRARI<UnsignedLongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<UnsignedLongType>

@JvmName(name = "plus_86")
operator fun RRARI<UnsignedByteType>.plus(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<UnsignedLongType>

@JvmName(name = "plus_87")
operator fun RRARI<UnsignedIntType>.plus(that: RRARI<UnsignedShortType>): RRARI<UnsignedIntType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<UnsignedIntType>

@JvmName(name = "plus_88")
operator fun RRARI<UnsignedShortType>.plus(that: RRARI<UnsignedIntType>): RRARI<UnsignedIntType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<UnsignedIntType>

@JvmName(name = "plus_89")
operator fun RRARI<UnsignedIntType>.plus(that: RRARI<UnsignedByteType>): RRARI<UnsignedIntType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<UnsignedIntType>

@JvmName(name = "plus_90")
operator fun RRARI<UnsignedByteType>.plus(that: RRARI<UnsignedIntType>): RRARI<UnsignedIntType> =
    RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<UnsignedIntType>

@JvmName(name = "plus_91")
operator fun RRARI<UnsignedShortType>.plus(that: RRARI<UnsignedByteType>): RRARI<UnsignedShortType>
    = RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<UnsignedShortType>

@JvmName(name = "plus_92")
operator fun RRARI<UnsignedByteType>.plus(that: RRARI<UnsignedShortType>): RRARI<UnsignedShortType>
    = RealRandomAccessibleRealIntervalArithmeticPlusExtensionsJava.plus(this, that) as
    RRARI<UnsignedShortType>
