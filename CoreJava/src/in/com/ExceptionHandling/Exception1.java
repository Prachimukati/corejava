package in.com.ExceptionHandling;

public class Exception1 {
public static void main(String[] args) {
	try {
		String name = "prachi";
		System.out.println(name.charAt(3));
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
