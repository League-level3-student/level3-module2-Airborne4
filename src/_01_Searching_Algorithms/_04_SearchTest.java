package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	int[] sortedArray = {1,2,3,4,5,6};
	
	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		assertEquals(-1,_01_BinarySearch.binarySearch(sortedArray, 0, sortedArray.length-1, 9) );
		
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		//assertEquals(2,_01_BinarySearch.binarySearch(sortedArray, sortedArray[0], sortedArray[sortedArray.length-1], 3) );
		assertEquals(-1,_01_BinarySearch.binarySearch(sortedArray, 0, sortedArray.length-1, 9) );
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		assertEquals(-1,_02_InterpolationSearch.interpolationSearch(sortedArray,9));
		assertEquals(2,_02_InterpolationSearch.interpolationSearch(sortedArray,3));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		assertEquals(0,_03_ExponentialSearch.exponentialSearch(sortedArray,3));
	}
}
