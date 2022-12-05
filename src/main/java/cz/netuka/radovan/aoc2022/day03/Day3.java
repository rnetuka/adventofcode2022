package cz.netuka.radovan.aoc2022.day03;

import cz.netuka.radovan.aoc2022.Puzzle;

import java.io.IOException;

public class Day3 implements Puzzle {

    @Override
    public void print() throws IOException {
        var solution = new Solution();
        System.out.println("--- Day 3: Rucksack Reorganization ---");
        System.out.println("What is the sum of the priorities of those item types?");
        System.out.println(solution.partOne());
        System.out.println("Find the item type that corresponds to the badges of each three-Elf group.");
        System.out.println("What is the sum of the priorities of those item types?");
        System.out.println(solution.partTwo());
    }

}