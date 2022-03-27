// Fig. 8.5: dt2.java
// dt2 class declaration with overloaded constructors. 

public class DateAnddt{
	
	private int hour;
	private int minute;
	private int second;
	
	private int year;
	private int month;
	private int day;
	
	private static final int[] daysPerMonth = 
		{0, 31, 28, 31, 30, 31, 30, 31, 31, 30,31, 30, 31};

		
	public DateAnddt(int hour, int minute, int second, int year, int month, int day){

		this.hour = hour;
		this.minute = minute; 
		this.second = second;
		this.month = month;
		this.day = day;
		this.year = year;
	}	
	
	public DateAndTime(DateAnddt dt){
		this(dt.getHour(), dt.getMinute(), dt.getSecond(), dt.getHour(), getMinute(), getSecond());
	}
	
	
	public void setdt(int hour, int minute, int second){
		// if (hour < 0 || hour >= 24)
		// throw new IllegalArgumentException("hour must be 0-23");

		// if (minute < 0 || minute >= 60)
		// throw new IllegalArgumentException("minute must be 0-59");

		// if (second < 0 || second >= 60)
		// throw new IllegalArgumentException("second must be 0-59");

		this.hour = hour;
		this.minute = minute; 
		this.second = second;
	}
	
	public void setHour(int hour){
  
		if (hour >= 24)
			day += 1;
	//	throw new IllegalArgumentException("hour must be 0-23");

		this.hour = hour;
		} 

		 // validate and set minute 
	public void setMinute(int minute){ 
		 
		if (minute >= 60)
			hour += 1;
		// throw new IllegalArgumentException("minute must be 0-59");

		this.minute = minute; 
		} 

		 // validate and set second 
	public void setSecond(int second){
		  
		if (second > 60)
			minute += 1;
		// throw new IllegalArgumentException("second must be 0-59");

		this.second = second;
	}
	
	public void setYear(int year){
			this.year = year;
		
	}
	
	public void setmonth(int month){
		if(second > 60)
			year += 1;
	}
	
	public void setDay(int day){
		if(day > 29)
			month += 1;
	}
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second;
	}
	
	public int getYear(){
		return year;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getDay(){
		return day;
	}
	
	public String toUniversalString(){
		return String.format(
			"%02d:%02d:%02d", getHour(), getMinute(), getSecond(),getYear(),getMonth(),getDay());
	}
	
	public String toString(){
		return String.format("%d:%02d:%02d %s", 
			((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
			getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}





	
	// private int year;
	// private int month;
	// private int day;
	
	// private static final int[] daysPerMonth = 
		// {0, 31, 28, 31, 30, 31, 30, 31, 31, 30,31, 30, 31};
		
	public Date(int month, int day, int year){
		
	// if (month <= 0 || month > 12)
		// throw new IllegalArgumentException(
		// "month (" + month + ") must be 1-12");
	// if (day <= 0 || 
		// (day > daysPerMonth[month] && !(month == 2 && day == 29)))
		// throw new IllegalArgumentException("day (" + day + 
		// ") out-of-range for the specified month and year");

		// check for leap year if month is 2 and day is 29
	// if (month == 2 && day == 29 && !(year % 400 == 0 || 
		// (year % 4 == 0 && year % 100 != 0)))
		// throw new IllegalArgumentException("day (" + day +
		// ") out-of-range for the specified month and year");
		 
		// this.month = month;
		// this.day = day;
		// this.year = year;

		// System.out.printf(
		// "Date object constructor for date %s%n", this);	
	// }
	
	// public String toString(){
		// return String.format("%d%d%d", month, day, year);
	}
}