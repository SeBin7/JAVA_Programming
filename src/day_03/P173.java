package day_03;

import java.util.Scanner;

public class P173 {

	public static void main(String[] args) {
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100)+1;  //컴퓨터가 난수 100개 정의
		
		Scanner scanner = new Scanner(System.in);
		
		while(input != answer){
			System.out.print("0~100사이의 정수를 입력하세요 ! >> ");
			input = scanner.nextInt();
			scanner.nextLine();
			
			if(input > answer){
				System.out.println("더 작은 수를 입력하시오");
			}else{
				
				
				System.out.println("보다 더 큰 수를 입력하세요 ");
				
			
			}
		}
	}
	
	
}


