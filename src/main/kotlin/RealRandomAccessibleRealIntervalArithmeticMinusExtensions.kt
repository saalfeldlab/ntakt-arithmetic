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
import net.imglib2.RealRandomAccessibleRealInterval as RRARI

operator fun <T : NumericType<T>> RRARI<T>.unaryMinus() =
    convert(type) { s, t -> t.set(s); t.mul(-1.0) }

@JvmName(name = "minus_1")
operator fun <T> RRARI<T>.minus(that: RRARI<T>): RRARI<T> where T : Type<T>, T : Sub<T> {
  return convert(that, type, BiConverterMinus.instance<T>())
}

@JvmName(name = "minus_2")
operator fun RRARI<RealType<*>>.minus(that: RRARI<RealType<*>>): RRARI<RealType<*>> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as?
    RRARI<RealType<*>> ?:
    error("Arithmetic operator - (minus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "minus_3")
operator fun RRARI<DoubleType>.minus(that: RRARI<FloatType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "minus_4")
operator fun RRARI<FloatType>.minus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "minus_5")
operator fun RRARI<DoubleType>.minus(that: RRARI<LongType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "minus_6")
operator fun RRARI<LongType>.minus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "minus_7")
operator fun RRARI<DoubleType>.minus(that: RRARI<IntType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "minus_8")
operator fun RRARI<IntType>.minus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "minus_9")
operator fun RRARI<DoubleType>.minus(that: RRARI<ShortType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "minus_10")
operator fun RRARI<ShortType>.minus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "minus_11")
operator fun RRARI<DoubleType>.minus(that: RRARI<ByteType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "minus_12")
operator fun RRARI<ByteType>.minus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "minus_13")
operator fun RRARI<DoubleType>.minus(that: RRARI<UnsignedLongType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "minus_14")
operator fun RRARI<UnsignedLongType>.minus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "minus_15")
operator fun RRARI<DoubleType>.minus(that: RRARI<UnsignedIntType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "minus_16")
operator fun RRARI<UnsignedIntType>.minus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "minus_17")
operator fun RRARI<DoubleType>.minus(that: RRARI<UnsignedShortType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "minus_18")
operator fun RRARI<UnsignedShortType>.minus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "minus_19")
operator fun RRARI<DoubleType>.minus(that: RRARI<UnsignedByteType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "minus_20")
operator fun RRARI<UnsignedByteType>.minus(that: RRARI<DoubleType>): RRARI<DoubleType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<DoubleType>

@JvmName(name = "minus_21")
operator fun RRARI<FloatType>.minus(that: RRARI<LongType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<FloatType>

@JvmName(name = "minus_22")
operator fun RRARI<LongType>.minus(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<FloatType>

@JvmName(name = "minus_23")
operator fun RRARI<FloatType>.minus(that: RRARI<IntType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<FloatType>

@JvmName(name = "minus_24")
operator fun RRARI<IntType>.minus(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<FloatType>

@JvmName(name = "minus_25")
operator fun RRARI<FloatType>.minus(that: RRARI<ShortType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<FloatType>

@JvmName(name = "minus_26")
operator fun RRARI<ShortType>.minus(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<FloatType>

@JvmName(name = "minus_27")
operator fun RRARI<FloatType>.minus(that: RRARI<ByteType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<FloatType>

@JvmName(name = "minus_28")
operator fun RRARI<ByteType>.minus(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<FloatType>

@JvmName(name = "minus_29")
operator fun RRARI<FloatType>.minus(that: RRARI<UnsignedLongType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<FloatType>

@JvmName(name = "minus_30")
operator fun RRARI<UnsignedLongType>.minus(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<FloatType>

@JvmName(name = "minus_31")
operator fun RRARI<FloatType>.minus(that: RRARI<UnsignedIntType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<FloatType>

@JvmName(name = "minus_32")
operator fun RRARI<UnsignedIntType>.minus(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<FloatType>

@JvmName(name = "minus_33")
operator fun RRARI<FloatType>.minus(that: RRARI<UnsignedShortType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<FloatType>

@JvmName(name = "minus_34")
operator fun RRARI<UnsignedShortType>.minus(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<FloatType>

@JvmName(name = "minus_35")
operator fun RRARI<FloatType>.minus(that: RRARI<UnsignedByteType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<FloatType>

@JvmName(name = "minus_36")
operator fun RRARI<UnsignedByteType>.minus(that: RRARI<FloatType>): RRARI<FloatType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<FloatType>

@JvmName(name = "minus_37")
operator fun RRARI<LongType>.minus(that: RRARI<IntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_38")
operator fun RRARI<IntType>.minus(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_39")
operator fun RRARI<LongType>.minus(that: RRARI<ShortType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_40")
operator fun RRARI<ShortType>.minus(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_41")
operator fun RRARI<LongType>.minus(that: RRARI<ByteType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_42")
operator fun RRARI<ByteType>.minus(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_43")
operator fun RRARI<LongType>.minus(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_44")
operator fun RRARI<UnsignedLongType>.minus(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_45")
operator fun RRARI<LongType>.minus(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_46")
operator fun RRARI<UnsignedIntType>.minus(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_47")
operator fun RRARI<LongType>.minus(that: RRARI<UnsignedShortType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_48")
operator fun RRARI<UnsignedShortType>.minus(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_49")
operator fun RRARI<LongType>.minus(that: RRARI<UnsignedByteType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_50")
operator fun RRARI<UnsignedByteType>.minus(that: RRARI<LongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_51")
operator fun RRARI<IntType>.minus(that: RRARI<ShortType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<IntType>

@JvmName(name = "minus_52")
operator fun RRARI<ShortType>.minus(that: RRARI<IntType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<IntType>

@JvmName(name = "minus_53")
operator fun RRARI<IntType>.minus(that: RRARI<ByteType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<IntType>

@JvmName(name = "minus_54")
operator fun RRARI<ByteType>.minus(that: RRARI<IntType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<IntType>

@JvmName(name = "minus_55")
operator fun RRARI<IntType>.minus(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_56")
operator fun RRARI<UnsignedLongType>.minus(that: RRARI<IntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_57")
operator fun RRARI<IntType>.minus(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_58")
operator fun RRARI<UnsignedIntType>.minus(that: RRARI<IntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_59")
operator fun RRARI<IntType>.minus(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<IntType>

@JvmName(name = "minus_60")
operator fun RRARI<UnsignedShortType>.minus(that: RRARI<IntType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<IntType>

@JvmName(name = "minus_61")
operator fun RRARI<IntType>.minus(that: RRARI<UnsignedByteType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<IntType>

@JvmName(name = "minus_62")
operator fun RRARI<UnsignedByteType>.minus(that: RRARI<IntType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<IntType>

@JvmName(name = "minus_63")
operator fun RRARI<ShortType>.minus(that: RRARI<ByteType>): RRARI<ShortType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<ShortType>

@JvmName(name = "minus_64")
operator fun RRARI<ByteType>.minus(that: RRARI<ShortType>): RRARI<ShortType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<ShortType>

@JvmName(name = "minus_65")
operator fun RRARI<ShortType>.minus(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_66")
operator fun RRARI<UnsignedLongType>.minus(that: RRARI<ShortType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_67")
operator fun RRARI<ShortType>.minus(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_68")
operator fun RRARI<UnsignedIntType>.minus(that: RRARI<ShortType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_69")
operator fun RRARI<ShortType>.minus(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<IntType>

@JvmName(name = "minus_70")
operator fun RRARI<UnsignedShortType>.minus(that: RRARI<ShortType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<IntType>

@JvmName(name = "minus_71")
operator fun RRARI<ShortType>.minus(that: RRARI<UnsignedByteType>): RRARI<ShortType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<ShortType>

@JvmName(name = "minus_72")
operator fun RRARI<UnsignedByteType>.minus(that: RRARI<ShortType>): RRARI<ShortType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<ShortType>

@JvmName(name = "minus_73")
operator fun RRARI<ByteType>.minus(that: RRARI<UnsignedLongType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_74")
operator fun RRARI<UnsignedLongType>.minus(that: RRARI<ByteType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_75")
operator fun RRARI<ByteType>.minus(that: RRARI<UnsignedIntType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_76")
operator fun RRARI<UnsignedIntType>.minus(that: RRARI<ByteType>): RRARI<LongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<LongType>

@JvmName(name = "minus_77")
operator fun RRARI<ByteType>.minus(that: RRARI<UnsignedShortType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<IntType>

@JvmName(name = "minus_78")
operator fun RRARI<UnsignedShortType>.minus(that: RRARI<ByteType>): RRARI<IntType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<IntType>

@JvmName(name = "minus_79")
operator fun RRARI<ByteType>.minus(that: RRARI<UnsignedByteType>): RRARI<ShortType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<ShortType>

@JvmName(name = "minus_80")
operator fun RRARI<UnsignedByteType>.minus(that: RRARI<ByteType>): RRARI<ShortType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<ShortType>

@JvmName(name = "minus_81")
operator fun RRARI<UnsignedLongType>.minus(that: RRARI<UnsignedIntType>): RRARI<UnsignedLongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<UnsignedLongType>

@JvmName(name = "minus_82")
operator fun RRARI<UnsignedIntType>.minus(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<UnsignedLongType>

@JvmName(name = "minus_83")
operator fun RRARI<UnsignedLongType>.minus(that: RRARI<UnsignedShortType>): RRARI<UnsignedLongType>
    = RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<UnsignedLongType>

@JvmName(name = "minus_84")
operator fun RRARI<UnsignedShortType>.minus(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType>
    = RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<UnsignedLongType>

@JvmName(name = "minus_85")
operator fun RRARI<UnsignedLongType>.minus(that: RRARI<UnsignedByteType>): RRARI<UnsignedLongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<UnsignedLongType>

@JvmName(name = "minus_86")
operator fun RRARI<UnsignedByteType>.minus(that: RRARI<UnsignedLongType>): RRARI<UnsignedLongType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<UnsignedLongType>

@JvmName(name = "minus_87")
operator fun RRARI<UnsignedIntType>.minus(that: RRARI<UnsignedShortType>): RRARI<UnsignedIntType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<UnsignedIntType>

@JvmName(name = "minus_88")
operator fun RRARI<UnsignedShortType>.minus(that: RRARI<UnsignedIntType>): RRARI<UnsignedIntType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<UnsignedIntType>

@JvmName(name = "minus_89")
operator fun RRARI<UnsignedIntType>.minus(that: RRARI<UnsignedByteType>): RRARI<UnsignedIntType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<UnsignedIntType>

@JvmName(name = "minus_90")
operator fun RRARI<UnsignedByteType>.minus(that: RRARI<UnsignedIntType>): RRARI<UnsignedIntType> =
    RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<UnsignedIntType>

@JvmName(name = "minus_91")
operator fun RRARI<UnsignedShortType>.minus(that: RRARI<UnsignedByteType>): RRARI<UnsignedShortType>
    = RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<UnsignedShortType>

@JvmName(name = "minus_92")
operator fun RRARI<UnsignedByteType>.minus(that: RRARI<UnsignedShortType>): RRARI<UnsignedShortType>
    = RealRandomAccessibleRealIntervalArithmeticMinusExtensionsJava.minus(this, that) as
    RRARI<UnsignedShortType>
