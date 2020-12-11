import static org.junit.jupiter.api.Assertions.assertEquals;

import com.xmas.DayTen;
import org.junit.jupiter.api.Test;

public class DayTenTest {


  @Test
  public void testOne() {
    var result = DayTen.puzzleOne(example);
    assertEquals(220, result);
  }

  @Test
  public void one() {
    var result = DayTen.puzzleOne(input);
    System.out.println(result);
  }

  @Test
  public void testTwo() {
    var solver = new DayTen(example);
    var result = solver.solveTwo();
    assertEquals(19208, result);
  }

  @Test
  public void two() {
    var solver = new DayTen(input);
    var result = solver.solveTwo();
    System.out.println(result);

  }

  String example = "28\n"
      + "33\n"
      + "18\n"
      + "42\n"
      + "31\n"
      + "14\n"
      + "46\n"
      + "20\n"
      + "48\n"
      + "47\n"
      + "24\n"
      + "23\n"
      + "49\n"
      + "45\n"
      + "19\n"
      + "38\n"
      + "39\n"
      + "11\n"
      + "1\n"
      + "32\n"
      + "25\n"
      + "35\n"
      + "8\n"
      + "17\n"
      + "7\n"
      + "9\n"
      + "4\n"
      + "2\n"
      + "34\n"
      + "10\n"
      + "3";

  String input = "115\n"
      + "134\n"
      + "121\n"
      + "184\n"
      + "78\n"
      + "84\n"
      + "77\n"
      + "159\n"
      + "133\n"
      + "90\n"
      + "71\n"
      + "185\n"
      + "152\n"
      + "165\n"
      + "39\n"
      + "64\n"
      + "85\n"
      + "50\n"
      + "20\n"
      + "75\n"
      + "2\n"
      + "120\n"
      + "137\n"
      + "164\n"
      + "101\n"
      + "56\n"
      + "153\n"
      + "63\n"
      + "70\n"
      + "10\n"
      + "72\n"
      + "37\n"
      + "86\n"
      + "27\n"
      + "166\n"
      + "186\n"
      + "154\n"
      + "131\n"
      + "1\n"
      + "122\n"
      + "95\n"
      + "14\n"
      + "119\n"
      + "3\n"
      + "99\n"
      + "172\n"
      + "111\n"
      + "142\n"
      + "26\n"
      + "82\n"
      + "8\n"
      + "31\n"
      + "53\n"
      + "28\n"
      + "139\n"
      + "110\n"
      + "138\n"
      + "175\n"
      + "108\n"
      + "145\n"
      + "58\n"
      + "76\n"
      + "7\n"
      + "23\n"
      + "83\n"
      + "49\n"
      + "132\n"
      + "57\n"
      + "40\n"
      + "48\n"
      + "102\n"
      + "11\n"
      + "105\n"
      + "146\n"
      + "149\n"
      + "66\n"
      + "38\n"
      + "155\n"
      + "109\n"
      + "128\n"
      + "181\n"
      + "43\n"
      + "44\n"
      + "94\n"
      + "4\n"
      + "169\n"
      + "89\n"
      + "96\n"
      + "60\n"
      + "69\n"
      + "9\n"
      + "163\n"
      + "116\n"
      + "45\n"
      + "59\n"
      + "15\n"
      + "178\n"
      + "34\n"
      + "114\n"
      + "17\n"
      + "16\n"
      + "79\n"
      + "91\n"
      + "100\n"
      + "162\n"
      + "125\n"
      + "156\n"
      + "65\n";
}
