import static org.junit.jupiter.api.Assertions.assertEquals;

import com.xmas.DayEleven;
import com.xmas.DayTen;
import org.junit.jupiter.api.Test;

public class DayElevenTEst {


  @Test
      public void oneExample() {
    var sut = new DayEleven(example);
    var result = sut.solveOne();
    assertEquals(37, result);
    System.out.println(result);
  }

  @Test
  public void one() {
    var sut = new DayEleven(input);
    var result = sut.solveOne();
    assertEquals(2283, result);
    System.out.println(result);
  }

  @Test
  public void twoExample() {
    var sut = new DayEleven(example);
    var result = sut.solveTwo();
    assertEquals(26, result);
    System.out.println(result);
  }

  @Test
  public void two() {
    var sut = new DayEleven(input);
    var result = sut.solveTwo();

    System.out.println(result);
  }

  String example = "L.LL.LL.LL\n"
      + "LLLLLLL.LL\n"
      + "L.L.L..L..\n"
      + "LLLL.LL.LL\n"
      + "L.LL.LL.LL\n"
      + "L.LLLLL.LL\n"
      + "..L.L.....\n"
      + "LLLLLLLLLL\n"
      + "L.LLLLLL.L\n"
      + "L.LLLLL.LL\n";

  String input = "LLLLL.LLLLLLLL..LLLLLLLLLLLLLL.LLLL..LL..LLLLLLLL.LLLL.LLLLLLLLLLLL.LLLLLL.LLLLLL.LLLLLLLL\n" +
          "LLLLL.LLLLLLLL.LLLLLL.LLLLLLLL.LLLLLLLLL.LLL.LLLL.LLLLLLLLLLLLLLLLLLLLLLLL.LLLLLL.LLLLLLLL\n" +
          "LLLLLLLLLLLLLLLLLLLLL.LLLLLLLL.LLLLLLL.L.LLLLL.LLLLLLL.LLLLLLLLLLLLLLLLLLLLLLLLLL.L.LLLLLL\n" +
          "LL.LLLLLLLLL.L.LLLLLL.LLLLLLLL.LLLL.LLLL.LLLLLLLL.LL.L.LLLL.LLLL.LLLLLLLLLLLLLLLLLLLLLLLLL\n" +
          "LLLLL.LLLLLLLL.LLLLLL.LLLLLLLLLLLLLLLL.L.LLLLLLLL.LLLL.LLLLLLLLL..LLLL.LLLLLL.LLL.LLLL.LLL\n" +
          "....L...............L...L...L.....L..L.LLLL..L.L...L...L.L.L..L.....LL..LL........L.LLLL..\n" +
          "LLLLL.LLLLLLLLLLLLLLL.LLLLLLLL.LLLLLLLLL.LLLLL.LL.LLLL.LLLL.LL.L.LLL.LLLLLLLLLLLL.LLLLLLLL\n" +
          "LLLLLLLLLLLLLL.L.LLLL.LLLLLLLL.LLLLLLLLLLLLLLLLLL.L.LLLLLLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLLLL\n" +
          "LLLLL.LLLLLLLL.LLLLLLLLLLLLLLL.LLLL.LLLLLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL.LLLLLLLL\n" +
          "LLLLLLLLLLLLLL.LLLLLL.LLL.LLLLLLLLL.L.LLLLLLLLLLL.LLLL.LLLLLLLLL.LLLLLLLLL..LLLLL.LLLLLLLL\n" +
          "LLLLLLLLLLLLLL.LLLLLL.LLLLLLLL.LLLL.LLLL.LL.LLLLL.LLLL.LLLLLLLLL.LLLLLLLLL.LLLLLLLLLL.LLLL\n" +
          "LLLLL.LLLLLLLLLLLLLLL.LLLLLLLL.LLLL.LLLL.LLLLLLLLLLLLL.LLLLLLLLL.LLLLLLLLLLLLLLLL.LLLLLLLL\n" +
          "L..L..L.LLL...L.L.....L....L.LL..........L.L....LLL...L...L.LLL.L...L...L......L..L..L....\n" +
          "LL.L.L..LLLL.LLLLLLLLLLLLLLLLL.LLLL..LLL.LLLLLLLL.LLLL.LLLLLLLLLL.LLLLLL.L.LLLLLLLLLLLLLLL\n" +
          "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL.LLLL.LLL..LLLLLLLLLLLLLLLL.LLLLLL.LLL.LLL.L.LLLLLL.LLLLLLLL\n" +
          "LLLLLLLLL.LLLLLLLLLLLLLL.LLLL..LLLLLLLLL.LLLLLLLL.LLLLLLLL.LLLLL.LLLLLLLLLLLLLLLLLLLLLLLLL\n" +
          "LLLLL.LLLLLLLLLLLLLLL.LLLLLLLL.LL.LLLLLL.LLLLLLLL.LLLL.LLLLLLLLL.LLLLLLLLL.LLLLLL.LL.LLLLL\n" +
          "LLL.L.LLLLLLLL.LLLLLL.LLLLLLLLLLLLL.LLLL.LLLLLLLL.LLLL.LL.LLLL.L.LLLL.LLL.LLLLLLL.LLLLLLLL\n" +
          "LLLLL.LLLLLLLL.LLLLLL.LLLLLLLL.LLLL.LLLL.LLLLLLLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLLLLL.LLLLLLLL\n" +
          ".LLLL.LLLLLLLLLLLLLLL.LLLLLLLL.LLLL.LLLL.LLLLL.LLLLLLLLLLLLLLLLL.LLLLLLLLL.LLLLLL.LLLLLL.L\n" +
          "LL....LL.L.L....L...........L........L...L.L.L.L.L.L.L...LLLL....L......L..LL.L...L...L..L\n" +
          "LLLLL.LLLLLLLL.LLLLLL.L.LLLLLL.LLLLLLLLLLLLLLLLLLLL.LL.LLLLLLLLLLLLLLLLLLL.LLLLLL.LLLLLLLL\n" +
          "LL.LL.LLLLLLLL.LLLLLL...LLLLLL.LLLL.LLLL.LLLLLLLL.LL.L.LLLLLLLLLLLLLLLLLLL.LLLLL..LLLLLLLL\n" +
          "LLLLL.LLL.LLLL.LL.LLLLLLLLLLLL.LLLLLLLLL.LLLLLLLL.LLLL.LLLLLLLLLLLLLLLLLLL..LLL.LLL.LLLLLL\n" +
          "LLLL.LLLLLLLLL.LLLLLL.LLLLLLLL.LLLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLL.LLLLLLLLL.LLLL.L.LLLLLLLL\n" +
          "LLLLLLLLLLLLLL.LLLLLL.LLLLLLLLLLLLL.LLLLLLLLLLLLL.LLLL.LLLLLLLLL.LLLLLLLLLLLLL.LL.L.LLLLLL\n" +
          ".LLLLL..L.LL....L..LL.LLL.L.....LLL.LL..........L..L..LL..L..L.L..L.L.L..L.L...........L.L\n" +
          "LLLLL.LLLLLLLL.LLLLLLLL.LLLLLL.LLLLLLLLL.LLLLLLLLLLLLL.LLLLLLLLL.LLLLLLLLL.LLLLLL.LLLL.LLL\n" +
          "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL.LLL..LLLLLLLLLLLLLLLLLL.LLLLLL.LLLLLLLLLLLL.LLLLLLLL.LLLLLL\n" +
          "LLL.L.LLLLLLLL.LLLLLLLLLLLLL.L.LLLL.LLLLLLLLLLLLL.LLLL.L.LLLLLLLLLLLLLLLLL.LL.LLL.LLLLLLLL\n" +
          "LLLLLLLLLLLLLLLLLLLLL.LLLLLLLLLLLLL.LLLL.LLLLLLLL.LLLL..LLLLLLLL.LLLLLLLLL.LLLLLL.LLLLL.LL\n" +
          "LLLLLLLLL.LLLL.LLLLLL.LLLLLLLL.LLLLLLLLLLLLLLLLLL.LLLL.L.LLLLLLL.LLLLLLLLLL.LLLLL.LLLLLLLL\n" +
          "LLLLL.LLLLLLLLLLLLLLL.LLLLLLLLLLLLLLLLLL.LLLLLLLL.LLLL.LLLLLLLLLLLLL.LLLLL.LLLLLL.LLLL.LLL\n" +
          "LLLLL.LLLLLLLL.LLLLLL.LLLLLLLLLLLLL.LLLL.LLLLLLLL.LLLL.LLLL.LLLLLLL.LLLLLL.LLLLLL.LLLLLLLL\n" +
          "LLL.LLLLL....L..L..L....L.L..L....L..LL..L.........L......L..L....LL...L.L...LLLLL.....L.L\n" +
          ".LLLL.LLLLLLLLLLLLLL.LLLLLLLLL.LLLLLLLLL.LLLLLLLL.LL.L.LLL.LLLLL.LLLLLLLLLLLLLLLLLLLLLLLLL\n" +
          "LLL.LLLLLLLLL.LLLLLLLLLLLLLLLL.LLLL.LLLL.LLLLLLLL.LLLL.LLLLLLLLLLLLLLLLLLL.LLLLLL.LLLLLLLL\n" +
          "LLLLLLLLLLLLLL.LLLLLL.LLLLLLLLLLLLLLLLL..LLLLLLLL.LLLL.LLLLLLL.L.LLLLLLLLL.LLLL.L.LLL.LLLL\n" +
          "LLLLL.LLLLLLLL.LLLLLL.LLLLLLLLLLLLLLLLLLLLLLLLLLL.LLLL.LLLLLLL.L.LLLLLLLL.LLLLLLL..LLLLLLL\n" +
          "....L...LL....L..L..L.L......LLL........L.LL..L.L...L...L..L....LLL..LL.LLL.LLL.L..L....L.\n" +
          "LLLLLLLLLLLLLL.LLLLLL.LLLLLLL..LLLL.LLLL..LLLLLLLLLL.LLLLLLLLLLL..LLLLLL.LLLLLLLL.LLLLLLLL\n" +
          "LLLLLLLLL.LLLLLLLLLLL.LLLLLLLLLLLLL.LLLL.LLLLLLLL.LLLL.LLLL.LLLL.LL.LLLL.L.LLL.LL.LLLL.LLL\n" +
          "LLLLL.LL.LLLLL.LLLL.L.LLLLLLLL.LLLL.L.LLLLLLLLLLL.LLLL.LLLLLLLLL.LLLLLLLLL.LLLLLL.LLLLLLLL\n" +
          "LLLLL.LLLLLLLLLLLLLLL.LLLLLLLL.LLL.LLLL..LLLLLLLL.LLLL.LLLLLLLLLLLLLLLLLLL.LLLLLL.LLLLLLLL\n" +
          "L.LLL.LLLLLLLL.LL.LLLLLLLLLLLL.LLLL.LLLL.LL.L.LLL.LLLL.LLLLLLLL..LLLLLLLLL.LLLLLL.LLLLLLLL\n" +
          "...LLLL..L...LLLL..LL...L.......L..LLL....L..........LL.L...LL.L.....L.....LL..L......LLLL\n" +
          "L.LLL.LLLLLLLLLLLLLLL.LLLLLLLL.LLLLLL.LL.LLLLLLLLLLLLLLLLLLLL.LLLLL.LLLL.LLLLLLLL.LLLLLLLL\n" +
          "LLLLL.LLLLLLLL.LLLLLL.LLLLLLLLLLLLL.LLLL..LLLLLLL.L.LL.LLLLLLL.LLLLLLLLLLL.LLLLLLLLLLLLLLL\n" +
          "LLLLL.LLLLLLL..LLLLLLLLLLLLLLL.LLLLLLLLL.LLLLLLLL.LLLL.L.L...LLLLLLLLLLLLLLLLLLLLLLLLLLLLL\n" +
          "LLLLLLL.LLLLL..LLLLLLLLLLLLLLLLLLLL.LLLL.LLLLLLLLLLLLLLLLLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLLLL\n" +
          "....LLL.L.......LL.....LL..L...LL.LLL......L..L..LL..LL.LL.L..L.LL.....L.L.L.L.....L..L...\n" +
          "LLL.L.LLLLLLLL.LL.LLL.LLLLLLLL.LLLL.LLLLLLLLLLLLL.LLLLLLLL.LLLLL.LLLLLLLLLLLLLLLLLLLLLLLLL\n" +
          "LLLLL.LLLLLLLL.LLLLLLLLLLLLLLL.LLLL.LLLLLLLLLLLLL.LLL..LLLLLLLLLLLLLLLLLLL.LLLLLL.LLLLLLLL\n" +
          "LLLLL.LL.LLLLL.LLLLLL.LLLLLLLLLL.LL.LLLL.LLLLLLLLLLLLLLLLLLLLLLL.LLLLLLLLL.LLLLLL.LLLLLLLL\n" +
          "LLLLL.LLLLLLLL.LLLLLL.LLLL.LLLLLLLLLLLLLLLLLLLLLL.LLLL.LLLLLLLLL.LLLLLLLLL.LLLLLL.LLLLLLLL\n" +
          "LLLLL.LLLLLLLLLLLLLLL.LLLLLLLL.LLLLLLLLL.LLLLLLL..LLLL.LLLLLLL.LLLLLLLLLLLLLLLLLLLLLLLL.LL\n" +
          "LLLLL.LLLLLLLL.LLL.LLLLLLLLLLL.LLLLLLLLLLLLLLLLLL.LLLL.LLLLLLLLL.LLLLLLLLL.LLLLLL.LLLLLLLL\n" +
          "LLLLLLLLLLLLLL.LLLLLL.LL.LLLLL.LLLLLLLLL.LLLLLLLL.LLLL.LLLLLLLL..LLLLLLLL..LL.LLL.LLLLLLLL\n" +
          "LLL..L.L.L..........LL....L...L.L.LLL.L.L..L.....L...L.LLL............L.L.L..L..........L.\n" +
          "LLLLL.LLLLL..L.LLLLLL.LLLLLLLL.LLLL.LLLL.LLLLLLLLLLLLL.LLLLLLLLL.LL.LLLLLLLLLLLLLLLLLLLLLL\n" +
          "L.LLL.LLLLLLLL.LLLLLL.LLLLLLLL.LLLLLLL.L.LLLLLLLLLLLLL.LLLLLLLLL.LLLLLLLLLLLLLL.L.LLLLLLLL\n" +
          "LLLL..LLLLLLLLLLLLLLLLLLLLL.LL.LLLL.LLLL.LLLLLLLL.LLLLLLLLLLLLLLLL.LLLL.LL.LLLLLLLLLLLLLLL\n" +
          "LLLL..LLLLLLLL.LLLLLL.LLLLLLLL.LLL.L.LLL.LLLLLLLLLLLLL.LLLLLLLLLLLLL.LLLLL.LLLLLL.LLLLLLLL\n" +
          "LLLLLLLLLLLLLLLLLLLLL.LLLLLLLL.LLLLLLLLL.LLLLLLLL.LLLLLLLLLLLLLLLLLL.LLLLLLLLLLLL.LLLL.LLL\n" +
          ".LLLL.LLL.LLLLLLLLLLL.LLLL.LLL..LLLLLLLL.LLLLLLLLLLLLL.LL.LLLLLLLLLLLLLLLLLLLLL.L.LLLLLLLL\n" +
          "LL.LL.LLLLLLLL.LLLLLLLLLLLLLLL.LLLL.LLLLLLLLLLLLLLLLLL.LLLLLLLLL.LLLLLLLLLL.LLLLL.LL.LLLLL\n" +
          "LLLLL.LLLLLLLL.LLL.LL..LLLLLLL.LLLL.LLLL.LLLLLLLL.LLLLLLLLLLLLLL.LLLLLLLLL.LLLLLLLL.LLLLLL\n" +
          "...L.L.........L............L...LLL.L.L.L....L..LL.LL...........L.LL.L.....LL.L.L..L..L...\n" +
          "LLLLL.LLLLLLLL.LLLLLL.LLLLLLLLLLLLL.LL.L.LLLLLLLL.LLLLLLLLL.L.LLLLLLLLLLLL.LLLLLL.LLLLLLLL\n" +
          "LLLLLLLLLLLL..LLLLLLLLLL.LLLLL.LLLL.LLLL.LLLLLLLL.LLLL.LL.LLLLLLLLLLLLLLLL.LLLLLL.LLL.LLLL\n" +
          "LLLLLLLLLLLLLL.LLLLLLLLLLLLLLL.L.LL.LLLL.LLLLLLLLLLLLLLLLLLLLLLL..LLLLLLLL.LLLLLLLLLLLLLLL\n" +
          "LLLLL.LLLLLLLLLLLLLLL.LLLLLLLL.LLLL.LLLL.LL..LLLL.LLLLLLLLLLLLLL.LLLLLLLLL.LLLLLL.L.LLLL.L\n" +
          "LLLLLLLLLL.LLL.LLLLLL.L.LLLLLL.LLLL.LLLL.LLL.LLLL.LLLLLLLLLLLLLL.LLLLLLLLL.LLLLLLLLLLLLLLL\n" +
          "LLLLL.LLLLLLLL.LLLLLL.LLLLLLLL.LLLLLLLLLLLLLLLLLL.LLLL.LLLLLLLLL.LLLLLL.LL.LLLLLL.LLLLLLLL\n" +
          "LLLLL.LLLL.LLL.LLLLLLLLLLLLLLL.LLLL.LLLL.LLLLLLLLLLLLL.LLLLLLLLL.L.LLLLLLL.LLLLLL.LLLLLLLL\n" +
          "L.LLLLLLLLLLLL.LLLLLL.LLLLLL.L.LLLLLLLLL.LL.LLLLL.LLLL.LLLLL.LLLLLLL.LLLLLLLLLLLLL.LLLLLLL\n" +
          ".......L.LL.LLL.L.L.....LL.LL.L....L...LL...L......L..L.L..L...L.....L.LL.L.L.LL.L.L......\n" +
          "LLLLL.LLLLLLLL.LLLLLL.LLLLLLLL.LLLL.LLLLLLLLLLLLL.LLLL.LLLLLLLLL.LLLLLLLLL.LLLLLL.LLL.LLLL\n" +
          "LLLLL.LLLLLLLLLLLLLLL.LLLLLLLL.LLLL.LLLLLLLLLLLLL.LLLL.LLL.LLLLL.L.LLLLLLL..LL.L.LLLLLLLLL\n" +
          "LLLLL.L.LLLLLL.LLLLLLLLLLLL.LLLLLLL.LLLLLLLLLLLLL.LLLLLLLLLL.LLL.LLLLLLLLL.LLLLLLLLLLL.LLL\n" +
          "LLLLLLLLLLLLLL.LLLLLL.LLLLLLLL.LLL...LLL.LL.LLLLL.LLLL.LLLLLLLLL..LLLLLLLL.LLLLLL.LLLLLLLL\n" +
          "LLLLLLLLLLLLLL.LLLLLL.LLL.LLLLLLLLLLLLLL.LLLLLLLL.LLLL.LLLL..LLL.LLLLLLLLL.LLLLLL.LLLLLLLL\n" +
          "LLLLL.LLLLLLLL.LLLLL..LLL..LLL.LLLLLLLLL.LLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLLL.LLLLLL.LLLLLLLL\n" +
          "LLLLL.LLLLLLLL.LLLLLL.LL.LLLLLLLLLLLLLLL.LLLLLLLL..LLLLLLLLLLLLL.LLLLLLLLLLLLLLLL.LLLLLLLL\n" +
          "...LL.L..L............LL.LL.....L.L.L..LLLL.L....L.L...L..LL.....LL.LL.L.L..LL..L..LL.L.L.\n" +
          "LLLLLLLLLLLLLL.LLLLLL.LLLLLLLL.LLLL.LLLL.L.LLLLLLLLLLLLLLLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLLLL\n" +
          "LLLLLLLLLLLLLLLLLLLLL.LLLLLLLLLLLLL.LL.L.LLLLLLLL.LLLL.LLLLLLLLLLLLLLLLLLL.LLLLLLLLLLLLLLL\n" +
          "LLLLLLL.LL.LLL.LLLLLLLLLLLLLLL.LLLL..LLL.LLLLLLLLLLLLLLLLLLLLLLL..LLLLLLLLLLL.LLLLLLLLLLLL\n" +
          "LLLLLLLLLLLLLLLLLLL.L.LLLLLLLL.LLLLLLLLLLLLLLL.LLLLLLL.LLLLLLLLL.LLLLLLLLL.LLLLLLLLLLLLLLL\n" +
          "LLLLL..LLLLLLL.LLLLLL.LLLLLLLLLLLLL.LLLL.LLLLLLLLLLLLLLLLLLLLLLLLLLLL.LL.L..LLLLL.LLLLLLLL\n" +
          "LLLLLLLLLLLLLLL.LLLLL.LLLLLLLL..LLL.LLLL.LLLLLLLLLLLLLLLLLLLLLLL.LLLLLLLLL.LLLLLLLLLLLLLLL\n" +
          "LLL.L.LLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLLLL.L.L.LLL.LLLLL.LLLLLLLLL.LLLLLLLLL.LLLLLL.LLLLLLLL\n" +
          "LLLLL.LLLLLLLL.LLLLLLLLLLLLLLL.LLLL.LLLL.LLLLLLLLLLLLL...LLLLLLL.LLLLLLLLL.LLLLLL.LLLLLLLL\n" +
          ".LLLL.LLLLLLLLLLLLLL..LLLLLLL.LLLLL.LLLL.LLLLLLLLLL.LL.LLLLLLLLLLLLLLLLLLL.LLLL...LLLLLLLL\n" +
          "LLLLLLLLLLLLLLLLLLLL..LLLLLLLL.LLLLLLLLL.LLLLLLLLLLLLLLLLLLLLLLL.LLLLLLLLL..LLLLL..LLLLLLL\n" +
          "LLLLLLLLLLLLLL.LLLLLL.LLLLLLLLLLLLLLLLLL.LLLLL.LL.LL.L.LLLLLLLLL.LLLLLLLLL.LLLLLLLLLLLLLLL\n" +
          "LL.LL.LLLLLLLL.LLLLLL.LLLLLLLL.LLLL.L.LL.LLLLLLLL.LLLL.LLLLLLL...LLLLLLLLL.LLLLLL.LL.LLLLL\n" +
          "LLLLL.LLLLLLLL.LLLLLL.LLLLL.LLLLLLL.LLLLLLLL.LLLLLLLLL.LLLLLLLLL.LLLLLL..L.LLLLLL.LLLLLLLL\n" +
          "LLLLL.LLLLLLLL.LLLLLLLLLL.LLLLLLLLL.LLLL.LLLLLLLL.LLL..LLLLLLLLL.LLLLLLLLL.LLLLLL.LLLLLLLL";
}
