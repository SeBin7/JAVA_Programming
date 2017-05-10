package day_05;

import java.util.Arrays;

public class Review {
	//변수 데이터(=특성)  =>  Member field
	//메소드 = 함수 = Function  =>  Member Method
	public static void main(String[] args) {
		int num = 0;
		boolean flag = true;
		char grade = 'A';
		double d = 99.7;
		//String name = "홍길동";
		//char cc = name.charAt(1);
		//int size = name.length();
		
		//String name = args[0];
		//char cc = name.charAt(0);
		//System.out.println(cc);
		
		int[] n = null;
		n = new int[6];
		
		for(int i=0; i<6; i++) {
			n[i] = (int) (Math.random()*45) + 1;
		}
		
		int[] src = new int[n.length];
		System.arraycopy(n, 0, src, 0, n.length);
		
		//n sort
		int temp = 0;
		for(int i=0; i<n.length-1; i++) {
			for(int j=i+1; j<n.length; j++) {
				if(n[i] > n[j]) {
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
					
			}
		}
		
		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.toString(src));
		
	}

}
