import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a number: ");
		int num = sc.nextInt();
		
		int rem = num % 2;
		
		if(rem == 0)
			System.out.println(num + " is EVEN");
		else
			System.out.println(num + " is ODD");
		
		sc.close();
	}

}
