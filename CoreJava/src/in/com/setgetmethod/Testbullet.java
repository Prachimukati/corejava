package in.com.setgetmethod;

public class Testbullet {
public static void main(String[] args) {
	PrintBullet b = new PrintBullet();
	b.color = "black";
	b.company = "royal enfield";
	b.price =200000;		
	
	b.printColor();
	b.printCompany();
	b.printPrice();
}
}
