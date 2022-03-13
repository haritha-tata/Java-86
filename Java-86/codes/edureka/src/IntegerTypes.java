
public class IntegerTypes {

	public static void main(String[] args) {
		byte b = 127;
		//byte b = 128; //Type mismatch: cannot convert from int to byte
		System.out.println(b);
		
		System.out.println("max value of int type = " + Integer.MAX_VALUE); //2147483647
		System.out.println("max value of long type = " + Long.MAX_VALUE);
		
		//long pop = 2147483647;
		long pop = 2147483648L;
		System.out.println("World Population = " + pop);
		
		//int n =12;
		int n = (int)12L;
		System.out.println(n);
	}

}
