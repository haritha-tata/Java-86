package co.edureka;

public class WrapperTest1 {

	public static void main(String[] args) {
		System.out.println("no of bytes for long type = " + Long.BYTES);
		System.out.println("size of long type = " + Long.SIZE+" bits");
		
		int n1 = 25; //primitive data
		Integer n2 = n1; //object type - boxing
		int n3 = n2; //primitive data - unboxing
		System.out.println(n1+" | " +n2+" | " +n3);
		
		String str = "125.45";
		float f = Float.parseFloat(str);
		System.out.println(f);
	}

}
