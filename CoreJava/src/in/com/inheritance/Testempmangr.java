package in.com.inheritance;

public class Testempmangr {
public static void main(String[] args) {
	Employe e = new Employe();
	e.calculatebonus();
	e.generatePerformanceResult();
	e.setAddress("indore");
	e.setName("prachi");
    e.setSalary(1200000.0);
    e.setJobtittle("JAVA");
    
    System.out.println(e.generatePerformanceResult());
    System.out.println(e.calculatebonus());
    System.out.println(e.getAddress());
    System.out.println(e.getjobtittle());
    System.out.println(e.getname());
    System.out.println(e.getSalary());
    
    Manager m =new Manager();
    m.getNumberOfSubordinates();
    m.calculatebonus();
    m.generatePerformanceResult();
    
    System.out.println(m.calculatebonus());
    System.out.println(m.getNumberOfSubordinates());
    System.out.println(m.generatePerformanceResult());
}
}