package in.com.setgetmethod;

public class Testperson {
public static void main(String[] args) {
	Person p = new Person();
	p.setName("prachi");
	p.setDob(2004);
	p.setAddress("indore");
	
	System.out.println(p.getName());
	System.out.println(p.getDob());
	System.out.println(p.getAddress());
}
}
