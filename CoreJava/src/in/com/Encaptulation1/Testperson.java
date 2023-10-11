package in.com.Encaptulation1;

public class Testperson {
public static void main(String[] args) {
	Person p = new Person();
	p.setName("Prachi");
	p.setCountry("India");
	p.setAge(20);
	
	String name = p.getName();
	String country = p.getCountry();
	int age = p.getAge();
	
	System.out.println("Name ="  + name);
	System.out.println("Country = " + country);
	System.out.println("age = " + age);
	
	//System.out.println(p.getName());
	//System.out.println(p.getCountry());
	//System.out.println(p.getAge());
}
}
