// Fig. 8.5: Time2.java
// Time2 class declaration with overloaded constructors. 

public class Time3{
	private int totalSeconds;
	
	public Time3(){
		this(0, 0, 0);
	}
	
	public Time3(int hour){
		this(hour,0, 0);
	}
	
	public Time3(int hour, int minute){
		this(hour, minute, 0);
	}
		
	public Time3(int hour, int minute, int second){
		
		if (hour < 0 || hour >= 24)
		throw new IllegalArgumentException("hour must be 0-23");

		if (minute < 0 || minute >= 60)
		throw new IllegalArgumentException("minute must be 0-59");

		if (second < 0 || second >= 60)
		throw new IllegalArgumentException("second must be 0-59");

		this.totalSeconds = (hour * 3600 + minute * 60 + second);
	}	
	
	public Time3(Time3 time){
		this(time.getHour(), time.getMinute(), time.getSecond());
	}
	
	public void setTime(int hour, int minute, int second){
		if (hour < 0 || hour >= 24)
		throw new IllegalArgumentException("hour must be 0-23");

		if (minute < 0 || minute >= 60)
		throw new IllegalArgumentException("minute must be 0-59");

		if (second < 0 || second >= 60)
		throw new IllegalArgumentException("second must be 0-59");

		this.totalSeconds = totalSeconds;
	}
	
	public void setHour(int hour){
  
		if (hour < 0 || hour >= 24)
		throw new IllegalArgumentException("hour must be 0-23");
			this.totalSeconds = (hour * 3600);
		} 

		  
	public void setMinute(int minute){ 
		 
		if (minute < 0 && minute >= 60)
		throw new IllegalArgumentException("minute must be 0-59/0");
			this.totalSeconds = minute * 60;
		
		} 

	 
	public void setSecond(int second){
		  
		if (second >= 0 && second < 60)
		throw new IllegalArgumentException("second must be 0-59");
		else
			this.totalSeconds = second;
		}
		
	// public int setTotalSeconds(){
	   // return  totalSeconds = hour + minute + second;
	// }
	public int getHour(){
		return totalSeconds / 3600;
		
	}
	
	public int getMinute(){
		return (totalSeconds % 3600) / 60;
		
	}
		
	public int getSecond(){
		return (totalSeconds % 3600) % 60;
		
	}
	
	// public int getTotalSeconds(int totalSeconds){
		// totalSeconds = hour + minute + second;
		// return totalSeconds;								  
	// }
	
	public String toUniversalString(){
		return String.format(
			"%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	public  String toString(){
		return String.format("%d:%02d:%02d %s", 
			((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
			getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	 }
}