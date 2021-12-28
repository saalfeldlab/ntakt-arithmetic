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
import net.imglib2.RandomAccessible as RA

operator fun <T : NumericType<T>> RA<T>.unaryPlus() = this

@JvmName(name = "plus_1")
operator fun <T> RA<T>.plus(that: RA<T>): RA<T> where T : Type<T>, T : Add<T> {
  return convert(that, type, BiConverterPlus.instance<T>())
}

@JvmName(name = "plus_2")
operator fun RA<RealType<*>>.plus(that: RA<RealType<*>>): RA<RealType<*>> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as? RA<RealType<*>> ?:
    error("Arithmetic operator + (plus) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "plus_3")
operator fun RA<DoubleType>.plus(that: RA<FloatType>): RA<DoubleType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<DoubleType>

@JvmName(name = "plus_4")
operator fun RA<FloatType>.plus(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<DoubleType>

@JvmName(name = "plus_5")
operator fun RA<DoubleType>.plus(that: RA<LongType>): RA<DoubleType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<DoubleType>

@JvmName(name = "plus_6")
operator fun RA<LongType>.plus(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<DoubleType>

@JvmName(name = "plus_7")
operator fun RA<DoubleType>.plus(that: RA<IntType>): RA<DoubleType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<DoubleType>

@JvmName(name = "plus_8")
operator fun RA<IntType>.plus(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<DoubleType>

@JvmName(name = "plus_9")
operator fun RA<DoubleType>.plus(that: RA<ShortType>): RA<DoubleType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<DoubleType>

@JvmName(name = "plus_10")
operator fun RA<ShortType>.plus(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<DoubleType>

@JvmName(name = "plus_11")
operator fun RA<DoubleType>.plus(that: RA<ByteType>): RA<DoubleType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<DoubleType>

@JvmName(name = "plus_12")
operator fun RA<ByteType>.plus(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<DoubleType>

@JvmName(name = "plus_13")
operator fun RA<DoubleType>.plus(that: RA<UnsignedLongType>): RA<DoubleType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<DoubleType>

@JvmName(name = "plus_14")
operator fun RA<UnsignedLongType>.plus(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<DoubleType>

@JvmName(name = "plus_15")
operator fun RA<DoubleType>.plus(that: RA<UnsignedIntType>): RA<DoubleType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<DoubleType>

@JvmName(name = "plus_16")
operator fun RA<UnsignedIntType>.plus(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<DoubleType>

@JvmName(name = "plus_17")
operator fun RA<DoubleType>.plus(that: RA<UnsignedShortType>): RA<DoubleType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<DoubleType>

@JvmName(name = "plus_18")
operator fun RA<UnsignedShortType>.plus(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<DoubleType>

@JvmName(name = "plus_19")
operator fun RA<DoubleType>.plus(that: RA<UnsignedByteType>): RA<DoubleType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<DoubleType>

@JvmName(name = "plus_20")
operator fun RA<UnsignedByteType>.plus(that: RA<DoubleType>): RA<DoubleType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<DoubleType>

@JvmName(name = "plus_21")
operator fun RA<FloatType>.plus(that: RA<LongType>): RA<FloatType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<FloatType>

@JvmName(name = "plus_22")
operator fun RA<LongType>.plus(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<FloatType>

@JvmName(name = "plus_23")
operator fun RA<FloatType>.plus(that: RA<IntType>): RA<FloatType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<FloatType>

@JvmName(name = "plus_24")
operator fun RA<IntType>.plus(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<FloatType>

@JvmName(name = "plus_25")
operator fun RA<FloatType>.plus(that: RA<ShortType>): RA<FloatType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<FloatType>

@JvmName(name = "plus_26")
operator fun RA<ShortType>.plus(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<FloatType>

@JvmName(name = "plus_27")
operator fun RA<FloatType>.plus(that: RA<ByteType>): RA<FloatType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<FloatType>

@JvmName(name = "plus_28")
operator fun RA<ByteType>.plus(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<FloatType>

@JvmName(name = "plus_29")
operator fun RA<FloatType>.plus(that: RA<UnsignedLongType>): RA<FloatType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<FloatType>

@JvmName(name = "plus_30")
operator fun RA<UnsignedLongType>.plus(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<FloatType>

@JvmName(name = "plus_31")
operator fun RA<FloatType>.plus(that: RA<UnsignedIntType>): RA<FloatType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<FloatType>

@JvmName(name = "plus_32")
operator fun RA<UnsignedIntType>.plus(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<FloatType>

@JvmName(name = "plus_33")
operator fun RA<FloatType>.plus(that: RA<UnsignedShortType>): RA<FloatType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<FloatType>

@JvmName(name = "plus_34")
operator fun RA<UnsignedShortType>.plus(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<FloatType>

@JvmName(name = "plus_35")
operator fun RA<FloatType>.plus(that: RA<UnsignedByteType>): RA<FloatType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<FloatType>

@JvmName(name = "plus_36")
operator fun RA<UnsignedByteType>.plus(that: RA<FloatType>): RA<FloatType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<FloatType>

@JvmName(name = "plus_37")
operator fun RA<LongType>.plus(that: RA<IntType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_38")
operator fun RA<IntType>.plus(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_39")
operator fun RA<LongType>.plus(that: RA<ShortType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_40")
operator fun RA<ShortType>.plus(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_41")
operator fun RA<LongType>.plus(that: RA<ByteType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_42")
operator fun RA<ByteType>.plus(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_43")
operator fun RA<LongType>.plus(that: RA<UnsignedLongType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_44")
operator fun RA<UnsignedLongType>.plus(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_45")
operator fun RA<LongType>.plus(that: RA<UnsignedIntType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_46")
operator fun RA<UnsignedIntType>.plus(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_47")
operator fun RA<LongType>.plus(that: RA<UnsignedShortType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_48")
operator fun RA<UnsignedShortType>.plus(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_49")
operator fun RA<LongType>.plus(that: RA<UnsignedByteType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_50")
operator fun RA<UnsignedByteType>.plus(that: RA<LongType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_51")
operator fun RA<IntType>.plus(that: RA<ShortType>): RA<IntType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<IntType>

@JvmName(name = "plus_52")
operator fun RA<ShortType>.plus(that: RA<IntType>): RA<IntType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<IntType>

@JvmName(name = "plus_53")
operator fun RA<IntType>.plus(that: RA<ByteType>): RA<IntType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<IntType>

@JvmName(name = "plus_54")
operator fun RA<ByteType>.plus(that: RA<IntType>): RA<IntType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<IntType>

@JvmName(name = "plus_55")
operator fun RA<IntType>.plus(that: RA<UnsignedLongType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_56")
operator fun RA<UnsignedLongType>.plus(that: RA<IntType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_57")
operator fun RA<IntType>.plus(that: RA<UnsignedIntType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_58")
operator fun RA<UnsignedIntType>.plus(that: RA<IntType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_59")
operator fun RA<IntType>.plus(that: RA<UnsignedShortType>): RA<IntType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<IntType>

@JvmName(name = "plus_60")
operator fun RA<UnsignedShortType>.plus(that: RA<IntType>): RA<IntType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<IntType>

@JvmName(name = "plus_61")
operator fun RA<IntType>.plus(that: RA<UnsignedByteType>): RA<IntType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<IntType>

@JvmName(name = "plus_62")
operator fun RA<UnsignedByteType>.plus(that: RA<IntType>): RA<IntType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<IntType>

@JvmName(name = "plus_63")
operator fun RA<ShortType>.plus(that: RA<ByteType>): RA<ShortType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<ShortType>

@JvmName(name = "plus_64")
operator fun RA<ByteType>.plus(that: RA<ShortType>): RA<ShortType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<ShortType>

@JvmName(name = "plus_65")
operator fun RA<ShortType>.plus(that: RA<UnsignedLongType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_66")
operator fun RA<UnsignedLongType>.plus(that: RA<ShortType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_67")
operator fun RA<ShortType>.plus(that: RA<UnsignedIntType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_68")
operator fun RA<UnsignedIntType>.plus(that: RA<ShortType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_69")
operator fun RA<ShortType>.plus(that: RA<UnsignedShortType>): RA<IntType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<IntType>

@JvmName(name = "plus_70")
operator fun RA<UnsignedShortType>.plus(that: RA<ShortType>): RA<IntType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<IntType>

@JvmName(name = "plus_71")
operator fun RA<ShortType>.plus(that: RA<UnsignedByteType>): RA<ShortType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<ShortType>

@JvmName(name = "plus_72")
operator fun RA<UnsignedByteType>.plus(that: RA<ShortType>): RA<ShortType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<ShortType>

@JvmName(name = "plus_73")
operator fun RA<ByteType>.plus(that: RA<UnsignedLongType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_74")
operator fun RA<UnsignedLongType>.plus(that: RA<ByteType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_75")
operator fun RA<ByteType>.plus(that: RA<UnsignedIntType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_76")
operator fun RA<UnsignedIntType>.plus(that: RA<ByteType>): RA<LongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<LongType>

@JvmName(name = "plus_77")
operator fun RA<ByteType>.plus(that: RA<UnsignedShortType>): RA<IntType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<IntType>

@JvmName(name = "plus_78")
operator fun RA<UnsignedShortType>.plus(that: RA<ByteType>): RA<IntType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<IntType>

@JvmName(name = "plus_79")
operator fun RA<ByteType>.plus(that: RA<UnsignedByteType>): RA<ShortType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<ShortType>

@JvmName(name = "plus_80")
operator fun RA<UnsignedByteType>.plus(that: RA<ByteType>): RA<ShortType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<ShortType>

@JvmName(name = "plus_81")
operator fun RA<UnsignedLongType>.plus(that: RA<UnsignedIntType>): RA<UnsignedLongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<UnsignedLongType>

@JvmName(name = "plus_82")
operator fun RA<UnsignedIntType>.plus(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<UnsignedLongType>

@JvmName(name = "plus_83")
operator fun RA<UnsignedLongType>.plus(that: RA<UnsignedShortType>): RA<UnsignedLongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<UnsignedLongType>

@JvmName(name = "plus_84")
operator fun RA<UnsignedShortType>.plus(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<UnsignedLongType>

@JvmName(name = "plus_85")
operator fun RA<UnsignedLongType>.plus(that: RA<UnsignedByteType>): RA<UnsignedLongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<UnsignedLongType>

@JvmName(name = "plus_86")
operator fun RA<UnsignedByteType>.plus(that: RA<UnsignedLongType>): RA<UnsignedLongType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<UnsignedLongType>

@JvmName(name = "plus_87")
operator fun RA<UnsignedIntType>.plus(that: RA<UnsignedShortType>): RA<UnsignedIntType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<UnsignedIntType>

@JvmName(name = "plus_88")
operator fun RA<UnsignedShortType>.plus(that: RA<UnsignedIntType>): RA<UnsignedIntType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<UnsignedIntType>

@JvmName(name = "plus_89")
operator fun RA<UnsignedIntType>.plus(that: RA<UnsignedByteType>): RA<UnsignedIntType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<UnsignedIntType>

@JvmName(name = "plus_90")
operator fun RA<UnsignedByteType>.plus(that: RA<UnsignedIntType>): RA<UnsignedIntType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<UnsignedIntType>

@JvmName(name = "plus_91")
operator fun RA<UnsignedShortType>.plus(that: RA<UnsignedByteType>): RA<UnsignedShortType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<UnsignedShortType>

@JvmName(name = "plus_92")
operator fun RA<UnsignedByteType>.plus(that: RA<UnsignedShortType>): RA<UnsignedShortType> =
    RandomAccessibleArithmeticPlusExtensionsJava.plus(this, that) as RA<UnsignedShortType>
