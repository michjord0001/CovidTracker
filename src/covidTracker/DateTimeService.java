package covidTracker;

import java.util.Calendar;
import java.util.Date;

public class DateTimeService
{
   private Calendar calendar;

   //constructor creates the Calendar object, could use the constructor:
   //   Calendar(TimeZone zone, Locale aLocale) to explicitly specify 
   //	  the time zone and locale
   public DateTimeService()
   {
	 this.calendar = Calendar.getInstance();
   }

   //method returns date/time as a formatted String object
   public String getDateAndTime()
   {
	 Date d = this.calendar.getTime();
     return "The BeagleBone time is: " + d.toString();	
   }	
}
