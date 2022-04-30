package lab4;
import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;

import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;



import org.junit.FixMethodOrder;
import org.junit.Rule;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class UtilityClassTest {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@Test
	public void test_0_0_() {
		int x=150, y=156;
		String result= UtilityClass.sumofEvensandOdds(x,y);
		String expect = "7 numbers between 150 and 156: sum of evens (612) and sum of odds (459)";
		String str = String.format("\nTest sumofEvensandOdds fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		assertEquals(expect,result);	
		assertEquals(str, expect,result);		
	}

	
	

	@Test
	public void test_0_1_() {
		int x=9, y=15;
		String result= UtilityClass.sumofEvensandOdds(x,y);
		String expect = "7 numbers between 9 and 15: sum of evens (36) and sum of odds (48)";
		String str = String.format("\nTest sumofEvensandOdds fail for (%d) and (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		assertEquals(expect,result);	
		assertEquals(str, expect,result);		
	}

	
	@Test
	public void test_0_2_() {
		int x=9, y=25;
		String result= UtilityClass.sumofEvensandOdds(x,y);
		String expect = "17 numbers between 9 and 25: sum of evens (136) and sum of odds (153)";
		String str = String.format("\nTest sumofEvensandOdds fail for (%d) and (%d)  Returned ( %s ), but correct is ( %s )\n",
				x,y, result, expect);
		assertEquals(expect,result);	
		assertEquals(str, expect,result);		
	}
	

	@Test
	public void test_1_0_() {
		short x=122;
		String result= UtilityClass.binaryValue(x);
		String expect = "The integer value (122) has 16 bits binary representation [0000000001111010]";
		String str = String.format("\nTest binaryValue fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(expect,result);	
		assertEquals(str, expect,result);		
	}

	@Test
	public void test_1_1_() {
		short x=102;
		String result= UtilityClass.binaryValue(x);
		String expect = "The integer value (102) has 16 bits binary representation [0000000001100110]";
		String str = String.format("\nTest binaryValue fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(expect,result);	
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_1_2_() {
		short x=204;
		String result= UtilityClass.binaryValue(x);
		String expect = "The integer value (204) has 16 bits binary representation [0000000011001100]";
		String str = String.format("\nTest binaryValue fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
		assertEquals(expect,result);	
		assertEquals(str, expect,result);		
	}

	@Test
	public void test_2_0_() {
		int x=150, y=156;
		String result= UtilityClass.countofMult35(x,y);
		String expect = "Between 150 and 156 there are (3) multiple of 3 and there are (2) multiple of 5";
		String str = String.format("\nTest countofMult35 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		assertEquals(expect,result);	
		assertEquals(str, expect,result);		
	}
	

	@Test
	public void test_2_1_() {
		int x=150, y=156;
		String result= UtilityClass.countofMult35(x,y);
		String expect = "Between 150 and 156 there are (3) multiple of 3 and there are (2) multiple of 5";
		String str = String.format("\nTest countofMult35 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		assertEquals(expect,result);	
		assertEquals(str, expect,result);		
	}
	
	
	
	@Test
	public void test_2_2_() {
		int x=5, y=25;
		String result= UtilityClass.countofMult35(x,y);
		String expect = "Between 5 and 25 there are (7) multiple of 3 and there are (5) multiple of 5";
		String str = String.format("\nTest countofMult35 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		assertEquals(expect,result);	
		assertEquals(str, expect,result);		
	}
	

	@Test
	public void test_2_3_() {
		int x=1, y=4;
		String result= UtilityClass.countofMult35(x,y);
		String expect = "Between 1 and 4 there are (1) multiple of 3 and there are (0) multiple of 5";
		String str = String.format("\nTest countofMult35 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		assertEquals(expect,result);	
		assertEquals(str, expect,result);		
	}

	@Test
	public void test_3_0_getRandomNumber() {
		final int x = 2;
		final int y =10;
		int result = UtilityClass.getRandomNumber(x,y);
		Integer[] array = {2,3,4,5,6,7,8,9,10};
		
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		flag =  expectset.contains(result);
		
		String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, result,
				expectset.toString());
		assertTrue(str, flag);
	}

	
	@Test
	public void test_3_1_getRandomNumber() {
		final int x = 5;
		final int y =7;
		int result = UtilityClass.getRandomNumber(x,y);
		Integer[] array = {5,6,7};
		
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		flag =  expectset.contains(result);
		
		String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, result,
				expectset.toString());
		assertTrue(str, flag);
	}
	@Test
	public void test_3_2_getRandomNumber() {
		final int x = 10;
		final int y =15;
		int result = UtilityClass.getRandomNumber(x,y);
		Integer[] array = {10,11,12,13,14,15};
		
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		flag =  expectset.contains(result);
		
		String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, result,
				expectset.toString());
		assertTrue(str, flag);
	}
	@Test
	public void test_3_3_getRandomNumber() {
		final int x = 2;
		final int y =7;
		int result = UtilityClass.getRandomNumber(x,y);
		Integer[] array = {2,3,4,5,6,7};
		
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		flag =  expectset.contains(result);
		
		String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct is ( %s )\n", x,y, result,
				expectset.toString());
		assertTrue(str, flag);
	}
	
	@Test
	public void test_3_4_getRandomNumber() {
		final int x = 0;
		final int y =10;
		int result = UtilityClass.getRandomNumber(x,y);
		Integer[] array = {0,1,2,3,4,5,6,7,8,9,10};
		
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		flag =  expectset.contains(result);
		
		String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, result,
				expectset.toString());
		assertTrue(str, flag);
	}
	
	
	

	@Test
	public void test_4_0_stringOfRandomInt() {
		final int x = 2;
		final int y =9;
		final int n =2;

		String result = UtilityClass.stringOfRandomInt(n,x,y);
		int expectedlength = 6;
		int actuallength = result.length();
		String strlegth = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned ( %d ), but correct string length should be  ( %d )\n", x,y, actuallength,
				expectedlength);
		
		assertEquals(strlegth, expectedlength,actuallength);
		
		Integer[] array = {2,3,4,5,6,7,8,9,10};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\<");
		for (String e: a){
			String [] b = e.split("\\>");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	
	
	@Test
	public void test_4_1_stringOfRandomInt() {
		final int x = 20;
		final int y =30;
		final int n =5;
		String result = UtilityClass.stringOfRandomInt(n,x,y);

		
		int expectedlength = 20;
		int actuallength = result.length();
		String strlegth = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned ( %d ), but correct string length should be  ( %d )\n", x,y, actuallength,
				expectedlength);
		
		assertEquals(strlegth, expectedlength,actuallength);
		
		Integer[] array = {20,21,22,23,24,25,26,27,28,29,30};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\<");
		for (String e: a){
			String [] b = e.split("\\>");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set  ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	
	
	@Test
	public void test_4_2_stringOfRandomInt() {
		final int x = 2;
		final int y =7;
		final int n =5;
		String result = UtilityClass.stringOfRandomInt(n,x,y);
		int expectedlength = 15;
		int actuallength = result.length();
		String strlegth = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned ( %d ), but correct string length should be  ( %d )\n", x,y, actuallength,
				expectedlength);
		
		assertEquals(strlegth, expectedlength,actuallength);
		
		Integer[] array = {2,3,4,5,6,7};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\<");
		for (String e: a){
			String [] b = e.split("\\>");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	
	@Test
	public void test_4_3_stringOfRandomInt() {
		final int x = 3;
		final int y =8;
		final int n =5;
		String result = UtilityClass.stringOfRandomInt(n,x,y);
		
		int expectedlength = 15;
		int actuallength = result.length();
		String strlegth = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned ( %d ), but correct string length should be  ( %d )\n", x,y, actuallength,
				expectedlength);
		
		assertEquals(strlegth, expectedlength,actuallength);
		
		Integer[] array = {3,4,5,6,7,8};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\<");
		for (String e: a){
			String [] b = e.split("\\>");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	@Test
	public void test_4_4_stringOfRandomInt() {
		final int x = 13;
		final int y =18;
		final int n =5;
		String result = UtilityClass.stringOfRandomInt(n,x,y);
		
		int expectedlength = 20;
		int actuallength = result.length();
		String strlegth = String.format("\nTest stringOfRandomInt fail for (%d,%d). Returned ( %d ), but correct string length should be  ( %d )\n", x,y, actuallength,
				expectedlength);
		
		assertEquals(strlegth, expectedlength,actuallength);
		
		Integer[] array = {13,14,15,16,17,18};
		HashSet<Integer> expectset = new HashSet<Integer>(Arrays.asList(array));
		
		boolean flag = false; 
		String[] a = result.split("\\<");
		for (String e: a){
			String [] b = e.split("\\>");
			for (String e1:b) {
				if (e1.length()!=0) {
				Integer val = Integer.parseInt(e1);
				flag =  expectset.contains(val);
				String str = String.format("\nTest getRandomNumber fail for (%d,%d). Returned ( %d ), but correct should be any number from set ( %s )\n", x,y, val,
						expectset.toString());
				assertTrue(str, flag);
				}
			}	      
		      
		}		
	}
	

	@Test
	public void test_5_0_isPerfectSquare() {
		final int n = 16;
		String result = UtilityClass.isPerfectSquare(n);
		
		assertEquals("Integer 16 is Perfect Square", result);
	}
	@Test
	public void test_5_1_isPerfectSquare() {
		final int n = 25;
		String result = UtilityClass.isPerfectSquare(n);
		
		assertEquals("Integer 25 is Perfect Square", result);
	}
	@Test
	public void test_5_2_isPerfectSquare() {
		final int n = 64;
		String result = UtilityClass.isPerfectSquare(n);
		
		assertEquals("Integer 64 is Perfect Square", result);
	}
	
	@Test
	public void test_5_3_isPerfectSquare() {
		final int n = 0;
		String result = UtilityClass.isPerfectSquare(n);
		
		assertEquals("Integer 0 is Perfect Square", result);
	}
	@Test
	public void test_5_4_isPerfectSquare() {
		final int n = 100;
		String result = UtilityClass.isPerfectSquare(n);
		
		assertEquals("Integer 100 is Perfect Square", result);;
	}
	@Test
	public void test_5_5_isPerfectSquare() {
		final int n = 99;
		String result = UtilityClass.isPerfectSquare(n);
		
		assertEquals("Integer 99 is NOT Perfect Square", result);;
	}
	@Test
	public void test_5_6_isPerfectSquare() {
		final int n = 7;
		String result = UtilityClass.isPerfectSquare(n);
		
		assertEquals("Integer 7 is NOT Perfect Square", result);;
	}
	
	@Test
	public void test_5_7_isPerfectSquare() {
		final int n = 11;
		String result = UtilityClass.isPerfectSquare(n);
		
		assertEquals("Integer 11 is NOT Perfect Square", result);;
	}
	

	@Test
	public void test_6_00_isPalindromeInt() {
		final int n = 16;
		String  result = UtilityClass.isPalindromeInt(n);
		assertEquals("Integer 16 is NOT Palindrome", result);
	}
	
	
	
	@Test
	public void test_6_01_isPalindromeInt() {
		final int n = 161;
		String  result = UtilityClass.isPalindromeInt(n);
		assertEquals("Integer 161 is Palindrome", result);
	}
	@Test
	public void test_6_02_isPalindromeInt() {
		final int n = 1006001;
		String  result = UtilityClass.isPalindromeInt(n);
		assertEquals("Integer 1006001 is Palindrome", result);
	}
	
	@Test
	public void test_6_03_isPalindromeInt() {
		final int n = 1230603201;
		String  result = UtilityClass.isPalindromeInt(n);
		assertEquals("Integer 1230603201 is NOT Palindrome", result);
	}
	
	@Test
	public void test_6_04_isPalindromeInt() {
		final int n = 2306032;
		String  result = UtilityClass.isPalindromeInt(n);
		assertEquals("Integer 2306032 is Palindrome", result);
	}
	
	@Test
	public void test_6_05_isPalindromeInt() {
		final int n = 230555032;
		String  result = UtilityClass.isPalindromeInt(n);
		assertEquals("Integer 230555032 is Palindrome", result);
	}
	
	
	@Test
	public void test_6_07_isPalindromeInt() {
		final int n = 555111;
		String  result = UtilityClass.isPalindromeInt(n);
		assertEquals("Integer 555111 is NOT Palindrome", result);
	}
	@Test
	public void test_6_08_isPalindromeInt() {
		final int n = 555656;
		String  result = UtilityClass.isPalindromeInt(n);
		assertEquals("Integer 555656 is NOT Palindrome", result);
	}
	
	
	
	@Test
	public void test_7_00_digitSum() {
		final int n = 2134;
		int sum = UtilityClass.digitSum(n);
		int expect = 10;
		String str = String.format("\nTest digitSum fail for %d. Returned ( %d ), but correct is ( %d )\n", n, sum,
				expect);
		assertTrue(str, expect == sum);
	}

	@Test
	public void test_7_01_digitSum() {
		final int n = 29107;
		int sum = UtilityClass.digitSum(n);
		int expect = 19;
		String str = String.format("\nTest digitSum fail for %d. Returned ( %d ), but correct is ( %d )\n", n, sum,
				expect);
		assertTrue(str, expect == sum);
	}

	@Test
	public void test_7_02_digitSum() {
		final int n = 5842;
		int sum = UtilityClass.digitSum(n);
		int expect = 19;
		String str = String.format("\nTest digitSum fail for %d. Returned ( %d ), but correct is ( %d )\n", n, sum,
				expect);
		assertTrue(str, expect == sum);
	}

	@Test
	public void test_7_03_digitSum() {
		final int n = 1005842;
		int sum = UtilityClass.digitSum(n);
		int expect = 20;
		String str = String.format("\nTest digitSum fail for %d. Returned ( %d ), but correct is ( %d )\n", n, sum,
				expect);
		assertTrue(str, expect == sum);
	}
	
	@Test
	public void test_8_00_sumEvendigits() {
		final int n= 2134;
		int  sum = UtilityClass.sumEvendigits(n);
		int  expect = 6 ;
		String str = String.format("\nTest sumEvendigits fail for %d. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}
	
	@Test
	public void test_8_01_sumEvendigits() {
		final int n= 1002;
		int  sum = UtilityClass.sumEvendigits(n);
		int  expect = 2 ;
		String str = String.format("\nTest sumEvendigits fail for %d. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}
	@Test
	public void test_8_02_sumEvendigits() {
		final int n= 5842;
		int  sum = UtilityClass.sumEvendigits(n);
		int  expect = 14 ;
		String str = String.format("\nTest sumEvendigits fail for %d. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}

	@Test
	public void test_8_03_sumEvendigits() {
		final int n= 105842;
		int  sum = UtilityClass.sumEvendigits(n);
		int  expect = 14 ;
		String str = String.format("\nTest sumEvendigits fail for %d. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}
	@Test
	public void test_8_04_sumEvendigits() {
		final int n= 4105842;
		int  sum = UtilityClass.sumEvendigits(n);
		int  expect = 18 ;
		String str = String.format("\nTest sumEvendigits fail for %d. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}

	
	@Test
	public void test_9_0_isPrime() {
		
		assertEquals("81 is NOT Prime", UtilityClass.isPrime ( 81));

		

	}
	@Test
	public void test_9_01_isPrime() {
		

		assertEquals("24 is NOT Prime", UtilityClass.isPrime ( 24));
	

	}
	
	@Test
	public void test_9_02_isPrime() {
		

		assertEquals("6 is NOT Prime", UtilityClass.isPrime ( 6));

		

	}
	@Test
	public void test_9_03_isPrime() {
		

		assertEquals("-8 is NOT Prime", UtilityClass.isPrime ( -8));

		

	}
	@Test
	public void test_9_04_isPrime() {
		

		assertEquals("29 is Prime", UtilityClass.isPrime ( 29));

		

	}
	@Test
	public void test_9_05_isPrime() {
		
		assertEquals("13 is Prime", UtilityClass.isPrime ( 13));
		

	}
	
	@Test
	public void test_9_06_isPrime() {
		
		assertEquals("1 is NOT Prime", UtilityClass.isPrime ( 1));
		

	}
	
	
	@Test
	public void test_9_07_isPrime() {
		
		assertEquals("2 is Prime", UtilityClass.isPrime ( 2));
		

	}

	
	
	
}
