package com.xmas;

import java.util.Arrays;

public class DaySix {

    public int puzOne(String input) {
        return Arrays.stream(input.split("\\n\\n")).map(in -> in.replace("\n", ""))
                .mapToInt(in -> (int) in.chars().distinct().count())
                .sum();
    }

    public int puzTwo(String input) {
        return Arrays.stream(input.split("\\n\\n"))
                .mapToInt(this::calcTwo)
                .sum();
    }

    private int calcTwo(String input) {
        return input.lines()    
                .reduce((left, right) -> {
                    var sb = new StringBuilder();
                    for (var s : left.toCharArray()) {
                        if (right.contains(String.valueOf(s))) {
                            sb.append(s);
                        }
                    }
                    return sb.toString();
                }).get().length();
    }
}
