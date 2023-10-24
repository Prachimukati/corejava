package in.com.Cloning;

public class TestaccCus {
public static void main(String[] args) throws CloneNotSupportedException {
	Account a1 = new Account();
	a1.balance = 600;
	Account a2 = (Account)a1.clone();
	a2.balance=500;
	System.out.println(a1.balance);
	System.out.println(a2.balance);
}
}