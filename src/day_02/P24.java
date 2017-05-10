package day_02;

import org.omg.CORBA.INTERNAL;

public class P24 {

	public static void main(String[] args) 
	{
		int year = 0 ;
		System.out.println(year);
		year += 2000;
		System.out.println("year : " + year);  //문자열의 머지 작업은 성능 저하를 이르킨다 
		System.out.printf("year :  %d %n ", year);
		
		
		int x = 10 , y =90, temp = 0;
		System.out.println("x = "+x + "y = "+y);  //변수가 많아지면 헷갈리면서 기능저하의 역할이 일어난다,
		System.out.printf("x = %d y = %d %n",x, y);
		
		
		/*
		temp = x;
		x = y;
		y = x;
		*/  
		
		//두개의 변수 값을 바꾸고 싶을때에는 새로운 변수를 통해서  값을 바꾼다 .
		
		
		final double PI = 3.14159;  //final 상수화처리되어 수정 불가 
		System.out.printf("pi : %f %n", PI);
		System.out.printf("pi : %5.2f %n", PI);  //나타내고싶은 자리 수만큼 표현할수 있다.
		System.out.printf("pi : %5.3f %n", PI);  //자릿수가 넘어가면 반올림 한다.
		
		//36 EX
		int num = 10;
		
		System.out.printf(" num = %d %n", num);
		System.out.printf(" num = %o %n", num); //8진수
		System.out.printf(" num = %x %n", num); //16진수
		System.out.println("num을 2진수로 : "+Integer.toBinaryString(num)); //2진수 바꾸는 방법 스트링타입니다
		System.out.printf("2진수 바꾸기 : %s %n",Integer.toBinaryString(num)); //2진수 바꾸는 방법 스트링타입니다
		//Integer class의 기능을 가져와 사용한다.
		
		String msg = "Hello!!";
		System.out.printf("%s %n", msg);
		
		System.out.println("========main end========");
	}

}
