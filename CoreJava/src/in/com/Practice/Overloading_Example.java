package in.com.Practice;
// Method overloading by changing the number of arguments
class Adder{
   void	add(int a,int b){
	   int c=a+b;
		System.out.println(a+" "+b);
		System.out.println(c);
}
   void add(String s,String s1 ,int a) {
	   System.out.println(s+" "+s1+ a);
   }
}
public class Overloading_Example {

	public static void main(String[] args) {
		
			Adder a=new Adder();
			a.add("Deepanshi","Prachi" ,10);
			a.add(10, 20);
		}

	}


