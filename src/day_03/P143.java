package day_03;

import java.util.Scanner;

public class P143 {

	public static void main(String[] args){
		
		//점수를 입력 받아서 학점처리하는 
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		char grade = ' ';
		
		System.out.println("your score : (0<score<100)");
		//score = scanner.nextInt();
		//scanner.nextLine();
		
		score = Integer.parseInt(scanner.nextLine());
		
		if(score >100 || score <0){
			
			System.out.println("잘못된 정보입니다.");
			System.out.println("프로그램 종료합니다");
			
			return; //  러턴을 해야함 !
		}
		
		if(score>=90){
			grade = 'A';
		}else if(score >=80){
			grade = 'B';
		}else if(score>=60){
			grade = 'C';
			
		}else if(score >=50){
			grade = 'D';
				
		
		}else
		{
			grade = 'F';
		}
		
		System.out.println(grade);
	}
}
