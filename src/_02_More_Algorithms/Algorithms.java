package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
	int num;
		for (int i = 0; i < eggs.size(); i++) {
		if (eggs.get(i).equals("cracked")) {
			int[] arr = {i};
			if (arr[0] > arr[1]) {
				num = arr[0]; 
			}
		}
	}
	return num;
	
	}
}
