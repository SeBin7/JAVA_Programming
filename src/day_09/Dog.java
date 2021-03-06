package day_09;

public class Dog extends Animal {
	String kind = "진돗개";
	String name;
	
	void print() {
		System.out.printf("Dog[Kind(부모): %s, Kind: %s, Name: %s] \n", 
				super.kind, this.kind, name);
	}
	
	public String superKind() {
		return super.kind;
	}
	
}

class ADog extends Dog {
	String kind = "허스킈";
	
	void print() {
		System.out.printf("ADog[Kind(부모): %s, Kind: %s, Name: %s] \n", 
				super.kind, this.kind, name);
	}
}