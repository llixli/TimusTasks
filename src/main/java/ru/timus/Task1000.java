package ru.timus;

import java.io.PrintWriter;
import java.util.Scanner;

/**
<<<<<<< HEAD
* Page of task: http://acm.timus.ru/problem.aspx?space=1&num=1000
*/
=======
 * Page of task: http://acm.timus.ru/problem.aspx?space=1&num=1000
 */
>>>>>>> b16fb21b5edafda1d30287530a05726dafa07840
public class Task1000 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int firstTerm = in.nextInt();
        int secondTerm = in.nextInt();


        int result = amountOfTwoValues(firstTerm, secondTerm);

        out.println(result);

        out.flush();

    }

    public static int amountOfTwoValues(int firstTerm, int secondTerm) {
        return firstTerm + secondTerm;
    }
}
