package com.xmas;

import java.util.Arrays;

public class DayTree {

  public int puzzleOne(String input ) {
    int result = 0;
    int position = 0;
    var slope = input.split("\\n");
    for(int i = 1; i < slope.length; i ++) {
      position = (position + 3) % slope[i].length();
      if(slope[i].charAt(position) == '#') {
        ++result;
      }
    }

    return result;
  }

}
