package lab1;

/**
 * Complete the implementation of the following static methods
 * 
 *
 */
public class Lab1Class {
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private Lab1Class() {
		// empty to prevent object creation
		// ALREADY IMPLEMENTED; DO NOT MODIFY
	}

	/**
	 * Implement the method receives a certain amount of time in seconds and then
	 * return a string indicated how many minutes and remaining seconds in the given
	 * input seconds
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if seconds=500 then return "500 seconds is 8 minutes and 20 seconds"
	 * if seconds=150 then return "150 seconds is 2 minutes and 30 seconds"
	 * if seconds=150 then return "50 seconds is 0 minutes and 50 seconds"
	 * </pre>
	 * 
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param seconds : int input value
	 * @return return the String value as shown in the examples above
	 * 
	 */

	public static String minutesSeconds(int seconds) {

		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		return seconds + " seconds is " + seconds/60 + " minutes and " + seconds%60 + " seconds";
	}

	/**
	 * Implement the method that converts a Fahrenheit degree to Celsius using the
	 * formula celsius = (5/9) (fahrenheit - 32).
	 *
	 * The method receives temperature degrees in Fahrenheit and returns string
	 * value as shown below in the examples. The celsius degree is rounded to two
	 * decimal points.
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if fahrenheit=100.0 then return "Fahrenheit 100.0 is 37.78 in Celsius"
	 * if fahrenheit=10.0 then return "Fahrenheit 10.0 is -12.22 in Celsius"
	 * if fahrenheit=150.0 then return "Fahrenheit 150.0 is 65.56 in Celsius"
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param fahrenheit input temperature value as double
	 * @return string value, see above examples
	 */

	public static String temperature(double fahrenheit) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		double celsius = (5/9)*(fahrenheit - 32);
		return "Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius";
	
	}

	/**
	 * Implement the method that converts centimetres to an integral number of feet
	 * and any remaining inches. The method receives the centimetres as double data
	 * type and returns string value as shown in the examples below. Note that the
	 * remaining inches value is rounded to two decimal points.
	 * 
	 * <p>
	 * You need the following facts to complete the implementation of this method.
	 * There are 12 inches in a foot and one inch is 2.54 centimetres.
	 * 
	 * </p>
	 * 
	 * *
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if cm=157.0 then return "157.0cm is 5ft and 1.81in"
	 * if cm=57.0 then return "57.0cm is 1ft and 10.44in"
	 * if cm=37.0 then return "37.0cm is 1ft and 2.57in"
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param cm double value of centimetres
	 * @return String value as shown above
	 */

	public static String convertDistance(double cm) {
		
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int feet = (int) (cm/30.48);
		return cm + "cm is " + feet + "ft and" + cm%30.48 + "in";


	}

	/**
	 * Implement the method that takes in two numbers as input arguments: an account
	 * balance (rounded to two decimal points) and an annual interest rate expressed
	 * as a percentage. The method return string indicated the balance after five
	 * years have elapsed. The return blance after five years should be rounded to
	 * two decimal points See examples below. Note that the interest from the first
	 * year is added back to the bank balance and is, therefore, itself subject to
	 * interest in the second year, and so on.
	 * 
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if balance=6000.00 and interest=4.25 then return "The balance was 6000.00 with interest 4.25, after five years balance is  7388.08"
	 * if balance=3000.00 and interest=3.50 then return "The balance was 3000.00 with interest 3.50, after five years balance is  3563.06"
	 * if balance=4000.00 and interest=2.25 then return "The balance was 4000.00 with interest 2.25, after five years balance is  4470.71"
	 * </pre>
	 * 
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param balance  : input balance
	 * @param interest : an annual interest rate expressed as a percentage. rounded
	 *                 to two decimal points
	 * @return String value as shown in the examples above
	 */

	public static String fiveyearbalance(double balance, double interest) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
         double fiveYear = Math.round(balance * Math.pow((1+interest/100),5)*100.0)/100.0;
         return "The balance was " + balance + " with interest " + interest + ", after five years balance is " + fiveYear;

	}

	/**
	 * Implement the method that takes the age in days and then calculates the age
	 * in years and remaining days. Assume there are 365 days in a year. The method
	 * return string value as shown in the examples below
	 * 
	 * *
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if days=7000  then return "Age in days 7000, age in years is 19 with remaining days 65"
	 * if days=17000 then return "Age in days 17000, age in years is 46 with remaining days 210"
	 * if days=37000 then return "Age in days 37000, age in years is 101 with remaining days 135"
	 * </pre>
	 * 
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param days input days value as int value
	 * @return String value as shown in the examples above
	 */

	public static String ageinyears(int days) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
         return "Age in days " + days + ", age in years is " + days/365 + " with remainning days " + days%365 + ""; 

	}

	/**
	 * Implement the method below which receives two integers and returns their
	 * product minus their double sum; i.e. xy - 2*(x+y).
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if x=1 and y=2  then return -4
	 * if x=4 and y=3  then  return -2
	 * if x=7 and y=6 then  return 16
	 * </pre>
	 * 
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param x : int input value
	 * @param y : int input value
	 * @return return the product minus the double of the sum of the input values
	 */
	public static int mul2Diff(int x, int y) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int z = (int)(x*y - 2*(x + y));
		return z;
		
		
	}

	/**
	 * Implement the method below which receives two integers x and y and returns
	 * the difference of their squares, i.e. x<sup>2</sup> - y<sup>2</sup>.
	 * 
	 *
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if x=1 and y=2  then return -3
	 * if x=4 and y=3  then  return 7
	 * if x=6 and y=7 then  return -13
	 * </pre>
	 * 
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * 
	 * @param x : int input value
	 * @param y : int input value
	 * @return the difference of squares of the input values
	 */

	public static int diffSquares(int x, int y) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int z = x * x - y * y;
		return z;
		
	}

	/**
	 * Implement the method below which receives a positive integer <code>n</code>
	 * and returns the string "The square root of X is Y", where X is to be replaced
	 * with the value of <code>n</code> and Y is to be replaced with the square root
	 * of <code>n</code> rounded to two decimals. For example, if <code>n=5</code>
	 * then the return should be: "The square root of 5 is 2.24"
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if n=4  then  return "The number (4) has square root value (2.00)"
	 * if n=5  then  return "The number (5) has square root value (2.24)"
	 * if n=56 then  return "The number (56) has square root value (7.48)"
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * 
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * 
	 * @param n : int input value
	 * @return String value as shown in the example above. note that the square root
	 *         of <code>n</code> is rounded to two decimals.
	 */
	public static String computeSquareRoot(int n) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
         double squareRoot = Math.round(Math.sqrt(n)*100.0)/100.0;
         return "The number (" + n + ") has square root value (" + squareRoot + ")";
	}

	/**
	 * Implement the following method, which receives a weight in pounds and a
	 * height in feet and inches for any given person, and returns the person's body
	 * mass index (BMI) rounded to 2 decimal place.
	 * 
	 * Note: the height of a person is represented in both feet and inches input
	 * parameters. So, if person has height is 10 feet and 15 inches then feet input
	 * parameter will be 10 and inches input parameter will be 15.
	 * 
	 * You must convert the weight in pounds into kilograms by using the following
	 * conversion rate: <strong>1 pound is equal to 0.453592 kilograms.</strong> You
	 * must convert the height in feet and inches into metres by using the following
	 * conversion rates: <strong>1 foot is equal to 0.3048 metre, and 1 inch is
	 * equal to 0.0254 metre.</strong> Given a weight in kilograms <i>w</i> and a
	 * height in metres <i>h</i>, the BMI is <i>w</i> / <i>h</i><sup>2</sup>.
	 * 
	 * <p>
	 * For example:
	 * </p>
	 * 
	 * <pre>
	 * if pounds=75, feet=15  and inches=45  then  return 1.04
	 * if pounds=80, feet=13  and inches=45  then  return 1.39
	 * if pounds=135, feet=7  and inches=45 then  return  5.7
	 * </pre>
	 * 
	 * @param pounds  : int input value for weight in pounds
	 * @param feet    : int input value for height in feet, should be used with
	 *                inches input
	 * @param inches: int input value for height in inches
	 * @return the person's body mass index (BMI) rounded to 2 decimal place.
	 */

	public static double getBMI(int pounds, int feet, int inches) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
         double massIndex = Math.round(pounds*0.453592/Math.pow(feet*0.3048 + inches*0.0254,2)*100.0)/100.0;
         return massIndex;
	}

	/**
	 * Returns the maximum number of complete revolutions equivalent to a number of
	 * degrees not greater than the given number of degrees (there are 360 degrees
	 * in one revolution). For example:
	 * 
	 * <pre>
	 * numRevolutions(0)    returns 0
	 * numRevolutions(1)    returns 0
	 * numRevolutions(360)  returns 1
	 * numRevolutions(719)  returns 1
	 * numRevolutions(720)  returns 2
	 * numRevolutions(800)  returns 2
	 * </pre>
	 * 
	 * @param degrees a number of degrees not less than zero
	 * @return the maximum number of complete revolutions not greater than the given
	 *         number of degrees
	 */
	public static long numRevolutions(long degrees) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		return degrees/360;
	}

	/**
	 * Returns the number of degrees on a circle that is equivalent to the given
	 * number of degrees. The returned value is always between 0 and 359 degrees,
	 * inclusive. For example:
	 * 
	 * <pre>
	 * fixAngle(0)    returns 0
	 * fixAngle(1)    returns 1
	 * fixAngle(359)  returns 359
	 * fixAngle(360)  returns 0
	 * fixAngle(700)  returns 340
	 * fixAngle(720)  returns 0
	 * fixAngle(725)  returns 5
	 * </pre>
	 * 
	 * @param degrees a number of degrees not less than zero
	 * @return the number of degrees on a circle that is equivalent to the given
	 *         number of degrees
	 */
	public static int fixAngle(long degrees) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		return (int)(degrees%360);
	}

	/**
	 * Implement the method compute the mathematical average of 3 values. and return
	 * string value as shown in the examples below the average value should be
	 * rounded to two decimals.
	 * 
	 * <p>
	 * Examples:
	 * </p>
	 * 
	 * <pre>
	 * if a=1, b=2  and c=5  then  return "Average of (1, 2, 5) is 2.67"
	 * if a=4, b=3  and c=5  then  return "Average of (4, 3, 5) is 4.00"
	 * if a=11, b=26  and c=5 then  return  "Average of (11, 26, 5) is 14.00"
	 * </pre>
	 * <p>
	 * Remember that double quotations are shown above to indicate the beginning and
	 * end of the string value, and these double quotations are not part of the
	 * return value.
	 * </p>
	 * 
	 * Make sure the method compiles without errors and returns the correct result
	 * when invoked.
	 * 
	 * @param a : int input value
	 * @param b : int input value
	 * @param c : int input value
	 * @return String value as shown above
	 */
	public static String avg(int a, int b, int c) {
		/* Your implementation of this method starts here. 
		 * Recall that :
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, you need to return the result.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
         return "Average of (" + a + ", " + b + ", " + c + ") is " + String.format("%.2f" , (a+b+c)/3.0)+ "";
	}

}
