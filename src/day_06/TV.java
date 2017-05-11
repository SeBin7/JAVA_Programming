package day_06;

public class TV {
	String color;
	boolean power;
	int channel;
	
	final static double in = 2.45;
	
	public void power() {
		power = !power;
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}
	
	public void display() {
		System.out.printf("Color: [%s], Power: [%s], Channel: [%d] \n",
				this.color, this.power, this.channel);
	}
}
