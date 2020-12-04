package com.xmas;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DayFour {

  public long puzzleOne(String input) {
    return Arrays.stream(input.split("\\n\\n"))
        .map(Passport::new)
        .filter(Passport::laxIsValid)
        .count();
  }

  public long puzzleTwo(String input) {
    return Arrays.stream(input.split("\\n\\n"))
        .map(Passport::new)
        .filter(Passport::strictIsValid)
        .count();
  }

  class Passport {

    Map<String, String> values;

    public Passport(String input) {
      var inputSplit = input.split("\\s");
      values = Arrays.stream(inputSplit).map(pass -> pass.split(":"))
          .map(pass -> new SimpleEntry<String, String>(pass[0], pass[1]))
          .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public boolean laxIsValid() {
      String[] requiredFields = {"byr",
          "iyr",
          "eyr",
          "hgt",
          "hcl",
          "ecl",
          "pid"};

      for (var s : requiredFields) {
        if (!values.containsKey(s)) {
          return false;
        }
      }
      return true;
    }

    public boolean strictIsValid() {
      if (!laxIsValid()) {
        return false;
      }
      return isValidYear(values.get("byr"), 1920, 2002) &&
          isValidYear(values.get("iyr"), 2010, 2020) &&
          isValidYear(values.get("eyr"), 2020, 2030) &&
          isValidHeight(values.get("hgt")) &&
          isValidHcl(values.get("hcl")) &&
          isValidEcl(values.get("ecl")) &&
          isValidPid(values.get("pid"));

    }

    public boolean isValidYear(String input, int lowBound, int highBound) {
      var intValue = Integer.parseInt(input);
      return input.matches("[12][09]\\d\\d") &&
          intValue >= lowBound && intValue <= highBound;
    }

    public boolean isValidHeight(String input) {
      var matcher = Pattern.compile("(\\d+)([a-z][a-z])").matcher(input);
      if (matcher.find()) {
        var value = Integer.parseInt(matcher.group(1));
        var unit = matcher.group(2);
        switch (unit) {
          case "cm":
            return value >= 150 && value <= 193;
          case "in":
            return value >= 59 && value <= 76;
        }
      }
      return false;
    }

    public boolean isValidHcl(String input) {
      return input.matches("#[0-9a-f]{6}");
    }

    public boolean isValidEcl(String input) {
      String[] validEcl = {"amb", "blu", "brn", "gry", "grn", "hzl", "oth"};
      return Arrays.stream(validEcl).anyMatch(clr -> clr.equals(input));
    }

    public boolean isValidPid(String input) {
      return input.matches("\\d{9}");
    }

  }
}
