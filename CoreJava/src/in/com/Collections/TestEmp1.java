package in.com.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp1 {
public static void main(String[] args) {
	ArrayList<Employee> e1 = new ArrayList<Employee>();
	e1.add(new Employee (1, "prachi", " 123456"));
	e1.add(new Employee (4, "depanshi", " 456789"));
	e1.add(new Employee (3, "sonali", " 789123"));
	e1.add(new Employee (2, "bhavana", " 135678"));
	
	System.out.println(e1);
	
	Collections.sort(e1);
	System.out.println(e1);
}
}
