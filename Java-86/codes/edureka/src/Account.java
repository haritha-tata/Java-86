
public class Account {
	long acno;
	String name;
	float bal;
	
	public Account() {}

	public Account(long acno, String name, float bal) {
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}
	
	public void deposit(float amt) {
		if(amt > 0) {
			this.bal = this.bal + amt;
			System.out.println("Rs."+amt+" Credited || Balance: " + this.bal);
		}else {
			System.out.println("ERROR: INVALID AMOUNT");
		}
	}
	
	public void withdraw(float amt) {
		if(this.bal >= amt) {
			this.bal -= amt;
			System.out.println("Rs."+amt+" Debited || Balance: " + this.bal);
		}else {
			System.out.println("ERROR: INSUFFICIENT BALANCE");
		}
	}
	
	public void getDetails() {
		System.out.println("A/C No: "+this.acno + " | NAME: " + this.name + " | BALANCE: "+this.bal);
	}
}
