package day_14;

public class Test04 {

	public static void main(String[] args) {
		Employee2<String> emp1 = new Employee2("È«±æµ¿", "9456");
		
		System.out.println(emp1);
		
		Employee2<Integer> emp2 = new Employee2("°í¾¾", 20265);
		System.out.println(emp2);
	}

}

class Employee2<T> extends Object {
	private String name;
	private T ssn;
	
	public Employee2() {}
	
	public Employee2(String name, T ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public T getSsn() {
		return ssn;
	}
	
	public void setSsn(T ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", ssn=" + ssn + "]";
	}
	
	
}