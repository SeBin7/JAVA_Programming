package day_01;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) // (�Ű�����)  
	{
		//Ű����� ���� �������� �Է¹޴´� .
		//�� ������ ��� �빮�ڷ� �ٲٰ�  �յ� ������ �ٲٴ� .
		
		String input  = null;
		Scanner scanner= new Scanner(System.in);

		System.out.println("���ڿ��� �Է����ּ���  :  ");
		
		input = scanner.nextLine();
		String data = input.toUpperCase();
		
		//System.out.println(data);
		//System.out.println(data.length());
		
		
		
	  for( int idx = data.length()-1;idx>=0  ;idx-- ){
		  System.out.print(data.charAt(idx));
		  
	  }
		
		
	}
}
