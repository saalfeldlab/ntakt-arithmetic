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
operator fun RRARI<RealType<*>>.times(that: RRARI<RealType<*>>): RRARI<RealType<*>> = when {
    this.type is DoubleType && that.type is DoubleType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is FloatType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is LongType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is IntType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is ShortType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is ByteType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is UnsignedLongType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is UnsignedIntType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is UnsignedShortType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is DoubleType && that.type is UnsignedByteType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is DoubleType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is FloatType -> (this.asType(FloatType()) * that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is LongType -> (this.asType(FloatType()) * that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is IntType -> (this.asType(FloatType()) * that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is ShortType -> (this.asType(FloatType()) * that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is ByteType -> (this.asType(FloatType()) * that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is UnsignedLongType -> (this.asType(FloatType()) * that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is UnsignedIntType -> (this.asType(FloatType()) * that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is UnsignedShortType -> (this.asType(FloatType()) * that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is FloatType && that.type is UnsignedByteType -> (this.asType(FloatType()) * that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is DoubleType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is FloatType -> (this.asType(FloatType()) * that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is LongType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is IntType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is ShortType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is ByteType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is UnsignedLongType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is UnsignedIntType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is UnsignedShortType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is LongType && that.type is UnsignedByteType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is DoubleType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is FloatType -> (this.asType(FloatType()) * that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is LongType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is IntType -> (this.asType(IntType()) * that.asType(IntType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is ShortType -> (this.asType(IntType()) * that.asType(IntType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is ByteType -> (this.asType(IntType()) * that.asType(IntType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is UnsignedLongType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is UnsignedIntType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is UnsignedShortType -> (this.asType(IntType()) * that.asType(IntType())) as RRARI<RealType<*>>
    this.type is IntType && that.type is UnsignedByteType -> (this.asType(IntType()) * that.asType(IntType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is DoubleType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is FloatType -> (this.asType(FloatType()) * that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is LongType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is IntType -> (this.asType(IntType()) * that.asType(IntType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is ShortType -> (this.asType(ShortType()) * that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is ByteType -> (this.asType(ShortType()) * that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is UnsignedLongType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is UnsignedIntType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is UnsignedShortType -> (this.asType(IntType()) * that.asType(IntType())) as RRARI<RealType<*>>
    this.type is ShortType && that.type is UnsignedByteType -> (this.asType(ShortType()) * that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is DoubleType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is FloatType -> (this.asType(FloatType()) * that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is LongType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is IntType -> (this.asType(IntType()) * that.asType(IntType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is ShortType -> (this.asType(ShortType()) * that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is ByteType -> (this.asType(ByteType()) * that.asType(ByteType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is UnsignedLongType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is UnsignedIntType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is UnsignedShortType -> (this.asType(IntType()) * that.asType(IntType())) as RRARI<RealType<*>>
    this.type is ByteType && that.type is UnsignedByteType -> (this.asType(ShortType()) * that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is DoubleType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is FloatType -> (this.asType(FloatType()) * that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is LongType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is IntType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is ShortType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is ByteType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedLongType -> (this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedIntType -> (this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedShortType -> (this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is UnsignedLongType && that.type is UnsignedByteType -> (this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is DoubleType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is FloatType -> (this.asType(FloatType()) * that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is LongType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is IntType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is ShortType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is ByteType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedLongType -> (this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedIntType -> (this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedShortType -> (this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is UnsignedIntType && that.type is UnsignedByteType -> (this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is DoubleType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is FloatType -> (this.asType(FloatType()) * that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is LongType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is IntType -> (this.asType(IntType()) * that.asType(IntType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is ShortType -> (this.asType(IntType()) * that.asType(IntType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is ByteType -> (this.asType(IntType()) * that.asType(IntType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedLongType -> (this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedIntType -> (this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedShortType -> (this.asType(UnsignedShortType()) * that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is UnsignedShortType && that.type is UnsignedByteType -> (this.asType(UnsignedShortType()) * that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is DoubleType -> (this.asType(DoubleType()) * that.asType(DoubleType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is FloatType -> (this.asType(FloatType()) * that.asType(FloatType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is LongType -> (this.asType(LongType()) * that.asType(LongType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is IntType -> (this.asType(IntType()) * that.asType(IntType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is ShortType -> (this.asType(ShortType()) * that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is ByteType -> (this.asType(ShortType()) * that.asType(ShortType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedLongType -> (this.asType(UnsignedLongType()) * that.asType(UnsignedLongType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedIntType -> (this.asType(UnsignedIntType()) * that.asType(UnsignedIntType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedShortType -> (this.asType(UnsignedShortType()) * that.asType(UnsignedShortType())) as RRARI<RealType<*>>
    this.type is UnsignedByteType && that.type is UnsignedByteType -> (this.asType(UnsignedByteType()) * that.asType(UnsignedByteType())) as RRARI<RealType<*>>
    else -> error("Arithmetic operator * (times) not supported for combination of types ${this.type::class} and ${that.type::class}. Use any pairwise combination of ${types.realTypes.map { it::class }}.")
}

