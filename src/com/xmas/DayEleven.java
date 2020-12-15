package com.xmas;

import java.util.Arrays;

public class DayEleven {
  public DayEleven(String input) {
    var lines  = input.split("\\n");
    numRows = lines.length;
    active = new char[lines.length][];
    passive = new char[lines.length][];
    for (int i = 0; i < lines.length; i++) {
      active[i] = lines[i].toCharArray();
      passive[i] = lines[i].toCharArray();
    }
    numCols = active[0].length;
  }
  char[][] active;
  char[][] passive;

  int numRows;
  int numCols;

  public int solveOne() {
    boolean keepGoing = true;
    int numPass = 0;
    while(keepGoing) {
      boolean isChanged = false;
      for(int i = 0; i < numRows ; i++) {
        for(int j = 0; j < numCols; j++) {
          isChanged = isChanged | changeSeat(i,j);
        }
      }
      numPass++;
      System.out.println("NumPass:" + numPass);
      keepGoing = isChanged;
      swapArray();
    }
    return (int)Arrays.stream(active).mapToInt(inner -> {
      int count = 0;
      for(var c : inner) {
        if(c == '#') {
          count++;
        }
      }
      return count;
    }).sum();
  }


  private boolean changeSeat(int row, int col) {
    if(active[row][col] == 'L') {
      if(!getSurouding(row, col).contains("#")){
        passive[row][col] = '#';
        return true;
      }
    } else if(active[row][col] == '#') {
      if( 4 <= getSurouding(row, col).chars().filter(s -> s == '#').count()) {
        passive[row][col] = 'L';
        return true;
      }
    }
    passive[row][col] = active[row][col];
    return false;

  }

  private String getSurouding(int row, int col) {
    var sb = new StringBuilder();
    int rowLow = row - 1 >= 0 ? row -1 : 0;
    int rowHigh = row + 1 < numRows ? row +1 : row;
    int colLow = col -1 >=0 ? col -1 : 0;
    int colHigh = col +1 < numCols ? col+1 : col;

    for(int i = rowLow ; i <= rowHigh ; i++) {
      for(int j = colLow ; j <= colHigh ; j++) {
        if(i != row || j != col) {
          sb.append(active[i][j]);
        }
      }
    }
    return sb.toString();
  }


  private void swapArray() {
    char[][] temp = active;
    active = passive;
    passive = temp;
  }
}
