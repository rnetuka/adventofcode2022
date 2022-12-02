package cz.netuka.radovan.aoc2022;

import cz.netuka.radovan.aoc2022.day01.Day1;
import cz.netuka.radovan.aoc2022.day02.Day2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String... args) throws Exception {
        if (args.length == 0) {
            System.err.println("Please specify an AoC day");
            return;
        }
        int day;
        try {
            day = Integer.parseInt(args[0]);
        } catch (NumberFormatException ex) {
            System.err.println("Please specify a valid day number");
            return;
        }
        Map<Integer, Puzzle> solutions = new HashMap<>();
        solutions.put(1, new Day1());
        solutions.put(2, new Day2());
        solutions.get(day).print();
    }

}