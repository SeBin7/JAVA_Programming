package day_02;

import java.util.Date;
import java.util.Scanner;

//import java.sql.Date; �̷��� �����̸��� �ΰ��� ����� ������ �ȵȴ� �ν��� �����Ѵ�.
//�׷��� ���־��� ��Ű���� ����ϰ� �������� �������ش�.
// ex  java.util.Date ..... java.sql.Date



public class P40 {

	public static void main(String[] args) {
		
		int n  = Integer.parseInt("9"); //���ڿ��� ���� ��Ʈ������ �ٲٱ����ؼ� Integer.parseInt�� ����Ѵ�.
		
		
		
		java.lang.String msg  = new String("hello"); //string�� java.lang�� �����Ǿ�����
		String name  = "ji sung park";
		
		java.util.Date today = new Date();  // �ٸ� ��Ű�� �ڿ��� �������� ������ �Ѵ�.
										 
		System.out.println(today);
		
		String ms ;
		Scanner scanner = new Scanner(System.in); //Ű����� �о�帰�� System.in
		System.out.print("�̸��� �Է��ϼ��� : ");
		ms = scanner.nextLine(); //�Է´�� ����
		System.out.println("����� �̸��� : " + ms);
		
		System.out.println("����� ���̴� ? ");
		
		int age = scanner.nextInt();
		scanner.nextLine();  //�Է´����� 
		
		
		//scanner.nextLine�� String Type 
		
		System.out.println("����� ���̴� : "+ age);
		
		System.out.print("���� ���� �Է����ּ��� ? (ex : 5)");
		int count = scanner.nextInt();  //string�� �˾Ƽ� int������ ��ȯ�ؼ� �����Ѵ�.
		scanner.nextLine();
		scanner.close();  
		/*
		 * ��ĳ�ʸ� ����ؼ� ��ä�� �����ϰ� �����. �׸��� �����ϰ��� 
		 * ������ ó�� ���並���� scanner.next(); - ����Ű �Է±��� ���� ó��
		 * scanner.close(); ��� ��ĵ��� ��ɹ����Ÿ� �����Ѵ�.
		 */
		
		System.out.printf("�Է� ���� : %s, %d, %d", ms, age, count);
		

	}

}
