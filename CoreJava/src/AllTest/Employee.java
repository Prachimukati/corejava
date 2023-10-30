package AllTest;

import java.util.Comparator;

public class Employee {//COMPARATOR

	public int id = 0 ;
	public String name = null ;
	public String address = null;
	
	public Employee(int id , String name , String address) {
		this.address = address;
		this.id = id;
		this.name = name ; 
	}

	
	@Override
	public String toString() {
		
		return id+" "+name+" "+address;
	}


	
}
