package day_13;

public class p414 {
	public static void main(String[] args) {
		System.out.println("======= Main Start =======");
		
		String name = "asdfsdf";
		
		try {
			System.out.println(name.length());
			int num = Integer.parseInt(name);
			int num2 = 100/num;
			System.out.println("100/" + num + " = " + num2);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			//System.out.println("NullPointerException...");
		} /*catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("NumberFormatException...");
		} 
		catch (ArithmeticException e) { 
			System.out.println(e.getMessage());
			System.out.println("ArithmeticException...");
		} */finally {
		
			System.out.println("Finally ผ๖วเ");
		}
		
		System.out.println("======== Main End ========");
	}
}
