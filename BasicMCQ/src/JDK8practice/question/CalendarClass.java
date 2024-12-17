package JDK8practice.question;

import java.util.Calendar;
import java.util.Date;

public class CalendarClass {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		System.out.println("Date :"+d);
		
	}
}
