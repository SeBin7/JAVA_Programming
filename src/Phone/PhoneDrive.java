package Phone;

import java.util.Scanner;

public class PhoneDrive {

	public static void main(String[] args) {

		PhoneManager mgr = new PhoneManager();		
		int num = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("�����ϼ���...");
			System.out.println("1. ������ �Է�");
			System.out.println("2. ȸ�� ��� ����");
			System.out.println("3. ȸ�� ��ȸ");
			System.out.println("4. ��ȣ ��ȸ");
			System.out.println("5. ȸ�� ����");
			System.out.println("6. ���α׷� ����");
			System.out.print("����: ");
			
			num = scanner.nextInt();
			scanner.nextLine();
			
			switch (num) {
			case 1:
				mgr.readData();
				System.out.println("=======================");
				break;
			case 2:
				mgr.view();
				System.out.println("=======================");
				break;
			case 3:
				mgr.serchName();
				System.out.println("=======================");
				break;
			case 4:
				mgr.searchNumer();
				System.out.println("=======================");
				break;
			case 5:
				mgr.removeData();
				System.out.println("=======================");
				break;
			case 6:
				System.out.println("�����մϴ�.");
				return;
			case 7:
				mgr.testData();
				System.out.println("=======================");
				break;
			default:
				System.out.println("�ٽ� �Է��ϼ���");
			}
			
		}
	}

}
