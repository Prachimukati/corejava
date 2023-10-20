package in.com.Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapp {
public static void main(String[] args) {
	Map<String , Integer> num = new HashMap<String, Integer>() ;
	num.put("one", 1);
	num.put("two", 2);
	num.put("three", 3);
	num.put("four", 4);
	num.put("five", 5);
	System.out.println(num); 
	
	//num.clear();
	//System.out.println(num);
	
	System.out.println(num.containsKey("two"));
	
	System.out.println(num.containsValue(10));
	
	System.out.println(num.entrySet());
	
	System.out.println(num.get("two"));
	
	//num.clear();
	System.out.println(num.isEmpty());
	
	System.out.println(num.keySet());
	
	num.remove("one");
	System.out.println(num);
	
	System.out.println(num.size());
	
	System.out.println(num.values());
	
	
	
}
}
