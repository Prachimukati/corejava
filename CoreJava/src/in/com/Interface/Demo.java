package in.com.Interface;

public class Demo implements Firstinterface , Secondinterface {
public static void main(String[] args) {
	Firstinterface f = new Demo();
	f.Mymethod();
	
	Secondinterface s = new Demo();
	s.Othermethod();

}
@Override
public void Othermethod() {
	System.out.println("firstperson");
	
}

@Override
public void Mymethod() {
	System.out.println("second person");
	
}
}
