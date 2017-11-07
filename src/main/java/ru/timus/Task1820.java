package ru.timus;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
* Page of task: http://acm.timus.ru/problem.aspx?space=1&num=1820
* Need make tests
*/
public class Task1820 {
    public static void main(String args[]) {
        Task1820 task1820 = new Task1820();
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        ArrayList<Integer> inputData = new ArrayList<>();
        int timeToCookingSteaks = 0;

        while(in.hasNextInt()) {
            inputData.add(in.nextInt());
        }

        if (inputData.size() == 2) {
            boolean dataIsCorrect = false;
            for (int i = 0; i < inputData.size(); i++ ) {
                dataIsCorrect = task1820.checkValue(inputData.get(i));
                if (!dataIsCorrect) {
                    break;
                }
            }
            if (dataIsCorrect) {
                int numberOfSteaks = inputData.get(0);
                int capacityOfPan = inputData.get(1);
                timeToCookingSteaks = task1820.calculateTime(numberOfSteaks, capacityOfPan);
            }
        }

        out.println(timeToCookingSteaks);
        out.flush();
    }

    private int calculateTime(int numberOfSteaks, int capacityOfPan) {

        int timeToCookingSteaks = 0;
        if (capacityOfPan < numberOfSteaks) {
            if (numberOfSteaks % capacityOfPan == 0) {
                timeToCookingSteaks = 2 * numberOfSteaks
            }
        }
        else {
            timeToCookingSteaks = 2;
        }
        return timeToCookingSteaks;
    }

    boolean checkValue(int inputValue) {
        if (inputValue >= 1 && inputValue <= 1000) {
            return true;
        }
        else {
            return false;
        }
    }

}