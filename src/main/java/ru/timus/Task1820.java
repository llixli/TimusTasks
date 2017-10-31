package ru.timus;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
* Page of task: http://acm.timus.ru/problem.aspx?space=1&num=1820
* Need make tests
*/
public class Task1820 {
    public static void main(String args[]) {
    Task1820 task1820 = new Task1820();
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        ArrayList<Integer> inputData = new ArrayList<>();
        int timeToCookingSteak = 0;
      
        while(in.hasNextInt()) {
        inputData.add(in.nextInt());
        }

        if (inputData.size() == 2) {
        boolean dataIsCorrect = false;
        for (int i = 0; i < inputData.size(); i++ ) {
        dataIsCorrect = task1820.checkValue(inputData.get(i));
        if (!dataIsCorrect) {
        break;
        }
        }
        if (dataIsCorrect) {
        timeToCookingSteak = inputData.get(0) * inputData.get(1) * 2;
        }
        }

        out.println(timeToCookingSteak);
        out.flush();
}

boolean checkValue(int inputValue) {
	if (inputValue >= 1 && inputValue <= 1000) {
		return true;
	}
	else {
		return false;
	}
}

}