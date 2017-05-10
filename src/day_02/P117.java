package day_02;

import java.util.Scanner;

public class P117 {

	public static void main(String[] args) {
		
		//ch 변수의 문자값이 숫자 (0~9)인지  아닌지 판별하는 기능
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자를 입력해 주세요 : ");
		
		String data = scanner.nextLine();
		char ch = data.charAt(0);
		
		
		//System.out.println((int)'0' +"  "+ (int)'9'); 조건 판별하기위해 필요한 구문
		System.out.println(ch+ "숫자?"+ ('0'<= ch && ch <= '9'));
		
		String result = ('0'<= ch && ch <='9'?"O":"X");
		
		//System.out.println(ch + result);  //+은 정수연산을하기 때문에 다른 방법으로 해야한다.
		
		
		System.out.println(""+ ch +" "+ result); // 머지작업으로 스트링타입으로 연산한다.
		
	
			System.out.println(ch);
			System.out.println( "isDigit? : " +Character.isDigit(ch));  //위에 연산자를 사용해서 만는 기능을 하는 메소드 Charater.isDigit();
	*/
			int num = Integer.parseInt("8") ;
			int n =3;
			/*
			 System.out.printf("%d   %s%n",num, Integer.toBinaryString(num));
			 System.out.printf("%d   %s%n",n, Integer.toBinaryString(n));
			 
			 System.out.printf("%d   %s%n",num|n, Integer.toBinaryString(num|n)); //비트연산자

			 */
			
			System.out.printf("%3d   %s%n",num, Integer.toBinaryString(num));
			System.out.printf("%3d   %s%n",num<<1, Integer.toBinaryString(num));
			System.out.printf("%3d   %s%n",num>>1, Integer.toBinaryString(num));
			

	
	}
	
	
	
	

}
