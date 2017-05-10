package day_04;

import java.util.Arrays;

public class p205 {

	public static void main(String[] args) {
		String[] str01 = new String[5];
		str01[0] = "Hello";
		str01[1] = "Hello~";
		str01[2] = "Hello~~";
		str01[3] = "Hello~~~";
		//str01[4] = "Hello~~~~";
		
		System.out.println(Arrays.toString(str01));
		
		for(String data:str01) {
			if(data != null)
				System.out.println(data.charAt(0));
		}
		
	}

}