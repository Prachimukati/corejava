package in.com.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(2);
	a.add(9);
	a.add(7);
	System.out.println(a);
	Iterator<Integer> i = a.iterator();
	while (i.hasNext()) {
		System.out.println(i.next()) ;
	}
		
	
	
}
}
