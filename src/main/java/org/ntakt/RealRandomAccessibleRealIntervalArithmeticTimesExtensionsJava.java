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

package org.ntakt;

import static org.ntakt.RealRandomAccessibleRealIntervalArithmeticTimesExtensionsKt.times_1;
import static org.ntakt.RealRandomAccessibleRealIntervalConverterExtensionsKt.asType;
import static org.ntakt.RealRandomAccessibleRealIntervalExtensionsKt.getType;

import net.imglib2.RealRandomAccessibleRealInterval;
import net.imglib2.type.numeric.RealType;
import net.imglib2.type.numeric.integer.ByteType;
import net.imglib2.type.numeric.integer.IntType;
import net.imglib2.type.numeric.integer.LongType;
import net.imglib2.type.numeric.integer.ShortType;
import net.imglib2.type.numeric.integer.UnsignedByteType;
import net.imglib2.type.numeric.integer.UnsignedIntType;
import net.imglib2.type.numeric.integer.UnsignedLongType;
import net.imglib2.type.numeric.integer.UnsignedShortType;
import net.imglib2.type.numeric.real.DoubleType;
import net.imglib2.type.numeric.real.FloatType;

public class RealRandomAccessibleRealIntervalArithmeticTimesExtensionsJava {
  public static RealRandomAccessibleRealInterval<? extends RealType> times(
      final RealRandomAccessibleRealInterval<? extends RealType> thiz,
      final RealRandomAccessibleRealInterval<? extends RealType> that) {
    if (getType(thiz) instanceof DoubleType && getType(that) instanceof DoubleType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof DoubleType && getType(that) instanceof FloatType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof DoubleType && getType(that) instanceof LongType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof DoubleType && getType(that) instanceof IntType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof DoubleType && getType(that) instanceof ShortType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof DoubleType && getType(that) instanceof ByteType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof DoubleType && getType(that) instanceof UnsignedLongType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof DoubleType && getType(that) instanceof UnsignedIntType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof DoubleType && getType(that) instanceof UnsignedShortType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof DoubleType && getType(that) instanceof UnsignedByteType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof FloatType && getType(that) instanceof DoubleType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof FloatType && getType(that) instanceof FloatType) return times_1(asType(thiz, new FloatType()), asType(that, new FloatType()));
    if (getType(thiz) instanceof FloatType && getType(that) instanceof LongType) return times_1(asType(thiz, new FloatType()), asType(that, new FloatType()));
    if (getType(thiz) instanceof FloatType && getType(that) instanceof IntType) return times_1(asType(thiz, new FloatType()), asType(that, new FloatType()));
    if (getType(thiz) instanceof FloatType && getType(that) instanceof ShortType) return times_1(asType(thiz, new FloatType()), asType(that, new FloatType()));
    if (getType(thiz) instanceof FloatType && getType(that) instanceof ByteType) return times_1(asType(thiz, new FloatType()), asType(that, new FloatType()));
    if (getType(thiz) instanceof FloatType && getType(that) instanceof UnsignedLongType) return times_1(asType(thiz, new FloatType()), asType(that, new FloatType()));
    if (getType(thiz) instanceof FloatType && getType(that) instanceof UnsignedIntType) return times_1(asType(thiz, new FloatType()), asType(that, new FloatType()));
    if (getType(thiz) instanceof FloatType && getType(that) instanceof UnsignedShortType) return times_1(asType(thiz, new FloatType()), asType(that, new FloatType()));
    if (getType(thiz) instanceof FloatType && getType(that) instanceof UnsignedByteType) return times_1(asType(thiz, new FloatType()), asType(that, new FloatType()));
    if (getType(thiz) instanceof LongType && getType(that) instanceof DoubleType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof LongType && getType(that) instanceof FloatType) return times_1(asType(thiz, new FloatType()), asType(that, new FloatType()));
    if (getType(thiz) instanceof LongType && getType(that) instanceof LongType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof LongType && getType(that) instanceof IntType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof LongType && getType(that) instanceof ShortType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof LongType && getType(that) instanceof ByteType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof LongType && getType(that) instanceof UnsignedLongType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof LongType && getType(that) instanceof UnsignedIntType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof LongType && getType(that) instanceof UnsignedShortType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof LongType && getType(that) instanceof UnsignedByteType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof IntType && getType(that) instanceof DoubleType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof IntType && getType(that) instanceof FloatType) return times_1(asType(thiz, new FloatType()), asType(that, new FloatType()));
    if (getType(thiz) instanceof IntType && getType(that) instanceof LongType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof IntType && getType(that) instanceof IntType) return times_1(asType(thiz, new IntType()), asType(that, new IntType()));
    if (getType(thiz) instanceof IntType && getType(that) instanceof ShortType) return times_1(asType(thiz, new IntType()), asType(that, new IntType()));
    if (getType(thiz) instanceof IntType && getType(that) instanceof ByteType) return times_1(asType(thiz, new IntType()), asType(that, new IntType()));
    if (getType(thiz) instanceof IntType && getType(that) instanceof UnsignedLongType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof IntType && getType(that) instanceof UnsignedIntType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof IntType && getType(that) instanceof UnsignedShortType) return times_1(asType(thiz, new IntType()), asType(that, new IntType()));
    if (getType(thiz) instanceof IntType && getType(that) instanceof UnsignedByteType) return times_1(asType(thiz, new IntType()), asType(that, new IntType()));
    if (getType(thiz) instanceof ShortType && getType(that) instanceof DoubleType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof ShortType && getType(that) instanceof FloatType) return times_1(asType(thiz, new FloatType()), asType(that, new FloatType()));
    if (getType(thiz) instanceof ShortType && getType(that) instanceof LongType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof ShortType && getType(that) instanceof IntType) return times_1(asType(thiz, new IntType()), asType(that, new IntType()));
    if (getType(thiz) instanceof ShortType && getType(that) instanceof ShortType) return times_1(asType(thiz, new ShortType()), asType(that, new ShortType()));
    if (getType(thiz) instanceof ShortType && getType(that) instanceof ByteType) return times_1(asType(thiz, new ShortType()), asType(that, new ShortType()));
    if (getType(thiz) instanceof ShortType && getType(that) instanceof UnsignedLongType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof ShortType && getType(that) instanceof UnsignedIntType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof ShortType && getType(that) instanceof UnsignedShortType) return times_1(asType(thiz, new IntType()), asType(that, new IntType()));
    if (getType(thiz) instanceof ShortType && getType(that) instanceof UnsignedByteType) return times_1(asType(thiz, new ShortType()), asType(that, new ShortType()));
    if (getType(thiz) instanceof ByteType && getType(that) instanceof DoubleType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof ByteType && getType(that) instanceof FloatType) return times_1(asType(thiz, new FloatType()), asType(that, new FloatType()));
    if (getType(thiz) instanceof ByteType && getType(that) instanceof LongType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof ByteType && getType(that) instanceof IntType) return times_1(asType(thiz, new IntType()), asType(that, new IntType()));
    if (getType(thiz) instanceof ByteType && getType(that) instanceof ShortType) return times_1(asType(thiz, new ShortType()), asType(that, new ShortType()));
    if (getType(thiz) instanceof ByteType && getType(that) instanceof ByteType) return times_1(asType(thiz, new ByteType()), asType(that, new ByteType()));
    if (getType(thiz) instanceof ByteType && getType(that) instanceof UnsignedLongType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof ByteType && getType(that) instanceof UnsignedIntType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof ByteType && getType(that) instanceof UnsignedShortType) return times_1(asType(thiz, new IntType()), asType(that, new IntType()));
    if (getType(thiz) instanceof ByteType && getType(that) instanceof UnsignedByteType) return times_1(asType(thiz, new ShortType()), asType(that, new ShortType()));
    if (getType(thiz) instanceof UnsignedLongType && getType(that) instanceof DoubleType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof UnsignedLongType && getType(that) instanceof FloatType) return times_1(asType(thiz, new FloatType()), asType(that, new FloatType()));
    if (getType(thiz) instanceof UnsignedLongType && getType(that) instanceof LongType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof UnsignedLongType && getType(that) instanceof IntType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof UnsignedLongType && getType(that) instanceof ShortType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof UnsignedLongType && getType(that) instanceof ByteType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof UnsignedLongType && getType(that) instanceof UnsignedLongType) return times_1(asType(thiz, new UnsignedLongType()), asType(that, new UnsignedLongType()));
    if (getType(thiz) instanceof UnsignedLongType && getType(that) instanceof UnsignedIntType) return times_1(asType(thiz, new UnsignedLongType()), asType(that, new UnsignedLongType()));
    if (getType(thiz) instanceof UnsignedLongType && getType(that) instanceof UnsignedShortType) return times_1(asType(thiz, new UnsignedLongType()), asType(that, new UnsignedLongType()));
    if (getType(thiz) instanceof UnsignedLongType && getType(that) instanceof UnsignedByteType) return times_1(asType(thiz, new UnsignedLongType()), asType(that, new UnsignedLongType()));
    if (getType(thiz) instanceof UnsignedIntType && getType(that) instanceof DoubleType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof UnsignedIntType && getType(that) instanceof FloatType) return times_1(asType(thiz, new FloatType()), asType(that, new FloatType()));
    if (getType(thiz) instanceof UnsignedIntType && getType(that) instanceof LongType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof UnsignedIntType && getType(that) instanceof IntType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof UnsignedIntType && getType(that) instanceof ShortType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof UnsignedIntType && getType(that) instanceof ByteType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof UnsignedIntType && getType(that) instanceof UnsignedLongType) return times_1(asType(thiz, new UnsignedLongType()), asType(that, new UnsignedLongType()));
    if (getType(thiz) instanceof UnsignedIntType && getType(that) instanceof UnsignedIntType) return times_1(asType(thiz, new UnsignedIntType()), asType(that, new UnsignedIntType()));
    if (getType(thiz) instanceof UnsignedIntType && getType(that) instanceof UnsignedShortType) return times_1(asType(thiz, new UnsignedIntType()), asType(that, new UnsignedIntType()));
    if (getType(thiz) instanceof UnsignedIntType && getType(that) instanceof UnsignedByteType) return times_1(asType(thiz, new UnsignedIntType()), asType(that, new UnsignedIntType()));
    if (getType(thiz) instanceof UnsignedShortType && getType(that) instanceof DoubleType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof UnsignedShortType && getType(that) instanceof FloatType) return times_1(asType(thiz, new FloatType()), asType(that, new FloatType()));
    if (getType(thiz) instanceof UnsignedShortType && getType(that) instanceof LongType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof UnsignedShortType && getType(that) instanceof IntType) return times_1(asType(thiz, new IntType()), asType(that, new IntType()));
    if (getType(thiz) instanceof UnsignedShortType && getType(that) instanceof ShortType) return times_1(asType(thiz, new IntType()), asType(that, new IntType()));
    if (getType(thiz) instanceof UnsignedShortType && getType(that) instanceof ByteType) return times_1(asType(thiz, new IntType()), asType(that, new IntType()));
    if (getType(thiz) instanceof UnsignedShortType && getType(that) instanceof UnsignedLongType) return times_1(asType(thiz, new UnsignedLongType()), asType(that, new UnsignedLongType()));
    if (getType(thiz) instanceof UnsignedShortType && getType(that) instanceof UnsignedIntType) return times_1(asType(thiz, new UnsignedIntType()), asType(that, new UnsignedIntType()));
    if (getType(thiz) instanceof UnsignedShortType && getType(that) instanceof UnsignedShortType) return times_1(asType(thiz, new UnsignedShortType()), asType(that, new UnsignedShortType()));
    if (getType(thiz) instanceof UnsignedShortType && getType(that) instanceof UnsignedByteType) return times_1(asType(thiz, new UnsignedShortType()), asType(that, new UnsignedShortType()));
    if (getType(thiz) instanceof UnsignedByteType && getType(that) instanceof DoubleType) return times_1(asType(thiz, new DoubleType()), asType(that, new DoubleType()));
    if (getType(thiz) instanceof UnsignedByteType && getType(that) instanceof FloatType) return times_1(asType(thiz, new FloatType()), asType(that, new FloatType()));
    if (getType(thiz) instanceof UnsignedByteType && getType(that) instanceof LongType) return times_1(asType(thiz, new LongType()), asType(that, new LongType()));
    if (getType(thiz) instanceof UnsignedByteType && getType(that) instanceof IntType) return times_1(asType(thiz, new IntType()), asType(that, new IntType()));
    if (getType(thiz) instanceof UnsignedByteType && getType(that) instanceof ShortType) return times_1(asType(thiz, new ShortType()), asType(that, new ShortType()));
    if (getType(thiz) instanceof UnsignedByteType && getType(that) instanceof ByteType) return times_1(asType(thiz, new ShortType()), asType(that, new ShortType()));
    if (getType(thiz) instanceof UnsignedByteType && getType(that) instanceof UnsignedLongType) return times_1(asType(thiz, new UnsignedLongType()), asType(that, new UnsignedLongType()));
    if (getType(thiz) instanceof UnsignedByteType && getType(that) instanceof UnsignedIntType) return times_1(asType(thiz, new UnsignedIntType()), asType(that, new UnsignedIntType()));
    if (getType(thiz) instanceof UnsignedByteType && getType(that) instanceof UnsignedShortType) return times_1(asType(thiz, new UnsignedShortType()), asType(that, new UnsignedShortType()));
    if (getType(thiz) instanceof UnsignedByteType && getType(that) instanceof UnsignedByteType) return times_1(asType(thiz, new UnsignedByteType()), asType(that, new UnsignedByteType()));
    return null;

  }
}
