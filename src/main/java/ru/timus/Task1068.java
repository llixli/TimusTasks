package ru.timus;

import java.io.PrintWriter;
<<<<<<< HEAD
import java.util.Scanner;

/**
* Page of task: http://acm.timus.ru/problem.aspx?space=1&num=1068
*/
public class Task1002 {
    public static void main(String[] args) {
        Task1002 task1002 = new Task1002();
=======
        import java.util.Scanner;

/**
 * Page of task: http://acm.timus.ru/problem.aspx?space=1&num=1068
 */
public class Task1068 {
    public static void main(String[] args) {
        Task1068 task1068 = new Task1068();
>>>>>>> b16fb21b5edafda1d30287530a05726dafa07840
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int inputNumber = in.nextInt();
<<<<<<< HEAD
        int sumOfNumbers = task1002.sumOfRowNumbers(inputNumber);
=======
        int sumOfNumbers = task1068.sumOfRowNumbers(inputNumber);
>>>>>>> b16fb21b5edafda1d30287530a05726dafa07840

        out.println(sumOfNumbers);

        out.flush();
    }

    private static boolean checkOnPositiveSighOfNumber(int inputNumber) {
        if (inputNumber > 0) {
            return true;
        }
        return false;
    }

<<<<<<< HEAD
    public int sumOfRowNumbers (int inputNumber) {
        int sumOfNumbers = 0;
        if (Math.abs(inputNumber) <= 10000) {
            boolean isPositiveNumber  = checkOnPositiveSighOfNumber(inputNumber);

            if (isPositiveNumber) {
                for (int i = 0; i <= inputNumber; i++) {
                    sumOfNumbers += i;
                }
            } else {
                for (int i = inputNumber; i <= 1; i++) {
                    sumOfNumbers += i;
                }
=======
    int sumOfRowNumbers(int inputNumber) {
        int sumOfNumbers = 0;
        if (Math.abs(inputNumber) <= 10000 ) {
            boolean isPositiveNumber  = checkOnPositiveSighOfNumber(inputNumber);
            for (int i = 0; i < Math.abs(inputNumber) + 1; i++) {
                sumOfNumbers += i;
            }
            if (!isPositiveNumber) {
                sumOfNumbers = 1 - sumOfNumbers;
>>>>>>> b16fb21b5edafda1d30287530a05726dafa07840
            }
        }
        if (inputNumber == 0) {
            sumOfNumbers = 1;
        }
<<<<<<< HEAD
        return sumOfNumbers;
    }
=======

        return sumOfNumbers;
    }

>>>>>>> b16fb21b5edafda1d30287530a05726dafa07840
}
