package day_03;

import java.util.Scanner;

public class P143 {

	public static void main(String[] args){
		
		//������ �Է� �޾Ƽ� ����ó���ϴ� 
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		char grade = ' ';
		
		System.out.println("your score : (0<score<100)");
		//score = scanner.nextInt();
		//scanner.nextLine();
		
		score = Integer.parseInt(scanner.nextLine());
		
		if(score >100 || score <0){
			
			System.out.println("�߸��� �����Դϴ�.");
			System.out.println("���α׷� �����մϴ�");
			
			return; //  ������ �ؾ��� !
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
