package day_02;

public class P55 {

	public static void main(String[] args)
	{
		char ch = 'a';
		System.out.println(ch);
		System.out.println((int)ch);  //ch�ȿ� ���� a�� ����Ǵ� ���� �ƴ϶� �����ڵ尪�� ����ȴ�.
		
		int i1 = 10, i2 = 20;
		
		System.out.println(i1+i2);
									//��ǻ�Ϳ��� ������ �Ҷ� ��ǻ�ʹ�  int ������ ��ȯ�ؼ� �Ѵ�.
									//�׷���  byte���� ��� ����� ��������.
		int b1 = 10, b2 = 20;
		System.out.println(b1+b2);
		
		String name = null ; //�ּҰ��� �ʿ������� ������ �ּҰ��� ���� - null
		String msg= "hello!!";
		
		name = msg;
		//msg�� �������ִ� �ּҰ��� name�� �����ԵǾ��ִ� .
		System.out.println(name.length()); //nullpointException �߻�  null�����Ϳ��� �����ü��ִ� �ּҰ��� �������� ����
		System.out.println(msg);
		
		
		
	}

}
