package day_09;

public class Dog extends Animal {
	String kind = "������";
	String name;
	
	void print() {
		System.out.printf("Dog[Kind(�θ�): %s, Kind: %s, Name: %s] \n", 
				super.kind, this.kind, name);
	}
	
	public String superKind() {
		return super.kind;
	}
	
}

class ADog extends Dog {
	String kind = "�㽺��";
	
	void print() {
		System.out.printf("ADog[Kind(�θ�): %s, Kind: %s, Name: %s] \n", 
				super.kind, this.kind, name);
	}
}