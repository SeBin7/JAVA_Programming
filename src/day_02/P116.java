package day_02;

public class P116 {

	public static void main(String[] args) {
		/*
		int n1 =5, n2 = 5, n3= 0, n4 = 0, sum =0;
		
		n3 = n1++;
		n4 = ++n2;
		System.out.println("n1="+n1+ "n2="+n2+"n3="+n3+"n4="+n4);
		System.out.printf("n1 = %d, n2 = %d, n3 = %d, n4 = %d %n", n1, n2, n3, n4);
				//tip ��ä������������ ���� �޸𸮰� ���ȴ�.
		System.out.printf("%s %n", sum); //string Ÿ���� ��� Ÿ���� ���밡��
		
		sum+=10; 
		*/
		
		int jumsu = 20;  // 0<= jumsu <=100
		int count = 0;  //���� ������� �������� ���ǽ��� ������ �ڵ鸵�غ���
		
		System.out.println(0<= jumsu && jumsu <=100);
		
		//2�� ����̰ų� 3�ǹ���� ����
		//�������� ����ؼ� �̿��Ѵ� .
		int num = 33;
		System.out.println(num % 2==0 ||num%3==0); //�̰ų� 
		System.out.println(num %2 ==0 && num%3==0); //and  ������ ���ǽ��� ������ �ڵ鸵�ϴ� �����ʿ�
		System.out.println(num %2 != 0 && num %3!=0);
		
		
		
		
		
	}

}
