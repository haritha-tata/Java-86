
public class ArrayInitialization1 {

	public static void main(String[] args) {
		int[][] n = {{1,2,3}, {4,5,6,7}, {8,9}};
		
		System.out.println("size of array = " + n.length);
		
		for(int i=0; i<n.length; i++) {
			System.out.println("size of n["+i+"] = " + n[i].length);
		}
		System.out.println();
		
		/*--- array iteration in a matrix form ---*/
		for(int[] x : n) {
			for(int y : x) {
				System.out.print(y+"\t");
			}
			System.out.println();
		}

	}

}
