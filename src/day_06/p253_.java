package day_06;

public class p253_ {
	public static int max(int x, int y) {
		int max;
		
		if(x > y)
			max = x;
		else
			max = y;
		
		return max;
	}
	
	public static void maxPrint(int x, int y) {
/*		if (x > y)
			System.out.println(x);
		else
			System.out.println(y);*/
		System.out.println(x>y ? x : y);
	}

	public static String msg(String msg) {
		//String hi = "æ»≥Á«œººø‰." + msg;
		return "æ»≥Á«œººø‰." + msg +"¥‘";
	}
	
	public void msgPrint(String msg, int num) {
		for(int i=0; i<num; i++)
			System.out.println(msg);
	}
	
	public static void main(String[] args) {
		p253_ p = new p253_();
		p.msgPrint("!!!", 3);
		
		new p253_().msgPrint("@@@", 3);
		
	}

}
