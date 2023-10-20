package in.com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmp {
public static void main(String[] args) {
	ArrayList<Employee> empn = new ArrayList<Employee>();
	empn.add(new Employee (2,"prachi" , "123"));
	empn.add(new Employee (1,"mukati" , "345"));
	empn.add(new Employee (4,"dipanshi" , "567"));
	empn.add(new Employee (2,"bhavna" , "987"));
	
	System.out.println(empn);
	
	//Collections.sort(empn, new ComparatorByname());
	//System.out.println(empn);
	
	ArrayList<Employee>empid= new ArrayList<Employee>(empn);
	Collections.sort(empid , new ComparatorByname());
	System.out.println(empid);
	
}
}
