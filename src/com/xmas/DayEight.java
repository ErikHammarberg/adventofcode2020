package com.xmas;

public class DayEight {

  public int puzzleOne(String input) {
    return executeEachOnce(input.split("\\n")).result;
  }

  public int puzzleTwo(String input) {
    var inputs = input.split("\\n");
    for (int i = 0; i < inputs.length; i++) {
      String changedFrom = null;
      if (inputs[i].startsWith("nop")) {
        changedFrom = inputs[i];
        inputs[i] = inputs[i].replace("nop", "jmp");
      } else if (inputs[i].startsWith("jmp")) {
        changedFrom = inputs[i];
        inputs[i] = inputs[i].replace("jmp", "nop");
      }

      if (changedFrom != null) {
        var result = executeEachOnce(inputs);
        if (result.executedNormally) {
          return result.result;
        }
        inputs[i] = changedFrom;
      }
    }
    throw new RuntimeException("Cant find normality");
  }

  private ReturnTupple executeEachOnce(String[] inputs) {

    boolean[] executionKeeper = new boolean[inputs.length];
    int executionPointer = 0;
    int accumulator = 0;

    while (executionPointer < inputs.length) {
      if (executionKeeper[executionPointer]) {
        return new ReturnTupple(false, accumulator);
      }
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
    return new ReturnTupple(true, accumulator);
  }

  class ReturnTupple {

    boolean executedNormally;
    int result;

    public ReturnTupple(boolean executedNormally, int result) {
      this.executedNormally = executedNormally;
      this.result = result;
    }
  }

}
