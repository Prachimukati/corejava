package in.com.Encaptulation1;

public class Testelployee {
public static void main(String[] args) {
	Employee e = new Employee();
	e.setEmployee_id(5);
	//e.setEmployee_name("siya");
	e.setEmployee_salary(200000);
	
	System.out.println(e.getEmloyee_id());
	//System.out.println(e.getEmloyee_name());
	System.out.println(e.getEmloyee_salary());
}
}
