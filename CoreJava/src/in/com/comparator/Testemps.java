package in.com.comparator;

import java.util.ArrayList;
import java.util.Collections;


public class Testemps {
public static void main(String[] args) {
	ArrayList<Emps> marks =new ArrayList<>();
	marks.add(new Emps(name:"prachi", address:"Indore",salary:2000000));
	marks.add(new Emps(name:"chand", address:"Kedwa",salary:20000));
	System.out.println(marks);
	
	
	Collections.sort(marks);
	System.out.println(mark);
	
}
}
