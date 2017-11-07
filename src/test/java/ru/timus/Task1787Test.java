package ru.timus;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task1787Test {
    Task1787 task1787;
    @Before
    public void init() {
        task1787 = new Task1787();
    }

    @After
    public void killObject() {
        task1787 = null;
    }

    @Test
    public void checkNumberOfCarsOnCrossroadZeroCars() throws Exception {
        String formattedRow = "5 2 10 0 0";
        assertEquals(0, task1787.checkNumberOfCarsOnCrossroad(formattedRow));
    }

    @Test
    public void checkNumberOfCarsOnCrossroadSomeNumberCars() throws Exception {
        String formattedRow = "5 3 5 11 10";
        assertEquals(11, task1787.checkNumberOfCarsOnCrossroad(formattedRow));
    }

    @Test
    public void checkNumberOfCarsOnCrossroadOneCar() throws Exception {
        String formattedRow = "5 1 6";
        assertEquals(1, task1787.checkNumberOfCarsOnCrossroad(formattedRow));
    }

    @Test
    public void checkNumberOfCarsOnCrossroadRowContainedNonNumericValue() throws Exception {
        String formattedRow = "5 2 15 0 ds";
        assertEquals(0, task1787.checkNumberOfCarsOnCrossroad(formattedRow));
    }

    @Test
    public void checkNumberOfCarsOnCrossroadValuesIsNotAccessoryToLimit() throws Exception {
        String formattedRow = "0 3 15 0 2";
        assertEquals(0, task1787.checkNumberOfCarsOnCrossroad(formattedRow));
    }

    @Test
    public void checkNumberOfCarsOnCrossroadValuesNumberOfConditionMunutesNotEqualsNumberOfMinutes() throws Exception {
        String formattedRow = "2 2 15 0 2";
        assertEquals(0, task1787.checkNumberOfCarsOnCrossroad(formattedRow));
    }
}