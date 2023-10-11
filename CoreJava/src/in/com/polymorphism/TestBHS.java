package in.com.polymorphism;

public class TestBHS {
public static void main(String[] args) {
	Bank b = new Bank ();
	b.setInterestRate(20.00);
	b.setName("geverner");
	
	System.out.println(b.getInterestRate());
	System.out.println(b.getname());
	
	HDFC h = new HDFC();
	h.setInterestRate(30.00);
	h.setName("private");
	
	System.out.println(h.getInterestRate());
	System.out.println(h.getname());
	
	SBI s = new SBI();
	s.setInterestRate(50.00);
	s.setName("governer");
	
	System.out.println(s.getInterestRate());
	System.out.println(s.getname());
}
}
