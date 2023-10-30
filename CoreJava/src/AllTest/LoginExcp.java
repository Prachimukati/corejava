package AllTest;

class Exception extends RuntimeException{
	public Exception() {
		super(" Syntax Error ");
	}
}
public class LoginExcp {
public static void main(String[] args) {
	String name = "prachi";
	if (name.equals("prachi")) {
		System.out.println("valide user input");
	}
	else {
		Exception c = new Exception();
	
	try {
		throw c ;
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
}