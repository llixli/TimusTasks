package ru.timus;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class Task1025Test {
    Task1025 task1025;
    @Before
    public void initialize() {
        this.task1025 = new Task1025();
    }

    @Test
    public void getMinimalNumbersOfSupportPartyGroupsArrOfPositiveNumbersTest() throws Exception {
        Integer[] groupsOfPeopleArr = new Integer[] {5, 7, 5};
        ArrayList<Integer> groupsOfPeopleList = new ArrayList<>(Arrays.asList(groupsOfPeopleArr));
        assertEquals(6, task1025.calculateMinimalNumbersOfSupportPeople(groupsOfPeopleList));
    }

    @Test
    public void getMinimalNumbersOfSupportPartyGroupsNullTest() throws Exception {
        Integer[] groupsOfPeopleArr = new Integer[] {0};
        ArrayList<Integer> groupsOfPeopleList = new ArrayList<>(Arrays.asList(groupsOfPeopleArr));
        assertEquals(0, task1025.calculateMinimalNumbersOfSupportPeople(groupsOfPeopleList));
    }


    @Test
    public void getMinimalNumbersOfSupportPartyGroupsArrOfNegativeNumbersTest() throws Exception {
        Integer[] groupsOfPeopleArr = new Integer[] {-1, -2, -3, -4};
        ArrayList<Integer> groupsOfPeopleList = new ArrayList<>(Arrays.asList(groupsOfPeopleArr));
        assertEquals(0, task1025.calculateMinimalNumbersOfSupportPeople(groupsOfPeopleList));
    }

    @After
    public void killObject() {
        task1025 = null;
    }

}