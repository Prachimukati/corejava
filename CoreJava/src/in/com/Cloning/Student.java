package in.com.Cloning;

public class Student implements Cloneable{
	int age;
	Addresss address;
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student s = (Student) super.clone();
		s.address=(Addresss)address.clone();
		return super.clone();
	}
}
