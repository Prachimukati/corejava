package in.com.inheritance;

public class Testsr {
public static void main(String[] args) {
	Shape s = new Shape();
	s.setBorderwidth(10);
	s.setColor("black");
	
	System.out.println(s.getBorderwidth());
	System.out.println(s.getColor());
	
	Rectangle r = new Rectangle();
	r.setLength(50);
	r.setwidth(25);
	//r.setBorderwidth(40);
	//r.setColor("blue");
	
	System.out.println(r.getLength());
	System.out.println(r.getWidth());
	//System.out.println(r.getBorderwidth());
	//System.out.println(r.getColor());
}
}
