package day_01;

public class DataType {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		boolean flag = true;   // c���ʹ� �ٸ��� 0�� 1�� ����� �ȵȴ� .
		char c = 'a';  //������ 
		String s = "aa";  //���ڿ��� �빮�� String
		
		byte money = 100;
		float f = (float)5.5;  //casting
		 double d = 8.8f;   //promotion
		 
		 d= money; // ��ǻ�ʹ� = �� �������� Ÿ�� �˻�����Ѵ�.
		 
		 byte b1 =127, b2 = 1, b3;
		 System.out.println("===========");  //println - ln = /n
		 System.out.println(b2);
		 System.out.println(10/4+"  /t  "+10/4.);
		 System.out.println(10/4+"  /n "+10/4.);
		 
		 //b3 = b1 - b2;  //��������� ���� ������ int
		 char a = '8';
		 String name = "oh se june";   //Referce type 
		 String name1= new  String("sejun oh"); //�ϵ忡 ��Ʈ�� Ŭ������ �޸𸮿� �ø����� = Ŭ���� 
		 System.out.println(name);
		 System.out.println(name.toUpperCase()); // toUpperCase �빮�ڷ� �ٲ����� ��� String class����  �����ؿ´�.
		 System.out.println("Byte �ִ밪 : "+Byte.MAX_VALUE);
		 System.out.println((char)97); //�ƽ�Ű�ڵ��  ���а����ϴ� 
		 System.out.println(a +"����?" + Character.isDigit(a));  //ĳ�������� ������ ��������
		 
		 
		 System.out.println(); 
	}

}
