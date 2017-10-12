package ru.timus;

import java.io.PrintWriter;
import java.util.*;

/**
* Page of task: http://acm.timus.ru/problem.aspx?space=1&num=1025
*/
public class Task1025 {
    public static void main(String[] args) {
        Task1025 task1025 = new Task1025();
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
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
}
