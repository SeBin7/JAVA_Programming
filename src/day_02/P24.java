package day_02;

import org.omg.CORBA.INTERNAL;

public class P24 {

	public static void main(String[] args) 
	{
		int year = 0 ;
		System.out.println(year);
		year += 2000;
		System.out.println("year : " + year);  //���ڿ��� ���� �۾��� ���� ���ϸ� �̸�Ų�� 
		System.out.printf("year :  %d %n ", year);
		
		
		int x = 10 , y =90, temp = 0;
		System.out.println("x = "+x + "y = "+y);  //������ �������� �򰥸��鼭 ��������� ������ �Ͼ��,
		System.out.printf("x = %d y = %d %n",x, y);
		
		
		/*
		temp = x;
		x = y;
		y = x;
		*/  
		
		//�ΰ��� ���� ���� �ٲٰ� ���������� ���ο� ������ ���ؼ�  ���� �ٲ۴� .
		
		
		final double PI = 3.14159;  //final ���ȭó���Ǿ� ���� �Ұ� 
		System.out.printf("pi : %f %n", PI);
		System.out.printf("pi : %5.2f %n", PI);  //��Ÿ������� �ڸ� ����ŭ ǥ���Ҽ� �ִ�.
		System.out.printf("pi : %5.3f %n", PI);  //�ڸ����� �Ѿ�� �ݿø� �Ѵ�.
		
		//36 EX
		int num = 10;
		
		System.out.printf(" num = %d %n", num);
		System.out.printf(" num = %o %n", num); //8����
		System.out.printf(" num = %x %n", num); //16����
		System.out.println("num�� 2������ : "+Integer.toBinaryString(num)); //2���� �ٲٴ� ��� ��Ʈ��Ÿ�Դϴ�
		System.out.printf("2���� �ٲٱ� : %s %n",Integer.toBinaryString(num)); //2���� �ٲٴ� ��� ��Ʈ��Ÿ�Դϴ�
		//Integer class�� ����� ������ ����Ѵ�.
		
		String msg = "Hello!!";
		System.out.printf("%s %n", msg);
		
		System.out.println("========main end========");
	}

}
