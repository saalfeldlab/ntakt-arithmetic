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
import net.imglib2.RandomAccessibleInterval as RAI

operator fun <T : NumericType<T>> RAI<T>.unaryPlus() = this

@JvmName(name = "plus_1")
operator fun <T> RAI<T>.plus(that: RAI<T>): RAI<T> where T : Type<T>, T : Add<T> {
  return convert(that, type, BiConverterPlus.instance<T>())
}

@JvmName(name = "plus_2")
operator fun RAI<RealType<*>>.plus(that: RAI<RealType<*>>): RAI<RealType<*>> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as? RAI<RealType<*>> ?:
    error("Arithmetic operator + (plus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "plus_3")
operator fun RAI<DoubleType>.plus(that: RAI<FloatType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<DoubleType>

@JvmName(name = "plus_4")
operator fun RAI<FloatType>.plus(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<DoubleType>

@JvmName(name = "plus_5")
operator fun RAI<DoubleType>.plus(that: RAI<LongType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<DoubleType>

@JvmName(name = "plus_6")
operator fun RAI<LongType>.plus(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<DoubleType>

@JvmName(name = "plus_7")
operator fun RAI<DoubleType>.plus(that: RAI<IntType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<DoubleType>

@JvmName(name = "plus_8")
operator fun RAI<IntType>.plus(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<DoubleType>

@JvmName(name = "plus_9")
operator fun RAI<DoubleType>.plus(that: RAI<ShortType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<DoubleType>

@JvmName(name = "plus_10")
operator fun RAI<ShortType>.plus(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<DoubleType>

@JvmName(name = "plus_11")
operator fun RAI<DoubleType>.plus(that: RAI<ByteType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<DoubleType>

@JvmName(name = "plus_12")
operator fun RAI<ByteType>.plus(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<DoubleType>

@JvmName(name = "plus_13")
operator fun RAI<DoubleType>.plus(that: RAI<UnsignedLongType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<DoubleType>

@JvmName(name = "plus_14")
operator fun RAI<UnsignedLongType>.plus(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<DoubleType>

@JvmName(name = "plus_15")
operator fun RAI<DoubleType>.plus(that: RAI<UnsignedIntType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<DoubleType>

@JvmName(name = "plus_16")
operator fun RAI<UnsignedIntType>.plus(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<DoubleType>

@JvmName(name = "plus_17")
operator fun RAI<DoubleType>.plus(that: RAI<UnsignedShortType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<DoubleType>

@JvmName(name = "plus_18")
operator fun RAI<UnsignedShortType>.plus(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<DoubleType>

@JvmName(name = "plus_19")
operator fun RAI<DoubleType>.plus(that: RAI<UnsignedByteType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<DoubleType>

@JvmName(name = "plus_20")
operator fun RAI<UnsignedByteType>.plus(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<DoubleType>

@JvmName(name = "plus_21")
operator fun RAI<FloatType>.plus(that: RAI<LongType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<FloatType>

@JvmName(name = "plus_22")
operator fun RAI<LongType>.plus(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<FloatType>

@JvmName(name = "plus_23")
operator fun RAI<FloatType>.plus(that: RAI<IntType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<FloatType>

@JvmName(name = "plus_24")
operator fun RAI<IntType>.plus(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<FloatType>

@JvmName(name = "plus_25")
operator fun RAI<FloatType>.plus(that: RAI<ShortType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<FloatType>

@JvmName(name = "plus_26")
operator fun RAI<ShortType>.plus(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<FloatType>

@JvmName(name = "plus_27")
operator fun RAI<FloatType>.plus(that: RAI<ByteType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<FloatType>

@JvmName(name = "plus_28")
operator fun RAI<ByteType>.plus(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<FloatType>

@JvmName(name = "plus_29")
operator fun RAI<FloatType>.plus(that: RAI<UnsignedLongType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<FloatType>

@JvmName(name = "plus_30")
operator fun RAI<UnsignedLongType>.plus(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<FloatType>

@JvmName(name = "plus_31")
operator fun RAI<FloatType>.plus(that: RAI<UnsignedIntType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<FloatType>

@JvmName(name = "plus_32")
operator fun RAI<UnsignedIntType>.plus(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<FloatType>

@JvmName(name = "plus_33")
operator fun RAI<FloatType>.plus(that: RAI<UnsignedShortType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<FloatType>

@JvmName(name = "plus_34")
operator fun RAI<UnsignedShortType>.plus(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<FloatType>

@JvmName(name = "plus_35")
operator fun RAI<FloatType>.plus(that: RAI<UnsignedByteType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<FloatType>

@JvmName(name = "plus_36")
operator fun RAI<UnsignedByteType>.plus(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<FloatType>

@JvmName(name = "plus_37")
operator fun RAI<LongType>.plus(that: RAI<IntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_38")
operator fun RAI<IntType>.plus(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_39")
operator fun RAI<LongType>.plus(that: RAI<ShortType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_40")
operator fun RAI<ShortType>.plus(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_41")
operator fun RAI<LongType>.plus(that: RAI<ByteType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_42")
operator fun RAI<ByteType>.plus(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_43")
operator fun RAI<LongType>.plus(that: RAI<UnsignedLongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_44")
operator fun RAI<UnsignedLongType>.plus(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_45")
operator fun RAI<LongType>.plus(that: RAI<UnsignedIntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_46")
operator fun RAI<UnsignedIntType>.plus(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_47")
operator fun RAI<LongType>.plus(that: RAI<UnsignedShortType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_48")
operator fun RAI<UnsignedShortType>.plus(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_49")
operator fun RAI<LongType>.plus(that: RAI<UnsignedByteType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_50")
operator fun RAI<UnsignedByteType>.plus(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_51")
operator fun RAI<IntType>.plus(that: RAI<ShortType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<IntType>

@JvmName(name = "plus_52")
operator fun RAI<ShortType>.plus(that: RAI<IntType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<IntType>

@JvmName(name = "plus_53")
operator fun RAI<IntType>.plus(that: RAI<ByteType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<IntType>

@JvmName(name = "plus_54")
operator fun RAI<ByteType>.plus(that: RAI<IntType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<IntType>

@JvmName(name = "plus_55")
operator fun RAI<IntType>.plus(that: RAI<UnsignedLongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_56")
operator fun RAI<UnsignedLongType>.plus(that: RAI<IntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_57")
operator fun RAI<IntType>.plus(that: RAI<UnsignedIntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_58")
operator fun RAI<UnsignedIntType>.plus(that: RAI<IntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_59")
operator fun RAI<IntType>.plus(that: RAI<UnsignedShortType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<IntType>

@JvmName(name = "plus_60")
operator fun RAI<UnsignedShortType>.plus(that: RAI<IntType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<IntType>

@JvmName(name = "plus_61")
operator fun RAI<IntType>.plus(that: RAI<UnsignedByteType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<IntType>

@JvmName(name = "plus_62")
operator fun RAI<UnsignedByteType>.plus(that: RAI<IntType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<IntType>

@JvmName(name = "plus_63")
operator fun RAI<ShortType>.plus(that: RAI<ByteType>): RAI<ShortType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<ShortType>

@JvmName(name = "plus_64")
operator fun RAI<ByteType>.plus(that: RAI<ShortType>): RAI<ShortType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<ShortType>

@JvmName(name = "plus_65")
operator fun RAI<ShortType>.plus(that: RAI<UnsignedLongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_66")
operator fun RAI<UnsignedLongType>.plus(that: RAI<ShortType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_67")
operator fun RAI<ShortType>.plus(that: RAI<UnsignedIntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_68")
operator fun RAI<UnsignedIntType>.plus(that: RAI<ShortType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_69")
operator fun RAI<ShortType>.plus(that: RAI<UnsignedShortType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<IntType>

@JvmName(name = "plus_70")
operator fun RAI<UnsignedShortType>.plus(that: RAI<ShortType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<IntType>

@JvmName(name = "plus_71")
operator fun RAI<ShortType>.plus(that: RAI<UnsignedByteType>): RAI<ShortType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<ShortType>

@JvmName(name = "plus_72")
operator fun RAI<UnsignedByteType>.plus(that: RAI<ShortType>): RAI<ShortType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<ShortType>

@JvmName(name = "plus_73")
operator fun RAI<ByteType>.plus(that: RAI<UnsignedLongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_74")
operator fun RAI<UnsignedLongType>.plus(that: RAI<ByteType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_75")
operator fun RAI<ByteType>.plus(that: RAI<UnsignedIntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_76")
operator fun RAI<UnsignedIntType>.plus(that: RAI<ByteType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<LongType>

@JvmName(name = "plus_77")
operator fun RAI<ByteType>.plus(that: RAI<UnsignedShortType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<IntType>

@JvmName(name = "plus_78")
operator fun RAI<UnsignedShortType>.plus(that: RAI<ByteType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<IntType>

@JvmName(name = "plus_79")
operator fun RAI<ByteType>.plus(that: RAI<UnsignedByteType>): RAI<ShortType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<ShortType>

@JvmName(name = "plus_80")
operator fun RAI<UnsignedByteType>.plus(that: RAI<ByteType>): RAI<ShortType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<ShortType>

@JvmName(name = "plus_81")
operator fun RAI<UnsignedLongType>.plus(that: RAI<UnsignedIntType>): RAI<UnsignedLongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<UnsignedLongType>

@JvmName(name = "plus_82")
operator fun RAI<UnsignedIntType>.plus(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<UnsignedLongType>

@JvmName(name = "plus_83")
operator fun RAI<UnsignedLongType>.plus(that: RAI<UnsignedShortType>): RAI<UnsignedLongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<UnsignedLongType>

@JvmName(name = "plus_84")
operator fun RAI<UnsignedShortType>.plus(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<UnsignedLongType>

@JvmName(name = "plus_85")
operator fun RAI<UnsignedLongType>.plus(that: RAI<UnsignedByteType>): RAI<UnsignedLongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<UnsignedLongType>

@JvmName(name = "plus_86")
operator fun RAI<UnsignedByteType>.plus(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<UnsignedLongType>

@JvmName(name = "plus_87")
operator fun RAI<UnsignedIntType>.plus(that: RAI<UnsignedShortType>): RAI<UnsignedIntType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<UnsignedIntType>

@JvmName(name = "plus_88")
operator fun RAI<UnsignedShortType>.plus(that: RAI<UnsignedIntType>): RAI<UnsignedIntType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<UnsignedIntType>

@JvmName(name = "plus_89")
operator fun RAI<UnsignedIntType>.plus(that: RAI<UnsignedByteType>): RAI<UnsignedIntType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<UnsignedIntType>

@JvmName(name = "plus_90")
operator fun RAI<UnsignedByteType>.plus(that: RAI<UnsignedIntType>): RAI<UnsignedIntType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<UnsignedIntType>

@JvmName(name = "plus_91")
operator fun RAI<UnsignedShortType>.plus(that: RAI<UnsignedByteType>): RAI<UnsignedShortType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<UnsignedShortType>

@JvmName(name = "plus_92")
operator fun RAI<UnsignedByteType>.plus(that: RAI<UnsignedShortType>): RAI<UnsignedShortType> =
    RandomAccessibleIntervalArithmeticPlusExtensionsJava.plus(this, that) as RAI<UnsignedShortType>
