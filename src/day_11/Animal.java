package day_11;

public abstract class Animal {
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

	public abstract void breath();

	public void print() {		
	}
}
