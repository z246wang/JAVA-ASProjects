package lab4;

/**
 * A random assortment of methods reviewing topics that should improve your
 * programming skills in using Java Control Structures (selection structures,
 * repetition structures, and nested Loops), and java.util.Random
 * <p>
 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
 * strictly forbidden. Violation of this will result in a 50% penalty on your
 * marks. Try to solve this problem using Java Control Structures (selection
 * structures, repetition structures, and nested Loops) only </strong>
 * </p>
 * 
 *
 */

public class UtilityClass {
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private UtilityClass() {
		// ALREADY IMPLEMENTED; DO NOT MODIFY
	}

	/**
	 * 
	 * Write a static method that counts the number of integers between a
	 * lower-limit integer and an upper-limit integer. Also, the method computes the
	 * sum of all even and odd integers between the lower-limit and upper-limit
	 * input values.
	 * 
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 50% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * 
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if lowerLimit=0 and  upperLimit= 5 then return "6 numbers between 0 and 5: sum of evens (6) and sum of odds (9)"
	 * if lowerLimit=10 and  upperLimit= 10 then return "1 number between 10 and 10: sum of evens (10) and sum of odds (0)"
	 * if lowerLimit=0 and  upperLimit= 6 then return "7 numbers between 0 and 6: sum of evens (12) and sum of odds (9)"
	 * if lowerLimit=7 and  upperLimit= 10 then return "4 numbers between 7 and 10: sum of evens (18) and sum of odds (16)"
	 * </pre>
	 * 
	 * @param lowerLimit lower limit integer value
	 * @param upperLimit upper limit integer value
	 * @return String value as shown in the examples above
	 * 
	 *         @pre.
	 *         <p>
	 *         <strong> Precondition </strong>
	 *         </p>
	 *         <p>
	 *         lowerLimit and upperLimit are non-negative values
	 *         </p>
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if lowerLimit or upperLimit are negative
	 *                                  value or if lowerLimit greater than upperLimit
	 *                                  </p>
	 */

	public static String sumofEvensandOdds(int lowerLimit, int upperLimit) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		

		/* Your implementation here. */
		int evenSum = 0;
		int oddSum = 0;
		int numCount = 0;
		String result = "";
		
		if (lowerLimit < 0 || upperLimit < 0) {
			throw new IllegalArgumentException();
		}
		if (lowerLimit > upperLimit) {
			throw new IllegalArgumentException();
		}
		if (lowerLimit == upperLimit && lowerLimit % 2 == 0) {
			result = "1 number between " + lowerLimit + " and " + upperLimit + ": sum of evens (" + lowerLimit + ") and sum of odds (0)";
		    return result;
		} else if(lowerLimit == upperLimit && lowerLimit % 2 != 0) {
			result = "1 number between " + lowerLimit + " and " + upperLimit + ": sum of evens (0) and sum of odds (" + upperLimit + ")";
	        return result;	
		} else if(lowerLimit != upperLimit) {
			for (int i = lowerLimit; i <= upperLimit ; i++) {
				if (i % 2 == 0) {
				    evenSum = evenSum + i;
				}
				if (i % 2 != 0) {
					oddSum = oddSum + i;
				}
				numCount ++;
				result = "" + numCount + " numbers between " + lowerLimit + " and " + upperLimit + ": sum of evens (" + evenSum + ") and sum of odds (" + oddSum + ")";
				}
		}
		return result;
	}
	
	/**
	 * Write a static method that receives a short value is stored in 16 bits and
	 * then convert this input value to 16 bits binary representation. The method
	 * returns the string value represents binary value in 16 bits equivalent to the
	 * input value.
	 * 
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 50% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if value=15 then return "The integer value (15) has 16 bits binary representation [0000000000001111]"
	 * if value=145 then return "The integer value (145) has 16 bits binary representation [0000000010010001]"
	 * if value=255  then return "The integer value (255) has 16 bits binary representation [0000000011111111]"
	 * if value=1255 then return "The integer value (1255) has 16 bits binary representation [0000010011100111]"
	 * </pre>
	 * 
	 * 
	 * @param value input integer value of type short
	 * @return String value represent binary value in 16 bits. See example above
	 * 
	 *         @pre.
	 *         <p>
	 *         <strong> Precondition </strong>
	 *         </p>
	 *         <p>
	 *         value is non-negative values
	 *         </p>
	 * 
	 * 
	 */

	public static String binaryValue(short value) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */



		/* Your implementation here. */
		String a = "";
		int b = value;
		int c = 32768;
		
		if (value == 0) {
			a ="0000000000000000";
		}
		
		while (c > 0 && value != 0) {
			if (b < c) {
		 		a = a + 0;
		 		c = c / 2;
			}
		 	if (b > c) {
		 		a = a + 1;
		 		b = b - c;
		 		c = c / 2;
		 	}
		 	if (b == c) {
		 		a = a + 1;
		 		c = c / 2;
		 		b = -1;
		 	}
		}
		return "The integer value (" + value + ") has 16 bits binary representation [" + a + "]";
	}

	/**
	 * 
	 * Write a static method that counts the number of integers between a
	 * lower-limit integer and an upper-limit integer that are multiple of 3 or
	 * multiple of 5.
	 * 
	 * 
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 50% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * 
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if lowerLimit=0 and  upperLimit= 5 then return "Between 0 and 5 there are (2) multiple of 3 and there are (2) multiple of 5"
	 * if lowerLimit=10 and  upperLimit= 10 then return "Between 10 and 10 there are (0) multiple of 3 and there are (1) multiple of 5"
	 * if lowerLimit=0 and  upperLimit= 6 then return "Between 0 and 6 there are (3) multiple of 3 and there are (2) multiple of 5"
	 * if lowerLimit=7 and  upperLimit= 15 then return "Between 7 and 15 there are (3) multiple of 3 and there are (2) multiple of 5"
	 * </pre>
	 * 
	 * @param lowerLimit lower limit integer value
	 * @param upperLimit upper limit integer value
	 * @return String value as shown in the examples above
	 * 
	 * 
	 *         @pre.
	 *         <p>
	 *         <strong> Precondition </strong>
	 *         </p>
	 *         <p>
	 *         lowerLimit and upperLimit are non-negative values
	 *         </p>
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if lowerLimit or upperLimit are negative
	 *                                  value or if lowerLimit greater than upperLimit
	 *                                  </p>
	 */

	public static String countofMult35(int lowerLimit, int upperLimit) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		/* Your implementation here. */
		int count1 = 0;
		int count2 = 0;
		
		if (lowerLimit < 0 || upperLimit < 0) {
			throw new IllegalArgumentException();
		}
		if (lowerLimit > upperLimit) {
			throw new IllegalArgumentException();
		}
		for (int i = lowerLimit; i <= upperLimit; i++) {
			if (i % 3 == 0) {
				count1 ++;
			}
			if (i % 5 == 0) {
				count2 ++;
			}
		}
		return "Between " + lowerLimit + " and " + upperLimit + " there are (" + count1 + ") multiple of 3 and there are (" + count2 + ") multiple of 5";
	}

	/**
	 * Write a static method to compute and return a random integer between x and y,
	 * inclusive, assuming x is less than or equal to y.
	 * <p>
	 * This method should not assign values to x or y nor print the random number.
	 * </p>
	 * 
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 50% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if x= 0 and y =10 then return any integer belonging to {0,1,2,3,4,5,6,7,8,9,10}
	 * if x= 2 and y =7  then return any integer belonging to {2,3,4,5,6,7}
	 * </pre>
	 * 
	 * 
	 * @param x : int input the lower limit
	 * @param y : int input the upper limit
	 * 
	 *          @pre.
	 *          <p>
	 *          <strong> Precondition </strong>
	 *          </p>
	 *          <p>
	 *          x is less than or equal to y
	 *          </p>
	 * 
	 * 
	 * @return a random integer between x and y, inclusive, assuming x is less than
	 *         or equal to y.
	 */

	public static int getRandomNumber(int x, int y) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		

		/* Your implementation here. */
		return (int)Math.random() * (y - x + 1) + x;
	}

	/**
	 * Write a static method to generate string of random number the number of
	 * generated random number is defined by integer value given by n the generated
	 * random integers should be between x and y (inclusive). Assuming n is positive
	 * and x is less than or equal to y.
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 50% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if n=5, x= 5 and y =10 then some of possible returned strings <code><6><8><9><10><7> </code>
	 * or <code> <8><9><6><6><7> </code> , <code> <9><6><9><6><9></code>,..., 
	 * <code><5><9><6><5><10></code>,... .
	 * if n=2,  x= 2 and y =7  then some of possible returned strings <code><3><7> 
	 * or <7><6> , <4><7>,...</code>
	 * </pre>
	 * 
	 * @pre.
	 * <p>
	 * <strong> Precondition </strong>
	 * </p>
	 * <p>
	 * n is positive and x is less than or equal to y
	 * </p>
	 * 
	 * @param n : number of random integers
	 * @param x : int input the lower limit
	 * @param y : int input the upper limit
	 * @return generate string of random number the number of generated random
	 *         number is defined by integer value given by n the generated random
	 *         integers should be between x and y (inclusive).
	 */

	public static String stringOfRandomInt(int n, int x, int y) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */


		/* Your implementation here. */
		String result = "";
		
		for (int i = 1; i <= n; i++) {
			result += "<" + (int)(Math.random() * (y - x + 1) + x) + ">";
		}
		return result;
	}

	/**
	 * Write a static method to determine if the given integer is perfect square.
	 * <p>
	 * Note: The numbers 0, 1, 4, 9, 16, 25, ... are perfect squares.
	 * </p>
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 50% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if n = 0 then 	return "Integer 0 is Perfect Square"
	 * if n= 10  then  return "Integer 10 is NOT Perfect Square"
	 * if n= 63 then  return "Integer 63 is NOT Perfect Square"
	 * if n= 64  then  return "Integer 64 is NOT Perfect Square"
	 * </pre>
	 * 
	 * 
	 * 
	 * @param n :int input integer
	 * 
	 *          @pre.
	 *          <p>
	 *          <strong> Precondition </strong>
	 *          </p>
	 *          <p>
	 *          You may assume that the integer n is No negative integer
	 *          </p>
	 * 
	 * @return String value
	 */

	public static String isPerfectSquare(int n) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
	

		/* Your implementation here. */
		String result = "";
		double a = Math.sqrt(n);
		double b = Math.floor(Math.sqrt(n));
		
		if (n == 0) {
			result = "Integer 0 is Perfect Square";
		}else if (a == b) {
			result = "Integer " + n + " is Perfect Square";
			}else result = "Integer " + n + " is NOT Perfect Square";
		return result;
	}

	/**
	 * Write a static method to determine if the given input <code>n</code> integer
	 * is palindrome integer.
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if n = 0 then 	return "Integer 0 is Palindrome"
	 * if n= 10  then  return "Integer 10 is NOT Palindrome"
	 * if n= 3635363 then  return "Integer 3635363 is Palindrome"
	 * if n= 121121  then  return "Integer 121121 is Palindrome"
	 * if n= 112545214 then return "Integer 112545214 is NOT Palindrome"
	 * </pre>
	 * 
	 * 
	 * @param n : int input value
	 * @return <code>n</code> is palindrome integer then return true. Otherwise,
	 *         return false
	 */
	public static String isPalindromeInt(int n) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		

		/* Your implementation here. */
		int num = n;
		int mod = 0;
		String reverse = "";
		
		while (num > 0) {
			mod = num % 10;
			num = (num - mod) / 10;
			reverse += mod;
		}
		if (reverse.equals("" + n) || n == 0) {
			return "Integer " + n + " is Palindrome";
		}else return "Integer " + n + " is NOT Palindrome";
	}

	/**
	 * 
	 * Write a static method below that takes <code>int</code> number as input
	 * argument and returns the sum of the digits of that number.
	 * 
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 50% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if number = 2134 then return 2+1+3+4=10
	 * if number = 29107 then return 2+9+1+0+7=19
	 * if number = 5842  then return 19
	 * if number = 1002  then return 3
	 * </pre>
	 * 
	 * You will need a loop, and <strong>your loop must not execute more iterations
	 * than necessary, and you cannot use break or continue</strong>. <strong>Make
	 * sure the method compiles without errors and returns the correct result when
	 * invoked.</strong>
	 * 
	 * @param number : int input value
	 * @return the sum of the digits of any given integer value
	 */

	public static int digitSum(int number) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		

		/* Your implementation here. */
		int sum = 0;
		int num = number;
		String length = "" + number;
		
		for (int i = 1; i <= length.length(); i++) {
			sum += num % 10;
			num = num / 10;
		}
		return sum;
	}

	/**
	 * 
	 * 
	 * Write a static method below that takes <code>int</code> number as input
	 * argument and returns the sum of the even digits of that number.
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 50% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if number = 5842 then return 8+4+2=14
	 * if number = 1002 then return 0+0+2=2
	 * if number = 19357  then return 0
	 * if number = 2864  then return 20
	 * </pre>
	 * 
	 * You will need a loop, and <strong>your loop must not execute more iterations
	 * than necessary, and you cannot use break or continue</strong>. <strong>Make
	 * sure the method compiles without errors and returns the correct result when
	 * invoked.</strong>
	 * 
	 * @param number : int input value
	 * @return the sum of the even digits of any given integer.
	 */

	public static int sumEvendigits(int number) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		

		/* Your implementation here. */
		int sum = 0;
		int num = number;
		String length = "" + number;
		
		for (int i = 1; i <= length.length(); i++) {
			if (num % 2 == 0) {
				sum += num % 10;
			}
			num = num / 10;
		}
		return sum;
	}

	/**
	 * <p>
	 * <strong> Primes</strong>
	 * </p>
	 * <p>
	 * A <em> positive integer </em> {@code n > 1} is called <strong> prime</strong>
	 * if the only positive factors of {@code n} are {@code  1} and {@code  n} . A
	 * positive integer that is greater than one and is not prime is called <strong>
	 * composite</strong>.
	 * 
	 * </p>
	 * 
	 * <p>
	 * An integer {@code  n} is <strong> composite </strong> if and only if there
	 * exists an integer {@code a} such that <strong> <em> {@code a} divides
	 * {@code n} </em></strong> and {@code 1 < a < n}.
	 * </p>
	 * <p>
	 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
	 * strictly forbidden. Violation of this will result in a 50% penalty on your
	 * marks. Try to solve this problem using Java Control Structures (selection
	 * structures, repetition structures, and nested Loops) only </strong>
	 * </p>
	 * <p>
	 * <strong> Hint: 1 is neither prime nor composite. It forms its own special
	 * category as a "unit".</strong>
	 * </p>
	 * 
	 * <p>
	 * This method checks the positive integer if it is prime or not.
	 * </p>
	 * 
	 * <pre>
	 *  Example:
	 *  
	 *  isPrime ( -5) returns "-5 is NOT Prime" 
	 *  isPrime ( 6) returns "6 is NOT Prime" 
	 *  isPrime ( 25) returns "25 is NOT Prime" 
	 *  isPrime ( 2) returns "2 is Prime"  
	 *  isPrime ( 3) returns "3 is Prime"  
	 *  isPrime ( 13) returns "13 is Prime"  
	 *  isPrime ( 17) returns "17 is Prime"  
	 *  isPrime ( 29) returns "29 is Prime"
	 * </pre>
	 * 
	 * @param n positive integer
	 * @return String value see above
	 * 
	 *         @pre.
	 *         <p>
	 *         <strong> Precondition </strong>
	 *         </p>
	 *         {@code n > 0}
	 * 
	 * 
	 */
	public static String isPrime(int n) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */

		

		/* Your implementation here. */
		boolean result = false;
		
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				result = true;
				break;
			}
		}
		if (n <= 1) {
			result = true;
		}
		if (result == false) {
			return n + " is Prime"; 
		}else return n + " is NOT Prime";
		
	}

}
