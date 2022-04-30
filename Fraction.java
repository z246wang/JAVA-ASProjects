package lab2;

/**
 * This class represent fraction of two integer values
 * A fraction consists of two integers, one for numerator 
 *   and one for denominator.  An example fraction is 1/5.
 *   
 *   Note: A valid fraction must not have zero in the denominator.
 *   No need to simplify or reduce the fraction value  * 
 *
 */
public class Fraction {

	/* To be able to complete this Class, you need to read  the API of this class
	 * 
	 * Hint: Use the WatchTest class to help you test you work  
	 * 
	 * */
	private int denominator;
	private int numerator;
	
	public Fraction() {
		this.denominator = 1;
		this.numerator = 0;
	}
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void setDenominator(int denominator) {
	    this.denominator = denominator;
	}
	
	public void setFraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public double getAbsValue() {
		return (double)numerator/denominator;
	}
	
	public void addFraction(Fraction f) {
		this.numerator = this.numerator * f.denominator + this.denominator * f.numerator;
	    this.denominator = this.denominator * f.denominator;
	}
	
	public java.lang.String toString() {
		return "Fraction (" + numerator + " / " + denominator + ")";
	}
}
