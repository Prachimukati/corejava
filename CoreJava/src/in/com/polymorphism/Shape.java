package in.com.polymorphism;

public class Shape { // POLYMORPHISM IN ARRAY
	private int borderwidth ;
	private String color;
	
	public void setBorwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void area () {
		System.out.println("this is area methopd!");
	}
}
