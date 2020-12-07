package com.xmas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class DaySeven {

  public int puzzleOne(String input) {
    var theMap = buildContainingMap(input);
    return theMap.get("shiny gold").size();
  }

  private Map<String, List<String>> buildContainingMap(String input) {
    var contensMap = new HashMap<String, List<String>>();
    for (var line : input.split("\\n")) {
      var matcher = Pattern.compile("(.+) bags contain (.+).").matcher(line);

      if (matcher.find()) {
        String outerBag = matcher.group(1);
        String contents = matcher.group(2);
        for (var innerLine : contents.split(",")) {
          var bagMatcher = Pattern.compile("\\d (.+) bag[s]?").matcher(innerLine);
          if (bagMatcher.find()) {
            String containedBag = bagMatcher.group(1);
            addElement(contensMap, containedBag, outerBag);
          }
        }
      }
    }
    return contensMap;
  }

  private void addElement(Map<String, List<String>> theMap, String key, String toAdd) {
    var theList = theMap.get(key);
    if(theList != null) {
      theList.add(toAdd);
    } else {
      var list = new ArrayList<String>();
      list.add(toAdd);
      theMap.put(key, list);
    }
  }

}
