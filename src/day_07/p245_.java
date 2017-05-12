package day_07;

public class p245_ {
	public static void main(String[] args) {
		Time t1 = new Time();
		
/*		t1.hour = 12;
		t1.minute = 44;
		t1.second = 26;  // private 접근 불가

		System.out.println(t1.hour + "시" + t1.minute + "분" + t1.second + "초");*/ 
		
		t1.setHour(13);
		t1.setMinute(22);
		t1.setSecond(45);
		System.out.println(t1.getHour() + "시 " + t1.getMinute() + "분 " + t1.getSecond() + "초");
		
		Time t2 = new Time();
		t2.setHour(11);
		t2.setMinute(20);
		t2.setSecond(15);
		t2.print();
		
	}
}



