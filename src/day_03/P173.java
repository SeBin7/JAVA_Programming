package day_03;

import java.util.Scanner;

public class P173 {

	public static void main(String[] args) {
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100)+1;  //��ǻ�Ͱ� ���� 100�� ����
		
		Scanner scanner = new Scanner(System.in);
		
		while(input != answer){
			System.out.print("0~100������ ������ �Է��ϼ��� ! >> ");
			input = scanner.nextInt();
			scanner.nextLine();
			
			if(input > answer){
				System.out.println("�� ���� ���� �Է��Ͻÿ�");
			}else{
				
				
				System.out.println("���� �� ū ���� �Է��ϼ��� ");
				
			
			}
		}
	}
	
	
}


