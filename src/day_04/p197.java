package day_04;

import java.util.Arrays;

public class p197 {

	public static void main(String[] args) {
		int[] num = {55, 64, 56, 76, 98, 83, 33};
		int[] src = new int[num.length];
		System.arraycopy(num, 0, src, 0, num.length);
		int min = num[0], max = num[0];
		
		for(int i=0; i<num.length; i++) {
			if(num[i] < min)
				min = num[i];
			if(num[i] > max)
				max = num[i];
		}
		
		System.out.printf("min = %d, max = %d", min, max);
		
		int temp;
		for(int i=0; i<num.length-1; i++) {
			temp = num[i];
			for(int j=i+1; j<num.length; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			//num[i] = temp;
		}
		
		System.out.println();
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(num));
	}

}
