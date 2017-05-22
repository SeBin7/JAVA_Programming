package day_12;

public class p352 {

	public static void main(String[] args) {
		Math.random();
		//Math m = new Math();		//불가  
		
/*		Singletone s1 = new Singletone();
		Singletone s2 = new Singletone();
		Singletone s3 = new Singletone();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);*/
		
		Singletone s1 = Singletone.getInstance();
		Singletone s2 = Singletone.getInstance();
		Singletone s3 = Singletone.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}

class Singletone {
	private static Singletone s = new Singletone();
	
	private Singletone() {
		System.out.println("Singletone() 객체 생성");
	}
	
	public static Singletone getInstance() {
		if(s == null) 
			s = new Singletone();
		
		return s;
	}
	
}
