package in.com.ExceptionHandling;

public class Finallly {
public static void main(String[] args) {
	
	int a = 20 ;
	int b = 4;
	String name = "rays";
	
	try {
		System.out.println(name.charAt(6));
	} catch (Exception e) {
		System.out.println(e);
	}
	try {
		int c = a/b;
		System.out.println(c);
	} catch (Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("ye to chalega hi chalega");
	}
}
}
