package day_09;

public class AnimalTest {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.print();
		dog.breath();
		
		ADog aDog = new ADog();
		aDog.print();
		System.out.println(aDog.superKind());
		
	}
}
