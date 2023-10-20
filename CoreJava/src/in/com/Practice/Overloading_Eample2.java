package in.com.Practice;
class Adder1{
	// same method name but differ arg
	void add(int a, int b) {
		int c=a+b;
		System.out.println("Addition is"+c);
		
	}
	void add(double d,double e) {
		double h=d*e;
		System.out.println("Multiplication"+h);
		
	}
}

public class Overloading_Eample2 {

	public static void main(String[] args) {
		Adder1 a=new Adder1();
		a.add(10, 20);
		//a.add(54, 45);
		a.add(10.2,5.5 );
		

	}

}
