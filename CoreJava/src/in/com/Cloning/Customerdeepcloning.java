package in.com.Cloning;

public class Customerdeepcloning {

	String name = null;
	int balance;
	
	Account a = new Account();
	public Customerdeepcloning (String name , int balance) {
		this.name = name;
		this.a.balance = balance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.a= (Account) a.clone();
		return c;
	}
}
