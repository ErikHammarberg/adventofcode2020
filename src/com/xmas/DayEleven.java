package com.xmas;

import java.util.Arrays;
import java.util.function.Function;

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
    return solve(4, getSurouding);
  }

  public int solveTwo() {
    return solve(5, getLineOfSight);
  }
  
  private int solve(int maxUntilChange, Function<Point, String> stringCreator) {
    boolean keepGoing = true;
    int numPass = 0;
    while(keepGoing) {
      boolean isChanged = false;
      for(int i = 0; i < numRows ; i++) {
        for(int j = 0; j < numCols; j++) {
          if(active[i][j] == '.') {
            continue;
          }
          isChanged = isChanged | changeSeat(i,j, maxUntilChange, stringCreator.apply(new Point(i, j)));
        }
      }
      numPass++;
      //System.out.println("NumPass:" + numPass);
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


  private boolean changeSeat(int row, int col, int maxAllowed, String lineOfSight) {
    if(active[row][col] == 'L') {
      if(!lineOfSight.contains("#")){
        passive[row][col] = '#';
        return true;
      }
    } else if(active[row][col] == '#') {
      if( maxAllowed <= lineOfSight.chars().filter(s -> s == '#').count()) {
        passive[row][col] = 'L';
        return true;
      }
    }
    passive[row][col] = active[row][col];
    return false;

  }

  private Function<Point, String> getLineOfSight =  (p) -> {
    var sb = new StringBuilder();

    int i = 1;
    boolean keep = true;

    boolean upLeft= false;
    boolean upUp = false;
    boolean upRight= false;
    boolean leftLeft = false;
    boolean downLeft  = false;
    boolean downDown= false;
    boolean downRight= false;
    boolean rightRight = false;
    while(keep) {
      boolean up = p.row -i > -1;
      boolean down = p.row + i < numRows;
      boolean left = p.col -i > -1;
      boolean right = p.col +i < numCols;

      if(!upLeft && up && left &&  active[p.row-i][p.col-i] != '.') {
        sb.append(active[p.row-i][p.col-i]);
        upLeft = true;
      }
      if(!upUp && up && active[p.row-i][p.col] != '.') {
        sb.append(active[p.row-i][p.col]);
        upUp = true;
      }
      if(!upRight && up && right && active[p.row-i][p.col+i] != '.') {
        sb.append(active[p.row-i][p.col+i]);
        upRight = true;
      }
      if(!leftLeft && left && active[p.row][p.col-i] != '.') {
        sb.append(active[p.row][p.col-i]);
        leftLeft = true;
      }
      if(!downLeft && left && down && active[p.row+i][p.col-i] != '.') {
        sb.append( active[p.row+i][p.col-i]);
        downLeft = true;
      }
      if(!downDown && down &&  active[p.row+i][p.col] != '.') {
        sb.append( active[p.row+i][p.col]);
        downDown = true;
      }
      if(!downRight && down && right &&  active[p.row+i][p.col+i] != '.') {
        sb.append( active[p.row+i][p.col+i]);
        downRight = true;
      }
      if(!rightRight && right &&  active[p.row][p.col+i] != '.') {
        sb.append( active[p.row][p.col+i]);
        rightRight = true;
      }
      keep = (up || down || left || right) && sb.length() < 8;
      i++;
    }
    return sb.toString();
  };

  private Function<Point, String> getSurouding = (p) -> {
    var sb = new StringBuilder();
    int rowLow = p.row - 1 >= 0 ? p.row -1 : 0;
    int rowHigh = p.row + 1 < numRows ? p.row +1 : p.row;
    int colLow = p.col -1 >=0 ? p.col -1 : 0;
    int colHigh = p.col +1 < numCols ? p.col+1 : p.col;

    for(int i = rowLow ; i <= rowHigh ; i++) {
      for(int j = colLow ; j <= colHigh ; j++) {
        if(i != p.row || j != p.col) {
          sb.append(active[i][j]);
        }
      }
    }
    return sb.toString();
  };



  private void swapArray() {
    char[][] temp = active;
    active = passive;
    passive = temp;
  }

  class Point {
    public Point(int row, int col) {
      this.row = row;
      this.col = col;
    }

    int row;
    int col;
  }
}
