package day_10;

public class Cat extends Animal{
	String kind;
	String name;
	
	public Cat() {
		super("����̰�");
	}
	
	public Cat(String kind, String name) {
		this("����̰�", kind, name);
	}
	
	public Cat(String kind1, String kind2, String name) {
		super(kind1);
		//super.setKind(kind1);
		this.kind = kind2;
		this.name = name;
	}
	
	public void print() {
		System.out.printf("Cat[Kind(�θ�): %s, Kind: %s, Name: %s] \n", 
				super.getKind(), this.kind, name);
	}
	
	public String superKind() {
		return super.getKind();
	}
}
