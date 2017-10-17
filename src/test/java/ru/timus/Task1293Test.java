package ru.timus;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class Task1293Test {
    Task1293 task1293;
    @Before
    public void init() {
        this.task1293 = new Task1293();
    }

    @After
    public void killObject() {
        this.task1293 = null;
    }


    @Test
    public void makeCalulationWrongNumberOfValues() throws Exception {
        ArrayList<Integer> inputValues = new ArrayList<>(Arrays.asList(5, 2));
        assertEquals(0, task1293.makeCalulation(inputValues));

    }


    @Test
    public void makeCalulationSuccessTest() throws Exception {
        ArrayList<Integer> inputValues = new ArrayList<>(Arrays.asList(5, 2, 3));
        assertEquals(60, task1293.makeCalulation(inputValues));
    }



}