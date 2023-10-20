package in.com.Practice;

class Driver{
	void sellary( int a , int b) {
		System.out.println(a + " " + b);
	}
	void sellary(int c , int d , int e) {
	System.out.println( c + " " + d + " " + e);	
	}
}

public class Car {
public static void main(String[] args) {
	Driver d = new Driver();
	d.sellary(8000, 5000);
	d.sellary(2000,6000, 8000);
}
}
