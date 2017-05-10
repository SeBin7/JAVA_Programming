package day_05;

import java.util.Arrays;

public class p215 {
	public static void main(String[] args) {
		int[] n = new int[6];
		int[][] nn = new int[5][5];
		nn[2][2] = 10;
		System.out.println(nn[2][2]);
		
		for(int i=0; i<nn.length; i++) {
			for(int j=0; j<nn.length; j++) {
				System.out.print(nn[i][j] + ",");
			}
			System.out.println();
		}
		
		System.out.println("====이차원 배열 출력====");
		
		for(int i=0; i<nn.length; i++) {
			System.out.println(Arrays.toString(nn[i]));
		}
		
		
	}
}
