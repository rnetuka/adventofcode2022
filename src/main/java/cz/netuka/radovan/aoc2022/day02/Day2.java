package cz.netuka.radovan.aoc2022.day02;

import cz.netuka.radovan.aoc2022.Puzzle;

import java.io.IOException;

public class Day2 implements Puzzle {

    @Override
    public void print() throws IOException {
        Solution solution = new Solution();

        System.out.println("--- Day 2: Rock Paper Scissors ---");
        System.out.println("What would your total score be if everything goes exactly according to your strategy guide?");
        System.out.println(solution.partOne());
        System.out.println("Following the Elf's instructions for the second column, what would your total score be if " +
                "everything goes exactly according to your strategy guide?");
        System.out.println(solution.partTwo());
    }

}