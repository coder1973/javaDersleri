package day26_arrays_part3;

import java.util.Arrays;

public class task94_SearchResult {

	public static void main(String[] args) {
		String info1 = "This info is used xxxCD132Gxxx . Please do not share";
		String info2 = "This info is used xxx00ABC!xxx . Please do not share";
		
		String[] infoArray1 = info1.split("used");
		String[] infoArray2 = info2.split("used");
		
		String pass1 = infoArray1[1].split("used")[0];
		String pass2 = infoArray2[1].split("used")[0];
		
		pass1 = pass1.substring(4, 10).trim();
		pass2 = pass2.substring(4, 10).trim();
		
		System.out.println(pass1 + pass2);
		
		
			
//		System.out.println(Arrays.toString(infoArray1));
//      System.out.println(Arrays.toString(infoArray2));
//      System.out.println(infoArray1[1].substring(4, 10) + infoArray2[1].substring(4, 10));
	}

}
