package in.com.Interface;

import java.util.Scanner;

public interface Client {

	void input();
	void output();
}
 class Raju implements Client {

	 String name ;
	 double salary;
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("User name = ");
		name = sc.nextLine();
		
		System.out.println("User salary = ");
		salary = sc.nextDouble();
		
	}

	public void output() {
		System.out.println(name + " " + salary);
	}
	 public static void main(String[] args) {
		Client c = new Raju();
		c.input();
		c.output();
	}
 }
