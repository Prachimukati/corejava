package in.com.OOPs;

public class Shape1 {

	 private String color;
	 private int borderwidth;
	 
	 public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	 public int getBorderwidth() {
		return borderwidth;
	}
	 public void setColor(String color) {
		this.color = color;
	}
	 public String getColor() {
		return color;
	}
	 public void area() {
		 System.out.println("Shape area");
	 }
}
