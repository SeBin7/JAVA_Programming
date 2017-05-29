package day_14;

import java.util.Date;

public class Test05 {

	public static void main(String[] args) {
		Employee3<String, Integer> emp1 = new Employee3("È«±æµ¿", 201);
		System.out.println(emp1);
	
		Employee3<String, Integer> emp2 = new Employee3("»ï±æµ¿", 202.4f);
		System.out.println(emp2);
		
		Employee3 emp3 = new Employee3("È«±æµ¿", 44);
		System.out.println(emp3);
		
	}

}

class Employee3<T, V extends Number> {
	private T name;
	private V number;
	
	public Employee3() {}
	
	public Employee3(T name, V number) {
		this.name = name;
		this.number = number;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public V getNumber() {
		return number;
	}

	public void setNumber(V number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Employee3 [name=" + name + ", number=" + number + "]";
	}
	
	
}