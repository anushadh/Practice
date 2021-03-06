package dataStructures;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		//Initializing arrays
		int[] numbers = {0, 1, 2, 3};
		int[] numbers2 = new int[5];
		
		//Find length of array
		System.out.println(numbers.length);
		System.out.println(numbers2.length);
		
		//Accessing elements in array
		int value = numbers[0];
		System.out.println("Value: " + value);
		
		//Modify elements in array
		numbers[2] = value;
		
		//Iterare over an array
		for(int i = 0; i < numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}
		
		for(int i : numbers) {
			System.out.println(i);
		}
		
		//Sort an array
		Arrays.sort(numbers);
		
		
	}

}
