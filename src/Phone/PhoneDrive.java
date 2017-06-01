package Phone;

import java.util.Scanner;

public class PhoneDrive {

	public static void main(String[] args) {		
		PhoneManager mgr = new PhoneManager();
		PhoneFileManager fMgr = new PhoneFileManager(mgr);
		PhoneMeau meau = new PhoneMeau();
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		fMgr.load();
		
		while (true) {

			meau.mainMeau();			
			num = scanner.nextInt();
			scanner.nextLine();
			
			switch (num) {
			case 1:
				mgr.inputData();
				System.out.println("=======================");
				break;
			case 2:
				mgr.viewData();
				System.out.println("=======================");
				break;
			case 3:
				meau.subMeau();
				num = scanner.nextInt();
				switch (num) {
				case 1:
					mgr.serchName();
					break;
				case 2:
					mgr.searchNumber();
					break;
				}
				System.out.println("=======================");
				break;
			case 4:
				mgr.removeData();
				System.out.println("=======================");
				break;
			case 5:
				fMgr.load();
				System.out.println("=======================");
				break;
			case 6:
				fMgr.save();
				System.out.println("=======================");
				break;
			case 7:				
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("다시 입력하세요");
			}
			
		}
	}

}
