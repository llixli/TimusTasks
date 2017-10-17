package ru.timus;

import java.io.PrintWriter;
import java.util.*;

/**
 * Page of task: http://acm.timus.ru/problem.aspx?space=1&num=1001
 */
public class Task1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        ArrayList<String> listOfRows = new ArrayList<>();

        while (in.hasNextLong()) {
            listOfRows.add(String.format(Locale.US, "%.4f", Math.sqrt(in.nextLong())));
        }

        for (int i = listOfRows.size() - 1; i >= 0; i--) {
            out.println(listOfRows.get(i));
            out.flush();
        }
    }

}
