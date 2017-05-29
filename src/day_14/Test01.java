package day_14;

public class Test01 {
	public static void main(String[] args) {
		String msg = "Hello Java!!!";
		System.out.println(msg);
		
		msg.replace('J', '@');			//읽기 전용
		System.out.println(msg.replace('J', '@'));
		System.out.println(msg);
		
		
	}
}
