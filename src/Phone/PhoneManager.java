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

		System.out.print("�̸��� �Է��ϼ��� >>> ");
		name = scanner.nextLine();

		System.out.print("��ȭ��ȣ�� �Է��ϼ��� >>> ");
		phoneNumber = scanner.nextLine();

		storage.add(new PhoneInfo(name, phoneNumber));
		
	}

	public void viewData() {

		if (storage.isEmpty()) {
			System.out.println("������ ����");

		} else {

			System.out.println("====== ������ ��ü���� ======");

			for (int i = 0; i < storage.size(); i++)
				System.out.println(storage.get(i).toString());
		}

/*		PhoneFileManager fMgr = new PhoneFileManager();
		fMgr.load();*/
	}

	public void serchName() {

		if (storage.isEmpty()) {
			System.out.println("������ ����");
		} else {
			String name;
			boolean flag = true;

			System.out.print("�˻��� �̸� >>> ");
			name = scanner.nextLine();

			for (int i = 0; i < storage.size(); i++) {
				if (storage.get(i).getName().equals(name)) {
					System.out.println(storage.get(i).toString());
					flag = false;
				}
			}

			if (flag)
				System.out.println("�˻� �̸� ����");
		}

	}

	public void searchNumber() {

		if (storage.isEmpty()) {
			System.out.println("������ ����");

		} else {
			String phoneNumber;
			boolean flag = true;

			System.out.print("�˻��� ��ȣ >>> ");
			phoneNumber = scanner.nextLine();

			for (int i = 0; i < storage.size(); i++) {
				if (storage.get(i).getPhoneNumber().equals(phoneNumber)) {
					System.out.println(storage.get(i).toString());
					flag = false;
				}

			}

			if (flag)
				System.out.println("�˻� ��ȣ ����");

			if (storage.isEmpty())
				System.out.println("������ ����");
		}
	}

	public void removeData() {

		if (storage.isEmpty()) {
			System.out.println("������ ����");
		} else {
			String name;
			boolean flag = true;
			String str = "";

			System.out.print("������ �̸� >>> ");
			name = scanner.nextLine();

			for (int i = 0; i < storage.size(); i++) {
				if (storage.get(i).getName().equals(name)) {
					System.out.print("<" + storage.get(i).toString() + "> �����͸� �����Ͻðڽ��ϱ�?(Y/N)");
					str = scanner.nextLine();

					if (str.equals("Y")) {
						System.out.print("<" + storage.get(i).toString() + "> �����Ͱ� �����Ǿ����ϴ�.");
						storage.remove(i);
						flag = false;
					} else if (str.equals("N")) {
						System.out.println("<" + storage.get(i).toString() + "> �����Ͱ� �������� �ʾҽ��ϴ�.");
					}
				}

			}

			if (flag)
				System.out.println("�˻� �̸� ����");

			if (storage.isEmpty())
				System.out.println("������ ����");

		}

	}

}
