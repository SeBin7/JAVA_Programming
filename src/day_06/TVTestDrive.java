package day_06;

public class TVTestDrive {

	public static void main(String[] args) {
		TV tv1 = new TV();
		TV tv2 = new TV();
		TV tv3 = tv1;

		System.out.println(TV.in);  // static 자원이기 때문

		tv1.color = "red";
		tv1.channel = 6;
		tv1.power();
		tv1.display();
		
		System.out.println(Math.PI);
		
	}

}
