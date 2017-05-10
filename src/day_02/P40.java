package day_02;

import java.util.Date;
import java.util.Scanner;

//import java.sql.Date; 이렇게 같은이름의 두가지 기능을 쓸려면 안된다 인식을 실패한다.
//그래서 자주쓰는 페키지를 사용하고 나머지는 선언해준다.
// ex  java.util.Date ..... java.sql.Date



public class P40 {

	public static void main(String[] args) {
		
		int n  = Integer.parseInt("9"); //문자열의 수를 인트형으로 바꾸기위해서 Integer.parseInt를 사용한다.
		
		
		
		java.lang.String msg  = new String("hello"); //string은 java.lang이 생략되어있음
		String name  = "ji sung park";
		
		java.util.Date today = new Date();  // 다른 패키지 자원을 쓰기위해 선언을 한다.
										 
		System.out.println(today);
		
		String ms ;
		Scanner scanner = new Scanner(System.in); //키보드로 읽어드린다 System.in
		System.out.print("이름을 입력하세요 : ");
		ms = scanner.nextLine(); //입력대기 상태
		System.out.println("당신의 이름은 : " + ms);
		
		System.out.println("당신의 나이는 ? ");
		
		int age = scanner.nextInt();
		scanner.nextLine();  //입력대기상태 
		
		
		//scanner.nextLine은 String Type 
		
		System.out.println("당신의 나이는 : "+ age);
		
		System.out.print("가족 수를 입력해주세요 ? (ex : 5)");
		int count = scanner.nextInt();  //string을 알아서 int형으러 변환해서 저장한다.
		scanner.nextLine();
		scanner.close();  
		/*
		 * 스캐너를 사용해서 객채를 생성하고 만든다. 그리고 사용다하고나서 
		 * 모든것을 처리 종요를위해 scanner.next(); - 엔터키 입력까지 같이 처리
		 * scanner.close(); 모든 스캔어어 명령받은거를 종료한다.
		 */
		
		System.out.printf("입력 정보 : %s, %d, %d", ms, age, count);
		

	}

}
