package day_14;

import java.util.Date;

public class p451 {
	public static void main(String[] args) {
		String msg = "Hello Java!!";
		String msg2 = "Hello Java!!";
		System.out.println(msg.equals(msg2));
		
		Date today = new Date();
		System.out.println(today);
		
		int num = 100;
		System.out.println(num);
		
		Employee emp1 = new Employee("sung", "999999-999999");
		Employee emp2 = new Employee("sung", "999999-999999");
		Employee emp3 = emp1;
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.equals(emp3));
		
	}
}

class Employee implements Cloneable {
	private String name;
	private String ssn;
	
	public Employee(String name, String ssn) {
		setName(name);
		setSsn(ssn);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public void print() {
		System.out.printf("[name:%s , ssn:%s]", name, ssn);
	}
	
    public String toString() {
        return "Employee[" + name + ", " + ssn + "]";
    }
    
    public boolean equals(Object obj) {
    	boolean result = false;
    	
    	if(!(obj instanceof Employee))
    		return false;
    	
    	Employee e = (Employee) obj;
    	if(name.equals(e.name) && ssn.equals(e.ssn)) {
    		result = true;
    	}
    	
    	return result;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	return super.clone();
    }
}