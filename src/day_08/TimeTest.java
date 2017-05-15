package day_08;

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
		t.print();
		
		Time t2 = new Time(14, 19, 24);
		t2.print();
		
		Time t3 = new Time(4, 19, 30, true);
		t3.print();
	}
}
