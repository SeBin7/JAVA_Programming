package day_08;

public class Car {
	//int[] num = new int[5];			// instance variable
	static int[] num = new int[5];		// static variable
	private String color;				//  
	private int door;					// 
	private String gearType;
	
	static {
		System.out.println("static{} initialization block");
		for(int i=0; i<num.length; i++) {
			num[i] = (int) (Math.random()*45 +1);
		}
	}
	
	{
		System.out.println("{} initialization block");
		System.out.println(color);
		System.out.println(num[0]);
	}
	
	Car() {
		//color = "White";
		//gearType = "AUTO";
		//door = 4;
		this("White", "AUTO", 4);
		System.out.println("Car() constructor perform");
	}
	
	Car(String color, String gearType, int door) {
		//this.color = color;
		//this.gearType = gearType;
		//this.door = door;
		this.setColor(color);
		this.setGearType(gearType);
		this.setDoor(door);
	}
	
	Car(Car c) {
		this(c.getColor(), c.getGearType(), c.getDoor());
		//this.color = c.getColor();
		//this.gearType = c.getGearType();
		//this.door = c.getDoor();
		
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public String getGearType() {
		return gearType;
	}

	public void setGearType(String gearType) {
		this.gearType = gearType;
	}

	public void print() {
		System.out.printf("Car[Color: '%s', GearType: '%s', Door: '%d'] \n", color, gearType, door);
	}
}
