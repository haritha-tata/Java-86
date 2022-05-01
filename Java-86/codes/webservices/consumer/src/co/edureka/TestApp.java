package co.edureka;

import co.edureka.services.Nums;
import co.edureka.services.NumsServiceLocator;

public class TestApp {

	public static void main(String[] args) throws Exception {
		NumsServiceLocator locator = new NumsServiceLocator();
		
		Nums nums = locator.getNums();
		
		System.out.println("Sum = " + nums.add(10, 20));
		System.out.println("Diff = " + nums.sub(10.5f, 20.3f));
	}
}
