package in.com.setgetmethod;

public class Testshap {
public static void main(String[] args) {
	Shape s = new Shape();
	s.setBorderwidth(100);
	s.setColor("blue");
	
	System.out.println(s.getBorderwidth());
	System.out.println(s.getColor());
}
}
