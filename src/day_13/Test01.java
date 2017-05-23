package day_13;

public class Test01 {

	public static void main(String[] args) {
		A a = new A();
		B b = new D();
		
	}

}

class A {
	String name;
	void print() {
		System.out.println(this.name);
	}
}

abstract class B {
	abstract void print();
	void go() {}
}

interface C {
	abstract void print();
	//default void go() {};
}
	
class D extends B{
	void print() {
		System.out.println("Hi!");
	}
}









