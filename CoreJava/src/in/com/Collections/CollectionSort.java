package in.com.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {
public static void main(String[] args) {
	ArrayList<Integer> marks = new ArrayList<Integer>();
	marks.add(99);
	marks.add(89);
	marks.add(79);
	marks.add(69);
	
	System.out.println(marks);
	
	Collections.sort(marks);
	System.out.println(marks);
}
}
