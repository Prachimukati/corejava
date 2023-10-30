package in.com.comparator;

public class Employee {
	int  id;
	private String address;
	String name;
	
	public  Employee (int id ,String name , String address) {
		this.id = id;
		this.address = address;
		this.name = name;
	}
	@Override
		public String toString() {
			return id+ " " + name + " " + address;
	}	
}
