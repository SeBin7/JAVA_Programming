package day_05;

public class p235 {
	public static void main(String[] args) {
		TV tv1 = new TV();    // �޸𸮿� ��� = ��ü = �ν��Ͻ�ȭ
		TV tv2 = new TV();
		TV tv3 = new TV();
		TV tv4 = tv1;  
		
		tv1.color = "Red";
		tv1.power();
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		
		/*System.out.println(tv1.color + ", " + tv1.channel + ", " + tv1.power);
		System.out.println(tv2.color + ", " + tv2.channel + ", " + tv2.power);
		System.out.println(tv3.color + ", " + tv3.channel + ", " + tv3.power);
		System.out.println(tv4.color + ", " + tv4.channel + ", " + tv4.power);*/
		
		tv1.display();
		tv2.display();
		tv3.display();
		tv4.display();
		
	}
}

class TV {
	// Ŭ������ ������� ���� + �޼ҵ�
	// Member Field, Ư�� ������ �Ӽ� Property
	String color;
	int channel;
	boolean power;
	
/*	public TV(String cl, int ch, boolean pw) {
		this.color = cl;
		this.channel = ch;
		this.power =pw;
	}*/

	void power() {
		power = !power;
		return;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	void display() {
		System.out.printf("Color: [%4s] , Channel: [%2d], Power: [%5s] \n", color, channel, power);		
	}
}