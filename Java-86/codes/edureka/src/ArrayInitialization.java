import java.util.Arrays;

public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {92,76,83,71,93,82};
		
		System.out.println("No of Subjects = " + marks.length + "\n");
		
		/*--- array iteration using for loop ---*/
		for(int i=0; i<marks.length; i++) {
			System.out.println("mark for subject-"+(i+1)+" = " + marks[i]);
		}
		System.out.println();
		
		/*--- array iteration using enhanced for loop ---*/
		System.out.print("marks obtained ----> ");
		for(int mark : marks) {
			System.out.print(mark + " | ");
		}
		System.out.println();
		
		/*--- to sort array ---*/
		Arrays.sort(marks);
		System.out.println(Arrays.toString(marks));
		
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}

}
