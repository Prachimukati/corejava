package in.com.Iterator;

public class Employee {

	private int  id = 0;
	private String name = null;
	private String address = null;
	
	public void Emlpoyee (int id ,String name , String address) {
		this.id = id;
		this.address = address;
		this.name = name;
	}
	public void setId( int id) {
		this.id =id;
	}
	public int getId () {
		return id;
	}
	public void setAddress( String address) {
		this.address =address;
	}
	public String getAddress() {
		return address;
	}
	public void setName( String name) {
		this.name =name;
	}
	public String getName() {
		return name;
	}
}
