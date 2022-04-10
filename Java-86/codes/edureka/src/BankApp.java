import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = null;

		while (true) {
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance");
			System.out.println("5. Exit");

			System.out.println("------------------------------------------------------");
			System.out.print("enter an option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			 case 1:
				if(acc == null) {
					System.out.print("enter a/c no: ");
					long acno = sc.nextLong();
					sc.nextLine();

					System.out.print("enter a/c holder's name: ");
					String name = sc.nextLine();

					System.out.print("enter initial deposit: ");
					float amount = sc.nextFloat();

					// --- create Account object
					acc = new Account(acno, name, amount);
					System.out.println("A/C OPENED ... WELCOME TO BANK!!!!");
				}else {
					System.out.println("###--- ACCOUNT IS ACTIVE WITH US --- PLEASE OPERATE ---###");
				}				 
				break;
			 case 2:
				if(acc != null) {
					System.out.print("enter amount to deposit: ");
					float amount = sc.nextFloat();
					acc.deposit(amount);						
				}else {
					System.out.println("###--- NO ACCOUNT WITH US ---###");
				}				 
				break;
			 case 3:
				if(acc != null) {
					System.out.println("enter amount to withdraw: ");
					float amount = sc.nextFloat();
					acc.withdraw(amount);
				}else {
					System.out.println("###--- NO ACCOUNT WITH US ---###");
				}				 
				break;
			 case 4:
				if(acc != null) {
					acc.getDetails();	
				}else {
					System.out.println("###--- NO ACCOUNT WITH US ---###");
				}
				break;
			 case 5:
				sc.close();				
				System.out.println("Application designed & developed by team@edureka");
				System.out.println("###--- BYE *** BYE ---###");
				System.exit(0); //to terminate application
				break;
			 default:
				System.out.println("$$$--- INVALID OPTION --- TRY AGAIN ---$$$"); 
				break;			
			}//switch
			System.out.println("======================================================");
		}//while

	}//main

}//class
