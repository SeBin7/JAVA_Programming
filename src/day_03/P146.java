package day_03;

import java.util.Scanner;

public class P146 {

	public static void main(String[] args) {
		
		
		
		int score = 0 ;
		char grade = ' ';
		Scanner scanner = new Scanner(System.in);
		System.out.println(" ����� ������ �Է��غ����� : ");
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
		
		System.out.println("����� ������ : "+ grade);
		
		
		System.out.println("===========end=============");
		
		
		//���� �߻� 
		
		int number = (int)(Math.random()*10)+1;
		System.out.println(number);
		
		
		
		
		
		
		/*
		 * char c = 'F';
		switch(c){  //  ���ǹ� : int Ÿ������ ���θ���� ������ Ÿ�� int, String
		case 'A' : 
			System.out.println("�����Ǹ��մϴ�");
			break;
		case 'F' : 
			System.out.println("������ξ��ϰ� ���߳� ?");
			break;
		default : 
			System.out.println("����� �Է��ض� !");
			break;
		
		}
		*/
	}

}
