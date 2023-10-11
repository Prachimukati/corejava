package in.com.Encaptulation1;

public class Tests {
public static void main(String[] args) {
	Shape s = new Shape();
	s.setBorderwidth(100);
	s.setColor("blue");
	
	System.out.println(s.getBorderwidth());
	System.out.println(s.getColor());
}

}
