package day_02;

public class P95 {

	public static void main(String[] args) {

		int i= 5, j = 5;
		System.out.println(i++); 	
		System.out.println(++i);
		
		System.out.println("i="+i + "j="+j); 
		
		int b1 =10 , b2 = 30 , b3 = 0;
		int b4 =b1*(int)b2;
		
		char c1 ='a';
		char c2 =c1;
		char c3 = ' ';
		System.out.println(c1++);
		System.out.println(c1+1);  //������ �ϸ鼭 int������ �ٲ㼭 �ƽ�Ű�ڵ尪�� ����
			//casting (char)(c1+1) �ڵ鸵 
		System.out.println(c2);
		
		
		
		//104p
		
		char a1 = 'A';
		
		for(int k =0 ; k<26 ; k++)  //for ��  
		{
		
			System.out.println(a1++ +" : " + (int)a1);
		
		}
		
		char c = 'f';
		
		System.out.println((char)(c-32));
		System.out.printf("f = %c", (char)(c-32)); //scanner �ڵ鸵�ϴ� ���� �����غ��� 
		
		
		//P106
		
		double pi = 3.14159;
		System.out.println((int)(pi*1000)/1000.);  //�������θ� �Ҽ��� ���ڸ����� ǥ��
		System.out.println((int)(pi*1000+0.5)/1000.); // �ݿø� 
		System.out.println(Math.round(pi));  //MathŬ�������� ���� ������ְ� �� ����ϸ� �ȴ� 
		
		
		//������ ���� (������� ���Ҽ��ִ�)
		int x = 10, y =6;
		
		System.out.printf("�� : %d , ������ : %d", x/y, x%y); //%������ ����
		
	}

}
