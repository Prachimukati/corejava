package in.com.inheritance;

public class TestAnimalCat {
public static void main(String[] args) {
	Animal a = new Animal();
	a.makeSound();
	
	cat c = new cat();
	c.bark();
	c.makeSound();
}
}

