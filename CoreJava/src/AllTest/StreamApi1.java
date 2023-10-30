package AllTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi1 {
public static void main(String[] args) {
	ArrayList<Integer>a = new ArrayList<Integer>();
	a.add(990);
	a.add(75);
	a.add(87);
	a.add(78);
	System.out.println(a);
	
	List<Integer> list = a.stream().filter(i-> i % 2 == 0).collect(Collectors.toList());
	System.out.println(list);
	
}
}
