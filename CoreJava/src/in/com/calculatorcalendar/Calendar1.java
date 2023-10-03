package in.com.calculatorcalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendar1 {
public static void main(String[] args) throws ParseException {
	String str = "29/09/2023";
	SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
	Date date = sd.parse(str);
	System.out.println(date);
}
}
