package day_02;

public class P109 {

	public static void main(String[] args) 
	{
		int x = 1, y = 100;
		System.out.println(x>100);
		System.out.println(x==y);
		System.out.println(x!=y);
		x=y;
		
		System.out.println(x==y);
		
		//���ڿ��� �� 
		
		String  s1 = new String("���³���");
		String  s2 = new String("�ʴ³ʴ�");
		String  s3 = s2; 
		String  s4 = new String("~~~~~");  //==�� pdt������ �����ͺ񱳿� ���� ���δ�.
										   //refernece ������ Ÿ���� �ּ��� �񱳺��� Ŭ�������� ���� �񱳸� ���ϴµ� ���� ���δ�.
											//s1.equals(s2);  �Լ��� ����ؼ� �� ���� �����ְ� true false���� ��ȯ�Ѵ�.
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		s1 = s2 = s3 = s4 = null;  //��ä������ �־ �������۾� 
		
		System.out.println("========end=======");
		
		
		s1 = "ȫ�浿"; //new�� ���������ʾ������� reference Ÿ�Կ� �˾ƺ��� 
		s2 = "ȫ�浿";
		s3 =  s1;    
		
		System.out.println(s1==s2);
		
		
		//�� ������
		
		System.out.println(false&&false);  //�տ��� false�� ���� ������ �ڸ� ó�����ϰ� ��ȯ��
		System.out.println(false&false);   // �� ���� ���ؼ� ��ȯ�Ѵ�.
		System.out.println(true||true); //or ������ ���� �� ���� true�̸� true�� ��ȯ�Ѵ�.
		System.out.println(!true);  //���׿����� 
		
		//3�� ������ (���ǽ�)? true�϶� ���� : false�϶� ���� == (���ǽ�)?��1:��2
		
		int jumsu = 90;
		
		
		boolean flag = jumsu >= 0  && jumsu <=100;  //������ ��ȿ���� üũ�ϴ� ����
		System.out.println(flag);
		
		String result = (jumsu >= 0  && jumsu <=100)?"��ȿ�ѵ�����":"Ȯ�� �ʿ�";
		//��µǴ� ������� ���� ���� �����ؼ� ������ �޴´�
	    
		
		System.out.println(result);
		System.out.println((jumsu >= 80)?"pass":"no pass");
		//���ǽ��� ����� ���̸� ��1 �����̸� ��2�� �����̵ȴ� .
		
		System.out.println(s1.charAt(0));  // s1.charAt(index); String�� char type���� �����ϰ��ְ�
										   // ������ ������� ���ڸ� �������� ���� �޼ҵ尡 s1.charAt(index)�̴�.
		
		}

}
