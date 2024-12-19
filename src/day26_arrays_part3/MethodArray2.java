package day26_arrays_part3;

import java.util.Scanner;

public class MethodArray2 {

	public static void main(String[] args) {
		
		System.out.println(findCar(2, "Honda"));
		

	}
	//createArray method - will accept one parameter which is car carSize
	//user will enter some cars
	public static String[] createArray(int carSize) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] carArray = new String[carSize];
		
		for (int i = 0; i < carArray.length; i++) {
			System.out.print("Enter your car: " + (i+1));
			carArray[i] = sc.next();
		}
		return carArray;
	}
	/*findCar method - will accept 2 parameters which one int value, toFindCar
	if car is found - return true
	if not return false*/
	public static boolean findCar(int value, String toFindCar) {
		
		for(String car : createArray(value)) {
			
			if(car.equalsIgnoreCase(toFindCar)) {
				return true;
			}
			
		}
		return false;
	}

}
