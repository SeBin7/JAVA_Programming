package day_07;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {
		
	}  //defualt ������ �Լ�
	
/*	Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}*/
	
	public void setHour(int hour) {
		if(hour >= 0 && hour <= 24)
			this.hour = hour;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public void setMinute(int minute) {
		if(minute >= 0 && minute <= 60)
			this.minute = minute;
	}
	
	public int getMinute() {
		return this.minute;
	}	
	
	public void setSecond(int second) {
		if(second >= 0 && second <= 60)
			this.second = second;
	}
	
	public int getSecond() {
		return this.second;
	}
	public void print() {
		System.out.println(this.hour + "�� " + this.minute + "�� " + this.second + "��");
	}
}