package AllTest;

public class NameException {
public static void main(String[] args) {
	try {
		String name ="siya";
		System.out.println(name.charAt(4));
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
