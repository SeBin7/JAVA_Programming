package Phone;

import java.util.Scanner;

public class PhoneDrive {

	public static void main(String[] args) {
		
		PhoneInfo info = new PhoneInfo();
		int num = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("선택하세요...");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 회원 목록 보기");
			System.out.println("3. 회원 조회");
			System.out.println("4. 프로그램 종료");
			System.out.print("선택: ");

			num = scanner.nextInt();
			scanner.nextLine();

			switch (num) {
			case 1:
				System.out.println("=======데이터 입력======");
				System.out.println("========================");
				break;
			case 2:
				System.out.println("=======회원 목록=======");
				info.name = "홍길동";
				info.phoneNumber = "010-3126-7538";
				info.print();
				System.out.println("=======================");
				break;
			case 3:
				System.out.println("=======회원 조회=======");
				System.out.println("=======================");
				break;
			case 4:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("다시 입력하세요");
			}
			
			/*
			 * if (num == 1) { System.out.println("=======데이터 입력======");
			 * System.out.println("========================"); } else if (num ==
			 * 2) { System.out.println("=======회원 목록=======");
			 * System.out.println("======================="); } else if (num ==
			 * 3) { System.out.println("=======회원 조회=======");
			 * System.out.println("======================="); } else if (num ==
			 * 4) { System.out.println("종료합니다."); break; }
			 */
		}
	}

}
