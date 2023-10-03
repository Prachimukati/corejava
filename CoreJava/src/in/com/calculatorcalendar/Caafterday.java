package in.com.calculatorcalendar;

import java.util.Calendar;
import java.util.Date;

public class Caafterday {
public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.DATE,10);
	Date date = cal.getTime();
	System.out.println(date);
}
}
