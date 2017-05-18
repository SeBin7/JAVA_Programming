package day_10;

public class Cat extends Animal{
	String kind;
	String name;
	
	public Cat() {
		super("고양이과");
	}
	
	public Cat(String kind, String name) {
		this("고양이과", kind, name);
	}
	
	public Cat(String kind1, String kind2, String name) {
		super(kind1);
		//super.setKind(kind1);
		this.kind = kind2;
		this.name = name;
	}
	
	public void print() {
		System.out.printf("Cat[Kind(부모): %s, Kind: %s, Name: %s] \n", 
				super.getKind(), this.kind, name);
	}
	
	public String superKind() {
		return super.getKind();
	}
}
