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
        //assertEquals("few", task1785.convertNumberToEqualWord(1));
        //assertEquals("several", task1785.convertNumberToEqualWord(7));
        //assertEquals("pack", task1785.convertNumberToEqualWord(19));
        assertEquals("lots", task1785.convertNumberToEqualWord(45));
        /*assertEquals("horde", task1785.convertNumberToEqualWord(98));
        assertEquals("throng", task1785.convertNumberToEqualWord(210));
        assertEquals("swarm", task1785.convertNumberToEqualWord(355));
        assertEquals("zounds", task1785.convertNumberToEqualWord(777));
        assertEquals("legion", task1785.convertNumberToEqualWord(1042));*/
    }

    @After
    public void killObject() {
        task1785 = null;
    }





}