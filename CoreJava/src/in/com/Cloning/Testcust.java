package in.com.Cloning;

public class Testcust {
public static void main(String[] args) throws CloneNotSupportedException {
	Customer c1 = new Customer("ram", 300);
	c1.name = "prachi";
	c1.balance  = 500000;
	
	Account a = new Account();
	a.balance = 3000;
	int balance = 0;
	c1.balance = balance;
	
	Customer c2 = (Customer) c1.clone();
	c2.name = "siya";
	c2.balance = 201;
	
	System.out.println(c1.name);
	System.out.println(c1.a.balance);
	System.out.println(c2.name);
	
	System.out.println(c2.a.balance);
}
}
