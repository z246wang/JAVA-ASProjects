package lab2;
import static org.junit.Assert.*;

import org.junit.Test;
import java.lang.reflect.Field;

import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WatchTest {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	
	private long getstartTime(Watch c) {
		long v=-1;
		try {
			Field name = Watch.class.getDeclaredField("startTime");
			name.setAccessible(true);
			v = (long)name.get(c);
			
		} catch (Exception x) {
			fail("exception occurred trying to get WatchTest this.getstartTime");
			System.out.println(x);
		}
		return v;
	}
	
	@Test
	public void test_0_0_Watch() {
		Watch c = new Watch();
		long actual = this.getstartTime(c);
		long expected = 0;
		String error = String.format(
				"\n Test no-arg constructor failed  Returned startTime value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	
	@Test
	public void test_2_0_Watch() {
		Watch c = new Watch(125);
		long actual = this.getstartTime(c);
		long expected = 125;
		String error = String.format(
				"\n Test arg constructor failed  Returned startTime value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	@Test
	public void test_3_0_Watch() {
		Watch c = new Watch(5825);
		long actual = c.getStartTime();
		long expected = 5825;
		String error = String.format(
				"\n Test getStartTime failed  Returned startTime value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	@Test
	public void test_4_0_Watch() {
		Watch c = new Watch(5825);
		c.setStartTime(89632);
		long actual = this.getstartTime(c);
		long expected = 89632;
		String error = String.format(
				"\n Test setStartTime failed  Returned startTime value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	@Test
	public void test_5_0_Watch() {
		Watch c = new Watch();
		c.incrbyHours(4);
		long actual = this.getstartTime(c);
		long expected = 14400;
		String error = String.format(
				"\n Test incrbyHours failed  Returned getstartTime value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	@Test
	public void test_5_1_Watch() {
		Watch c = new Watch();
		c.incrbyHours(1);
		long actual = this.getstartTime(c);
		long expected = 3600;
		String error = String.format(
				"\n Test incrbyHours failed  Returned startTime value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	
	
	@Test
	public void test_6_0_Watch() {
		Watch c = new Watch(14440);
		c.decrbyHours(4);
		long actual = this.getstartTime(c);
		long expected = 40;
		String error = String.format(
				"\n Test decrbyHours failed  Returned startTime value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	@Test
	public void test_6_1_Watch() {
		Watch c = new Watch(3652);
		c.decrbyHours(1);
		long actual = this.getstartTime(c);
		long expected = 52;
		String error = String.format(
				"\n Test decrbyHours failed  Returned startTime value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	@Test
	public void test_7_0_Watch() {
		Watch c = new Watch();
		c.incrbyMinutes(4);
		long actual = this.getstartTime(c);
		long expected = 240;
		String error = String.format(
				"\n Test incrbyMinutes failed  Returned startTime value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	@Test
	public void test_7_1_Watch() {
		Watch c = new Watch(65);
		c.incrbyMinutes(125);
		long actual = this.getstartTime(c);
		long expected = 7565;
		String error = String.format(
				"\n Test incrbyMinutes failed  Returned startTime value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	
	@Test
	public void test_8_0_Watch() {
		Watch c = new Watch(18840);
		c.decrbyMinutes(4);
		long actual = this.getstartTime(c);
		long expected = 18600;
		String error = String.format(
				"\n Test decrbyMinutes failed  Returned startTime value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	@Test
	public void test_8_1_Watch() {
		Watch c = new Watch(3652);
		c.decrbyMinutes(1);
		long actual = this.getstartTime(c);
		long expected = 3592;
		String error = String.format(
				"\n Test decrbyMinutes failed  Returned startTime value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	
	@Test
	public void test_9_0_Watch() {
		Watch c = new Watch(18840);
		
		int actual = c.getTimeinHours();
		int expected = 5;
		String error = String.format(
				"\n Test getTimeinHours failed  Returned startTime value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	@Test
	public void test_9_1_Watch() {
		Watch c = new Watch(3652);
		
		int actual = c.getTimeinHours();
		int expected = 1;
		String error = String.format(
				"\n Test getTimeinHours failed  Returned startTime value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	@Test
	public void test_10_0_Watch() {
		Watch c = new Watch(1840);
		
		int actual = c.getTimeinMinutes();
		int expected = 30;
		String error = String.format(
				"\n Test getTimeinMinutes failed  Returned startTime value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	@Test
	public void test_10_1_Watch() {
		Watch c = new Watch(36652);
		
		int actual = c.getTimeinMinutes();
		int expected = 610;
		String error = String.format(
				"\n Test getTimeinMinutes failed  Returned startTime value ( %d ) " + " but correct value is ( %d ). \n",
				actual, expected);
		assertEquals(error, expected, actual);
		
	}
	
	@Test
	public void test_11_1_Watch() {
		Watch c = new Watch(36652);
		
		String actual = c.toString();
		String expected = "Watch Time is 10 Hours, 10 Minutes, and 52 Seconds.";

		assertEquals(expected, actual);
		
	}
	@Test
	public void test_11_2_Watch() {
		Watch c = new Watch(652);
		
		String actual = c.toString();
		String expected = "Watch Time is 0 Hours, 10 Minutes, and 52 Seconds.";

		assertEquals(expected, actual);
		
	}

}
