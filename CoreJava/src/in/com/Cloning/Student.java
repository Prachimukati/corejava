package in.com.Cloning;

public class Student implements Cloneable{
	int age;
	String address;
	//Addresss a=new Addresss();
	
	public Student(int age,String address) {
		
		this.age=age;
		this.address=address;
	}
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student s = (Student) super.clone();
		//s.a=(Addresss)a.clone();
		return s;
	}
}
