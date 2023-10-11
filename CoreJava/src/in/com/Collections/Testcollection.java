package in.com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Testcollection{
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add("prachi");
		c1.add(20.00);
		
		Collection c2 = new ArrayList();
		c2.add('a');
		c2.add(null);
		c2.add("mukati");
		
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.addAll(c2);
		System.out.println(c1);
		
		//c1.clear();
		//System.out.println(c1);
		
		System.out.println(c1.contains("rays"));
		System.out.println(c1.containsAll(c2));
		
		//c1.clear();
		System.out.println(c1.isEmpty());
		
		c2.remove("null");
		System.out.println(c2);
		
		c1.removeAll(c2);
		System.out.println(c2);
		
		c1.retainAll(c2);
		System.out.println(c1);
		
		c2.size();
		System.out.println(c2);
		
	}
}
		