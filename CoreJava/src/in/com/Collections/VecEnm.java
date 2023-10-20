package in.com.Collections;

import java.util.Enumeration;
import java.util.Vector;

public class VecEnm {
public static void main(String[] args) {
	Vector v = new Vector ();
	v.add(100);
	v.add("Prachi");
	v.add("Mukati");
	System.out.println();
	
	Enumeration e = v.elements();
	v.add("Rays");
	v.add(10000);
	System.out.println(v);
	
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	
}
}
