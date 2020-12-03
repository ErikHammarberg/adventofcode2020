import static org.junit.jupiter.api.Assertions.assertEquals;

import com.xmas.DayTree;
import org.junit.jupiter.api.Test;

public class DayTreeTest {

  DayTree dayTree = new DayTree();

  @Test
  public void testInput() {
    var result = dayTree.puzzleOne(exampleInput);
    assertEquals(7, result);
    System.out.println(result);
  }

  @Test
  public void puzzleOne() {
    var result = dayTree.puzzleOne(puzzleInput);
    assertEquals(282, result);
    System.out.println(result);
  }

  @Test
  public void test2Test() {
    var result = dayTree.puzzleTwo(exampleInput);
    assertEquals(336, result);
    System.out.println("Result: " + result);
  }

  @Test
  public void puzzlTwo() {

    // First faulty answer = 1438223688 To High
    var result = dayTree.puzzleTwo(puzzleInput);
    assertEquals(958815792, result);
    System.out.println(result);
  }


  String exampleInput = "..##.......\n"
      + "#...#...#..\n"
      + ".#....#..#.\n"
      + "..#.#...#.#\n"
      + ".#...##..#.\n"
      + "..#.##.....\n"
      + ".#.#.#....#\n"
      + ".#........#\n"
      + "#.##...#...\n"
      + "#...##....#\n"
      + ".#..#...#.#";

  String puzzleInput =
      ".........#.#.#.........#.#.....\n"
          + "...#......#...#.....#.....#....\n"
          + "#.....#.....#.....#.#........#.\n"
          + "......#..#......#.......#......\n"
          + ".#..........#.............#...#\n"
          + "............#..##.......##...##\n"
          + "....#.....#..#....#............\n"
          + ".#..#.........#....#.#....#....\n"
          + "#.#...#...##..##.#..##..#....#.\n"
          + ".#.......#.#...#..........#....\n"
          + "...#...#........##...#..#.....#\n"
          + "..................#..........#.\n"
          + ".....#.##..............#.......\n"
          + "........#....##..##....#.......\n"
          + "...#.....#.##..........#...##..\n"
          + ".......#.#....#............#...\n"
          + "..............#......#......#..\n"
          + "#.......#...........#........##\n"
          + ".......#.......##......#.......\n"
          + "................#....##...#.#.#\n"
          + "#.......#....................#.\n"
          + ".##.#..##..#..#.#.....#.....#..\n"
          + "#...#............#......##....#\n"
          + ".#....##.#......#.#......#..#..\n"
          + "..........#........#.#.#.......\n"
          + "...#...#..........#..#....#....\n"
          + "..#.#...#...#...##...##......#.\n"
          + "......#...#........#.......###.\n"
          + "....#...............#.###...#.#\n"
          + "..................#.....#..#.#.\n"
          + ".#...#..#..........#........#..\n"
          + "#..........##................##\n"
          + "...#.....#...#......#.#......#.\n"
          + "......#..........#.#......#..#.\n"
          + "..#......#.....................\n"
          + "............#.........##.......\n"
          + "......#.......#........#.......\n"
          + "#.#...#...........#.......#....\n"
          + ".#.#........#.#.#....#........#\n"
          + "#.....##........#.#.....#.#....\n"
          + ".#...#..........##...#.....#..#\n"
          + ".........#....###............#.\n"
          + "..#...#..............#.#.#.....\n"
          + ".....#.#.#..#.#.#.###......#.#.\n"
          + ".#.##...#.......###..#.........\n"
          + ".....##....#.##..#.##..#.......\n"
          + "..#...........##......#..#.....\n"
          + "................##...#.........\n"
          + "##.....................#..#.###\n"
          + "...#..#....#...........#.......\n"
          + ".#.............##.#.....#.#....\n"
          + ".......#.#.#....##..#....#...#.\n"
          + "...##..#..........#....#.......\n"
          + "....##......#.........#........\n"
          + ".##....#...........#.#.......#.\n"
          + "...#...#.##.......#.#..........\n"
          + "..#.........#.##...........#...\n"
          + "....#.##........#.......#...##.\n"
          + "...................#..#..#...##\n"
          + "#...#......###..##.#..###......\n"
          + "#.............#.#........#...#.\n"
          + "...#...#..#..#..............#..\n"
          + "#.....#..#...#...#......#.#..#.\n"
          + "...##.............#........##.#\n"
          + "......#.#.........#.#....#...#.\n"
          + "........##............#...#....\n"
          + "............#.#...#......#.....\n"
          + "...#...........#...#...........\n"
          + ".........#.#......#............\n"
          + "....#.............#..#.....#..#\n"
          + "#.....#...........#.....#.#.#.#\n"
          + ".............#.....##......#...\n"
          + "...................###.#......#\n"
          + "#.##.....#...#..#..#...#....#..\n"
          + "............#.....#....#.#.....\n"
          + "#....#..#..........#....#..#...\n"
          + "..........##..................#\n"
          + "....#.......###..#......###....\n"
          + ".......#...#.##.##..#....##....\n"
          + "...##...............#.....#...#\n"
          + "#...........#...#......#..#..#.\n"
          + "..##....#.......#...#.....#....\n"
          + ".......##..............#.##..#.\n"
          + ".#......#..........#.......#...\n"
          + "....##...................#.#..#\n"
          + "......#....###................#\n"
          + ".#........#...........#........\n"
          + ".#.....##....#..##...........#.\n"
          + "##..............##...#.......#.\n"
          + "......#..........#..........##.\n"
          + "..#.....#.#.........####....#..\n"
          + ".............#......#......#...\n"
          + "..#.............#...........##.\n"
          + "#.#...#........#..........##...\n"
          + "...#....#.....#.....#.....##...\n"
          + "......#........................\n"
          + "......#..#...#......#.....#....\n"
          + "......#....##.....#....#.......\n"
          + "#.#......#.##..#...............\n"
          + "..........#.#.##..##..#........\n"
          + "......#.#..#....###.#..........\n"
          + "........................#....#.\n"
          + "#.#.............#....#.....##.#\n"
          + ".#.#..........#.......#..#....#\n"
          + "..#...#......#..#..#...#.#...#.\n"
          + "...#.##...###..................\n"
          + "........#.#...........#...#....\n"
          + "........#..........#....#......\n"
          + "#....#........#.......##.....#.\n"
          + "......###...##...#......#......\n"
          + "............#.......#.....##..#\n"
          + "....#..#.......##......#.......\n"
          + "#............##................\n"
          + "...............#..#......#...#.\n"
          + ".#....##...#......#............\n"
          + "#...#................#.........\n"
          + "..#....#..#........##......#...\n"
          + "....#....###......##.#.......#.\n"
          + "......#.#..#.#..#....#..#......\n"
          + "....#..........#..#..#.........\n"
          + ".#..#.......#......#........#..\n"
          + ".......#..#..#............#....\n"
          + ".............#...#....#..#.....\n"
          + "..............#.#.#.........#..\n"
          + "#.....##.......#....#..........\n"
          + "...#.....#......#..............\n"
          + "...##.#..#.#........#..##....#.\n"
          + ".......#.#.....##..#...........\n"
          + ".....#.#....#..................\n"
          + ".#......#.###..............##..\n"
          + "..#....#...#..#...##...##....#.\n"
          + "..........##..#...#..#.........\n"
          + "..#............#........#.#...#\n"
          + ".........................#.#.#.\n"
          + "......#........#.#..#......##.#\n"
          + "#.#......#..#.........#........\n"
          + ".....#........#......#...#.#...\n"
          + "........##....##....#.#........\n"
          + "....#....#.#...#...##....#..#..\n"
          + "#.............#.....#..........\n"
          + "#............##..#............#\n"
          + "..#.#......#........#..........\n"
          + ".#......#......#.#.##.##.......\n"
          + "..#.....#..........#......##...\n"
          + "...#......#...#.##....#.....##.\n"
          + "......#......#...........#.#...\n"
          + "....#........#..#..#........#.#\n"
          + "....#.........#.....#...#.#.#..\n"
          + "....#.....###........#.........\n"
          + ".............##........#.#.....\n"
          + "...#............#........#.#.#.\n"
          + "......#....#.......#.#.........\n"
          + ".....#................#........\n"
          + ".#....#..#.#.............#...#.\n"
          + "#..##...#............#......#..\n"
          + "...#..#........................\n"
          + ".#.#...........#.......#.......\n"
          + "#....###............##.........\n"
          + "...##....#.#............##.....\n"
          + ".........####......#........#..\n"
          + ".....#.......#.#...............\n"
          + ".......#...#.###..#....#...#..#\n"
          + "...#.....##..#....#..#.#...###.\n"
          + ".............#........#.#.#..#.\n"
          + "................#..........##..\n"
          + ".......####..##..##........##.#\n"
          + "..#......#..#..#.#.##..........\n"
          + "#....#........#....#...###.#.#.\n"
          + "........##........##.....#.....\n"
          + "...........#.#...........#....#\n"
          + "#.............#...........#....\n"
          + "...#.........#...#....#.....#..\n"
          + "..##......#...#...............#\n"
          + ".............#.........#....#..\n"
          + "..#...........#..#........#.##.\n"
          + ".#.#......#.............##...#.\n"
          + ".#......#.....##.#..#..#.......\n"
          + "....##......#..................\n"
          + ".#.#..##............#....#....#\n"
          + "........#...##.............#..#\n"
          + "........#....##.....#......###.\n"
          + ".........#....#.#..............\n"
          + "#.....#........................\n"
          + ".#..#....#.....#......#.###..#.\n"
          + "..........#...#....##....#..#..\n"
          + "...#.#.#...##..#..#......#..#.#\n"
          + "#............#.....#....#......\n"
          + "#.###...#.#......###..#....#..#\n"
          + "...#.###........#......#....#..\n"
          + "..#.##...#.........#.#.........\n"
          + "............##.................\n"
          + "....#..........#.#.#.#.#....#..\n"
          + "...##.#...#.......#.......##..#\n"
          + "....##.#........#....#...#.....\n"
          + ".............#.#....#...#.....#\n"
          + "...#......................##...\n"
          + "..#...#.....#.....#........#..#\n"
          + "..#..#.......#....#..##.....#..\n"
          + "..#..#.#.......................\n"
          + ".......##..#....#....#..#......\n"
          + "....#......##....#............#\n"
          + ".#...#..#..#.##...#.#...#......\n"
          + ".....#......#....#.........#...\n"
          + ".##......##.........#....#.....\n"
          + "#...........#...##.....#......#\n"
          + ".....#.#.......#.........#.....\n"
          + ".........#..........#..####.##.\n"
          + "............#..#......#.#......\n"
          + ".#.............#........#.#....\n"
          + "......#......#...#..#....#####.\n"
          + ".........##.#..##...###..#....#\n"
          + "....#.#....#.#..#.........#....\n"
          + "..#.............#...##...##....\n"
          + "........#..........#.##..#....#\n"
          + ".....#...#..##........#.#..#...\n"
          + "##..#.#.....#............#.....\n"
          + ".............#........##...##..\n"
          + "#......####.....##.............\n"
          + "..##.....##....###..#.#....#...\n"
          + "......##.##.#...#..#.#..##.....\n"
          + "......#.................#......\n"
          + "#.....#.#...#......#.#....#....\n"
          + "....#.#........#..............#\n"
          + "##........#.......##.#...##...#\n"
          + "..#..................#.#....#..\n"
          + "...........#..........#.#.....#\n"
          + "........##.#.....#......#..#..#\n"
          + ".....#....#..#.....#.........##\n"
          + "#.#..#..#...#......#..........#\n"
          + "#...##.....#..#.#.......#.##...\n"
          + "..#....##...............#......\n"
          + "#..........#.#.........#.#....#\n"
          + "..............#......#....#....\n"
          + ".....#...........#...#...#...#.\n"
          + "...#......#....#....#..........\n"
          + ".#..........#.#....##..##....#.\n"
          + "..............#.........#.#....\n"
          + ".......#.....#.....#...##....#.\n"
          + "##.#.........#....#.....#.#....\n"
          + "....#..#......#................\n"
          + "......##.....#.......##........\n"
          + ".....##...#........#...#...#...\n"
          + "..#...#...#..#..#.#......#..#..\n"
          + "....#...#.......#..............\n"
          + "....#..#.........###........#..\n"
          + "....#.............##..#........\n"
          + "..........##.#.......##..##....\n"
          + "#.##..................#.....#..\n"
          + "#........#........#.....#......\n"
          + ".#...#......#..................\n"
          + "#....##.##......#...#.........#\n"
          + "......#.##..##................#\n"
          + "............#.........##.......\n"
          + "..........####.#........#.....#\n"
          + ".##...#...#....#..#............\n"
          + ".#.##...#..#...#......#......##\n"
          + ".....#.#....#..###......#.#.#..\n"
          + "...#.......................##..\n"
          + "......................#.......#\n"
          + "..#....#.........#..#.#.....#..\n"
          + ".#....#..#....#...#............\n"
          + "..........#...##.....#.#..#....\n"
          + "........#..#..#....#...#...#...\n"
          + ".....#......#.#................\n"
          + ".....#...........#...#.........\n"
          + ".....#...##..#.#....#..#.....#.\n"
          + "#.......#.............##.......\n"
          + "................#....#.#..#....\n"
          + ".#..##...#.#........#......#.#.\n"
          + ".#.##..........#...............\n"
          + "....##......#....#........#....\n"
          + "....#..#....#.##.#.............\n"
          + ".......#..#......##.#.....#....\n"
          + ".......#.....#.............#...\n"
          + ".....#....#.......#............\n"
          + "........#.#...##..##..##.......\n"
          + "#.........##....##...##........\n"
          + "........#..#.#..........###.#..\n"
          + "..........................#.#..\n"
          + "#.....#.......#..#........#....\n"
          + "...##.....#.......#......#.....\n"
          + ".#.#..#...........#...........#\n"
          + ".....##..#........#...####.....\n"
          + ".#.#...##.#.#..#..#.#..#.......\n"
          + "..#.##.#...#.#.#...#..#........\n"
          + "............#..........#..#....\n"
          + "...............#..##.#.........\n"
          + ".............#.....#....#......\n"
          + "...##..##......##..........#...\n"
          + "..#.......#....#..........#...#\n"
          + ".##................#.#.#.......\n"
          + ".....##.....#..#.....#.........\n"
          + "......#.#.......#......#..#....\n"
          + ".....#.....#........#.......##.\n"
          + "......#.......##......#...#...#\n"
          + "....#...........###.........#..\n"
          + "...#.....#.........##........#.\n"
          + "..#.....#..............#.......\n"
          + "....#.......#...#....#....#..##\n"
          + "......#...........#...........#\n"
          + ".##......#......#.#.....#.##...\n"
          + "....#..##......#...#..#.#.###..\n"
          + ".......#.#....#......#..#......\n"
          + "..........#........#...........\n"
          + "#.##.........#.#.#...#...#.#...\n"
          + ".#......###.....#....#.#....#..\n"
          + "...................##..#.......\n"
          + "....#..#..............#.#.....#\n"
          + "#..................#.....#.....\n"
          + "...........##.##.......#..#.#..\n"
          + "........#.#......#...........#.\n"
          + "#..#.......#...#...........#.#.\n"
          + "......##...........#...........\n"
          + ".........#.#........#........#.\n"
          + "#......#....#.#.....#..#.......\n"
          + "............#..#.....##...#....\n"
          + ".#......#..#......#.........#..\n"
          + ".......#...#.........#.##.....#\n"
          + "........................#..#...\n"
          + ".###..............#.#..#.......\n"
          + ".....#.........#.......#......#\n"
          + "..##..##....#.....#.......#.#..\n"
          + "...###.#..#.##............#....\n";
}
