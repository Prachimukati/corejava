package in.com.OOPs;

public class Test_Circle_shape {
public static void main(String[] args) {
	Shape s = new Shape();
	s.setBorderwidth(99);
	s.setColor("Black");
	
	
	System.out.println(s.getBorderwidth());
	System.out.println(s.getColor());
	
	Circle c = new Circle();
	c.setRadius(98);
	c.setBorderwidth(67);
	c.setColor("pink");
	c.area();
	
	System.out.println(c.getBorderwidth());
	System.out.println(c.getColor());
	System.out.println(c.getRadius());
}
}
