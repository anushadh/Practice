package dataStructures;
/*
In Java, the two-dimensional array is actually a one-dimensional array which contains M elements, each of which is an array of N integers.
Similar to the one-dimensional dynamic array, we can also define a dynamic two-dimensional array. Actually, it can be just a nested dynamic 
array. You can try it out by yourself.*/

import java.util.ArrayList;
import java.util.List;

public class ArrayList2D {
	
	public static void main(String args[]) {
		List<ArrayList> arrayList = new ArrayList<>();
		
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(1);
		marks.add(2);
		
		ArrayList<Integer> marks2 = new ArrayList<>();
		marks2.add(3);
		marks2.add(4);
		
		arrayList.add(marks);
		arrayList.add(marks2);
		
		for(ArrayList a : arrayList) {
			for(int i = 0; i < a.size(); i++) {
				System.out.print(a.get(i) + " ");
			}
			System.out.println();
		}
		
	}
	
}
