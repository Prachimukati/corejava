package in.com.Encaptulation1;

public class Testbank {
public static void main(String[] args) {
	Bank b = new Bank ();
	b.setBalance(20000.0);
	b.setNumber(10);
	
	System.out.println(b.getBalance());
	System.out.println(b.getNumber());
}
}
