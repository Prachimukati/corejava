package in.com.intewie;

public class Armstrong {//means a number which equals to 
	                   //the sum of the cube of its own digits;
public static void main(String[] args) {
	int a = 371;
	int b = 0;
	int c ;
	int d = a ;
	
	while (d>0) {
		c = d % 10;
		b = d + (c * c * c);
		d = d/10;
	}
	if( b == a) {
		System.out.println("yes it is asrmstrong number");
	}
	else {
		System.out.println("no its not armstrong number");
	}
}
}

