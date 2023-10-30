package in.com.POLYMORPHISMTEST;

public class A {           
                                    // METHOD OVERLOADING
	void add() {
		int a = 10;
		int b =20;
		int c = a+b;
		System.out.println(c);
	}
	void add(double d , int e) {
		
		double c = d*e;
		System.out.println(c);
	}
	void add(double a , float b) {
		
		double c = a/b;
		System.out.println(c);
	}
	
}
