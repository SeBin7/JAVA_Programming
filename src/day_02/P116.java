package day_02;

public class P116 {

	public static void main(String[] args) {
		/*
		int n1 =5, n2 = 5, n3= 0, n4 = 0, sum =0;
		
		n3 = n1++;
		n4 = ++n2;
		System.out.println("n1="+n1+ "n2="+n2+"n3="+n3+"n4="+n4);
		System.out.printf("n1 = %d, n2 = %d, n3 = %d, n4 = %d %n", n1, n2, n3, n4);
				//tip 객채생성과정에서 많은 메모리가 사용된다.
		System.out.printf("%s %n", sum); //string 타입은 모든 타입을 수용가능
		
		sum+=10; 
		*/
		
		int jumsu = 20;  // 0<= jumsu <=100
		int count = 0;  //내가 가지고올 데이터의 조건식을 가지고 핸들링해보자
		
		System.out.println(0<= jumsu && jumsu <=100);
		
		//2의 배수이거나 3의배수인 정수
		//나머지를 사용해서 이용한다 .
		int num = 33;
		System.out.println(num % 2==0 ||num%3==0); //이거나 
		System.out.println(num %2 ==0 && num%3==0); //and  적절한 조건식을 가지고 핸들링하는 연습필요
		System.out.println(num %2 != 0 && num %3!=0);
		
		
		
		
		
	}

}
