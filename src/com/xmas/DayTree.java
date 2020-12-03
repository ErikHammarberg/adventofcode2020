package com.xmas;

import java.util.Arrays;

public class DayTree {

  public int puzzleOne(String input) {
    return puzzleCounter(input, 3, 1);
  }

  public int puzzleCounter(String input, int right, int down ) {
    int result = 0;
    int position = 0;
    var slope = input.split("\\n");
    for(int i = 1; i < slope.length; i += down) {
      position = (position + right) % slope[i].length();
      if(slope[i].charAt(position) == '#') {
        ++result;
      }
    }

    return result;
  }

}
