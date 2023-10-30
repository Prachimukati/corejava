package in.com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmp {
public static void main(String[] args) {
	ArrayList<Employee> emp = new ArrayList<Employee>();
	emp.add(new Employee (2,"prachi" , "123"));
	emp.add(new Employee (1,"sonu" , "345"));
	emp.add(new Employee (4,"dipanshi" , "567"));
	emp.add(new Employee (2,"bhavna" , "987"));
	
	System.out.println(emp);
	
	Collections.sort(emp, new ComparatorByname());
	System.out.println(emp);
	
	
//	ArrayList<Employee> emp1 = new ArrayList<Employee>(emp);
//	Collections.sort(emp1, new ComparatorByname());
//	System.out.println(emp1);
}
}
