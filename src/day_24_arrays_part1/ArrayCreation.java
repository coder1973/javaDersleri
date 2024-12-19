package day_24_arrays_part1;

import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) {
		int score1 = 85;
		int score2 = 85;
		int score3 = 85;
		int score4 = 85;
		int score5 = 85;
		
		int avgScore = (score1 + score2 + score3 + score3 + score4 + score5) / 5;
		System.out.println(avgScore);
		System.out.println("---------------------------------------");
		
		int[] scores = new int[5];
		scores[0] = 80;
		scores[1] = 85;
		scores[2] = 90;
		scores[3] = 95;
		scores[4] = 100;
			
		int aveScore2 = (scores[0] + scores[1] + scores[2] + scores[3] + scores[4])/5;
		System.out.println(aveScore2);
		
		//Option_1 
		int[] numbers;
		numbers = new int[3];
		
		//Option_3
		int[] numbers1 = new int[4];
		float[] temp = new float[100];
		char[] letters = new char[40];
		long[] units = new long[50];	
		String words[] = new String[5];
		
		numbers[0] = 5;
		
		System.out.println(numbers[2]);
		System.out.println(numbers[0]);
		System.out.println(temp[82]);
		System.out.println(units[49]);
		System.out.println(words[4]);
		
		
		
	}

}
