package com.xmas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DaySeven {

  public int puzzleOne(String input) {
    var theMap = buildContainingMap(input).contentsMap;
    return findAllContainers(theMap,"shiny gold").size();
  }

  public int puzzleTwo(String input) {
    var theMap = buildContainingMap(input).ruleMap;
    return findAllRuleContainers(theMap, "shiny gold") - 1; // Remove the shiny gold bag
  }

  private Set<String> findAllContainers(Map<String, Set<String>> theMap, String findKey) {
    var containers = theMap.get(findKey);

    if(containers != null ) {
      var newSet = new HashSet(containers.stream()
          .flatMap(bag -> findAllContainers(theMap, bag).stream())
          .collect(Collectors.toSet()));

      newSet.addAll(containers);
      return newSet;
    }
    return new HashSet<String>();
  }

  private int findAllRuleContainers(Map<String, Set<Rule>> theMap, String findKey) {
    var containers = theMap.get(findKey);

    int totalBags = 1;
    if(containers != null ) {


      for (var rule : containers) {
        int requiredNoDownstream = findAllRuleContainers(theMap, rule.name);
        int product = rule.amount * requiredNoDownstream;
        System.out.println(String.format(
            "Bag type: %s required: %d bags, and bag type: %s rule require : %d of these bags", rule.name, requiredNoDownstream, findKey, rule.amount));
        totalBags += product;
      }

    }
    return totalBags;
//
//    if(containers != null ) {
//      return containers.stream()
//          .mapToInt(rule -> findAllRuleContainers(theMap, rule.name) * rule.amount)
//          .sum();
//    }

  }

  private Tupple buildContainingMap(String input) {
    var contensMap = new HashMap<String, Set<String>>();

    var ruleMap = new HashMap<String, Set<Rule>>();

    for (var line : input.split("\\n")) {
      var matcher = Pattern.compile("(.+) bags contain (.+).").matcher(line);

      if (matcher.find()) {
        String outerBag = matcher.group(1);
        String contents = matcher.group(2);
        for (var innerLine : contents.split(",")) {
          var bagMatcher = Pattern.compile("(\\d) (.+) bag[s]?").matcher(innerLine);
          if (bagMatcher.find()) {
            int ammount = Integer.parseInt(bagMatcher.group(1));
            String containedBag = bagMatcher.group(2);
            addElement(contensMap, containedBag, outerBag);
            addRuleElement(ruleMap, outerBag, new Rule(containedBag, ammount));
          }
        }
      }
    }
    return new Tupple(contensMap, ruleMap);
  }

  private void addElement(Map<String, Set<String>> theMap, String key, String toAdd) {
    var theList = theMap.get(key);
    if(theList != null) {
      theList.add(toAdd);
    } else {
      var list = new HashSet<String>();
      list.add(toAdd);
      theMap.put(key, list);
    }
  }

  private void addRuleElement(Map<String, Set<Rule>> theMap, String key, Rule toAdd) {
    var theList = theMap.get(key);
    if(theList != null) {
      theList.add(toAdd);
    } else {
      var list = new HashSet<Rule>();
      list.add(toAdd);
      theMap.put(key, list);
    }
  }

  class Tupple {
    Map<String, Set<String>> contentsMap;
    Map<String, Set<Rule>> ruleMap;

    Tupple(Map<String, Set<String>> contentsMap, Map<String, Set<Rule>> ruleMap) {
      this.contentsMap = contentsMap;
      this.ruleMap = ruleMap;
    }
  }

  class Rule {
    String name;
    int amount;

    public Rule(String name, int amount) {
      this.name = name;
      this.amount = amount;
    }
  }

}
