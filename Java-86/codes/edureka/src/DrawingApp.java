import java.util.Scanner;

public class DrawingApp {

	public static void main(String[] args) {
		Shape sh;
		Scanner sc = new Scanner(System.in);
		//sh = new Shape(); //Cannot instantiate the type Shape
		
		System.out.print("type of shape[1.Rectangle | 2.Circle]: ");
		int shapeType = sc.nextInt();
		
		switch(shapeType) {
		  case 1:
			sh = new Rectangle("Blue", 15,8);  
			break;
		  case 2:
			sh = new Circle("Yellow", 15.25f);  
			break;			
          default:
        	  sc.close();
        	  System.out.println("INVALID SHAPE SELECTED");
        	  return;
		}//switch
		
		System.out.println("$$$--- TYPE OF SHAPE :: "+sh.getClass().getName().toUpperCase()+" ---$$$");
		System.out.println("Color of "+sh.getClass().getName().toUpperCase()+" = " + sh.getColor());
		sh.setColor("Red");
		sh.area();
	}

}
