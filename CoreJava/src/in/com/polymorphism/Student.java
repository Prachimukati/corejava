package in.com.polymorphism;

public class Student { // COMPILE TIME POLY
	public void read() {
		System.out.println("Student reading book");
	}
	public void read(String bookname) {
		System.out.println("Student reading book "+ bookname);
	}
	public void read( String writer , int rate) {
		System.out.println(writer);
		System.out.println(rate);
	}
}
