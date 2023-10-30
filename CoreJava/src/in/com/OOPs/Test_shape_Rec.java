package in.com.OOPs;

public class Test_shape_Rec {
public static void main(String[] args) {
	Shape s = new Shape();
	s.setBorderwidth(90);
	s.setColor("Black");
	
	System.out.println(s.getBorderwidth());
	System.out.println(s.getBorderwidth());
	
	Rectengle r = new Rectengle();
	r.setLength(100);
	r.setWidth(90);
	r.setBorderwidth(92);
	r.setColor("Blue");
	
	System.out.println(r.getLength());
	System.out.println(r.getWidth());
	System.out.println(r.getBorderwidth());
	System.out.println(r.getColor());
}
}
