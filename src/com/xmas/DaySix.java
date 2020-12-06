package com.xmas;

import java.util.Arrays;

public class DaySix {

    public int puzOne(String input) {
        return Arrays.stream(input.split("\\n\\n")).map(in -> in.replace("\n",""))
                .mapToInt(in -> (int)in.chars().distinct().count())
                .sum();
    }
}
