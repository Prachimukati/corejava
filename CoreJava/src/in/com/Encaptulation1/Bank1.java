package in.com.Encaptulation1;

public class Bank1 {

	 int number ;
	 double balance;
	
	public void Bank(double balance , int number) {
		this.balance = balance;
		this.number = number;
		System.out.println("my account is "+number);
		System.out.println("my balance is "+balance);
		
	}//ENCAPTULATION
}
