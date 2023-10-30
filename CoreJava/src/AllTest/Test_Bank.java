package AllTest;

import java.util.ArrayList;
import java.util.Collections;

public class Test_Bank {
public static void main(String[] args) {
	ArrayList<Bank> list = new ArrayList<Bank>();
	list.add(new Bank(1, "SBI","987"));
	list.add(new Bank(4, "Union Bank","765"));
	list.add(new Bank(2, "HDFC","497"));
	list.add(new Bank(0, "RBi", "kuch bhi"));
	System.out.println(list);
	
	Collections.sort(list);
	System.out.println(list);
	}
}
//COMPARABLE