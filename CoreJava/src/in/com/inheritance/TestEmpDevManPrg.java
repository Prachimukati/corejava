package in.com.inheritance;

public class TestEmpDevManPrg {
private static int Salary;

public static void main(String[] args) {
	Employe2 e = new Employe2();
	e.setName(" Name = Prachi");
	e.setAddress("Address = indore");
	e.setJob_tittle("Job_tittle = Developer");
	e.setSalary(Salary = 100000);
	
	
	System.out.println(e.getName());
	System.out.println(e.getAddress());
	System.out.println(e.getJob_tittle());
	System.out.println(e.getAddress());
	
	
	Manager2 m = new Manager2();
	m.setName(" Name = Sujata");
	m.setAddress("Address = Mardana");
	m.setJob_tittle("Job_tittle = IAS");
	m.setSalary(Salary = 10000);
	
	
	System.out.println(m.getName());
	System.out.println(m.getAddress());
	System.out.println(m.getJob_tittle());
	System.out.println(m.getAddress());
	
	Developers d = new Developers();
	d.setName("Name = Pratha");
	d.setAddress("Address = Bhikangaon");
	d.setJob_tittle(" Job_tittle = Student");
	d.setSalary(Salary = 1000);
	
	System.out.println(d.getName());
	System.out.println(d.getAddress());
	System.out.println(d.getJob_tittle());
	System.out.println(d.getAddress());
		
    Programmer p = new Programmer();
    p.setName("Name = Chanda");
	p.setAddress("Address = Kedwa");
	p.setJob_tittle("Job_tittle = Talkitive");
	p.setSalary(Salary = 1020);
	
	
	System.out.println(p.getName());
	System.out.println(p.getAddress());
	System.out.println(p.getJob_tittle());
	System.out.println(p.getAddress());
	
	
	
	
	
}
}
