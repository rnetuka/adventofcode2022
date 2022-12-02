package cz.netuka.radovan.aoc2022.day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    private static final int rock = 1;
    private static final int paper = 2;
    private static final int scissors = 3;

    private static final int loss = 0;
    private static final int draw = 3;
    private static final int win = 6;

    private List<String> input;


    public Solution() throws IOException {
        input = Files.readAllLines(Path.of("src/main/resources/input02.txt"));
    }


    private Map<String, Integer> createMapping() {
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("A", rock);
        mapping.put("B", paper);
        mapping.put("C", scissors);
        return mapping;
    }

    private int outcome(int elf, int me) {
        if (me == elf) {
            return draw;
        }
        switch (me) {
            case rock:
                return elf == scissors ? win : loss;
            case paper:
                return elf == rock ? win : loss;
            case scissors:
                return elf == paper ? win : loss;
            default:
                throw new IllegalStateException("Unknown game move");
        }
    }

    private int choose(int elf, int outcome) {
        if (outcome == draw) {
            return elf;
        }
        switch (elf) {
            case rock:
                return outcome == win ? paper : scissors;
            case paper:
                return outcome == win ? scissors : rock;
            case scissors:
                return outcome == win ? rock : paper;
            default:
                throw new IllegalStateException("Unknown game move");
        }
    }

    int partOne() {
        Map<String, Integer> mapping = createMapping();
        mapping.put("X", rock);
        mapping.put("Y", paper);
        mapping.put("Z", scissors);

        int score = 0;
        for (String line : input) {
            String[] parts = line.split(" ");
            int elf = mapping.get(parts[0]);
            int me = mapping.get(parts[1]);
            int outcome = outcome(elf, me);
            score += me + outcome;
        }
        return score;
    }

    int partTwo() {
        Map<String, Integer> mapping = createMapping();
        mapping.put("X", loss);
        mapping.put("Y", draw);
        mapping.put("Z", win);

        int score = 0;
        for (String line : input) {
            String[] parts = line.split(" ");
            int elf = mapping.get(parts[0]);
            int outcome = mapping.get(parts[1]);
            int me = choose(elf, outcome);
            score += me + outcome;
        }
        return score;
    }

}