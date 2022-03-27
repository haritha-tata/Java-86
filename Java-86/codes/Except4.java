class Except4 
{
	public static void main(String[] args) 
	{
       try{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		int res = x / y;

		System.out.println(x + " / " + y + " = " + res);
	   }
	   catch(ArithmeticException ex){
			System.out.println("cannot divide a number by zero");
	   }
	   System.out.println("--- done ---");
	}
}
