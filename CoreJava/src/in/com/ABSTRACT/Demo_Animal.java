package in.com.ABSTRACT;

public class Demo_Animal {
public static void main(String[] args) {
	Dog d = new Dog();
	d.sound();
	
	Lion l = new Lion();
	l.sound();
	
	Animal a = new Animal() {
	@Override
	public void sound() {
		System.out.println("All animals____________");
	}
};
    a.sound();
}
}
