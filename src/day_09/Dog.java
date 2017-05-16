package day_09;

public class Dog extends Animal {
	String kind = "Áøµ¾°³";
	String name;
	
	void print() {
		System.out.printf("Dog[Kind(ºÎ¸ð): %s, Kind: %s, Name: %s] \n", 
				super.kind, this.kind, name);
	}
	
	public String superKind() {
		return super.kind;
	}
	
}

class ADog extends Dog {
	String kind = "Çã½º´”";
	
	void print() {
		System.out.printf("ADog[Kind(ºÎ¸ð): %s, Kind: %s, Name: %s] \n", 
				super.kind, this.kind, name);
	}
}