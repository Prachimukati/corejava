package in.com.Abstractnam;

public class Testsrc {
public static void main(String[] args) {
	Shape s = new Shape();
	s.hello();


	Rectangle r = new Rectangle () {
		@Override
		public void Length() {
			System.out.println("this is rectangle area");
		}

};
r.area();
r.Length();
	
	Circle c = new Circle() {

		@Override
		public void radius() {
			System.out.println("this is circle radius");
		}
	};
	c.radius();
	}	
}