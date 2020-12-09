package com.xmas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DayNine {


  public static int solveOne(String input, int preamble) {
    var inputs = input.split("\\n");

    var solver = new DayNine(inputs, preamble);
    return solver.oneSolution(inputs);

  }

  public static int solveTwo(String input, int preamble) {
    var inputs = input.split("\\n");
    var solver = new DayNine(inputs, preamble);
    var theSum = solver.oneSolution(inputs);

    return solver.findRange(theSum);
  }

  List<Integer> rollingList;
  int preamble;

  DayNine(String[] inputs, int preamble) {
    this.preamble = preamble;
    rollingList = new ArrayList<>(inputs.length);
    for(int i = 0; i < preamble ; i++) {
      rollingList.add(Integer.parseInt(inputs[i]));
    }
  }

  private int oneSolution(String[] inputs) {
    for (int i = preamble; i < inputs.length; i++) {
      rollingList.add(Integer.parseInt(inputs[i]));
      if (!isValid(i)) {
        return rollingList.get(i);
      }
    }
    throw new RuntimeException("Non found");
  }

  private boolean isValid(int index) {
    for (int i = index - preamble; i < index - 1; i++) {
      for (int j = index - preamble + 1; j < index; j++) {
        if (i == j) {
          continue;
        }
        if (rollingList.get(i) + rollingList.get(j) == rollingList.get(index)) {
          return true;
        }
      }
    }
    return false;
  }

  private int findRange(int theSum) {
    for (int i = 0; i < rollingList.size() - 1; i++) {
      int rollingSum = rollingList.get(i);
      int max = rollingSum;
      int min = rollingSum;
      for (int j = i + 1; j < rollingList.size(); j++) {
        rollingSum += rollingList.get(j);
        if(rollingSum < theSum) {
          max = Math.max(max, rollingList.get(j));
          min = Math.min(min, rollingList.get(j));
          continue;
        } else if(rollingSum > theSum) {
          break;
        } else if(rollingSum == theSum) {
          return max + min;
        }
      }
    }
    throw new RuntimeException("Non found");
  }


}
