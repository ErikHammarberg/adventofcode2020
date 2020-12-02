package com.xmas;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class DayTwo {
  public static void main(String[] args) {

  }

  public long puzzle1(String passwords) {
    return Arrays.stream(passwords.split("\\n")).filter(isValidPasswordPuzzle1).count();

  }

  Predicate<String> isValidPasswordPuzzle1 = s -> {
    var row = extractRow(s);
      var numberOfChars = row.password.chars().filter(letter -> letter == row.charachter).count();
      if (numberOfChars <= row.max && numberOfChars >= row.min ) {
        return true;
      }
      return false;
  };

  PassRow extractRow (String input ) {
    var patternString = "(\\d+)-(\\d+) (\\w): (\\w+)";
    var matcher = Pattern.compile(patternString).matcher(input);
    if (matcher.find()) {
      var row = new PassRow(
          Integer.parseInt(matcher.group(1)),
          Integer.parseInt(matcher.group(2)),
          matcher.group(3),
          matcher.group(4));
      return row;

    }
    throw new RuntimeException("Error with predicate");
  }

  class PassRow {
    int min;
    int max;

    public PassRow(int min, int max, String charachter, String password) {
      this.min = min;
      this.max = max;
      this.charachter = charachter.charAt(0);
      this.password = password;
    }

    char charachter;
    String password;

  }

}

