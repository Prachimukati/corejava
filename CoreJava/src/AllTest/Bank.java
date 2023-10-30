package AllTest;

public class Bank implements Comparable<Bank>{

	public int Bank_id =0;
	public String Bank_name = null;
	public String Bank_address = null;
	public Bank(int Bank_id , String Bank_name , String Bank_address) {
		this.Bank_id = Bank_id;
		this.Bank_name = Bank_name;
		this.Bank_address = Bank_address;
	}
	@Override
	public int compareTo(Bank o) {
		
		return this.Bank_id - o.Bank_id;
	}
	@Override
	public String toString() {
		
		return Bank_id + " " + Bank_name + " " +Bank_address;
	}
}
//COMPARABLE