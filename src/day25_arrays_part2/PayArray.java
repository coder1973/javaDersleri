package day25_arrays_part2;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {
/*This program stores in an array the hours worked for by 5 employees 
who all make the some hourly display their gross pay*/
		
		final int EMPLOEES = 5;
		double payRate;
		double grossPay;
		
		//Create a scanner object for input 
		Scanner sc = new Scanner(System.in);
		
		//create an array to hold employee hours
		int[] hours = new int[EMPLOEES];
		
		//Get the hours worked by each employee
		System.out.println("Enter the hours worked by " + EMPLOEES + " employees who all earn the same hourly wage");
		for (int i = 0; i < EMPLOEES; i++) {
			hours[i] = sc.nextInt();
		} 
		
		//Get the hourly pay rate
		System.out.println("Enter the hourly rate for each employee: ");
		payRate = sc.nextDouble();
		
		//display each employee's gross pay
		
		for (int i = 0; i < EMPLOEES; i++) {
			
			grossPay = hours[i] * payRate;
			System.out.println("Employee #" + (i+1) + ": $" + grossPay);
			
		}

	}

}
