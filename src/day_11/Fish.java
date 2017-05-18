package day_11;

public class Fish extends Animal {
	String name;
	
	public Fish() {
		super("물고기");
	}
	
	public Fish(String kind, String name) {
		super(kind);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Method Overriding
	public void breath() {
		System.out.println("아가미 breath...");
	}

	public void print() {
		System.out.printf("Fish[%s, %s] \n", getKind(), name);
	}
}
