package ru.timus;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.timus.Task1000.amountOfTwoValues;

public class Task1000Test {

    @Test
    public void amountOfTwoIntTest() throws Exception {
        assertEquals(8, amountOfTwoValues(3, 5));
    }
}