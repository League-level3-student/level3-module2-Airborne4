package _00_Sorting_Algorithms;

public class SelectionSorter extends Sorter {
	public SelectionSorter() {
		type = "Selection";
	}
	
	//  You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		
	        int n = array.length; 
	  
	        // One by one move boundary of unsorted subarray 
	        for (int i = 0; i < n-1; i++) 
	        { 
	            // Find the minimum element in unsorted array 
	            int min_idx = i; 
	            for (int j = i+1; j < n; j++) 
	                if (array[j] < array[min_idx]) 
	                    min_idx = j; 
	  
	            // Swap the found minimum element with the first 
	            // element 
	            int temp = array[min_idx]; 
	            array[min_idx] = array[i]; 
	            array[i] = temp; 
	        } 
	    } 
}
