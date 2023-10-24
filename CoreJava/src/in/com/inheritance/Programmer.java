package in.com.inheritance;

public class Programmer extends Employe2{
	private String name = null;
	private String address = null;
	private int salary = 0 ;
    private String job_tittle = null;
    
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
	public void setSalary(int Salary) {
		this.salary = Salary;
	}
	public int getSalary() {
		return salary;
	}	
		public void setJob_tittle(String job_tittle) {
			this.job_tittle = job_tittle;
		}
		public String getJob_tittle() {
			return job_tittle;
		}
		
}
