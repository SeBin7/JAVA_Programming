package day_08;

public class Time {
	private int hour;
	private int minute;
	private int second;
	private boolean am;
	
	//������ �Լ�
	public Time() {
		this(12, 0, 0, true);
		// �ʱ�ȭ �۾� ���
		//System.out.println("������ �Լ� ---- �ʱ�ȭ -----");
		//this.hour = 11;
		//this.minute = 0;
		//this.second = 0 ;
		//this.am = true;
	}
	
	public Time(int hour, int minute, int second) {
		//this.hour = hour;
		//this.minute = minute;
		//this.second = second;
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}
	
	public Time(int hour, int minute, int second, boolean am) {
/*		this.hour = hour;
		this.minute = minute;
		this.second = second;*/
		this(hour, minute, second);      
		this.am = am;
	}
	
	public boolean isAm() {
		return am;
	}

	public void setAm(boolean am) {
		this.am = am;
	}

	public void setHour(int hour) {
		if(hour >= 0 && hour < 24)
			this.hour = hour;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void print() {
		if(am == false || hour >= 12)
			System.out.println("PM: "+hour + "�� " + minute + "�� " + second + '��');
		else
			System.out.println("AM: "+hour + "�� " + minute + "�� " + second + '��');
	}
}
