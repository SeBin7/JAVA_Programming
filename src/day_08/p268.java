package day_08;

public class p268 {
	
	public static void main(String[] args) {
		int x = 999;
		System.out.println(x);
		p268.change(x);
		System.out.println(x);
		System.out.println("===================");
		Data data = new Data();
		System.out.println(data.x);
		p268.change(data);
		System.out.println(data.x);
		
	}

	public static void change(int x) {
		x = 100;
		System.out.printf("change(int x) : %d \n", x);
	}
	
	public static void change(Data d) {
		d.x = 100;
		System.out.printf("change(int x) : %d \n", d.x);
	}
}

class Data {
	int x;
	int y;
	
}
