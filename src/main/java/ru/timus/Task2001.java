package ru.timus;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Page of task: http://acm.timus.ru/problem.aspx?space=1&num=2001
 */
public class Task2001 {
    public static void main(String[] args) {
        Task2001 task2001 = new Task2001();
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String[] pairsValuesOfWeighing = new String[3];
        int counter = 0;
        while (in.hasNextLine()) {
            pairsValuesOfWeighing[counter] = in.nextLine();
            counter++;
        }

        String weightOfBerries = task2001.getWeightOfBerries(pairsValuesOfWeighing);

        out.println(weightOfBerries);
        out.flush();
    }

    String getWeightOfBerries(String[] pairsValuesOfWeighing) {
        String weightOfBerries = "";
        if (pairsValuesOfWeighing.length == 3) {
            String[][] splitedWeigthOfBerries = new String[3][2];
            for (int i = 0; i < pairsValuesOfWeighing.length; i++) {
                String[] parsedLine = pairsValuesOfWeighing[i].split(" ");
                if (parsedLine.length == 2) {
                    splitedWeigthOfBerries[i] = parsedLine;
                }
            }
            boolean valuesIsBelong = checkValuesOnBelongignToLimits(splitedWeigthOfBerries);

            if(valuesIsBelong) {
                weightOfBerries = calculatePairValuesOfWeight(splitedWeigthOfBerries);
            }
        }
        return weightOfBerries;
    }

    private boolean checkValuesOnBelongignToLimits(String[][] splitedWeigthOfBerries) {
        int checkedValue = 0;

        for (int i = 0; i < splitedWeigthOfBerries.length; i++) {
            for (int j = 0; j < splitedWeigthOfBerries[i].length; j++) {
                checkedValue = Integer.parseInt(splitedWeigthOfBerries[i][j]);
                boolean condition = checkedValue >= 0 && checkedValue <= 10000;
                if (!condition) {
                    return false;
                }
            }
        }

        return true;
    }

    private String calculatePairValuesOfWeight(String[][] splitedWeigthOfBerries) {


        String firstPartBerriesWeight = calculateWeigth(splitedWeigthOfBerries[0][0], splitedWeigthOfBerries[2][0]);
        String secondPartBerriesWeight = calculateWeigth(splitedWeigthOfBerries[0][1], splitedWeigthOfBerries[1][1]);

        return firstPartBerriesWeight + " " + secondPartBerriesWeight;
    }

    private String calculateWeigth(String weightOfBasketWithBerries, String weightOfbasket) {
        int minuend = Integer.parseInt(weightOfBasketWithBerries);
        int subtrahend = Integer.parseInt(weightOfbasket);

        Integer result = minuend - subtrahend;

        return result.toString();
    }
}
