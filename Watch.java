package lab2;

/**
 * A simple Watch. A Watch keeps track of a long value in seconds.
 *  Users can change the time value of the Watch through other methods.   
 * A Watch provides a method to get and set the time value of the Watch.
 * 
 * 
 *
 */

public class Watch {
	/* To be able to complete this Class, you need to read  the API of this class
	 * 
	 * Hint: Use the WatchTest class to help you test you work  
	 * 
	 * */
	private long startTime = 0;
	
	public Watch() {
	}
	
	public Watch(long value) {
		this.startTime = value;
	}
	
	public long getStartTime() {
		return startTime;
	}
	
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	
	public void incrbyHours(int value) {
		this.startTime = value * 3600 + startTime;
	}
	
	public void decrbyHours(int value) {
		this.startTime = startTime - value * 3600;
	}
	
	public void incrbyMinutes(int value) {
		this.startTime = startTime + value * 60; 
	}
	
	public void decrbyMinutes(int value) {
		this.startTime = startTime - value * 60;
	}
	
	public int getTimeinHours() {
		return (int)startTime/3600;
	}
	
	public int getTimeinMinutes() {
		return (int)startTime/60;
	}
	
	public java.lang.String toString() {
		int minutes = (int)startTime % 3600 / 60;
		int seconds = (int)startTime % 60;
		return "Watch Time is " + getTimeinHours() + " Hours, " + minutes + " Minutes, and " + seconds + " Seconds.";
	}
}
