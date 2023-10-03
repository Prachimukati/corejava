package in.com.intewie;

public class Primenumber{//The number which is div by 1 & its own;
public static void main(String[] args) {
	int num = 13 ;
	int count = 0;
	for (int i = 2; i < num; i++) {
		if(num % i == 0) {
			count++;
		}
	}
	if(count == 0 ) {
		System.out.println("yes its prime number ");
	}else {
		System.out.println("not prime number");
	}
}
}
