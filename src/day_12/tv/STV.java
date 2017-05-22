package day_12.tv;

public class STV implements TV {

	@Override
	public void powerOn() {
		System.out.println("STV Power On");
		
	}

	@Override
	public void powerOff() {
		System.out.println("STV Power Off");
	}

}
