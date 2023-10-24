package in.com.Cloning;

public class Teststd {
public static void main(String[] args) throws CloneNotSupportedException {
	Student s1 = new Student();
	s1.age=18;
	
	Addresss a = new Addresss();
	a.address=22;
	 
	s1.address = a;
	
    Student s2 = (Student)s1.clone();
	s2.age = 21;
	s2.address.1address = 98;
	
	System.out.println(s1.age+" ");
	System.out.println(s2.age+" ");
	System.out.println(s1.address +" ");
	System.out.println(s2.address + "");
}
}
