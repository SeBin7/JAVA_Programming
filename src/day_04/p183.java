package day_04;

public class p183 {
	public static void main(String[] args) {
		//배열 선언
		String[] name;
		int[] jumsus;
		
		name = new String[5];  // null 초기화
		jumsus = new int[5];   // 0 초기화
		
		for(int i=0; i<jumsus.length; i++){
			System.out.println(name[i]);
			System.out.println(jumsus[i]);
		}
		for(int i=0; i<jumsus.length; i++) {
			jumsus[i] = i+90;
		}
		//jdk 1.5부터 지원
		for(int data:jumsus) {
			System.out.println(data + "\t");
		}
		for(String data:name) {
			System.out.println(data);
		}
	}

}
