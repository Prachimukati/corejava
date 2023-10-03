package in.com.polymorphism;

public class Testpoly {
public static void main(String[] args) {
	Shape [] s = new Shape [3];
	s[0] = new Rectangle();
	s[1] = new Circle();
	s[2] =new Triangle();
	
	Rectangle r = (Rectangle) s[0];
	r.setLength(10);
	r.setWidth(20);
	r.area();
	
	Circle c = (Circle) s[1];
	c.setRadius(60);
	c.area();
	
	Triangle t = (Triangle) s[2];
	t.setHeight(30);
	t.setBase(40);
	t.area();
	
	}
}
