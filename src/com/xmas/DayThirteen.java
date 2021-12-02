package com.xmas;

import java.util.Arrays;

public class DayThirteen {

    public int solveOne(String input) {
        var inputs = input.split("\\n");
        return findOneThingy(Integer.parseInt(inputs[0]), inputs[1]);
    }

    private int findOneThingy(int timestart, String input) {

        var theLowest = Arrays.stream(input.split(","))
                .filter(num -> num.matches("\\d+"))
                .map(Integer::parseInt)
                .reduce(new BusParse(0, Integer.MAX_VALUE)
                    ,(lowest, element) ->
                        {
                            int waiter = element - timestart % element;
                            if(waiter < lowest.waitTime) {
                                return new BusParse(element, waiter);
                            }
                            return lowest;
                        }
                        , (a,b)->a);

        return theLowest.period * theLowest.waitTime;
    }

    record BusParse (
        int period,
        int waitTime) { }
}
