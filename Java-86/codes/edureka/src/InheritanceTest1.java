class A2{
	A2(int n){
		//super();
		System.out.println("inside A2 constructor");
	}
}

class B2 extends A2{

	public B2() {
		super(10);
		System.out.println("inside B2 constructor");
	}
	
}

public class InheritanceTest1 {

	public static void main(String[] args) {
		B2 obj = new B2();
	}

}
