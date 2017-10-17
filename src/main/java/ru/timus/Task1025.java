package ru.timus;

import java.io.PrintWriter;
<<<<<<< HEAD
import java.util.*;

/**
* Page of task: http://acm.timus.ru/problem.aspx?space=1&num=1025
*/
=======
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Page of task: http://acm.timus.ru/problem.aspx?space=1&num=1025
 */
>>>>>>> b16fb21b5edafda1d30287530a05726dafa07840
public class Task1025 {
    public static void main(String[] args) {
        Task1025 task1025 = new Task1025();
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
<<<<<<< HEAD
        
        int numbersOfGroups = in.nextInt();
        int numberOfSupporters = 0;
        
        if (numbersOfGroups >= 1 && numbersOfGroups <= 101) {
            int[] numberOfPeopleInGroups = new int[numbersOfGroups];
            int islandPopulation = 0;
            for (int i = 0; i < numberOfPeopleInGroups.length; i++) {
                numberOfPeopleInGroups[i] = in.nextInt();
                islandPopulation += numberOfPeopleInGroups[i];
            }
            if (islandPopulation > 0 && islandPopulation <= 9999) {
                numberOfSupporters = task1025.getNumberOfSupporters(numberOfPeopleInGroups);
            }
        }

        out.println(numberOfSupporters);
        out.flush();
    }

    private int getNumberOfSupporters(int[] numberOfPeopleInGroups) {
        int numberOfSupporters = 0;



        return numberOfSupporters;
    }
=======

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

>>>>>>> b16fb21b5edafda1d30287530a05726dafa07840
}
