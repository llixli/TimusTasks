package ru.timus;


import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Page of task: http://acm.timus.ru/problem.aspx?space=1&num=1787
 */
public class Task1787 {
    public static void main(String[] args) {
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
            numberOfCarsInCrossroad = checkNumberOfCarsOnCrossroad(concatenatedRow);
        }

        out.println(numberOfCarsInCrossroad);
        out.flush();
    }

    private static int checkNumberOfCarsOnCrossroad(String concatenatedRow) {
        int numberOfCarsInCrossroad = 0;
        String[] resultStringArray = concatenatedRow.split(" ");


        try {
            int[] resultIntArray = Arrays.stream(resultStringArray).mapToInt(Integer::parseInt).toArray();
            boolean taskConditionIsReliable = false;
            boolean taskDataIsReliable = false;
            
            numberOfCarsInCrossroad = calculateNumberOfCars(resultIntArray);
        }
        catch (NumberFormatException e) {
            return numberOfCarsInCrossroad;
        }
        return numberOfCarsInCrossroad;
    }

    private static int calculateNumberOfCars(int[] resultIntArray) {
        int numberOfCarsOnCrossroad = 0;

        numberOfCarsOnCrossroad

        return numberOfCarsOnCrossroad;
    }

}