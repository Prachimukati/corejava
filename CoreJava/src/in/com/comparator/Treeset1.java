package in.com.comparator;

import java.util.TreeSet;

public class Treeset1 {
public static void main(String[] args) {
	TreeSet t = new TreeSet(new Mycomparator());
	t.add(20);
	t.add(10);
	t.add(30);
	t.add(40);
	System.out.println(t);
}
}
