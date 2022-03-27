package co.edureka;

public class WrapperTest {

	public static void main(String[] args) {
		Integer i1 = new Integer(25);
		Integer i2 = new Integer("25");
		
		Integer i3 = Integer.valueOf(25);
		Integer i4 = Integer.valueOf("25");
		System.out.println(i1+" | " + i2+" | " +i3+" | " +i4 );
		
		Character c1 = new Character('A');
		Character c2 = Character.valueOf('A');
		System.out.println(c1+" | " +c2);
		
		Integer i = Integer.valueOf(26);
		byte b = i.byteValue();
		short s = i.shortValue();
		int n = i.intValue();
		long l = i.longValue();
		
		float f = i.floatValue();
		double d = i.doubleValue();
		
		System.out.println(b+" | " +s+" | " +n+" | " +l);
		System.out.println(f+" | " +d);
	}
}
