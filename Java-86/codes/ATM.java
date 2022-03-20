import java.util.Scanner;
class ATM 
{
	public static void main(String[] args) 
	{
		Bank bank;

		Scanner sc = new Scanner(System.in);

		System.out.print("which Bank's card is this[1.SBI |2.ICICI]: ");
		int cardType = sc.nextInt();

		switch(cardType){
			case 1:
				bank = new SBI();
				break;
			case 2:
				bank = new ICICI();
				break;
			default:
				System.out.println("CARD READ ERROR");
				sc.close();
				return;
		} //switch

		System.out.println();
		System.out.println("========================================");
		System.out.println("\t\tWELCOME TO "+bank.getClass().getName().toUpperCase());
		System.out.println("========================================");

		bank.deposit(1000);
		bank.withdraw(500);

		System.out.println(bank.n);
		System.out.println(Bank.n);
		System.out.println(SBI.n);
		System.out.println(ICICI.n);

		//bank.n=10; // error: cannot assign a value to final variable n
	}
}
