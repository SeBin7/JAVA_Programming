package day_04;

import java.util.Arrays;

public class p186 {

	public static void main(String[] args) {
		int[] num = new int[8];
		int[] num2 = new int[num.length*2];
		int[] num3 = new int[num.length*3];
		
		for(int i=0; i<num.length; i++){
			num[i] = i+1;
		}

		for(int i=0; i<num.length; i++) {
			num2[i] = num[i];
		}
		
		System.arraycopy(num, 0, num3, 2, num.length);
		
		System.out.println("num: " + Arrays.toString(num));
		System.out.println("num2: " + Arrays.toString(num2));
		System.out.println("num3: " + Arrays.toString(num3));
		

	}

}
