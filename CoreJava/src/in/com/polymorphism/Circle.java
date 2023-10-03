package in.com.polymorphism;

public class Circle extends Shape {
	private int radius ;
	public static final double PI = 3.14;
	
	public void setRadius(int radius ) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius ;
	}
	public void area() {
		double carea = PI * getRadius() * getRadius();
		System.out.println("Circle area =" + carea);
	}
	 
	}

