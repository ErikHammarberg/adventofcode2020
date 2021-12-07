package com.xmas;

import java.util.ArrayList;
import java.util.Arrays;

public class DayThirteen {

    public int solveOne(String input) {
        var inputs = input.split("\\n");
        return findOneThingy(Integer.parseInt(inputs[0]), inputs[1]);
    }

    public long solveTwo(String input) {
        var inputs = input.split("\\n");
        return findSecond( inputs[1]);
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

    public long findSecond(String input) {
        var inputs = input.split(",");

        var numbers = new ArrayList<Integer>();
        var distances = new ArrayList<Integer>();
        var nums = new ArrayList<NumPosition>();
        int maxVal = 0;
        int maxValIndex = 0;
        for(int i=0, lastValIndex = 0 ; i < inputs.length; i++ ) {
            if (inputs[i].matches("\\d+")) {
                var number = Integer.parseInt(inputs[i]);

                nums.add(new NumPosition(number, i));
                if(number > maxVal) {
                    maxVal = number;
                    maxValIndex = nums.size()-1;
                }
                lastValIndex = i;
            }
        }


        var sortedList = nums.stream().sorted().toList();

        for(long i = maxVal; i < 100000000000000l ; i += maxVal) {
            boolean ok = true;
            for(int inner = 1; inner < sortedList.size() && ok; inner++) {
                final var value = sortedList.get(inner).value();
                final var distance = sortedList.get(inner).distance() - sortedList.get(0).distance();
                if ( (i + distance)%value != 0 ) {
                    ok = false;
                }
            }
            if(ok) {
                return i - sortedList.get(0).distance();
            }
        }




        throw new RuntimeException("no found");
    }

    record NumPosition(int value, int distance) implements Comparable{
        @Override
        public int compareTo(Object o) {
           return Integer.compare (((NumPosition)o).value, value);
        }
    }
    record BusParse (
        int period,
        int waitTime) { }
}
