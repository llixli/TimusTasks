package ru.timus;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task1785Test {
    Task1785 task1785;
    @Before
    public void init() {
        this.task1785 = new Task1785();
    }

    @Test
    public void convertNumberToEqualWordNull() throws Exception {
        assertEquals("", task1785.convertNumberToEqualWord(0));
    }

    @Test
    public void convertNumberToEqualWordNegativeNumber() throws Exception {
        assertEquals("", task1785.convertNumberToEqualWord(-123));

    }

    @Test
    public void convertNumberToEqualWordOutOfLimitNumber() throws Exception {
        assertEquals("", task1785.convertNumberToEqualWord(2001));

    }

    @Test
    public void convertNumberToEqualWordSuccessTest() throws Exception {
        assertEquals("lots", task1785.convertNumberToEqualWord(45));
    }

    @After
    public void killObject() {
        task1785 = null;
    }





}