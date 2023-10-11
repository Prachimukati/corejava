package in.com.inheritance;

public class Testma {
public static void main(String[] args) {
	
	Automobile a = new Automobile();
	a.setColor("black");
	a.setCompany("pulrser");
	
	System.out.println(a.getColor());
	System.out.println(a.getCompany());
	
	Mobile m = new Mobile();
	m.setPrice(200000);
	m.setBike("model");
	
	System.out.println(m.getPrice());
	System.out.println(m.getBike());
}
}
