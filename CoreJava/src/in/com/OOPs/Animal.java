package in.com.OOPs;

abstract class Animal {

	public abstract void sound();
	
}
class Dog extends Animal{
	
	public void sound() {
		System.out.println("Dog is barking");
	}
}
class Lion extends Animal {
	public void sound() {
		System.out.println("Lion is Shouting ");
	}
}
