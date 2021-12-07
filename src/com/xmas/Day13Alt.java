package com.xmas;

import java.math.BigInteger;
import java.util.Arrays;

public class Day13Alt {

    public long solveTwo(String input) {
        var numStrings = Arrays.stream(input.split("\\n")[1].split(",")).toList();
        Rotation lastRotation = new Rotation(Integer.parseInt(numStrings.get(0)),0);
        for (int i = 1 ; i < numStrings.size(); i++) {
            final String number = numStrings.get(i);
            if(number.matches("\\d+")) {
                lastRotation = combinedPhasedRotations(lastRotation, new Rotation(
                        Long.parseLong(number), i
                ));
            }
        }
        System.out.println("period:" + lastRotation.period());
        System.out.println("offset:" + lastRotation.offset());
        System.out.println("mod offset: " + Math.floorMod(-lastRotation.offset(), lastRotation.period()) );
        return Math.floorMod(-lastRotation.offset(), lastRotation.period());
    }


    /*
    Combine two phased rotations into a single phased rotation

    Returns: combined_period, combined_phase

    The combined rotation is at its reference point if and only if both a and b
    are at their reference points.
     */
    Rotation combinedPhasedRotations(Rotation red, Rotation green) {

        var gcd = GCD.extendedGcd(red.period(), green.period());
        long phaseDifference = red.offset() - green.offset();
        long pdMult = Math.floorDiv(phaseDifference , gcd.gcd());
        long pdRemainder = Math.floorMod(phaseDifference , gcd.gcd());
        if(pdRemainder != 0) {
            throw new RuntimeException("Will never sync");
        }

        BigInteger bigCombinedPeriod = BigInteger.valueOf(red.period()).divide(BigInteger.valueOf(gcd.gcd())).multiply(BigInteger.valueOf(
            green.period()));
        long combinedPeriod = red.period() / gcd.gcd() * green.period();
        long combinedPhase = Math.floorMod(red.offset - gcd.s() * pdMult * red.period(), combinedPeriod);

        return new Rotation(combinedPeriod, combinedPhase);

    }

    record GCD(long gcd, long s, long t){
        public static GCD extendedGcd(long a, long b) {

            // https://math.stackexchange.com/questions/2218763/how-to-find-lcm-of-two-numbers-when-one-starts-with-an-offset
            //         https://en.wikipedia.org/wiki/Extended_Euclidean_algorithm#Pseudocode

            long oldR = a;
            long r = b;
            long oldS = 1;
            long s = 0;
            long oldT = 0;
            long t = 1;

            while(r != 0) {
                long quotient = Math.floorDiv(oldR , r);
                long rest = Math.floorMod(oldR , r);
                oldR = r;
                r = rest;

                final long tempS = s;
                s = oldS - quotient * s;
                oldS = tempS;

                final long tempT = t;
                t = oldT - quotient * t;
                oldT = tempT;
            }
            return new GCD(oldR,oldS, oldT);
        }
    }

    record Rotation(long period, long offset) {}
}
