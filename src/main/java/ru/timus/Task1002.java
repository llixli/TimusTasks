package ru.timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1002 {
    public static void main(String[] args) {
        Task1002 task1002 = new Task1002();
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int inputNumber = in.nextInt();
        int sumOfNumbers = task1002.sumOfRowNumbers(inputNumber);

        out.println(sumOfNumbers);

        out.flush();
    }

    private static boolean checkOnPositiveSighOfNumber(int inputNumber) {
        if (inputNumber >= 0) {
            return true;
        }
        return false;
    }

    public int sumOfRowNumbers (int inputNumber) {
        int sumOfNumbers = 0;
        if (Math.abs(inputNumber) < 10000) {
            boolean isPositiveNumber  = checkOnPositiveSighOfNumber(inputNumber);

            if (isPositiveNumber) {
                for (int i = 1; i <= inputNumber; i++) {
                    sumOfNumbers += i;
                }
            } else {
                for (int i = inputNumber; i <= 1; i++) {
                    sumOfNumbers += i;
                }
            }
        }
        return sumOfNumbers;
    }
}
