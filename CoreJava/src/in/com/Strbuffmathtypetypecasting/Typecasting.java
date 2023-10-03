package in.com.Strbuffmathtypetypecasting;

public class Typecasting {
public static void main(String[] args) {
	
	// int --> double ;
	//implict;
	
	int a = 10;
	double b = a ;
	System.out.println(b);
	
	// double --> int;
	//Explicit ;
	
	double c = 100;
	int d = (int) c;
	System.out.println(d);
	
	// int --> float;
	
	int e = 20;
	float f = e;
	System.out.println(f);
	
	// float --> int
	
	float g = 200;
	int h = (int) g;
	System.out.println(h);
	
	//int --> long ;
	
	int i = 30 ;
	long j= (long) i;
	System.out.println(j);
	
	//long --> int
	
	long k = 300;
	int l = (int) k;
	System.out.println(l);
}
}
