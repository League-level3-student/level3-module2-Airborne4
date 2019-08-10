package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {
				// if array is not sorted then shuffle the 
		        // array again 
		        while (isSorted(array) == false) 
		            shuffle(array); 
		    } 
		  
		    // To generate permuatation of the array 
		    void shuffle(int[] array) 
		    { 
				int n = 0;
				// Math.random() returns a double positive 
		         // value, greater than or equal to 0.0 and 
		         // less than 1.0. 
		         for (int i=1; i <= n; i++) 
		             swap(array, i, (int)(Math.random()*i)); 
		    } 
		  
		    // Swapping 2 elements 
		    void swap(int[] array, int i, int j) 
		    { 
		        int temp = array[i]; 
		        array[i] = array[j]; 
		        array[j] = temp; 
		    } 
		  
		    // To check if array is sorted or not 
		    boolean isSorted(int[] array) 
		    { 
		        for (int i=1; i<array.length; i++) 
		            if (array[i] < array[i-1]) 
		                return false; 
		        return true; 
		    } 
	}

