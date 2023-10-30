package in.com.ExceptionHandling;

public class TestLoginException {
public static void main(String[] args) {
	String name = "prachi";
	if (name.equals("prachi")) {
		System.out.println("valide user input");
	}
	else {
		LoginException e = new LoginException();
		try {
			 throw e;
		} catch (Exception e2) {
			System.out.println(e);
		}
		
	}	}
}
