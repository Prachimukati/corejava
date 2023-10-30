package in.com.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_Example {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(101);
		list.add("Prachi");
		list.add(455);
		System.out.println(list);
		Iterator it=list.iterator();
	//	System.out.println(it.next());
        while(it.hasNext()) {
        	System.out.println(it.next());  
        }
        
        for(int i=0;i<list.size();i++) {
        	Object o=list.get(i);
        	System.out.println(o);
        }
	}

}
