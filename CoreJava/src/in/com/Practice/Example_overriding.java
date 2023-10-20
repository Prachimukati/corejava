package in.com.Practice;

class Employee{
	void showDetail() {
	System.out.println("this is employee detail ");
	}
   void showDetail( String name) {
	System.out.println("this is example of overriding " + name );
	}
   void showDetail( int id , int  sellary) {
		System.out.println("this is example of overriding " + id  + "  " + sellary  );
		}
}


public class Example_overriding {
public static void main(String[] args) {
	Employee e  = new Employee ();
	e.showDetail();
	e.showDetail("prachi");
	e.showDetail(1, 2000);
}
}
