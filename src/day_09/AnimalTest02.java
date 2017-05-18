package day_09;

public class AnimalTest02 {

	public static void main(String[] args) {
		
/*		Animal a = new Animal();
		a.breath();
		System.out.println(a.kind);
		System.out.println(a.toString());
		
		Dog d = new Dog();*/
		
		Object a = new Animal();
		Animal aa = (Animal) a;
		
		((Animal)a).breath();
		System.out.println(((Animal)a).kind);		//
		System.out.println(a.toString());
		
		Dog d = new Dog();
		System.out.println(d.kind);
		System.out.println(((Animal)d).kind);
		
		Object o1 = "Hello";
		Object o2 = new Dog();
		Object o3 = new Animal();
		
/*		if(o2 instanceof Dog) {
			Dog o4 = (Dog) o2;				//O
		}
		if(o3 instanceof Dog) {
			Dog o5 = (Dog) o3;				//X
		}
		if(o1 instanceof Dog) {
			Dog o6 = (Dog) o1;				//X
		}*/
		System.out.println("==============");
		typeCheck(o2);
		typeCheck(o3);
		
		
		System.out.println("==============");
		Object oo = "Object Test";
		System.out.println(oo instanceof Animal);
		
	}

	public static void typeCheck(Object obj) {
		if(obj instanceof Dog)
			System.out.println("[Dog type]");
		if(obj instanceof Animal)
			System.out.println("[Animal type]");
		if(obj instanceof Object)
			System.out.println("[Object type]");
	}
}
