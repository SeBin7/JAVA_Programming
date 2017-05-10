package day_04;

import java.util.Arrays;

public class p195 {

	public static void main(String[] args) {
		int[] num = {1, 22, 33, 6, 43, 40};
		
		System.out.println(Arrays.toString(num));
		
		String[] name = {"È«±æµ¿", "¼º¼¼ºó", "ÂêÀ§", "´ÙÇö", "¼öÁö"};
		
		System.out.println(Arrays.toString(name));
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i].charAt(0) + "¾¾ \t");
		}
		
		System.out.println();
		
		char[] abc = {'a', 'b', 'c'};
		char[] n = {'0', '1', '2', '3', '4'};
		
		System.out.println(Arrays.toString(abc));
		System.out.println(Arrays.toString(n));
		
		char[] c = new char[abc.length + n.length];
		
		System.arraycopy(abc, 0, c, 0, abc.length);
		System.arraycopy(n, 0, c, 3, n.length);
		System.out.println(Arrays.toString(c));
		
	}

}
