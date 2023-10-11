package in.com.Encaptulation1;

public class Circle {

	private int radius ;
	public static final double PI = 3.14;
	
	public void setradius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void area() {
		double Carea = PI * radius *radius; 
		System.out.println("Circle area " + Carea);
	}
	public void calculatearea() {
		double darea = PI * radius ;
		System.out.println("Circle area " + darea);
	}	
	
}
