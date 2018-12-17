package dataStructures;

/*In java 2d array(M*N) is the one which contains one dimensional array of M elements each of which has N element array
 * 
 * */

public class Array2D {

	public static void main(String[] args) {
		int[][] myArray = new int[3][4];
		printArray(myArray);
		
		int[][] myArray2 = new int[2][];
		myArray2[0] = new int[2];
		myArray2[1] = new int[] {1, 2, 3, 4};
		printArray(myArray2);
	}

	public static void printArray(int[][] array) {

		for(int m = 0; m < array.length; m++) {
			for(int n = 0; n < array[m].length; n++) {

				System.out.print(array[m][n] + " ");
			}
			System.out.println();
		}

	}

}
