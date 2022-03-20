
public class StringMethods {

	public static void main(String[] args) {
		String str = "edureka limited";
		
		System.out.println("size = " + str.length());
		
		System.out.println("character @ index 0 = " + str.charAt(0));
		
		//System.out.println("character @ index 15 = " + str.charAt(15)); //java.lang.StringIndexOutOfBoundsException
		
		System.out.println("index of \"e\" = " + str.indexOf("e"));
		
		System.out.println("index of \"e\" from 1 = " + str.indexOf("e",1));
		
		System.out.println("index of \"lim\" = " + str.indexOf("lim"));
		
		System.out.println("index of \"ram\" = " + str.indexOf("ram")); //-1
		
		System.out.println("index of \"e\" from last = " + str.lastIndexOf("e"));
		
		String s1 = new String("edureka");
		String s2 = new String("edureka");
		
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.contentEquals(s2)); //true
		
		System.out.println("java".equals("Java"));
		System.out.println("java".equalsIgnoreCase("Java"));
		
		System.out.println(str.replace('e','*'));
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(str);
	}
}
