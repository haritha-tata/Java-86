package co.edureka;
import static java.lang.Math.*;
import static java.lang.System.out;

public class MathTest {

	public static void main(String[] args) {
		out.println(E);
		out.println(PI);
		
		out.println(sin(0));
		out.println(cos(0));
		System.out.println(sqrt(25));
		
		System.out.println(max(10, 20));
		System.out.println(min(10, 20));
		
		System.out.println(floor(10.4)); //10.0
		System.out.println(ceil(10.4)); //11.0
		
		double d = random(); 
		System.out.println(d);
		
		int otp = (int)(d*10000);
		System.out.println("OTP = " + otp);
	}

}
