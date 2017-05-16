package day_09;

public class Car {
	private String color;
	private String gearType;
	private int door;
	
	public Car() {
		//this.color = "Yellow";
		//this.gearType = "AUTO";
		//this.door = 4;		
		this("Yellow", "AUTO", 4);
	}
	
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	public Car(Car c) {
		//this.color = c.color;
		//this.gearType = c.gearType;
		//this.door = c.door;
		this(c.color, c.gearType, c.door);
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getGearType() {
		return gearType;
	}
	
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	
	public int getDoor() {
		return door;
	}
	
	public void setDoor(int door) {
		this.door = door;
	}
	
	public void print() {
		System.out.println(color + ", " + gearType + ", " + door);
	}
	
	public static void main(String[] args) {
		Car c1 = new Car("Blue", "AUTO", 4);
		c1.print();
		
		Car c2 = new Car();
		c2.print();
		
		//Car c3 = null;
		//c3.print();
		
		Car c3 = c1;
		c3.print();
		System.out.println(c3 == c1);
		
		Car c4 = new Car(c1);			//인스턴스 복제
		c4.print();
		System.out.println(c4 == c1);
	}
}






