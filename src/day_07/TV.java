package day_07;

public class TV {

/*	int[] n;
	char[][] c;
	TV tv;
	TV[] tt;
	int i;*/
	String color;
	boolean power;
	int channel;
	static double in = 3.15;
	
	public void display() {
		String msg = "";        // local variable => ÃÊ±âÈ­
		//System.out.println(color);
		System.out.println("TV[Channel: " + channel + "]");
	}
	
	public int channelUp() {
		return channel++;
	}
	
	public static void p() {
		System.out.println(in);			//static area
		//System.out.println(color);		//heap area => error
	}
}
