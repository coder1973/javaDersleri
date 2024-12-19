package day24_arrays_part1;

import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		
		int[] myList = {1,2,3,4};
		
		String[] myArray = {"Apple", "Orange", "Watermelon"};
		
		System.out.println(myList[0]);
		System.out.println(myList[1]);
		System.out.println(myList[2]);
		System.out.println(myList[3]);
		System.out.println("myList.length: " + myList.length);
		System.out.println("myArray.length: " + myArray.length);
		
		for (int i = 0; i < myList.length;i++) {
			System.out.println(i + ": " + myList[i]);
			
		}
		
		int[] scores = {80, 90, 100, 35, 60, 72, 64, 30, 10, 5, 3, 99, 89, 80, 90, 100};
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			 sum += scores[i]; 
			
		}
		
		
		System.out.println("sum: " + sum);
		System.out.println("avarage: " + sum / scores.length);
		
		
		

	}

}
