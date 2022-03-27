package co.edureka.except;
class Calculator{
  void divide(int x, int y) {
	  if(y == 0)
		  //throw new ArithmeticException();
		  throw new ArithmeticException("cannot divide an int by zero");
	  
	  int res = x/y;
	  System.out.println("result = " + res);
  }
}

public class ThrowTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try {
			//calc.divide(10, 2);
			calc.divide(10, 0);
		}catch(Exception ex) {
			System.out.println("message = " + ex.getMessage());
			System.out.println(ex.toString());
		}
	}
}
