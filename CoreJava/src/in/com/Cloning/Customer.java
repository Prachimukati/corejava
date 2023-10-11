package in.com.Cloning;

public class Customer implements Cloneable {

	String name = null ;
	int balance;
	
	Account a = new Account();
	
	public Customer (String name , int balance) {
		this.balance = balance;
		this.name = name;
	}
	@Override

	protected Object clone () throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.a = (Account) a.clone();
		return c;
		
	}
}