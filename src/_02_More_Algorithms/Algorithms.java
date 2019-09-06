package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
	int num = -1;
		for (int i = 0; i < eggs.size(); i++) {
		if (eggs.get(i).equals("cracked")) {
				num = i; 
		}
	}
	return num;
	
	}

	public static Object countPearls(List<Boolean> oysters) {
		
		return null;
	}

	public static double findTallest(List<Double> peeps) {
		        // initialize max variable to minimum value 
		        Double max = Double.MIN_VALUE; 
		  
		        // loop for compare to current max value 
		        // with all list element and find maximum value 
		        for (Double i : peeps) { 
		  
		            // update max if found to be less than  
		            // the current element 
		            if (max < i) { 
		                max = i; 
		            } 
		        } 
		  
		        return max; 
	}

	public static List<String> sortScores(List<Double> results) {

		return null;
	}

	public static Object containsSOS(List<String> message2) {
		 
		return null;
	}





}
