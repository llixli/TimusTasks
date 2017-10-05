package ru.timus;

import java.io.PrintWriter;
import java.util.*;

public class Task1001 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String dataFromThread = "";

        while (in.hasNext()) {
            dataFromThread += in.next();
        }

        ArrayList<Double> resultList = getListOfResultValues(dataFromThread);

        for (int i = resultList.size() - 1; i >= 0; i--) {
            out.println(resultList.get(i).toString());
        }
    }

    private static ArrayList<Double> getListOfResultValues(String dataFromThread) {
        ArrayList<Double> listOfValues = convertStringToListOfNumbers(dataFromThread);
        return getSqrtFromNumbersOfList(listOfValues);
    }

    private static ArrayList<Double> convertStringToListOfNumbers(String dataFromThread) {
        ArrayList<Double> listOfNumbers = new ArrayList<>();

        String[] arrayOfNumbers = dataFromThread.split("\\s+");

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (!arrayOfNumbers[i].equals("")) {
                listOfNumbers.add(Double.parseDouble(arrayOfNumbers[i]));
            }
        }
        return listOfNumbers;
    }

    private static ArrayList<Double> getSqrtFromNumbersOfList(ArrayList<Double> listOfValues) {
        for (int i = 0; i < listOfValues.size(); i++) {
            listOfValues.set(i, Math.sqrt(listOfValues.get(i)));
        }
        return listOfValues;
    }

}
