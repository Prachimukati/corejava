package in.com.Practice;


class Bike{
	void run(int a,int b) {
		System.out.println("Bike class run method");
	}
}
public class Overriding_Example extends Bike {
 void run(int a,int b) {
	 System.out.println("run method is calling");
 }
	public static void main(String[] args) {
	//	new Overriding_Example().run();
		Bike b=new Overriding_Example();
		b.run(10,20);
		

	}

}
