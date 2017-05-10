package Phone;

public class PhoneInfo {
	String name;
	String phoneNumber;
	
	void print() {
		System.out.printf("이름: %3s, 번호 %s", name, phoneNumber);
		System.out.println();
		return;
	}
}
