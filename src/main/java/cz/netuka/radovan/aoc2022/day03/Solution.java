package cz.netuka.radovan.aoc2022.day03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Solution {

    private static final String possibleItems = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private List<String> input;


    public Solution() throws IOException {
        input = Files.readAllLines(Path.of("src/main/resources/input03.txt"));
    }


    private int getPriority(char item) {
        return possibleItems.indexOf(item) + 1;
    }

    private Set<Character> getItems(String rucksack) {
        Set<Character> items = new LinkedHashSet<>();
        for (char item : rucksack.toCharArray()) {
            items.add(item);
        }
        return items;
    }

    int partOne() {
        int priorities = 0;
        for (String line : input) {
            String compartment1 = line.substring(0, line.length() / 2);
            String compartment2 = line.substring(line.length() / 2);
            Set<Character> items = getItems(compartment1);
            items.retainAll(getItems(compartment2));
            for (Character item : items) {
                priorities += getPriority(item);
            }
        }
        return priorities;
    }

    int partTwo() {
        int priorities = 0;
        for (int i = 0; i < input.size(); i += 3) {
            Set<Character> items = getItems(input.get(i));
            items.retainAll(getItems(input.get(i + 1)));
            items.retainAll(getItems(input.get(i + 2)));
            for (char item : items) {
                priorities += getPriority(item);
            }
        }
        return priorities;
    }

}