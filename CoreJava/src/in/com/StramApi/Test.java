package in.com.StramApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
public static void main(String[] args) {
	ArrayList<Integer> i1 =  new ArrayList<Integer>();
	i1.add(1);
	i1.add(2);
	i1.add(5);
	i1.add(8);
	System.out.println(i1);
	List<Integer>i2= i1.stream().filter(i->i%2!=0).collect(Collectors.toList());
	System.out.println(i2);
	}
}

