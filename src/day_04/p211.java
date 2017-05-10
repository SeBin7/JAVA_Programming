package day_04;

public class p211 {

	public static void main(String[] args) {
		System.out.println(args);
		System.out.println(args.length);
		
		for(String data:args) {
			System.out.println(data);
			System.out.println(data.charAt(0));
			System.out.println(data.toLowerCase());
		}
	}

}
