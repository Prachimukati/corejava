package in.com.Iterator;

public class Employe {

	private int  id = 0;
	private String address = null;
	private String name = null;
	
	public  Employe(int id ,String name , String address) {
		this.id = id;
		this.address = address;
		this.name = name;
	}
	@Override
	public String toString() {
		return id+ " " + name + " " + address;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Employe )) {
			return false;
	}
		Employe e = (Employe) obj;
		boolean b = this.id == e.id && this.name == e.name && this.address == e.address;
		return b;
}
	@Override
	public int hashCode() {
		String str = id + name + address;
		return str.hashCode();
	}
}
