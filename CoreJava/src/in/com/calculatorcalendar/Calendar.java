package in.com.calculatorcalendar;

import java.text.SimpleDateFormat;
import java.util.Date;
                   // str --> int(formate method )
public class Calendar {
public static void main(String[] args) {
	Date date = new Date();
	SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
	String str = sd.format(date);
	System.out.println(str);
}
}
