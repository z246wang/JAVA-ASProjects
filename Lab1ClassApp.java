package lab1;
/**
 * Use this Class to test the method that you 
 * implemented 
 * 
 *
 */
public class Lab1ClassApp {

	public static void main(String[] args) {
		
		System.out.println(Lab1Class.minutesSeconds(150));
		System.out.println(Lab1Class.minutesSeconds(500));
		System.out.println(Lab1Class.minutesSeconds(50));
		
		System.out.println(Lab1Class.temperature(100));
		System.out.println(Lab1Class.temperature(10));
		System.out.println(Lab1Class.temperature(150));
		
		System.out.println(Lab1Class.convertDistance(157));
		System.out.println(Lab1Class.convertDistance(57));
		System.out.println(Lab1Class.convertDistance(37));
		
		
		System.out.println(Lab1Class.fiveyearbalance(6000, 4.25));
		System.out.println(Lab1Class.fiveyearbalance(3000, 3.5));
		System.out.println(Lab1Class.fiveyearbalance(4000, 2.25));
		
		
		System.out.println(Lab1Class.ageinyears(7000));
		System.out.println(Lab1Class.ageinyears(17000));
		System.out.println(Lab1Class.ageinyears(37000));
		
		
		
		System.out.println("Test mul2Diff(1, 2) = "+ Lab1Class.mul2Diff(1, 2));
		System.out.println("Test mul2Diff(4, 3) = "+ Lab1Class.mul2Diff(4, 3));
		System.out.println("Test mul2Diff(7, 6) = "+ Lab1Class.mul2Diff(7, 6));
		
		System.out.println("Test diffSquares(1, 2) = "+Lab1Class.diffSquares(1, 2));
		System.out.println("Test diffSquares(4, 3) = "+Lab1Class.diffSquares(4, 3));
		System.out.println("Test diffSquares(6, 7) = "+Lab1Class.diffSquares(6, 7));
		
		System.out.println("Test computeSquareRoot(4) = "+Lab1Class.computeSquareRoot(4));
		System.out.println("Test computeSquareRoot(5) = "+Lab1Class.computeSquareRoot(5));
		System.out.println("Test computeSquareRoot(56) = "+Lab1Class.computeSquareRoot(56));
		
		
		System.out.println("Test getBMI(75,15,45) = "+Lab1Class.getBMI(75,15,45));
		System.out.println("Test getBMI(75,15,45) = "+Lab1Class.getBMI(85,15,5));
		System.out.println("Test getBMI(75,15,45) = "+Lab1Class.getBMI(95,15,15));
		
		System.out.println("Test numRevolutions(720) = "+Lab1Class.numRevolutions(720));
		System.out.println("Test numRevolutions(525) = "+Lab1Class.numRevolutions(525));
		System.out.println("Test numRevolutions(940) = "+Lab1Class.numRevolutions(940));
		
		
		System.out.println("Test fixAngle(720) = "+Lab1Class.fixAngle(720));
		System.out.println("Test fixAngle(525) = "+Lab1Class.fixAngle(525));
		System.out.println("Test fixAngle(940) = "+Lab1Class.fixAngle(940));
		
		System.out.println("Test avg(1,2,5) = "+Lab1Class.avg(1,2,5));
		System.out.println("Test avg(4,3,5) = "+Lab1Class.avg(4,3,5));
		System.out.println("Test avg(11,26,5) = "+Lab1Class.avg(11,26,5));

		
		/* you can all more test */
	}
	
}
