package day_12;

class A {
	String name = "A";
	
	A() {
		System.out.println("A 持失");
	}
	
	class B {
		
		B() {	
			System.out.println("B 持失");
		}
		
		void print() {
			System.out.println(name);
		}
	}
	
}

public class Test03 {

	public static void main(String[] args) {
		//A a = new A();
		A.B b = new A().new B();
		b.print();
	}

}
