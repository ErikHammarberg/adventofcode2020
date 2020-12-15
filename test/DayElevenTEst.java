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
}
