package ru.timus;

import java.io.PrintWriter;
        import java.util.Scanner;

/**
 * Page of task: http://acm.timus.ru/problem.aspx?space=1&num=1068
 */
public class Task1068 {
    public static void main(String[] args) {
        Task1068 task1068 = new Task1068();
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int inputNumber = in.nextInt();
        int sumOfNumbers = task1068.sumOfRowNumbers(inputNumber);

        out.println(sumOfNumbers);

        out.flush();
    }

    private static boolean checkOnPositiveSighOfNumber(int inputNumber) {
        if (inputNumber > 0) {
            return true;
        }
        return false;
    }

    int sumOfRowNumbers(int inputNumber) {
        int sumOfNumbers = 0;
        if (Math.abs(inputNumber) <= 10000 ) {
            boolean isPositiveNumber  = checkOnPositiveSighOfNumber(inputNumber);
            for (int i = 0; i < Math.abs(inputNumber) + 1; i++) {
                sumOfNumbers += i;
            }
            if (!isPositiveNumber) {
                sumOfNumbers = 1 - sumOfNumbers;
            }
        }
        if (inputNumber == 0) {
            sumOfNumbers = 1;
        }

        return sumOfNumbers;
    }

}
