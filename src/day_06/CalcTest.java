package day_06;


public class CalcTest {

	public static void main(String[] args) {

		System.out.println(Calc.add(45, 65));   // static �޼ҵ� => Ŭ����.�޼ҵ�
		System.out.println(Calc.add(44, 44, 745));  // �����ε�(Overloading)
		System.out.printf("%.3f \n", Calc.add(4.4, 65.54));
		
		int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		//System.out.println(Calc.add(n));
		System.out.println(Calc.add(1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7));
	}

}
