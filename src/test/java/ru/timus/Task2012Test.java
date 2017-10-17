package ru.timus;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task2012Test {
    Task1785 task2012;
    @Before
    public void init() {
        this.task2012 = new Task1785();
    }


    @After
    public void killObject() {
        task2012 = null;
    }

}