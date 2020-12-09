package com.xmas;

import java.util.LinkedList;
import java.util.List;

public class DayNine {


  public static int solveOne(String input, int preamble) {
    var inputs = input.split("\\n");

    var solver = new DayNine(inputs, preamble);

    for(int i = preamble; i < inputs.length; i++) {
      solver.rollingList.add(Integer.parseInt(inputs[i]));
      if(!solver.isValid(i)) {
        return solver.rollingList.get(i);
      }
    }
    throw new RuntimeException("Non found");
  }

  List<Integer> rollingList;
  int preamble;

  DayNine(String[] inputs, int preamble) {
    this.preamble = preamble;
    rollingList = new LinkedList<>();
    for(int i = 0; i < preamble ; i++) {
      rollingList.add(Integer.parseInt(inputs[i]));
    }
  }

  private boolean isValid(int index) {
    for (int i = index - preamble; i < index - 1; i++) {
      for(int j = index - preamble +1; j < index; j++) {
        if(i == j) {
          continue;
        }
        if(rollingList.get(i) + rollingList.get(j) == rollingList.get(index)) {
          return true;
        }
      }
    }
    return false;
  }


}
