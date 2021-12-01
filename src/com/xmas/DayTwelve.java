package com.xmas;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DayTwelve {

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

        void moveWest(int instruction) {
            x -= instruction;
        }

        void moveEast(int instruction) {
            x+= instruction;
        }

        void moveSouth(int value) {
            y-= value;
        }

        void moveNorth(int value) {
            y+= value;
        }

        void turn(int value) {
            if (value % 90 != 0 ) {
                System.out.println("Wierd turn: " + value);
            }
            direction = (direction + value) % 360;
            if (direction < 0) {
                direction += 360;
            }
        }

        void forward(int value) {
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

    public int solveTwo(String input) {
        SecondBoat solveBoat = new SecondBoat();
        solveBoat.direction = 90;
        WayPoint wayPoint = new WayPoint();
        wayPoint.x = 10;
        wayPoint.y = 1;
        solveBoat.wayPoint = wayPoint;

        Arrays.stream(input.split("\\n")).map(Instruction::fromString).forEach(instruction -> solveBoat.parseInsctruction(instruction));
        return Math.abs(solveBoat.x) + Math.abs(solveBoat.y);
    }

    public class SecondBoat extends Boat {

        private Boat wayPoint;

        @Override
        void moveWest(int value) {
            wayPoint.moveWest(value);
        }
        @Override
        void moveSouth(int value) {
            wayPoint.moveSouth(value);
        }
        @Override
        void moveNorth(int value) {
            wayPoint.moveNorth(value);
        }
        @Override
        void moveEast(int value) {
            wayPoint.moveEast(value);
        }
        @Override
        void turn(int value) {
            wayPoint.turn(value);
        }

        @Override
        void forward(int value) {
            for (int i = 0 ; i < value ; i++) {
                x += wayPoint.x;
                y += wayPoint.y;
            }
        }
    }

    public class WayPoint extends Boat {
        @Override
        void turn(int value) {
            if (value < 0) {
                value += 360;
            }
            for (int i = 0; i < value / 90; i++) {
                var oldX = x;
                x = y;
                y = -1 * oldX;
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
