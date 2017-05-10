package day_03;

import java.util.Scanner;

public class P146 {

	public static void main(String[] args) {
		
		
		
		int score = 0 ;
		char grade = ' ';
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 당신의 점수를 입력해보세요 : ");
		String tmp =  scanner.nextLine();

		score = Integer.parseInt(tmp);
		
		switch(score/10){
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8 :
		case 7 : 
			grade = 'B';
			break;
		case 6 :
			grade = 'C';
			break;
		case 5 : 
			grade = 'D';
			break;
			
			default : 
				grade = 'F';
				break;
		}
		
		System.out.println("당신의 점수는 : "+ grade);
		
		
		System.out.println("===========end=============");
		
		
		//난수 발생 
		
		int number = (int)(Math.random()*10)+1;
		System.out.println(number);
		
		
		
		
		
		
		/*
		 * char c = 'F';
		switch(c){  //  조건문 : int 타입으로 프로모션이 가능한 타입 int, String
		case 'A' : 
			System.out.println("아주훌륭합니다");
			break;
		case 'F' : 
			System.out.println("시험공부안하고 뭐했냐 ?");
			break;
		default : 
			System.out.println("제대로 입력해라 !");
			break;
		
		}
		*/
	}

}
