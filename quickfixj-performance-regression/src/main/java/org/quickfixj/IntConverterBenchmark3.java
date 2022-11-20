package org.quickfixj;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@Fork( 1 )
@State( Scope.Benchmark )
@Warmup( iterations = 3, time = 3, timeUnit = TimeUnit.SECONDS )
@Measurement( iterations = 5, time = 3, timeUnit = TimeUnit.SECONDS )
public class IntConverterBenchmark3 {

    public static void main( String[] args ) throws Exception {
        Options opt = new OptionsBuilder().shouldDoGC( true )
                .include( IntConverterBenchmark3.class.getSimpleName() )
                .build();
        new Runner( opt ).run();
    }



    @Benchmark
    public void benchmarkOld( Blackhole bh ) throws Exception {
        bh.consume( oldConvert( "220912" ) );
    }



    @Benchmark
    public void benchmarkNew( Blackhole bh ) throws Exception {
        bh.consume( convert( "220912" ) );
    }

    private static final String INT_MAX_STRING = String.valueOf( Integer.MAX_VALUE );

    public static int convert( String value ) throws Exception {

        if ( !value.isEmpty() ) {
            final char firstChar = value.charAt( 0 );
            boolean isNegative = ( firstChar == '-' );
            if ( !Character.isDigit( firstChar ) && !isNegative ) {
                throw new Exception( "invalid integral value: " + value );
            }
            int minLength = ( isNegative ? 2 : 1 );
            if ( value.length() < minLength ) {
                throw new Exception( "invalid integral value: " + value );
            }

            // Heuristic: since we have no range check in parseInt() we only parse
            // values which have at least one digit less than Integer.MAX_VALUE and
            // leave the rest to Integer.parseInt().
            // NB: we must not simply reject strings longer than MAX_VALUE since
            // they could possibly include an arbitrary number of leading zeros.
            int maxLength = ( isNegative ? INT_MAX_STRING.length() : INT_MAX_STRING.length() - 1 );
            if ( value.length() <= maxLength ) {
                return parseInt( value, isNegative );
            } else {
                try {
                    return Integer.parseInt( value );
                } catch ( NumberFormatException e ) {
                    throw new Exception( "invalid integral value: " + value + ": " + e );
                }
            }
        } else {
            throw new Exception( "invalid integral value: empty string" );
        }
    }



    static int parseInt( String value, boolean isNegative ) throws Exception {
        int num = 0;
        int firstIndex = ( isNegative ? 1 : 0 );
        for ( int i = firstIndex; i < value.length(); i++ ) {
            if ( Character.isDigit( value.charAt( i ) ) ) {
                num = ( num * 10 ) + ( value.charAt( i ) - '0' );
            } else {
                throw new Exception( "invalid integral value: " + value );
            }
        }
        return isNegative ? -num : num;
    }



    static int oldConvert( String value ) throws Exception {
        try {
            for ( int i = 0; i < value.length(); i++ ) {
                if ( !Character.isDigit( value.charAt( i ) ) && ! ( i == 0 && value.charAt( i ) == '-' ) ) {
                    throw new Exception( "invalid integral value: " + value );
                }
            }
            return Integer.parseInt( value );
        } catch ( NumberFormatException e ) {
            throw new Exception( "invalid integral value: " + value + ": " + e );
        }
    }

}
