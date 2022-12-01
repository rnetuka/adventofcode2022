package cz.netuka.radovan.aoc2022.day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    private List<String> input;


    public Solution() throws IOException {
        input = Files.readAllLines(Path.of("src/main/resources/input01.txt"));
    }


    private List<Integer> elves() {
        List<Integer> elves = new ArrayList<>();
        int calories = 0;
        for (String line : input) {
            if (line.isEmpty()) {
                elves.add(calories);
                calories = 0;
            } else {
                calories += Integer.parseInt(line);
            }
        }
        return elves;
    }

    int maxCalories() {
        List<Integer> elves = elves();
        return Collections.max(elves);
    }

    int topTreeCalories() {
        List<Integer> elves = elves();
        Collections.sort(elves);
        Collections.reverse(elves);
        return elves.get(0) + elves.get(1) + elves.get(2);
    }

}
