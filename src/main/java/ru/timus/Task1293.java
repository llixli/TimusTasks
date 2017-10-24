package ru.timus;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Page of task: http://acm.timus.ru/problem.aspx?space=1&num=1293
 */
public class Task1293 {
    public static void main(String[] args) {
        Task1293 task1293 = new Task1293();
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        ArrayList<Integer> inputNumbers = new ArrayList<>();
        int inputNumber = 0;
        while(in.hasNextInt()) {
            inputNumber = in.nextInt();
            if (inputNumber < 1 && inputNumber > 100) {
                break;
            }
            inputNumbers.add(inputNumber);
        }
        int resultOfCalculation = task1293.makeCalulation(inputNumbers);
        out.println(resultOfCalculation);
        out.flush();
    }

    int makeCalulation(ArrayList<Integer> inputNumbers) {
        int resultOfCalculation = 0;
        if (inputNumbers.size() == 3) {
            int numberOfPanels = inputNumbers.get(0);
            int length = inputNumbers.get(1);
            int width = inputNumbers.get(2);
            int numberOfPanelSides = 2;
            resultOfCalculation =  numberOfPanels * length * width * numberOfPanelSides;
        }
        return resultOfCalculation;
    }

}
