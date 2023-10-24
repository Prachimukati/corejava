package in.com.comparator;

public class Emps implements Comparable{
	private String name;
	private String address;
	private int salary;
	
	public void Emps(String name , String address , int salary) {
		this.address=address;
		this.name=name;
		this.salary=salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		
		return name+" "+address+" "+salary;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
    private void compareTo() {
    return this.salary-o.salary;

	}	
	
}
