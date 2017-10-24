package ru.timus;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task1068Test {
    Task1068 task1068 = new Task1068();
    @Test
    public void sumOfRowNumbersPositiveTest() throws Exception {
        assertEquals(1, task1068.sumOfRowNumbers(1));
    }

    @Test
    public void sumOfRowNumbersNegativeTest() throws Exception {
        assertEquals(0, task1068.sumOfRowNumbers(-1));
    }

    @Test
    public void sumOfRowNumbersNullTest() throws Exception {
        assertEquals(1, task1068.sumOfRowNumbers(0));
    }

}