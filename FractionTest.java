package lab2;

import static org.junit.Assert.*;

import org.junit.Test;
import java.lang.reflect.Field;

import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FractionTest {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	private int getNumeratorValue(Fraction c) {
		int v=-1;
		try {
			Field name = Fraction.class.getDeclaredField("numerator");
			name.setAccessible(true);
			v = (int)name.get(c);
			
		} catch (Exception x) {
			fail("exception occurred trying to get FractionTest this.getNumeratorValue");
			System.out.println(x);
		}
		return v;
	}
	
	
	private int getdenominatorValue(Fraction c) {
		int v=-1;
		try {
			Field name = Fraction.class.getDeclaredField("denominator");
			name.setAccessible(true);
			v = (int)name.get(c);
			
		} catch (Exception x) {
			fail("exception occurred trying to get FractionTest this.getdenominatorValue");
			System.out.println(x);
		}
		return v;
	}
	
	
	@Test
	public void test_0_0_FractionCtor() {
		Fraction c = new Fraction();
		int actual = this.getdenominatorValue(c);
		int expected = 1;
		String error = String.format(
				"\n Test no-arg constructor failed  Returned denominator value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	
	
	
	
	
	
	
	
	@Test
	public void test_0_1_FractionCtor() {
		Fraction c = new Fraction();
		int actual = this.getNumeratorValue(c);
		int expected = 0;
		String error = String.format(
				"\n Test no-arg constructor failed  Returned numerator value ( %d ) " + 
						" but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}	
	@Test
	public void test_1_0_FractionCtor() {
		Fraction c = new Fraction(10,10);
		int actual = this.getNumeratorValue(c);
		int expected = 10;
		String error = String.format(
				"\n Test arg constructor failed  Returned numerator value ( %d ) " + 
						" but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	
	
	
	@Test
	public void test_1_1_FractionCtor() {
		Fraction c = new Fraction(10,150);
		int actual = this.getdenominatorValue(c);
		int expected = 150;
		String error = String.format(
				"\n Test arg constructor failed  Returned denominator value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	@Test
	public void test_2_0_FractiongetNumerator() {
		Fraction c = new Fraction(145,10);
		int actual = c.getNumerator();
		int expected = 145;
		String error = String.format(
				"\n Test getDenominator failed  Returned numerator value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	@Test
	public void test_2_1_FractiongetDenominator() {
		Fraction c = new Fraction(10,995);
		int actual = c.getDenominator();
		int expected = 995;
		String error = String.format(
				"\n Test  getDenominator failed  Returned denominator value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	@Test
	public void test_3_0_FractionsetNumerator() {
		Fraction c = new Fraction(145,10);
		c.setNumerator(785);
		int actual = this.getNumeratorValue(c);
		int expected = 785;
		String error = String.format(
				"\n Test setNumerator failed  Returned numerator value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	@Test
	public void test_3_1_FractionsetDenominator() {
		Fraction c = new Fraction(10,995);
		c.setDenominator(854);
		int actual = this.getdenominatorValue(c);
		int expected = 854;
		String error = String.format(
				"\n Test setDenominator failed  Returned denominator value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	@Test
	public void test_4_0_FractionsetFraction() {
		Fraction c = new Fraction(145,10);
		c.setFraction(852, 458);
		int actual = this.getNumeratorValue(c);
		int expected = 852;
		String error = String.format(
				"\n Test setFraction failed  Returned numerator value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	@Test
	public void test_4_1_FractionsetFraction() {
		Fraction c = new Fraction(10,995);
		c.setFraction(852, 458);
		int actual = this.getdenominatorValue(c);
		int expected = 458;
		String error = String.format(
				"\n Test setFraction failed  Returned denominator value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	@Test
	public void test_5_0_FractiongetAbsValue() {
		Fraction c = new Fraction(145,10);
		
		double  actual = c.getAbsValue();
		double expected = 14.5;
		String error = String.format(
				"\n Test getAbsValue failed  Returned numerator value ( %.7f ) " + " but correct value is ( %.7f ). \n",
				actual, expected);
		final double THRESHOLD = .0000005;
		assertTrue(error, Math.abs(expected - actual) < THRESHOLD);
		
		
	}
	
	@Test
	public void test_5_1_FractiongetAbsValue() {
		Fraction c = new Fraction(10,995);
		double  actual = c.getAbsValue();
		double expected = 0.0100503;
		String error = String.format(
				"\n Test getAbsValue failed  Returned numerator value ( %.7f ) " + " but correct value is ( %.7f ). \n",
				actual, expected);
		final double THRESHOLD = .0000005;
		assertTrue(error, Math.abs(expected - actual) < THRESHOLD);
		
	}
	
	@Test
	public void test_5_2_FractiongetAbsValue() {
		Fraction c = new Fraction(1,1995);
		double  actual = c.getAbsValue();
		double expected = 0.0005013;
		String error = String.format(
				"\n Test getAbsValue failed  Returned numerator value ( %.7f ) " + " but correct value is ( %.7f ). \n",
				actual, expected);
		final double THRESHOLD = .0000005;
		assertTrue(error, Math.abs(expected - actual) < THRESHOLD);
		
	}
	@Test
	public void test_5_3_FractiongetAbsValue() {
		Fraction c = new Fraction(1,98995);
		double  actual = c.getAbsValue();
		double expected = 0.0000101;
		String error = String.format(
				"\n Test getAbsValue failed  Returned numerator value ( %.7f ) " + " but correct value is ( %.7f ). \n",
				actual, expected);
		final double THRESHOLD = .0000005;
		assertTrue(error, Math.abs(expected - actual) < THRESHOLD);
		
	}
	
	@Test
	public void test_6_0_FractionaddFraction() {
		Fraction a = new Fraction(1,10);
		Fraction b = new Fraction(1,10);
		a.addFraction(b);
		
		int actual = this.getNumeratorValue(a);
		int expected = 20;
		String error = String.format(
				"\n Test addFraction failed  Returned numerator value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	@Test
	public void test_6_1_FractionaddFraction() {
		Fraction a = new Fraction(1,10);
		Fraction b = new Fraction(1,10);
		a.addFraction(b);
		int actual = this.getdenominatorValue(a);
		int expected = 100;
		String error = String.format(
				"\n Test addFraction failed  Returned denominator value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	@Test
	public void test_6_2_FractionaddFraction() {
		Fraction a = new Fraction(2,3);
		Fraction b = new Fraction(5,4);
		a.addFraction(b);
		
		int actual = this.getNumeratorValue(a);
		int expected = 23;
		String error = String.format(
				"\n Test addFraction failed  Returned numerator value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	@Test
	public void test_6_3_FractionaddFraction() {
		Fraction a = new Fraction(2,4);
		Fraction b = new Fraction(5,3);
		a.addFraction(b);
		int actual = this.getdenominatorValue(a);
		int expected = 12;
		String error = String.format(
				"\n Test addFraction failed  Returned denominator value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	
	@Test
	public void test_7_0_FractiontoString() {
		Fraction c = new Fraction(145,10);
		
		String actual = c.toString();
		String expected = "Fraction (145 / 10)";

		assertEquals(expected, actual);
		
	}
	@Test
	public void test_7_1_FractiontoString() {
		Fraction c = new Fraction(1,10);
		
		String actual = c.toString();
		String expected = "Fraction (1 / 10)";

		assertEquals(expected, actual);
		
	}
}
