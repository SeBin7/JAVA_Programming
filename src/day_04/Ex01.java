package day_04;

public class Ex01 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		for(int i=1, s=1; true; i++, s=-s) {
			num = i*s;
			sum += num;
			if(sum>=100) break;
			
		}
		System.out.println(sum);
	}
//fd
}
