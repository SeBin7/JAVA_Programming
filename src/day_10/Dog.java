package day_10;

public class Dog extends Animal {
	String kind;
	String name;
	
	public Dog() {
		super("강아지과");
	}
	
	public Dog(String kind, String name) {
		this("강아지과", kind, name);
	}
	
	public Dog(String kind1, String kind2, String name) {
		super(kind1);
		//super.setKind(kind1);
		this.kind = kind2;
		this.name = name;
	}
	
	public void print() {
		System.out.printf("Dog[Kind(부모): %s, Kind: %s, Name: %s] \n", 
				super.getKind(), this.kind, name);
	}
	
	public String superKind() {
		return super.getKind();
	}
	
}
