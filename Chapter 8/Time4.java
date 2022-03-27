// Exercise 8.7 Solution: Time2.java
// Time2 class definition with methods tick,
// incrementMinute and incrementHour.

public class Time4
{
private int hour; // 0 - 23
private int minute; // 0 - 59
private int second; // 0 - 59

   //Chapter 8 Classes and Objects: A Deeper Look
 // Time2 no-argument constructor: initializes each instance variable
 // to zero; ensures that Time2 objects start in a consistent state
public Time4()
 {
 this( 0, 0, 0 ); // invoke Time2 constructor with three arguments
 } // end Time2 no-argument constructor

 // Time2 constructor: hour supplied, minute and second defaulted to 0
 public Time4( int h )
 {
 this( h, 0, 0 ); // invoke Time2 constructor with three arguments
 } // end Time2 one-argument constructor

 // Time2 constructor: hour and minute supplied, second defaulted to 0
 public Time4( int h, int m )
 {
 this( h, m, 0 ); // invoke Time2 constructor with three arguments
 } // end Time2 two-argument constructor

 // Time2 constructor: hour, minute and second supplied
 public Time4( int h, int m, int s )
 {
 setTime( h, m, s ); // invoke setTime to validate time
 } // end Time2 three-argument constructor

 // Time2 constructor: another Time2 object supplied
 public Time4( Time2 time )
 {
 // invoke Time2 constructor with three arguments
 this( time.getHour(), time.getMinute(), time.getSecond() );
 } // end Time2 constructor with Time2 argument

 // Set Methods
 // set a new time value using universal time; perform
 // validity checks on data; set invalid values to zero
 public void setTime( int h, int m, int s )
 {
 setHour( h ); // set the hour
 setMinute( m ); // set the minute
 setSecond( s ); // set the second
 } // end method setTime

 // validate and set hour
 public void setHour( int h )
 {
 hour = ( ( h >= 0 && h < 24 ) ? h : 0 );
 } // end method setHour

 // validate and set minute
 public void setMinute( int m )
 {
 minute = ( ( m >= 0 && m < 60 ) ? m : 0 );
 } // end method setMinute

//Exercises 13
 // validate and set second
 public void setSecond( int s )
 {
 second = ( ( s >= 0 && s < 60 ) ? s : 0 );
 } // end method setSecond

 // Get Methods
 // get hour value
 public int getHour()
 {
 return hour;
 } // end method getHour

 // get minute value
 public int getMinute()
 {
 return minute;
 } // end method getMinute

 // get second value
 public int getSecond()
 {
 return second;
 } // end method getSecond

 // Tick the time by one second
 public void tick()
 {
 setSecond( second + 1 );

 if ( second == 0 )
 incrementMinute();
 } // end method tick

 // Increment the minute
 public void incrementMinute()
 {
 setMinute( minute + 1 );

 if ( minute == 0 )
 incrementHour();
 } // end method incrementMinute

 // Increment the hour
 public void incrementHour()
 {
 setHour( hour + 1 );
 } // end method incrementHour

 // convert to String in universal-time format (HH:MM:SS)
 public String toUniversalString()
 {
 return String.format(
 "%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
// Chapter 8 Classes and Objects: A Deeper Look
 } // end method toUniversalString

 // convert to String in standard-time format (H:MM:SS AM or PM)
 public String toString()
 {
 return String.format( "%d:%02d:%02d %s",
 ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
 getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
 } // end method toStandardString
 } // end class Time2
 // Exercise 8.7 Solution: Time2Test.java
 // Demonstrating the Time2 class set and get methods
