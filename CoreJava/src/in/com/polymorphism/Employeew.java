package in.com.polymorphism;
class Employee12 {
	
	 void Showdetail() {
		System.out.println("This is employee detail");
	}
}

class Developer extends Employee12{
		
	 void Showdetail() {
		 super.Showdetail();
		System.out.println("This is developer detail");
	}
	}

public class Employeew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee12 e=new Developer();
		e.Showdetail();

	}

}
