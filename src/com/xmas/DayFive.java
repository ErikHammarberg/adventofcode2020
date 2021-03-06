package com.xmas;

import java.util.ArrayList;
import java.util.Arrays;

public class DayFive {

    public int puzzleOne(String input) {
        return Arrays.stream(input.split("\\n")).mapToInt(in -> {
            int row = solve(in.substring(0,7), 7,'B');
            int col = solve(in.substring(7,in.length()),3, 'R');
            return row *8 + col;
        }).max().getAsInt();
    }

    public int puzzleTwo(String input) {
        var ids=  Arrays.stream(input.split("\\n")).mapToInt(in -> {
            int row = solve(in.substring(0,7), 7,'B');
            int col = solve(in.substring(7,in.length()),3, 'R');
            return row *8 + col;
        }).sorted().toArray();

        int previous = -1;
        for(var element : ids) {
            if(element == previous + 2) {
                return element-1;
            }
            previous = element;
        }
        throw new RuntimeException("No seat found");
    }


    private int solve(String input, int range, char increaseLetter) {
        int result = 0;
        for(int i = 0; i < range; i++) {
            if(input.charAt(i) == increaseLetter) {
                result += (int)Math.pow(2, range -i - 1);
            }
        }
        return result;
    }
}
