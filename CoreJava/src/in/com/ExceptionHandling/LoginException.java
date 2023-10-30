package in.com.ExceptionHandling;

public class LoginException extends RuntimeException{

	public LoginException() {
		
		super("invalide syntax please check ypur syntax");
	}
}