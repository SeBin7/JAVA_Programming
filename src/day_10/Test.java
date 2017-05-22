package day_10;

public class Test {
	public static void main(String[] args) {
		Object obj1 = new Animal();
		Object obj2 = new String();
		obj2 = obj1;
		
		if(obj2 instanceof Animal) {
			Animal a = (Animal) obj2;
		}
		
		Animal a = new Dog();
		Cat c = (Cat) a;
		
	}
}
