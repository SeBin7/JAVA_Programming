package Phone;

import java.util.Scanner;

public class PhoneDrive {

	public static void main(String[] args) {
		
		PhoneInfo info = new PhoneInfo();
		int num = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("�����ϼ���...");
			System.out.println("1. ������ �Է�");
			System.out.println("2. ȸ�� ��� ����");
			System.out.println("3. ȸ�� ��ȸ");
			System.out.println("4. ���α׷� ����");
			System.out.print("����: ");

			num = scanner.nextInt();
			scanner.nextLine();

			switch (num) {
			case 1:
				System.out.println("=======������ �Է�======");
				System.out.println("========================");
				break;
			case 2:
				System.out.println("=======ȸ�� ���=======");
				info.name = "ȫ�浿";
				info.phoneNumber = "010-3126-7538";
				info.print();
				System.out.println("=======================");
				break;
			case 3:
				System.out.println("=======ȸ�� ��ȸ=======");
				System.out.println("=======================");
				break;
			case 4:
				System.out.println("�����մϴ�.");
				return;
			default:
				System.out.println("�ٽ� �Է��ϼ���");
			}
			
			/*
			 * if (num == 1) { System.out.println("=======������ �Է�======");
			 * System.out.println("========================"); } else if (num ==
			 * 2) { System.out.println("=======ȸ�� ���=======");
			 * System.out.println("======================="); } else if (num ==
			 * 3) { System.out.println("=======ȸ�� ��ȸ=======");
			 * System.out.println("======================="); } else if (num ==
			 * 4) { System.out.println("�����մϴ�."); break; }
			 */
		}
	}

}
