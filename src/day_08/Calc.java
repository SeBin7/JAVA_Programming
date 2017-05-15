package day_08;

public class Calc {
	
	public static double exec(char key, double ... a) { // 가변인자는 뒤로
		double result = 0;
		
		switch(key) {
			case '+' :
				result = add(a);
				break;
				
			case '*' :
				result = multiply(a);
				break;
				
			default :
				System.out.println("지원 안함");
		}
		
		return result;
	}
	
	public static double add(double ... a) {		
		double sum = 1;
		for(int i=0; i<a.length; i++)
			sum += a[i];
		
		return sum;
	}
	
	public static double multiply(double ... a) {		
		double result = 1;
		for(double data:a)
			result *= data;
		
		return result;
	}
}
