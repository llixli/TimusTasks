package ru.timus;


import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * http://acm.timus.ru/problem.aspx?space=1&num=1409
 */
public class Task1409 {
    public static void main(String[] args) {
        Task1409 task1409 = new Task1409();
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        ArrayList<Integer> inputNumbers = new ArrayList<>();
        int inputValue = 0;
        while (in.hasNextInt()) {
            inputValue = in.nextInt();
            if (inputValue > 0 && inputValue < 10) {
                inputNumbers.add(inputValue);
            }
        }
        String result = "";
        if (inputNumbers.size() == 2) {
            result = "" + (inputNumbers.get(1) - 1) + " " + (inputNumbers.get(0) - 1);
        }
        out.println(result);
        out.flush();
    }
}
