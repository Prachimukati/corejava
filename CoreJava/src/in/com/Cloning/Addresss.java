package in.com.Cloning;

public class Addresss implements Cloneable{
	int address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
