package AllTest;

public class TestWork {
	public static void p1() {
	p2();
	}
	public static void p2() {
		p3();
	}
    public static void p3() {
    	try {
			String name = "prachi";
			System.out.println(name.charAt(3));
		} catch (Exception e) {
			System.out.println(e);
		}
    }


public static void main(String[] args) {
	p1();
}
}
