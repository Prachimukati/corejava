package in.com.Interface;

public class Mennager implements Bank , Passbook {
public static void main(String[] args) {
	Bank b = new Mennager();
	b.giveloan();
	
	Passbook p = new Mennager();
	p.toPublic();
}

	@Override
	public void toPublic() {
		System.out.println("give it to public");
		
	}

	@Override
	public void giveloan() {
		System.out.println("give to the customers");
	}

}
