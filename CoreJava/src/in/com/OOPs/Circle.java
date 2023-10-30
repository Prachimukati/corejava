package in.com.OOPs;

public class Circle extends Shape{

	private int radius;
	public static final double pi = 3.14;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	
	public void area() {
		double Carea = pi*radius*radius;
		System.out.println("Circle area ="+Carea);
	}
}
