package day_02;

import java.util.Scanner;

public class P117 {

	public static void main(String[] args) {
		
		//ch ������ ���ڰ��� ���� (0~9)����  �ƴ��� �Ǻ��ϴ� ���
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��� �ּ��� : ");
		
		String data = scanner.nextLine();
		char ch = data.charAt(0);
		
		
		//System.out.println((int)'0' +"  "+ (int)'9'); ���� �Ǻ��ϱ����� �ʿ��� ����
		System.out.println(ch+ "����?"+ ('0'<= ch && ch <= '9'));
		
		String result = ('0'<= ch && ch <='9'?"O":"X");
		
		//System.out.println(ch + result);  //+�� �����������ϱ� ������ �ٸ� ������� �ؾ��Ѵ�.
		
		
		System.out.println(""+ ch +" "+ result); // �����۾����� ��Ʈ��Ÿ������ �����Ѵ�.
		
	
			System.out.println(ch);
			System.out.println( "isDigit? : " +Character.isDigit(ch));  //���� �����ڸ� ����ؼ� ���� ����� �ϴ� �޼ҵ� Charater.isDigit();
	*/
			int num = Integer.parseInt("8") ;
			int n =3;
			/*
			 System.out.printf("%d   %s%n",num, Integer.toBinaryString(num));
			 System.out.printf("%d   %s%n",n, Integer.toBinaryString(n));
			 
			 System.out.printf("%d   %s%n",num|n, Integer.toBinaryString(num|n)); //��Ʈ������

			 */
			
			System.out.printf("%3d   %s%n",num, Integer.toBinaryString(num));
			System.out.printf("%3d   %s%n",num<<1, Integer.toBinaryString(num));
			System.out.printf("%3d   %s%n",num>>1, Integer.toBinaryString(num));
			

	
	}
	
	
	
	

}
