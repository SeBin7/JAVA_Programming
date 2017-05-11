package day_06;

public class p252 {
	public int max(int x, int y) {
		int max;
		
		if(x > y)
			max = x;
		else
			max = y;
		
		return max;
	}
	
	public void maxPrint(int x, int y) {
/*		if (x > y)
			System.out.println(x);
		else
			System.out.println(y);*/
		System.out.println(x>y ? x : y);
	}

	public String msg(String msg) {
		//String hi = "æ»≥Á«œººø‰." + msg;
		return "æ»≥Á«œººø‰." + msg +"¥‘";
	}
	
	public void msgPrint(String msg, int num) {
		for(int i=0; i<num; i++)
			System.out.println(msg);
	}
	
	public static void main(String[] args) {
		p252 p = new p252();
		int n1 = 100, n2 = 200;
		int max;
		
/*		if(n1>n2) 
			max = n1;
		else
			max = n2;
		
		System.out.println(max);*/
		
		System.out.println(p.max(n1, n2));
		
		int n3 = 300, n4 = 400;
		
/*		if(n3>n4) 
			max = n3;
		else
			max = n4;
		
		System.out.println(max);*/
		
		p.maxPrint(n3, n4);
		
		System.out.println(p.msg("º∫ºº∫Û"));
		p.msgPrint("Hello", 5);
	}

}
