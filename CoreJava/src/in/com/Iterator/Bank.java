package in.com.Iterator;

public class Bank {
  public int bank_id;
  public String bank_name;
  public Bank(int bank_id,String bank_name) {
	this.bank_id=bank_id;
	this.bank_name=bank_name;
}
  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return bank_id+" "+bank_name;
	}

}
