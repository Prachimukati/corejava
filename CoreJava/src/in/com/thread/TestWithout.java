package in.com.thread;

public class TestWithout {
public static void main(String[] args) {
	WithoutThread w1 = new WithoutThread("Queen");
	WithoutThread w2 = new WithoutThread("prachi");
	
	w1.run();
	w2.run();
	
}
}
