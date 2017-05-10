package day_05;

import java.util.Arrays;

public class p218 {
	public static void main(String[] args) {
		String[] name = {"È«±æµ¿", "±è±æµ¿", "Àå±æµ¿", "Á¤±æµ¿"};
		int[][] n = { {97, 82, 53, 74, 85}, 
					  {43, 74, 95, 96, 77},
					  {100, 98, 97, 96, 91},
					  {77, 77, 58, 75, 48} };
		
		for(int i=0; i<n.length; i++) 
			System.out.println(Arrays.toString(n[i]));
		
		System.out.println("=======================");
		
		for(int i=0; i<n.length; i++) {
			int sum = 0;
			for(int j=0; j<n[i].length; j++){
				sum += n[i][j];
			}
			System.out.println(name[i] + " Æò±Õ: " + sum/n[i].length);
		}
		
	}
		
}
