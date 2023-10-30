package in.com.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Bank_Test {

	public static void main(String[] args) {
		Bank b=new Bank(101, "SBI");
		Bank b1=new Bank(102, "HDFC");
		ArrayList<Bank> list=new ArrayList<Bank>();
		list.add(b);
		list.add(b1);
		System.out.println(list);
		System.out.println("----For Loop using iterate----");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---For Each Loop------");
		for (Bank b3 : list) {
			System.out.println(b3);
		}
		System.out.println("-----Iterator----");
		Iterator<Bank>it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
