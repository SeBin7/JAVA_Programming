package day_02;

public class P55 {

	public static void main(String[] args)
	{
		char ch = 'a';
		System.out.println(ch);
		System.out.println((int)ch);  //ch안에 문자 a가 저장되는 것이 아니라 유니코드값이 저장된다.
		
		int i1 = 10, i2 = 20;
		
		System.out.println(i1+i2);
									//컴퓨터에서 연산을 할때 컴퓨터는  int 형으로 변환해서 한다.
									//그래서  byte같은 경우 기능이 떨어진다.
		int b1 = 10, b2 = 20;
		System.out.println(b1+b2);
		
		String name = null ; //주소값이 필요하지만 아직은 주소값이 없다 - null
		String msg= "hello!!";
		
		name = msg;
		//msg가 가지고있는 주소값을 name이 가지게되어있다 .
		System.out.println(name.length()); //nullpointException 발생  null포인터에서 가져올수있는 주소값이 존재하지 않음
		System.out.println(msg);
		
		
		
	}

}
