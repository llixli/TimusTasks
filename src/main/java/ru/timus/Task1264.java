package ru.timus;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Page of task: http://acm.timus.ru/problem.aspx?space=1&num=1264
 */
public class Task1264 {
    public static void main(String[] args) {
    	Task1264 task1264 = new Task1264();
    	
    	Scanner in = new Scanner(System.in);
    	PrintWriter out = new PrintWriter(System.out);

    	String inputConditions = "";
    	if  (in.hasNextLine()) {
    		inputConditions = in.nextLine();
    	}

    	Integer timeToMakeWork = task1264.getTimeToWriteCode(inputConditions);

    	if (timeToMakeWork != -1) {
    		out.println(timeToMakeWork.toString());
    		out.flush();
    	}
    }

    Integer getTimeToWriteCode(String inputConditions) {
    	Integer timeToMakeWork = -1;
    	String[] dimensionAndMaxNumberOfElements = inputConditions.split(" ");

    	if (dimensionAndMaxNumberOfElements.length == 2) {
    		int dimensionOfArray = Integer.parseInt(dimensionAndMaxNumberOfElements[0]);
    		int maxNumberOfElements = Integer.parseInt(dimensionAndMaxNumberOfElements[1]);
    		boolean firstCondition = dimensionOfArray >= 0 && dimensionOfArray <= 40000;
    		boolean secondCondition = maxNumberOfElements >= 0 && maxNumberOfElements <= 40000;

			if(firstCondition && secondCondition) {
    			// Addition 1 to maxNumberOfElements because numerations become since from 0
    			timeToMakeWork = dimensionOfArray * (maxNumberOfElements + 1);
    		}
    	}
    	return timeToMakeWork;
    }
}
