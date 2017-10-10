package ru.timus;

import java.io.PrintWriter;
import java.util.*;

public class Task1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
  //      PrintWriter out = new PrintWriter(System.out);


        StringBuilder rowWithDataFromThread = new StringBuilder(" 1427  0   \n" +
                "\n" +
                "   876652098643267843 \n" +
                "5276538\n" +
                "  \n" +
                "   ");
/*
        while (in.hasNext()) {
            rowWithDataFromThread.append(in.next());
        }
*/
        ArrayList<String> resultList = getListOfResultValues(rowWithDataFromThread.toString());

        for (int i = resultList.size() - 1; i >= 0; i--) {
            System.out.println(resultList.get(i).toString());
        }
    }

    private static ArrayList<String> getListOfResultValues(String rowWithDataFromThread) {
        ArrayList<Double> listOfNumbers = convertRowToListOfNumbers(rowWithDataFromThread);
        ArrayList<String> listOfRoundedNumbersHowStrings = new ArrayList<>();
        for (Double number : listOfNumbers) {
            double sqrtOfNumber = Math.sqrt(number);

            listOfRoundedNumbersHowStrings.add(String.format(Locale.US, "%.4f", sqrtOfNumber));
        }

        return listOfRoundedNumbersHowStrings;
    }

    private static ArrayList<Double> convertRowToListOfNumbers(String rowWithDataFromThread) {
        ArrayList<Double> listOfNumbers = new ArrayList<>();

        String[] arrayOfNumbers = rowWithDataFromThread.split("\\s+");
        if (arrayOfNumbers.length > 0) {

            for (String row: arrayOfNumbers) {
                if (row.matches("[+-]?([0-9]*[.])?[0-9]+")) {
                    listOfNumbers.add(Double.parseDouble(row));
                }
            }
        }
        return listOfNumbers;
    }


}
