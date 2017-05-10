package day_02;

public class P95 {

	public static void main(String[] args) {

		int i= 5, j = 5;
		System.out.println(i++); 	
		System.out.println(++i);
		
		System.out.println("i="+i + "j="+j); 
		
		int b1 =10 , b2 = 30 , b3 = 0;
		int b4 =b1*(int)b2;
		
		char c1 ='a';
		char c2 =c1;
		char c3 = ' ';
		System.out.println(c1++);
		System.out.println(c1+1);  //연산을 하면서 int값으로 바꿔서 아스키코드값이 나옴
			//casting (char)(c1+1) 핸들링 
		System.out.println(c2);
		
		
		
		//104p
		
		char a1 = 'A';
		
		for(int k =0 ; k<26 ; k++)  //for 문  
		{
		
			System.out.println(a1++ +" : " + (int)a1);
		
		}
		
		char c = 'f';
		
		System.out.println((char)(c-32));
		System.out.printf("f = %c", (char)(c-32)); //scanner 핸들링하는 문제 생각해보자 
		
		
		//P106
		
		double pi = 3.14159;
		System.out.println((int)(pi*1000)/1000.);  //연산으로만 소수점 세자리까지 표기
		System.out.println((int)(pi*1000+0.5)/1000.); // 반올림 
		System.out.println(Math.round(pi));  //Math클래스에서 많은 기능이있고 잘 사용하면 된다 
		
		
		//나머지 연산 (배수들을 구할수있다)
		int x = 10, y =6;
		
		System.out.printf("몫 : %d , 나머지 : %d", x/y, x%y); //%나머지 연산
		
	}

}
