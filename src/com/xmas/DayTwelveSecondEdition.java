package com.xmas;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DayTwelveSecondEdition {

    // shiop starts facing east.

    public int solveOne(String input) {
        var solveBoat = new Boat();
        solveBoat.direction = 90;

        Arrays.stream(input.split("\\n")).map(Instruction::fromString).forEach(instruction -> solveBoat.parseInsctruction(instruction));
        return Math.abs(solveBoat.x) + Math.abs(solveBoat.y);
    }

    class Boat {
        int x;
        int y;
        int direction;

        public void parseInsctruction(Instruction instruction) {
            switch (instruction.direction()) {
                case
                    'N' -> moveNorth(instruction.value());
                case
                    'S' -> moveSouth(instruction.value());
                case
                    'E' -> moveEast(instruction.value());
                case
                    'W' -> moveWest(instruction.value());
                case
                    'R' -> turn(instruction.value());
                case
                    'L' -> turn((-1) * instruction.value());
                case
                    'F' -> forward(instruction.value());
            }



        }

        private void moveWest(int instruction) {
            x -= instruction;
        }

        private void moveEast(int instruction) {
            x+= instruction;
        }

        private void moveSouth(int value) {
            y-= value;
        }

        private void moveNorth(int value) {
            y+= value;
        }

        private void turn(int value) {
            if (value % 90 != 0 ) {
                System.out.println("Wierd turn: " + value);
            }
            direction = (direction + value) % 360;
            if (direction < 0) {
                direction += 360;
            }
        }

        private void forward(int value) {
            switch (direction) {
                case
                    0 -> moveNorth(value);
                case
                    90 -> moveEast(value);
                case
                    180 -> moveSouth(value);
                case
                    270 -> moveWest(value);

                default -> throw new RuntimeException("Unsupported direction: " + value);
            }

        }
    }

    record Instruction(char direction, int value) {
        public static Instruction fromString(String input) {
            Pattern p = Pattern.compile("([A-Z])(\\d+)");
            Matcher m = p.matcher(input);
            m.find();
            var direction = m.group(1).charAt(0);
            var value = Integer.parseInt(m.group(2));
            return new Instruction(direction, value);
        }
    }

}
