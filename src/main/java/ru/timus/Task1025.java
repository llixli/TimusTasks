package ru.timus;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Page of task: http://acm.timus.ru/problem.aspx?space=1&num=1025
 */
public class Task1025 {
    public static void main(String[] args) {
        Task1025 task1025 = new Task1025();
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int numberOfGroups = in.nextInt();
        int minimalNumbersOfSupportPeople = 0;

        if (numberOfGroups >= 1 &&  numberOfGroups <= 101) {
            ArrayList<Integer> numberOfPeopleInEveryGroup = new ArrayList<>();

            if (in.hasNextInt()) {
                numberOfPeopleInEveryGroup = task1025.saveInputData(in);
            }
            if (numberOfPeopleInEveryGroup.size() > 0) {
                minimalNumbersOfSupportPeople = task1025.calculateMinimalNumbersOfSupportPeople(numberOfPeopleInEveryGroup);
            }
        }

        out.println(minimalNumbersOfSupportPeople);
        out.flush();
    }

    private ArrayList<Integer> saveInputData(Scanner in) {
        ArrayList<Integer> numberOfPeopleInEveryGroup = new ArrayList<>();
        int islandPopulation = 0;
        int inputNumberOfPeopleInGroup = 0;
        boolean incorrectNumberOfPeople = false;

        while(in.hasNextInt()) {
            inputNumberOfPeopleInGroup = in.nextInt();
            if (inputNumberOfPeopleInGroup > 0) {
                numberOfPeopleInEveryGroup.add(inputNumberOfPeopleInGroup);
                islandPopulation += numberOfPeopleInEveryGroup.get(numberOfPeopleInEveryGroup.size() - 1);
                if (islandPopulation > 9999  || islandPopulation < 1) {
                    incorrectNumberOfPeople = true;
                    break;
                }
            }
            else {
                incorrectNumberOfPeople = true;
                break;
            }
        }
        if (!incorrectNumberOfPeople) {
            return numberOfPeopleInEveryGroup;
        }
        else {
            return new ArrayList<>();
        }
    }

    int calculateMinimalNumbersOfSupportPeople (ArrayList<Integer> numberOfPeopleInEveryGroup) {
        int minimalNumberOfGroupsSupporter = getMinimalNumbersOfSupportPartyGroups(numberOfPeopleInEveryGroup);
        Collections.sort(numberOfPeopleInEveryGroup);
        int minimalNumberOfSupportPeople = 0;

        int sufficientNumberOFPeopleInGroup = 0;
        for (int i = 0; i < minimalNumberOfGroupsSupporter; i++) {
            int currentSupporter = numberOfPeopleInEveryGroup.get(i);
            if (currentSupporter < 1) {
                minimalNumberOfSupportPeople = 0;
                break;
            }
            sufficientNumberOFPeopleInGroup = 1 + numberOfPeopleInEveryGroup.get(i)/2;
            minimalNumberOfSupportPeople += sufficientNumberOFPeopleInGroup;
        }

        return minimalNumberOfSupportPeople;
    }


    private int getMinimalNumbersOfSupportPartyGroups(ArrayList<Integer> numberOfPeopleInEveryGroup) {
        int minimalNumberOfGroupsSupporter = numberOfPeopleInEveryGroup.size()/2;
        if (numberOfPeopleInEveryGroup.size() % 2 != 0) {
            minimalNumberOfGroupsSupporter++;
        }
        return minimalNumberOfGroupsSupporter;

    }

}
