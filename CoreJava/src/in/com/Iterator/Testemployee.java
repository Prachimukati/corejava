package in.com.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Testemployee {
public static void main(String[] args) {
	Employee e1 = new Employee(1, "prachi", "indore");
	Employee e2 = new Employee(2, "dipanshi", "Khargone");

	ArrayList a =new ArrayList();
	a.add(e1);
	a.add(e2);
	
	//Employee e3 = (Employee) a.get(1);
	//System.out.println(e);
	//System.out.println(e);
	//System.out.println(e.getId());
	//System.out.println(e.getAddress());
	//System.out.println(e.getname());
	//for (int i = 0; i < a.size(); i++) {
		//Employee e3 = (Employee) a.get(i);
		//System.out.println(e3);
		
		for (Object object : a) {
			Employee e3 = (Employee) object ;
			System.out.println(e3);
			
			Iterator it = a.iterator();
			while(it.hasNext()) {
				Employee e = (Employee) it.next();
				System.out.println(e);
			}
		}		
	}	
}