package in.com.ExceptionHandling;

public class Exception2 {
public static void main(String[] args) {
	try {
		int a = 20;
		int b = 0;
		int c = a/b;
		System.out.println(c);
	} catch (Exception e) {
		System.out.println(e);
	}
			
}
}
