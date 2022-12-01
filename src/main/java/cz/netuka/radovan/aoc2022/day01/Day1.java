package cz.netuka.radovan.aoc2022.day01;

import cz.netuka.radovan.aoc2022.Puzzle;

import java.io.IOException;

public class Day1 implements Puzzle {

    @Override
    public void print() throws IOException {
        Solution solution = new Solution();

        System.out.println("--- Day 1: Calorie Counting ---");
        System.out.println("How many total Calories is that Elf carrying?");
        System.out.println(solution.maxCalories());
        System.out.println("How many Calories are those Elves carrying in total?");
        System.out.println(solution.topTreeCalories());
    }

}