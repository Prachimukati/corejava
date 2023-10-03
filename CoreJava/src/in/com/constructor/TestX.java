package in.com.constructor;

public class TestX {
public static void main(String[] args) {
	X r = new X();
	X r1 = new X(100);
	X r2 = new X( 20.00,"Maa");
	System.out.println(r.a+" " + r.b + " " + r.c);
	System.out.println(r1.a);
	System.out.println(r2.b + " " + r2.c);
}
}
