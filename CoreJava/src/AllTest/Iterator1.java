package AllTest;

import java.util.ArrayList;

import java.util.Iterator;

public class Iterator1 {
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(80);
	a.add(67);
	a.add(32);
	a.add(67);
	a.add(80);
	System.out.println(a);
	Iterator<Integer> i = a.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}
