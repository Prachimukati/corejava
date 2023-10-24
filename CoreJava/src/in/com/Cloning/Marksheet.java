package in.com.Cloning;

public class Marksheet implements Cloneable{
	int  num ;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
