package ru.timus;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task2001Test {
    Task2001 task2001;

    @Before
    public void init() {
        task2001 = new Task2001();
    }

    @After
    public void dropObject() {
        task2001 = null;
    }

    @Test
    public void getWeightOfBerriesCorrectArrayTest() throws Exception {
        String[] inputArr = new String[3];

        inputArr[0] = "1 2";
        inputArr[1] = "2 1";
        inputArr[2] = "0 3";

        assertEquals("1 1", task2001.getWeightOfBerries(inputArr));

    }

    @Test
    public void getWeightOfBerriesIncorrectArrayTest() throws Exception {
        String[] inputArr = new String[2];

        inputArr[0] = "1 2";
        inputArr[1] = "2 1";

        assertEquals("", task2001.getWeightOfBerries(inputArr));
    }

    @Test
    public void getWeightOfBerriesIncorrectValuesTest() throws Exception {
        String[] inputArr = new String[3];

        inputArr[0] = "30000 30000";
        inputArr[1] = "30000 30000";
        inputArr[2] = "30000 30000";

        assertEquals("", task2001.getWeightOfBerries(inputArr));
    }

}