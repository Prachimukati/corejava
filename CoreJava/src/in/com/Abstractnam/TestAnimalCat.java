package in.com.Abstractnam;

public class TestAnimalCat {
public static void main(String[] args) {
	Animal a = new Animal();
	a.Dog();
	
	Cat c = new Cat() {

	@Override
	public void kattle() {
		System.out.println("She want water");
		
	}
};
c.kattle();
c.Dog();
}
}