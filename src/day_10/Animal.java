package day_10;

public class Animal {
	private String kind;
	
	public Animal() {}
	
	public Animal(String kind) {
		this.kind = kind;
	}
		
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public void breath() {
		System.out.println("Æó·Î Breath....");
	}

	public void print() {		
	}
}
