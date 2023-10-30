package AllTest;

import java.util.ArrayList;
import java.util.Collections;

public class Test_Employee {
public static void main(String[] args) {
	ArrayList<Employee> list = new ArrayList<Employee>();
	list.add( new Employee (7, "Prachi " , "946"));
	list.add(new Employee (4, "Ahavna" ,"564"));
	list.add(new Employee (8,"Sonu" , "307"));
	list.add(new Employee(101, "Himanshu Jain", "Indore"));
	
	System.out.println(list);
	
	Collections.sort(list,new By_name());
	System.out.println(list);
	
	Collections.sort(list , new By_id());
	System.out.println(list);
	//COMrARABLE
	
}
}
