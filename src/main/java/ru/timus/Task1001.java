package ru.timus;

import java.io.PrintWriter;
import java.util.*;

public class Task1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        StringBuilder dataFromThread = new StringBuilder("");

        while (in.hasNext()) {
            dataFromThread.append(in.next());
        }

        ArrayList<String> resultList = getListOfResultValues(dataFromThread.toString());

        for (int i = resultList.size() - 1; i >= 0; i--) {
            System.out.println(resultList.get(i).toString());
        }
    }

    private static ArrayList<String> getListOfResultValues(String dataFromThread) {
        ArrayList<Double> listOfValues = convertStringToListOfNumbers(dataFromThread);
        return getSqrtFromNumbersOfList(listOfValues);
    }

    private static ArrayList<Double> convertStringToListOfNumbers(String dataFromThread) {
        ArrayList<Double> listOfNumbers = new ArrayList<>();

        String[] arrayOfNumbers = dataFromThread.split("\\s+");
        if (arrayOfNumbers.length > 0) {

            for (String number : arrayOfNumbers) {
                if (number.matches("[+-]?([0-9]*[.])?[0-9]+")) {
                    listOfNumbers.add(Double.parseDouble(number));
                }
            }
        }
        return listOfNumbers;
    }

    private static ArrayList<String> getSqrtFromNumbersOfList(ArrayList<Double> listOfValues) {
        ArrayList<String> arrayListWithRowsOfNumbers = new ArrayList<>();
        for (int i = 0; i < listOfValues.size(); i++) {
            arrayListWithRowsOfNumbers.add(String.format("%.4f", Math.sqrt(listOfValues.get(i))));
        }
        return arrayListWithRowsOfNumbers;
    }

}
