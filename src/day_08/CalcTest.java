package day_08;

import org.junit.Test;

public class CalcTest {
	
/*	public static void main(String[] args) {
		double[] a = {2, 3, 5, 6, 7, 0};
		System.out.println(Calc.exec('+', a));
	}*/
	
	@Test
	public void test() {
		double result = Calc.exec('*', 5,5,5,5,5,5);
		
		System.out.println(result);
	}
}
