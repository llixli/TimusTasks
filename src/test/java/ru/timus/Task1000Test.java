package ru.timus;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.timus.Task1000.amountOfTwoValues;


public class Task1000Test {

    @Test
    public void amountOfTwoValuesTest() throws Exception {

        assertEquals(4, amountOfTwoValues(2, 2));
    }

}