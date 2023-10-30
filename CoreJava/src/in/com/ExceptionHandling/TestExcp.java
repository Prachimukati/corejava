package in.com.ExceptionHandling;

class Excp extends RuntimeException{
	public Excp() {
		super ("Syntax error");
	}
}
public class TestExcp {
public static void main(String[] args) {
	String name = "siya";
	if (name.equals("Siya")) {
		System.out.println("Syntax is write");
	}
	else {
		Excp e1 = new Excp();
		
		try {
			throw e1 ;
			
			
		} catch (Exception e) {
          System.out.println(e);
		}
	}
}
}
