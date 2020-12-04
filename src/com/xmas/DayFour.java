package com.xmas;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class DayFour {

  public long puzzleOne(String input) {
    return Arrays.stream(input.split("\\n\\n"))
        .map(Passport::new)
        .filter(Passport::isValid)
        .count();
  }

  class Passport {

    Map<String,String> values;

    public Passport(String input) {
      var inputSplit = input.split("\\s");
      values = Arrays.stream(inputSplit).map(pass -> pass.split(":"))
          .map(pass -> new SimpleEntry<String, String>(pass[0],pass[1]))
          .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public boolean isValid() {
      String[] requiredFields = {"byr",
          "iyr",
          "eyr",
          "hgt",
          "hcl",
          "ecl",
          "pid"};

      for(var s : requiredFields) {
        if(!values.containsKey(s)) {
          return false;
        }
      }
      return true;
    }
  }
}
