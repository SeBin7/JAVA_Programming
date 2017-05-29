package Phone;

import java.util.Scanner;

public class PhoneDrive {

	public static void main(String[] args) {

		PhoneManager mgr = new PhoneManager();		
		int num = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("선택하세요...");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 회원 목록 보기");
			System.out.println("3. 회원 조회");
			System.out.println("4. 번호 조회");
			System.out.println("5. 회원 삭제");
			System.out.println("6. 프로그램 종료");
			System.out.print("선택: ");
			
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
				System.out.println("종료합니다.");
				return;
			case 7:
				mgr.testData();
				System.out.println("=======================");
				break;
			default:
				System.out.println("다시 입력하세요");
			}
			
		}
	}

}
