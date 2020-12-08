package com.xmas;

public class DayEight {
  public int puzzleOne(String input) {
    return executeEachOnce(input.split("\\n"));
  }

  private int executeEachOnce(String[] inputs) {

    boolean[] executionKeeper = new boolean[inputs.length];
    int executionPointer = 0;
    int accumulator = 0;

    while(!executionKeeper[executionPointer]) {
      var instruction = inputs[executionPointer].split(" ");
      executionKeeper[executionPointer] = true;
      switch (instruction[0]) {
        case "nop":
          executionPointer++;
          break;
        case "jmp":
          executionPointer += Integer.parseInt(instruction[1]);
          break;
        case "acc":
          accumulator += Integer.parseInt(instruction[1]);
          executionPointer++;
          break;
      }
    }
    return accumulator;
  }

}
