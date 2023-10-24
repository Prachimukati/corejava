package in.com.Cloning;

public class TestMark {
public static void main(String[] args) throws CloneNotSupportedException {
	Marksheet m1 = new Marksheet();
	m1.num = 29;
	
	Marksheet m2=(Marksheet)m1.clone();
	m2.num = 60;
	System.out.println(m1.num+" ");
	System.out.println(m2.num+" ");
}
}
