package day_01;

public class DataType {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		boolean flag = true;   // c언어와는 다르게 0과 1은 사용이 안된다 .
		char c = 'a';  //단일형 
		String s = "aa";  //문자열은 대문자 String
		
		byte money = 100;
		float f = (float)5.5;  //casting
		 double d = 8.8f;   //promotion
		 
		 d= money; // 컴퓨터는 = 을 기준으로 타입 검사부터한다.
		 
		 byte b1 =127, b2 = 1, b3;
		 System.out.println("===========");  //println - ln = /n
		 System.out.println(b2);
		 System.out.println(10/4+"  /t  "+10/4.);
		 System.out.println(10/4+"  /n "+10/4.);
		 
		 //b3 = b1 - b2;  //산술연산의 값은 무조건 int
		 char a = '8';
		 String name = "oh se june";   //Referce type 
		 String name1= new  String("sejun oh"); //하드에 스트링 클래스를 메모리에 올리세요 = 클래스 
		 System.out.println(name);
		 System.out.println(name.toUpperCase()); // toUpperCase 대문자로 바꿔지는 기능 String class에서  참종해온다.
		 System.out.println("Byte 최대값 : "+Byte.MAX_VALUE);
		 System.out.println((char)97); //아스키코드로  구분가능하다 
		 System.out.println(a +"숫자?" + Character.isDigit(a));  //캐릭터인지 참인지 거짓인지
		 
		 
		 System.out.println(); 
	}

}
