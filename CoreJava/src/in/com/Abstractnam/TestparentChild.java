package in.com.Abstractnam;

public class TestparentChild {
public static void main(String[] args) {
	Parent p  = new Parent ();
	p.Sayhello();
	
	Child c = new Child() {
	@Override
	public void Saybyy() {
		System.out.println("Byy");
	}
	};
	c.Saybyy();
}
}
