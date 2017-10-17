package ru.timus;

import org.junit.Test;

<<<<<<< HEAD
import static org.junit.Assert.*;
import static ru.timus.Task1000.amountOfTwoValues;

public class Task1000Test {

    @Test
    public void amountOfTwoIntTest() throws Exception {
        assertEquals(8, amountOfTwoValues(3, 5));
    }
=======
import static org.junit.Assert.assertEquals;
import static ru.timus.Task1000.amountOfTwoValues;


public class Task1000Test {

    @Test
    public void amountOfTwoValuesTest() throws Exception {

        assertEquals(4, amountOfTwoValues(2, 2));
    }

>>>>>>> b16fb21b5edafda1d30287530a05726dafa07840
}