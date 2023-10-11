package in.com.inheritance;

public class Employe {

	private String name;
	private String address;
	private String jobtittle;
	private double salary;
	
	public void setName (String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setJobtittle(String jobtittle) {
		this.jobtittle = jobtittle;
	}
	public String getjobtittle() {
		return jobtittle;
	}
	public void setSalary(double  salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public double calculatebonus() {
		return 0.0;
	}
	public String generatePerformanceResult() {
		return "No  Generate Performance Result" ; 
	}
	
	
}
