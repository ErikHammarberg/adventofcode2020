package com.xmas;

public class DayTree {

  public int puzzleOne(String input) {
    return puzzleCounter(input, 3, 1);
  }

  public int puzzleTwo(String input) {
    int one = puzzleCounter(input, 1, 1);
    int two = puzzleCounter(input, 3, 1);
    int three = puzzleCounter(input, 5, 1);
    int four = puzzleCounter(input, 7, 1);
    int five = puzzleCounter(input, 1, 2);

    System.out.println("Path one: " + one);
    System.out.println("Path two: " + two);
    System.out.println("Path three: " + three);
    System.out.println("Path four: " + four);
    System.out.println("Path five: " + five);

    return one * two * three * four * five;
  }

  public int puzzleCounter(String input, int right, int down) {
    int result = 0;
    int position = 0;
    var slope = input.split("\\n");
    for (int i = down; i < slope.length; i += down) {
      position = (position + right) % slope[i].length();
      if (slope[i].charAt(position) == '#') {
        ++result;
      }
    }

    return result;
  }

}
