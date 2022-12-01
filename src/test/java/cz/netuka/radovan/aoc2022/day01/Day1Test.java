package cz.netuka.radovan.aoc2022.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class Day1Test {

    private Solution solution;

    @BeforeEach
    public void setUp() throws IOException {
        solution = new Solution();
    }

    @Test
    public void testSolution1() {
        int expected = 69626;
        int result = solution.maxCalories();
        assertEquals(expected, result);
    }

    @Test
    public void testSolution2() {
        int expected = 206780;
        int result = solution.topTreeCalories();
        assertEquals(expected, result);
    }

}