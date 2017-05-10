package day_01;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) // (매개변수)  
	{
		//키보드로 부터 영문장을 입력받는다 .
		//그 문장을 모두 대문자로 바꾸고  앞뒤 순서를 바꾸다 .
		
		String input  = null;
		Scanner scanner= new Scanner(System.in);

		System.out.println("문자열을 입력해주세요  :  ");
		
		input = scanner.nextLine();
		String data = input.toUpperCase();
		
		//System.out.println(data);
		//System.out.println(data.length());
		
		
		
	  for( int idx = data.length()-1;idx>=0  ;idx-- ){
		  System.out.print(data.charAt(idx));
		  
	  }
		
		
	}
}
