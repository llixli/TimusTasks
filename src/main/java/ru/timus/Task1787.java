package ru.timus;


import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Page of task: http://acm.timus.ru/problem.aspx?space=1&num=1787
 */
public class Task1787 {
    public static void main(String[] args) {
        Task1787 task1787 = new Task1787();
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String taskCondition = "";
        String taskData = "";
        int numberOfCarsInCrossroad = 0;

        if (in.hasNextLine()) {
            taskCondition = in.nextLine();
            taskData = in.nextLine();
        }

        if (taskCondition.length() == 2 && !taskData.equals("")  ) {
            String concatenatedRow = taskCondition + " " + taskData;
            numberOfCarsInCrossroad = task1787.checkNumberOfCarsOnCrossroad(concatenatedRow);
        }

        out.println(numberOfCarsInCrossroad);
        out.flush();
    }

    int checkNumberOfCarsOnCrossroad(String concatenatedRow) {
        int numberOfCarsInCrossroad = 0;
        String[] resultStringArray = concatenatedRow.split(" ");
        int[] resultIntArray = new int[resultStringArray.length];

        try {
            for (int i = 0; i < resultStringArray.length; i++) {
                resultIntArray[i] = Integer.parseInt(resultStringArray[i]);
            }
            if (resultIntArray[1] == resultIntArray.length - 2) {
                boolean conditionAndDataIsRelevant = checkNumbersToAccessoryOfLimit(resultIntArray);
                if (conditionAndDataIsRelevant) {
                    numberOfCarsInCrossroad = calculateNumberOfCars(resultIntArray);
                }
            }
        }
        catch (NumberFormatException e) {
            return numberOfCarsInCrossroad;
        }

        return numberOfCarsInCrossroad;
    }

    private boolean checkNumbersToAccessoryOfLimit(int[] resultIntArray) {
        boolean conditionIsRelevant = true;
        for (int i = 0; i < 1; i++) {
            if (resultIntArray[i] < 0 || resultIntArray[i] > 100) {
                conditionIsRelevant = false;
                break;
            }
        }
        boolean dataIsRelevant = true;
        for (int i = 2; i < resultIntArray.length; i++) {
            if (resultIntArray[i] < 1 || resultIntArray[i] > 100) {
                dataIsRelevant = false;
                break;
            }
        }
        if (conditionIsRelevant && dataIsRelevant) {
            return true;
        }
        else {
            return false;
        }
    }

    private static int calculateNumberOfCars(int[] resultIntArray) {
        int numberOfCarsOnCrossroad = 0;

        int summaryValueOfCars = 0;
        for (int i = 2; i < resultIntArray.length; i++) {
            summaryValueOfCars += resultIntArray[i];
        }

        numberOfCarsOnCrossroad = resultIntArray[0] * resultIntArray[1] - summaryValueOfCars;
        if (numberOfCarsOnCrossroad < 0) {
            numberOfCarsOnCrossroad = Math.abs(numberOfCarsOnCrossroad);
        }
        else {
            numberOfCarsOnCrossroad = 0;
        }
        return numberOfCarsOnCrossroad;
    }
}