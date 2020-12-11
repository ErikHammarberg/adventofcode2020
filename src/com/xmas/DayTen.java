package com.xmas;


import java.util.HashMap;
import java.util.Map;

public class DayTen {

  public static int puzzleOne(String input) {

    var counter = new Counter();

    input.lines().mapToInt(Integer::parseInt).sorted().reduce(0, (left, right) -> {
      switch (right - left) {
        case 1:
          counter.one++;
          break;
        case 2:
          counter.two++;
          break;
        case 3:
          counter.three++;
          break;
      }
      return right;
    });
    return counter.one * (counter.three + 1);

  }

  int[] inputs;

  Map<CacheKey, Long> resultCache;


  public DayTen(String input) {
    inputs = input.lines().mapToInt(Integer::parseInt).sorted().toArray();
    resultCache = new HashMap<>();
  }

  public long solveTwo() {

    long result = 0;
    if (inputs[0] == 3 || (inputs[1] - inputs[0] == 3)) {

      result += solveTwo(new CacheKey(inputs[0], 1));
    } else {

      result += solveTwo(new CacheKey(inputs[0], 1));
      result += solveTwo(new CacheKey(0, 1));
    }
    return result;
  }

  long solveTwo(CacheKey in) {
    long result = 0;
    if (in.index + 1 == inputs.length) {
      result = 1;
    } else if (inputs[in.index + 1] - in.prevValue > 3) {
      var queryKey = new CacheKey(inputs[in.index], in.index + 1);
      var cachedResult = resultCache.get(queryKey);
      result = cachedResult != null ? cachedResult : solveTwo(queryKey);
    } else {
      var queryKey = new CacheKey(inputs[in.index], in.index + 1);
      var firstCache = resultCache.get(queryKey);
      long firstResult = firstCache != null ? firstCache : solveTwo(queryKey);

      var secondQuery = new CacheKey(in.prevValue, in.index + 1);
      var secondCache = resultCache.get(secondQuery);
      var secondResult = secondCache != null ? secondCache : solveTwo(secondQuery);
      result = firstResult + secondResult;
    }
    resultCache.put(in, result);
    return result;

  }


  class CacheKey {

    int prevValue;
    int index;


    public CacheKey(int prevValue, int index) {
      this.index = index;
      this.prevValue = prevValue;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      CacheKey cacheKey = (CacheKey) o;

      if (index != cacheKey.index) {
        return false;
      }
      return prevValue == cacheKey.prevValue;
    }

    @Override
    public int hashCode() {
      int result = index;
      result = 31 * result + prevValue;
      return result;
    }
  }
}

class Counter {

  int one;
  int two;
  int three;
}