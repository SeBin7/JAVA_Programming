package day_02;

public class P109 {

	public static void main(String[] args) 
	{
		int x = 1, y = 100;
		System.out.println(x>100);
		System.out.println(x==y);
		System.out.println(x!=y);
		x=y;
		
		System.out.println(x==y);
		
		//문자열의 비교 
		
		String  s1 = new String("나는나다");
		String  s2 = new String("너는너다");
		String  s3 = s2; 
		String  s4 = new String("~~~~~");  //==은 pdt형식의 데이터비교에 많이 쓰인다.
										   //refernece 데이터 타입은 주소의 비교보다 클래스안의 값을 비교를 원하는데 많이 쓰인다.
											//s1.equals(s2);  함수를 사용해서 두 값을 비교해주고 true false값을 반환한다.
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		s1 = s2 = s3 = s4 = null;  //객채생성에 있어서 마무리작업 
		
		System.out.println("========end=======");
		
		
		s1 = "홍길동"; //new를 생성하지않았을때의 reference 타입에 알아보자 
		s2 = "홍길동";
		s3 =  s1;    
		
		System.out.println(s1==s2);
		
		
		//논리 연산자
		
		System.out.println(false&&false);  //앞에서 false로 답이 나오면 뒤를 처리안하고 반환한
		System.out.println(false&false);   // 두 논리를 비교해서 반환한다.
		System.out.println(true||true); //or 연산자 둘중 하 나라도 true이면 true를 반환한다.
		System.out.println(!true);  //단항연산자 
		
		//3항 연산자 (조건식)? true일때 수행 : false일때 수행 == (조건식)?식1:식2
		
		int jumsu = 90;
		
		
		boolean flag = jumsu >= 0  && jumsu <=100;  //점수의 유효성을 체크하는 조건
		System.out.println(flag);
		
		String result = (jumsu >= 0  && jumsu <=100)?"유효한데이터":"확인 필요";
		//출력되는 결과값에 따라 변수 설정해서 정보를 받는다
	    
		
		System.out.println(result);
		System.out.println((jumsu >= 80)?"pass":"no pass");
		//조건식의 결과가 참이면 식1 거짓이면 식2가 선택이된다 .
		
		System.out.println(s1.charAt(0));  // s1.charAt(index); String은 char type으로 관리하고있고
										   // 가지고 오고싶은 문자를 가져오는 문자 메소드가 s1.charAt(index)이다.
		
		}

}
