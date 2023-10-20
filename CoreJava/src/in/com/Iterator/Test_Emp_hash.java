package in.com.Iterator;

public class Test_Emp_hash {
public static void main(String[] args) {
	
	Employe e1 = new Employe( 1 , "prachi","indore");
	Employe e2 = new Employe( 2 , "dipanshi","Indore");
	
	System.out.println(e1.equals(e1));
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
}
}