package lab3;

import static org.junit.Assert.*;

import org.junit.Test;
import java.lang.reflect.Field;

import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import org.junit.FixMethodOrder;
import org.junit.Rule;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class CoffeeOrderTest {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	
	private String getcoffeeType(CoffeeOrder p) {
		String v="";
		try {
			Field name = CoffeeOrder.class.getDeclaredField("coffeeType");
			name.setAccessible(true);
			v = (String)name.get(p);
			
		} catch (Exception x) {
			fail("exception occurred trying to get this.getcoffeeType");
			System.out.println(x);
		}
		return v;
	}
	
	private String getcupSize(CoffeeOrder p) {
		String v="";
		try {
			Field name = CoffeeOrder.class.getDeclaredField("cupSize");
			name.setAccessible(true);
			v = (String)name.get(p);
			
		} catch (Exception x) {
			fail("exception occurred trying to get this.getcupSize");
			System.out.println(x);
		}
		return v;
	}
	
	
	@Test
	public void test_0_0_CoffeeOrderCtor() {
		CoffeeOrder c = new CoffeeOrder();
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "AmericanRegular";
		String expectedcupSize = "S";
		
		String errorcoffeeType = String.format(
				"\n Test no-arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test no-arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	@Test
	public void test_1_0_CoffeeOrderCtor() {
		CoffeeOrder c = new CoffeeOrder("Espresso","XL");
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "Espresso";
		String expectedcupSize = "XL";
		
		String errorcoffeeType = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	@Test
	public void test_2_0_CoffeeOrderCtor() {
		CoffeeOrder c = new CoffeeOrder("Latte","L");
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "Latte";
		String expectedcupSize = "L";
		
		String errorcoffeeType = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	@Test
	public void test_3_0_CoffeeOrderCtor() {
		CoffeeOrder c = new CoffeeOrder("AmericanDark","M");
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "AmericanDark";
		String expectedcupSize = "M";
		
		String errorcoffeeType = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	@Test
	public void test_4_0_CoffeeOrderCtor() {
		CoffeeOrder c = new CoffeeOrder("IceCoffee","M");
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "IceCoffee";
		String expectedcupSize = "M";
		
		String errorcoffeeType = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	
	
	@Test
	public void test_5_0_CoffeeOrderCopyCtor() {
		CoffeeOrder c1 = new CoffeeOrder("Espresso","XL");
		CoffeeOrder c = new CoffeeOrder(c1);
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "Espresso";
		String expectedcupSize = "XL";
		
		String errorcoffeeType = String.format(
				"\n Test Copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test Copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	@Test
	public void test_6_0_CoffeeOrderCopyCtor() {
		CoffeeOrder c1 = new CoffeeOrder("Latte","L");
		CoffeeOrder c = new CoffeeOrder(c1);
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "Latte";
		String expectedcupSize = "L";
		
		String errorcoffeeType = String.format(
				"\n Test Copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test Copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	@Test
	public void test_7_0_CoffeeOrderCopyCtor() {
		CoffeeOrder c1 = new CoffeeOrder("AmericanDark","XL");
		CoffeeOrder c = new CoffeeOrder(c1);
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "AmericanDark";
		String expectedcupSize = "XL";
		
		String errorcoffeeType = String.format(
				"\n Test Copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test  Copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	@Test
	public void test_8_0_CoffeeOrderCopyCtor() {
		CoffeeOrder c1 = new CoffeeOrder("IceCoffee","M");
		CoffeeOrder c = new CoffeeOrder(c1);
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "IceCoffee";
		String expectedcupSize = "M";
		
		String errorcoffeeType = String.format(
				"\n Test Copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test Copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	@Test
	public void test_9_0_CoffeeOrdersetCoffeeType() {
		CoffeeOrder c = new CoffeeOrder("IceCoffee","M");
		c.setCoffeeType("AmericanRegular");
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "AmericanRegular";
		String expectedcupSize = "M";
		
		String errorcoffeeType = String.format(
				"\n Test setCoffeeType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test setCoffeeType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	@Test
	public void test_10_0_CoffeeOrdersetCupSize() {
		CoffeeOrder c = new CoffeeOrder("IceCoffee","M");
		c.setCupSize("XL");
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "IceCoffee";
		String expectedcupSize = "XL";
		
		String errorcoffeeType = String.format(
				"\n Test setCupSize  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test setCupSize  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	@Test
	public void test_11_0_CoffeeOrdergetCoffeeType() {
		CoffeeOrder c = new CoffeeOrder("IceCoffee","M");
		String actualcoffeeType = c.getCoffeeType();
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "IceCoffee";
		String expectedcupSize = "M";
		
		String errorcoffeeType = String.format(
				"\n Test getCoffeeType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test getCoffeeType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	@Test
	public void test_12_0_CoffeeOrdergetCupSize() {
		CoffeeOrder c = new CoffeeOrder("IceCoffee","L");
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = c.getCupSize();
		
		String expectedcoffeeType = "IceCoffee";
		String expectedcupSize = "L";
		
		String errorcoffeeType = String.format(
				"\n Test getCupSize  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test getCupSize  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	@Test
	public void test_13_0_CoffeeOrdercoffeeOrderTime() {
		CoffeeOrder c = new CoffeeOrder("IceCoffee","L");
		int actual  = c.coffeeOrderTime();
		int expected =  11;
		
		String errorcoffeeTime = String.format(
				"\n Test coffeeOrderTime  failed  Returned name ( %d ) " + " but correct name is ( %d ). \n",
				actual, expected);
		assertEquals(errorcoffeeTime,expected, actual );
			
	}
	
	@Test
	public void test_14_0_CoffeeOrdercoffeeOrderTime() {
		CoffeeOrder c = new CoffeeOrder("AmericanDark","L");
		int actual  = c.coffeeOrderTime();
		int expected =  17;
		
		String errorcoffeeTime = String.format(
				"\n Test coffeeOrderTime  failed  Returned name ( %d ) " + " but correct name is ( %d ). \n",
				actual, expected);
		assertEquals(errorcoffeeTime,expected, actual );
			
	}
	
	@Test
	public void test_15_0_CoffeeOrdercoffeeOrderTime() {
		CoffeeOrder c = new CoffeeOrder("Latte","M");
		int actual  = c.coffeeOrderTime();
		int expected =  11;
		
		String errorcoffeeTime = String.format(
				"\n Test coffeeOrderTime  failed  Returned name ( %d ) " + " but correct name is ( %d ). \n",
				actual, expected);
		assertEquals(errorcoffeeTime,expected, actual );
			
	}
	
	
	@Test
	public void test_16_0_CoffeeOrdertoString() {
		CoffeeOrder c = new CoffeeOrder("Latte","M");
		String  actual  = c.toString();
		String  expected =  "Coffee Order with Coffee type is Latte and cup size is M";
		
		assertEquals(expected, actual );
			
	}
	@Test
	public void test_16_1_CoffeeOrdertoString() {
		CoffeeOrder c = new CoffeeOrder("Espresso","M");
		String  actual  = c.toString();
		String  expected =  "Coffee Order with Coffee type is Espresso and cup size is M";
		
		assertEquals(expected, actual );
			
	}
	@Test
	public void test_16_3_CoffeeOrdertoString() {
		CoffeeOrder c = new CoffeeOrder("AmericanRegular","XL");
		String  actual  = c.toString();
		String  expected =  "Coffee Order with Coffee type is AmericanRegular and cup size is XL";
		
		assertEquals(expected, actual );
			
	}
	
	
	
	
	
	
	
	
	
	
	

}
