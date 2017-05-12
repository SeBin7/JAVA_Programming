package day_07;

public class p245 {

	public static void main(String[] args) {
		//시간 정보 관리 시, 분, 초
		int hour;
		int minute;
		int second;
		
		//학생 정보 이름,성적
		String[] name = new String[20];
		int[] ko = new int[20];
		int[] eng = new int[20];
		int[] mat = new int[20];
		
		Student[] students = new Student[20];
	}

}


class Student {
	String name;
	int ko;
	int eng;
	int mat;
}