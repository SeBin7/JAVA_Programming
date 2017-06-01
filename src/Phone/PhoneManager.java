package Phone;

import java.util.ArrayList;
import java.util.Scanner;

import day_15.PhoneInfo;

public class PhoneManager {
	
	ArrayList<PhoneInfo> storage = new ArrayList<PhoneInfo>();
	PhoneFileManager mgr = new PhoneFileManager(storage);
	Scanner scanner = new Scanner(System.in);

	public void setList(ArrayList<PhoneInfo> storage) {
		this.storage = storage;
		
	}
	
	public void inputData() {
		String name;
		String phoneNumber;

		System.out.print("이름을 입력하세요 >>> ");
		name = scanner.nextLine();

		System.out.print("전화번호를 입력하세요 >>> ");
		phoneNumber = scanner.nextLine();

		storage.add(new PhoneInfo(name, phoneNumber));
		
	}

	public void viewData() {

		if (storage.isEmpty()) {
			System.out.println("데이터 없음");

		} else {

			System.out.println("====== 데이터 전체보기 ======");

			for (int i = 0; i < storage.size(); i++)
				System.out.println(storage.get(i).toString());
		}

/*		PhoneFileManager fMgr = new PhoneFileManager();
		fMgr.load();*/
	}

	public void serchName() {

		if (storage.isEmpty()) {
			System.out.println("데이터 없음");
		} else {
			String name;
			boolean flag = true;

			System.out.print("검색할 이름 >>> ");
			name = scanner.nextLine();

			for (int i = 0; i < storage.size(); i++) {
				if (storage.get(i).getName().equals(name)) {
					System.out.println(storage.get(i).toString());
					flag = false;
				}
			}

			if (flag)
				System.out.println("검색 이름 없음");
		}

	}

	public void searchNumber() {

		if (storage.isEmpty()) {
			System.out.println("데이터 없음");

		} else {
			String phoneNumber;
			boolean flag = true;

			System.out.print("검색할 번호 >>> ");
			phoneNumber = scanner.nextLine();

			for (int i = 0; i < storage.size(); i++) {
				if (storage.get(i).getPhoneNumber().equals(phoneNumber)) {
					System.out.println(storage.get(i).toString());
					flag = false;
				}

			}

			if (flag)
				System.out.println("검색 번호 없음");

			if (storage.isEmpty())
				System.out.println("데이터 없음");
		}
	}

	public void removeData() {

		if (storage.isEmpty()) {
			System.out.println("데이터 없음");
		} else {
			String name;
			boolean flag = true;
			String str = "";

			System.out.print("삭제할 이름 >>> ");
			name = scanner.nextLine();

			for (int i = 0; i < storage.size(); i++) {
				if (storage.get(i).getName().equals(name)) {
					System.out.print("<" + storage.get(i).toString() + "> 데이터를 삭제하시겠습니까?(Y/N)");
					str = scanner.nextLine();

					if (str.equals("Y")) {
						System.out.print("<" + storage.get(i).toString() + "> 데이터가 삭제되었습니다.");
						storage.remove(i);
						flag = false;
					} else if (str.equals("N")) {
						System.out.println("<" + storage.get(i).toString() + "> 데이터가 삭제되지 않았습니다.");
					}
				}

			}

			if (flag)
				System.out.println("검색 이름 없음");

			if (storage.isEmpty())
				System.out.println("정보가 없음");

		}

	}

}
