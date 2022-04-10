package co.edureka.except;

public class ThrowsTest {

	public static void main(String[] args) throws Exception {
		System.out.println("Please wait for 5 seconds.....");
		try {
			Thread.sleep(5000); //5000 milliseconds
		}catch(Exception ex) {}
		System.out.println("--- thanks ----");
		
		System.out.println("please wait another 2 seconds ....");
		Thread.sleep(2000);
		System.out.println("thanks again");
	}

}
