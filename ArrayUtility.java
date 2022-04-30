package lab5;

import java.util.*;

/**
 * In this lab you will practice writing methods, using classes from the Java
 * Standard Library, and working with String and arrays.
 * 
 * 
 * This ArrayUtility class will help you do things with arrays: 1D and 2D This
 * ArrayUtility class contains a random assortment of methods that should
 * improve your programming skills in using Java Control Structures (selection
 * structures, repetition structures, and nested Loops), 1D and 2D arrays.
 * 
 * <strong>Hint: You may use java.util.Arrays class.</strong>
 *
 */
public class ArrayUtility {

	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private ArrayUtility() {
		// ALREADY IMPLEMENTED; DO NOT MODIFY
	}

	/**
	 * 
	 * 
	 * Implement the method below which takes an array of <code>int</code> numbers
	 * as input argument and returns the number of even numbers in the array
	 * argument. <strong>Your code should use a for loop.</strong>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if array1 = {9, 10, 3, 4, 3} then 	return 2
	 * if array1 = { 1, 6, 1}  then  return 1
	 * if array1 = { 4, 24, 46, 0} then  return 4
	 * if array1 = { 15, 9, 45, 57}  then  return 0
	 * </pre>
	 * 
	 * 
	 * @param inputarray : int input array
	 * @return returns the number of even numbers in the array argument.
	 */

	public static int numberOfEvens(int[] inputarray) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int sum = 0;
		
		for (int i = 0; i < inputarray.length; i++) {
			if (inputarray[i] % 2 == 0) {
				sum ++;
			}
		}
		return sum;
	}

	/**
	 * Given class <strong><code>Rectangle</code></strong> defined in same package
	 * <code>eecs1021.lab5</code>
	 * 
	 * <p>
	 * Implement the method below which takes an array of <code>Rectangle</code>
	 * objects as input argument and returns the average area of these rectangle
	 * objects.
	 * </p>
	 * <p>
	 * <strong> You can assume that the input array is not null and contains at
	 * least 1 one rectangle object.</strong>
	 * </p>
	 * 
	 * @param inputarray Array of Rectangle object
	 * @return the average area of these rectangle objects.
	 */

	public static double avgAreaofRectangeles(Rectangle[] inputarray) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		double average = 0.0;
		
		for (int i = 0; i < inputarray.length; i++) {
		    average += inputarray[i].getArea();
		    }
		return average / inputarray.length;
	}

	/**
	 * 
	 * Implement the method below which takes a 2D array of <code>int</code> numbers
	 * as input argument and returns the average of its elements.
	 * <p>
	 * <strong> You can assume that the input array is not null and contains at
	 * least 1 one element.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * 	if inputarray = {{9, 2, 3, 4}, {1, 2, 3, 45}, {1, 222, 333, -4}} then return 51.75
	 * 	if inputarray = {{1, 4}, {12, 42}} then return 14.75
	 * 	if inputarray = {{20}, {4, 2, 12}} then return 9.5
	 * 	if inputarray = {{81, 28, 4}, {2, 33, -42}, {1, -22,-4}} then return 9.0
	 * </pre>
	 * 
	 * @param inputarray 2D input array of integers
	 * @return the average of its elements.
	 */

	public static double average2D(int[][] inputarray) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		double average = 0.0;
		int sum = 0;
		
		for (int i = 0; i < inputarray.length; i++) {
			for (int j = 0; j < inputarray[i].length; j++) {
				average += inputarray[i][j];
				sum ++;
			}
		}
		return average / sum; 
	
	}

	/**
	 * Implement the method below which takes a 2D array of <code>int</code> numbers
	 * as input argument then finds out its maximum and minimum values, and return
	 * sorted array contains the minimum and maximum values, respectively.
	 * <p>
	 * <strong> You can assume that the input array is not null and contains at
	 * least two elements.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * 	if inputarray = {{9, 2, 3, 4}, {1, 2, 3, 45}, {1, 222, 333, -4}} then return [-4, 333]
	 * 	if inputarray = {{1, 4}, {12, 42}} then return [1, 42]
	 * 	if inputarray = {{20}, {4, 2, 12}} then return [2, 20]
	 * 	if inputarray = {{81, 28, 4}, {2, 33, -42}, {1, -22,-4}} then return [-42, 81]
	 * </pre>
	 * 
	 * @param inputarray 2D input array of integers
	 * @return sorted array contains the minimum and maximum values, respectively.
	 */

	public static int[] minmax2D(int[][] inputarray) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int min = inputarray[0][0];
		int max = inputarray[0][0];
		int[] arr =new int[2];
		
		for (int i = 0; i < inputarray.length; i++) {
			for (int j = 0; j <inputarray[i].length; j++) {
				if (inputarray[i][j] < min) {
					min = inputarray[i][j];
				} else if (inputarray[i][j] > max) {
					max = inputarray[i][j];
				}
			}
		}
		arr[0] = min;
		arr[1] = max;
		return arr;
	}

	/**
	 * 
	 * This averageOfOdd method received an array of integers, then calculate the
	 * average of the odd elements of this array.
	 * <p>
	 * <strong> You can assume that the array is not empty and contains at least 1
	 * one element.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 *		if inputarray = {3, 6}   then 	return 3.0
	 *		if inputarray = { 1, 1, 1}   then 	return 1.0
	 *		if inputarray = { 2, 4, 6, 3}  then  	return 3.0
	 *		if inputarray = { 11, 25, 12, 50}  then  	return 18.0
	 * </pre>
	 * 
	 * 
	 * @param inputarray the input array of integers
	 * @return the average of the ODD elements of the input array of integers, the
	 *         average of type double
	 */
	public static double averageOfOdd(int[] inputarray) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		double average = 0.0;
		int counter = 0;
		for (int i = 0; i < inputarray.length; i++) {
			if (inputarray[i] % 2 != 0) {
				average += inputarray[i];
				counter ++;
			}
		}
		if (counter == 0) {
			return 0.00;
		} else return average / counter;
	}

	/**
	 * Implement the method below that takes an array <code>int</code> as input
	 * argument and returns an array of <code>int</code> contains the unique
	 * elements after removing the duplicate elements from the input array. The
	 * order of elements in the returned array is not important, so the array
	 * contains [1, 2, 3] and [3, 2, 1] will be considered similar/same.
	 * 
	 * <p>
	 * <strong> You can assume that the input array is not null and contains at
	 * least 1 one element.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * 	if inputarray = {3,4,4,1,2,3,5,6,7,8}  then return [1, 2, 3, 4, 5, 6, 7, 8]
	 * 	if inputarray = {4,2,8,8,9,9,7,8} then return [2, 4, 7, 8, 9]
	 * 	if inputarray = {9,2,8,8,9,9,8,8} then return [2, 8, 9]
	 * 	if inputarray = {1,1,0,1,8,8} then return [0, 1, 8]
	 * </pre>
	 * 
	 * @param inputarray input array of integer
	 * @return  array of <code>int</code> contains the unique
	 * elements after removing the duplicate elements from the input array
	 */

	public static int[] removeDuplicatesElement(int[] inputarray) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */ 
		Arrays.sort(inputarray);
		List<Integer> result = new ArrayList<Integer>();
		result.add(inputarray[0]);
		
		for (int i = 1; i < inputarray.length; i++) {
			if (inputarray[i] != inputarray[i-1]) {
				result.add(inputarray[i]);
			}
		}
		int[] arr = new int[result.size()];
		for (int j = 0; j < result.size(); j++) {
			arr[j] = result.get(j);
		}
		return arr;
	}
	
	
	/**
	 * 
	 * Implement the method below that takes an array of <code>int</code> numbers as
	 * input argument and returns String value indicate that all elements belonging to this input array
	 * are in a sequence of increasing consecutive integers and returns 
	 * another String value if not consecutive 
	 * Consecutive integers are integers that come one after the other,
	 * as in 5, 6, 7, 8, 9, etc.
	 * <p>
	 * <strong> You can assume that the input array is not empty and contains at
	 * least 1 one element.</strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if inputarray = {6, 7, 8, 9} then return "{6, 7, 8, 9} is consecutive"
	 * if inputarray = { 6, 7, 8, 9, 2, 9} then return "{ 6, 7, 8, 9, 2, 9} is NOT consecutive"
	 * if inputarray = { 1, 1, 1, 1}  then return "{ 1, 1, 1, 1} is NOT consecutive"
	 * if inputarray = { 2, 3, 4, 5} then return "{ 2, 3, 4, 5} is consecutive"
	 * </pre>
	 * 
	 * 
	 * 
	 * @param inputarray input array of integer 
	 * @return   String value see above 
	 * otherwise.
	 */

	public static String isConsecutive(int[] inputarray) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		String str = Arrays.toString(inputarray).replaceAll("\\[","\\{").replaceAll("\\]", "\\}");
		String result = str + " is consecutive";
		
		for (int i = 1; i < inputarray.length; i++) {
			if (inputarray[i-1] + 1 != inputarray[i]) {
				result = str + " is NOT consecutive";
				break;
			}
		}
		return result;
	}

	
	

}
