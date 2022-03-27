class Except6
{
	public static void main(String[] args) 
	{
       try{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		int res = x / y;

		System.out.println(x + " / " + y + " = " + res);
	   }
	   catch(Exception ex){
			System.out.println("inside catch block");
			System.out.println("message = " + ex.getMessage());
			System.out.println("toString() = " + ex.toString()); //exception type + message
			System.out.println();
			ex.printStackTrace(); //toString() + callstack
	   }

	   System.out.println("--- done ---");
	}
}
