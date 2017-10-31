package ru.timus;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Page of task: http://acm.timus.ru/problem.aspx?space=1&num=2012
 * Need make tests
 */
public class Task2012 {
    public static void main(String[] args) {
    	Task2012 task2012 = new Task2012();
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String result = "NO";

        if (in.hasNextInt()) {
	 	    int numberOfTasks =  in.nextInt();
	 	    if (numberOfTasks >= 7 && numberOfTasks <= 11) {
	 	    	result = "YES";
	 	    }
    	}

    	out.println(result);
        out.flush();
    }
}
