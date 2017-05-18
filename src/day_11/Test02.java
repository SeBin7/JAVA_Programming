package day_11;

public class Test02 {

	public static void main(String[] args) {
		//Animal a = new Animal();      //추상메소드 때문
		
		Animal[] a = new Animal[3];
		
		Dog b = new Dog();
		a[1] = b;
		b.breath();
		a[1].breath();
	}

}
