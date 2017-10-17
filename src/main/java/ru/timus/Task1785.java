package ru.timus;

import java.io.PrintWriter;
        import java.util.Scanner;

/**
 * http://acm.timus.ru/problem.aspx?space=1&num=1785
 */
public class Task1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Task1785 task1785 = new Task1785();

        int inputNumber = 0;
        if (in.hasNextInt()) {
            inputNumber = in.nextInt();
        }
        String outputWord =  task1785.convertNumberToEqualWord(inputNumber);

        out.println(outputWord);
        out.flush();
    }

    String convertNumberToEqualWord(int inputNumber) {
        String outputRow = "";
        if (inputNumber >= 1 && inputNumber <= 2000) {
            if (inputNumber >= 1 && inputNumber <= 4) return "few";
            if (inputNumber >= 5 && inputNumber <= 9) return "several";
            if (inputNumber >= 10 && inputNumber <= 19) return "pack";
            if (inputNumber >= 20 && inputNumber <= 49) return "lots";
            if (inputNumber >= 50 && inputNumber <= 99) return "horde";
            if (inputNumber >= 100 && inputNumber <= 249) return "throng";
            if (inputNumber >= 250 && inputNumber <= 499) return "swarm";
            if (inputNumber >= 500 && inputNumber <= 999) return "zounds";
            if (inputNumber >= 1000) return "legion";
        }
        return outputRow;
    }
}
