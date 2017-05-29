package Phone;

import java.util.ArrayList;
import java.util.Scanner;


public class PhoneManager {
	//private static int count = 0;
	//PhoneInfo[] storage = new PhoneInfo[100];
	ArrayList<PhoneInfo> storage1 = new ArrayList<PhoneInfo>();
	Scanner scanner = new Scanner(System.in);	

	public void readData() {
		String name;
		String phoneNumber;
		
		System.out.print("이름을 입력하세요 >>> ");
		name = scanner.nextLine();

		System.out.print("전화번호를 입력하세요 >>> ");
		phoneNumber = scanner.nextLine();

		//storage[count] = new PhoneInfo(name, phoneNumber);
		//count ++;
		
		
		storage1.add(new PhoneInfo(name, phoneNumber));	
		
	}
	
	public void view() {
		
		if(storage1.isEmpty()) {
			System.out.println("데이터 없음");

		} else {
		
			System.out.println("====== 데이터 전체보기 ======");
/*		if(count > 0) {
				for(int i=0; i<count; i++) {
					System.out.println(storage[i].toString());
				}
			} else if (count > 10) {
				System.out.println("초과하였습니다.");
			} else
				System.out.println("데이터 없습니다.");*/
			
			for(int i=0; i<storage1.size(); i++) 
				System.out.println(storage1.get(i).toString());
			
		}
		
	}
	
	public void serchName() {
/*		if(count > 0) {
			String name;
			
			System.out.print("검색할 이름 >>> ");
			name = scanner.nextLine();
		
			for(int i=0; i<count; i++) {
				if(storage[i].getName().equals(name))
					System.out.println(storage[i].toString());
				else
					System.out.println("검색한 이름없음");
			}
		} else 
			System.out.println("데이터 비어있음");*/
		
		if(storage1.isEmpty()) {
			System.out.println("데이터 없음");
		} else {
			String name;
			boolean flag = true;
			
			System.out.print("검색할 이름 >>> ");
			name = scanner.nextLine();
			
			for(int i=0; i<storage1.size(); i++) {
				if(storage1.get(i).getName().equals(name)){
					System.out.println(storage1.get(i).toString());	
					flag = false;
				}
			}
			
			if(flag) 
				System.out.println("검색 이름 없음");
		}
				
	}
	
	public void searchNumer() {
/*		if(count > 0) {
			String phoneNumber;
			
			System.out.print("검색할 번호 >>> ");
			phoneNumber = scanner.nextLine();
		
		
			for(int i=0; i<count; i++) {
				if(storage[i].getPhoneNumber().equals(phoneNumber))
					System.out.println(storage[i].toString());
				else
					System.out.println("검색 번호없음");
			}
		} else 
			System.out.println("데이터 비어있음");*/
		if(storage1.isEmpty()) {
			System.out.println("데이터 없음");

		} else {
			String phoneNumber;
			boolean flag = true;
			
			System.out.print("검색할 번호 >>> ");
			phoneNumber = scanner.nextLine();
			
			for(int i=0; i<storage1.size(); i++) {
				if(storage1.get(i).getPhoneNumber().equals(phoneNumber)) {
					System.out.println(storage1.get(i).toString());
					flag = false;
				}
						
			}
			
			if(flag) 
				System.out.println("검색 이름 없음");
		
			if(storage1.isEmpty()) 
				System.out.println("데이터 없음");
		}
	}
	
	public void removeData() {
		
		if(storage1.isEmpty()) {
			System.out.println("데이터 없음");
		} else {
			String name;
			boolean flag = true;
			
			System.out.print("삭제할 이름 >>> ");
			name = scanner.nextLine();
			
			for(int i=0; i<storage1.size(); i++) {
				if(storage1.get(i).getName().equals(name)){
					System.out.println(storage1.get(i).toString() + "삭제...");
					storage1.remove(i);
					flag = false;
				}
	
			}		
			
			if(flag) 
				System.out.println("검색 이름 없음");		
			
			if(storage1.isEmpty()) 
				System.out.println("정보가 없음");
		}
		
	}
	
	public void testData() {
		storage1.add(new PhoneInfo("a", "1"));
		storage1.add(new PhoneInfo("b", "2"));
		storage1.add(new PhoneInfo("c", "3"));
		storage1.add(new PhoneInfo("d", "4"));
		storage1.add(new PhoneInfo("e", "5"));
		storage1.add(new PhoneInfo("f", "6"));
		storage1.add(new PhoneInfo("g", "7"));
		storage1.add(new PhoneInfo("h", "8"));
		storage1.add(new PhoneInfo("i", "9"));
		storage1.add(new PhoneInfo("j", "10"));
		storage1.add(new PhoneInfo("k", "11"));
		storage1.add(new PhoneInfo("l", "12"));
	}
}
