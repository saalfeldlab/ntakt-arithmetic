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
import net.imglib2.RandomAccessibleInterval as RAI

@JvmName(name = "div_1")
operator fun <T> RAI<T>.div(that: RAI<T>): RAI<T> where T : Type<T>, T : Div<T> {
  return convert(that, type, BiConverterDiv.instance<T>())
}

@JvmName(name = "div_2")
operator fun RAI<RealType<*>>.div(that: RAI<RealType<*>>): RAI<RealType<*>> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as? RAI<RealType<*>> ?:
    error("Arithmetic operator / (div) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")

@JvmName(name = "div_3")
operator fun RAI<DoubleType>.div(that: RAI<FloatType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<DoubleType>

@JvmName(name = "div_4")
operator fun RAI<FloatType>.div(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<DoubleType>

@JvmName(name = "div_5")
operator fun RAI<DoubleType>.div(that: RAI<LongType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<DoubleType>

@JvmName(name = "div_6")
operator fun RAI<LongType>.div(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<DoubleType>

@JvmName(name = "div_7")
operator fun RAI<DoubleType>.div(that: RAI<IntType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<DoubleType>

@JvmName(name = "div_8")
operator fun RAI<IntType>.div(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<DoubleType>

@JvmName(name = "div_9")
operator fun RAI<DoubleType>.div(that: RAI<ShortType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<DoubleType>

@JvmName(name = "div_10")
operator fun RAI<ShortType>.div(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<DoubleType>

@JvmName(name = "div_11")
operator fun RAI<DoubleType>.div(that: RAI<ByteType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<DoubleType>

@JvmName(name = "div_12")
operator fun RAI<ByteType>.div(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<DoubleType>

@JvmName(name = "div_13")
operator fun RAI<DoubleType>.div(that: RAI<UnsignedLongType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<DoubleType>

@JvmName(name = "div_14")
operator fun RAI<UnsignedLongType>.div(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<DoubleType>

@JvmName(name = "div_15")
operator fun RAI<DoubleType>.div(that: RAI<UnsignedIntType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<DoubleType>

@JvmName(name = "div_16")
operator fun RAI<UnsignedIntType>.div(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<DoubleType>

@JvmName(name = "div_17")
operator fun RAI<DoubleType>.div(that: RAI<UnsignedShortType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<DoubleType>

@JvmName(name = "div_18")
operator fun RAI<UnsignedShortType>.div(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<DoubleType>

@JvmName(name = "div_19")
operator fun RAI<DoubleType>.div(that: RAI<UnsignedByteType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<DoubleType>

@JvmName(name = "div_20")
operator fun RAI<UnsignedByteType>.div(that: RAI<DoubleType>): RAI<DoubleType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<DoubleType>

@JvmName(name = "div_21")
operator fun RAI<FloatType>.div(that: RAI<LongType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<FloatType>

@JvmName(name = "div_22")
operator fun RAI<LongType>.div(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<FloatType>

@JvmName(name = "div_23")
operator fun RAI<FloatType>.div(that: RAI<IntType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<FloatType>

@JvmName(name = "div_24")
operator fun RAI<IntType>.div(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<FloatType>

@JvmName(name = "div_25")
operator fun RAI<FloatType>.div(that: RAI<ShortType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<FloatType>

@JvmName(name = "div_26")
operator fun RAI<ShortType>.div(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<FloatType>

@JvmName(name = "div_27")
operator fun RAI<FloatType>.div(that: RAI<ByteType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<FloatType>

@JvmName(name = "div_28")
operator fun RAI<ByteType>.div(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<FloatType>

@JvmName(name = "div_29")
operator fun RAI<FloatType>.div(that: RAI<UnsignedLongType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<FloatType>

@JvmName(name = "div_30")
operator fun RAI<UnsignedLongType>.div(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<FloatType>

@JvmName(name = "div_31")
operator fun RAI<FloatType>.div(that: RAI<UnsignedIntType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<FloatType>

@JvmName(name = "div_32")
operator fun RAI<UnsignedIntType>.div(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<FloatType>

@JvmName(name = "div_33")
operator fun RAI<FloatType>.div(that: RAI<UnsignedShortType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<FloatType>

@JvmName(name = "div_34")
operator fun RAI<UnsignedShortType>.div(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<FloatType>

@JvmName(name = "div_35")
operator fun RAI<FloatType>.div(that: RAI<UnsignedByteType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<FloatType>

@JvmName(name = "div_36")
operator fun RAI<UnsignedByteType>.div(that: RAI<FloatType>): RAI<FloatType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<FloatType>

@JvmName(name = "div_37")
operator fun RAI<LongType>.div(that: RAI<IntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_38")
operator fun RAI<IntType>.div(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_39")
operator fun RAI<LongType>.div(that: RAI<ShortType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_40")
operator fun RAI<ShortType>.div(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_41")
operator fun RAI<LongType>.div(that: RAI<ByteType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_42")
operator fun RAI<ByteType>.div(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_43")
operator fun RAI<LongType>.div(that: RAI<UnsignedLongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_44")
operator fun RAI<UnsignedLongType>.div(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_45")
operator fun RAI<LongType>.div(that: RAI<UnsignedIntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_46")
operator fun RAI<UnsignedIntType>.div(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_47")
operator fun RAI<LongType>.div(that: RAI<UnsignedShortType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_48")
operator fun RAI<UnsignedShortType>.div(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_49")
operator fun RAI<LongType>.div(that: RAI<UnsignedByteType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_50")
operator fun RAI<UnsignedByteType>.div(that: RAI<LongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_51")
operator fun RAI<IntType>.div(that: RAI<ShortType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<IntType>

@JvmName(name = "div_52")
operator fun RAI<ShortType>.div(that: RAI<IntType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<IntType>

@JvmName(name = "div_53")
operator fun RAI<IntType>.div(that: RAI<ByteType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<IntType>

@JvmName(name = "div_54")
operator fun RAI<ByteType>.div(that: RAI<IntType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<IntType>

@JvmName(name = "div_55")
operator fun RAI<IntType>.div(that: RAI<UnsignedLongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_56")
operator fun RAI<UnsignedLongType>.div(that: RAI<IntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_57")
operator fun RAI<IntType>.div(that: RAI<UnsignedIntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_58")
operator fun RAI<UnsignedIntType>.div(that: RAI<IntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_59")
operator fun RAI<IntType>.div(that: RAI<UnsignedShortType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<IntType>

@JvmName(name = "div_60")
operator fun RAI<UnsignedShortType>.div(that: RAI<IntType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<IntType>

@JvmName(name = "div_61")
operator fun RAI<IntType>.div(that: RAI<UnsignedByteType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<IntType>

@JvmName(name = "div_62")
operator fun RAI<UnsignedByteType>.div(that: RAI<IntType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<IntType>

@JvmName(name = "div_63")
operator fun RAI<ShortType>.div(that: RAI<ByteType>): RAI<ShortType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<ShortType>

@JvmName(name = "div_64")
operator fun RAI<ByteType>.div(that: RAI<ShortType>): RAI<ShortType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<ShortType>

@JvmName(name = "div_65")
operator fun RAI<ShortType>.div(that: RAI<UnsignedLongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_66")
operator fun RAI<UnsignedLongType>.div(that: RAI<ShortType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_67")
operator fun RAI<ShortType>.div(that: RAI<UnsignedIntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_68")
operator fun RAI<UnsignedIntType>.div(that: RAI<ShortType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_69")
operator fun RAI<ShortType>.div(that: RAI<UnsignedShortType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<IntType>

@JvmName(name = "div_70")
operator fun RAI<UnsignedShortType>.div(that: RAI<ShortType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<IntType>

@JvmName(name = "div_71")
operator fun RAI<ShortType>.div(that: RAI<UnsignedByteType>): RAI<ShortType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<ShortType>

@JvmName(name = "div_72")
operator fun RAI<UnsignedByteType>.div(that: RAI<ShortType>): RAI<ShortType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<ShortType>

@JvmName(name = "div_73")
operator fun RAI<ByteType>.div(that: RAI<UnsignedLongType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_74")
operator fun RAI<UnsignedLongType>.div(that: RAI<ByteType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_75")
operator fun RAI<ByteType>.div(that: RAI<UnsignedIntType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_76")
operator fun RAI<UnsignedIntType>.div(that: RAI<ByteType>): RAI<LongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<LongType>

@JvmName(name = "div_77")
operator fun RAI<ByteType>.div(that: RAI<UnsignedShortType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<IntType>

@JvmName(name = "div_78")
operator fun RAI<UnsignedShortType>.div(that: RAI<ByteType>): RAI<IntType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<IntType>

@JvmName(name = "div_79")
operator fun RAI<ByteType>.div(that: RAI<UnsignedByteType>): RAI<ShortType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<ShortType>

@JvmName(name = "div_80")
operator fun RAI<UnsignedByteType>.div(that: RAI<ByteType>): RAI<ShortType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<ShortType>

@JvmName(name = "div_81")
operator fun RAI<UnsignedLongType>.div(that: RAI<UnsignedIntType>): RAI<UnsignedLongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<UnsignedLongType>

@JvmName(name = "div_82")
operator fun RAI<UnsignedIntType>.div(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<UnsignedLongType>

@JvmName(name = "div_83")
operator fun RAI<UnsignedLongType>.div(that: RAI<UnsignedShortType>): RAI<UnsignedLongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<UnsignedLongType>

@JvmName(name = "div_84")
operator fun RAI<UnsignedShortType>.div(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<UnsignedLongType>

@JvmName(name = "div_85")
operator fun RAI<UnsignedLongType>.div(that: RAI<UnsignedByteType>): RAI<UnsignedLongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<UnsignedLongType>

@JvmName(name = "div_86")
operator fun RAI<UnsignedByteType>.div(that: RAI<UnsignedLongType>): RAI<UnsignedLongType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<UnsignedLongType>

@JvmName(name = "div_87")
operator fun RAI<UnsignedIntType>.div(that: RAI<UnsignedShortType>): RAI<UnsignedIntType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<UnsignedIntType>

@JvmName(name = "div_88")
operator fun RAI<UnsignedShortType>.div(that: RAI<UnsignedIntType>): RAI<UnsignedIntType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<UnsignedIntType>

@JvmName(name = "div_89")
operator fun RAI<UnsignedIntType>.div(that: RAI<UnsignedByteType>): RAI<UnsignedIntType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<UnsignedIntType>

@JvmName(name = "div_90")
operator fun RAI<UnsignedByteType>.div(that: RAI<UnsignedIntType>): RAI<UnsignedIntType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<UnsignedIntType>

@JvmName(name = "div_91")
operator fun RAI<UnsignedShortType>.div(that: RAI<UnsignedByteType>): RAI<UnsignedShortType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<UnsignedShortType>

@JvmName(name = "div_92")
operator fun RAI<UnsignedByteType>.div(that: RAI<UnsignedShortType>): RAI<UnsignedShortType> =
    RandomAccessibleIntervalArithmeticDivExtensionsJava.div(this, that) as RAI<UnsignedShortType>
