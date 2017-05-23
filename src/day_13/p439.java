package day_13;

public class p439 {
	public static void main(String[] args) {
		Employee em = new Employee();
		
		try {
			em.setEmail("asdf@sdkjfao");
			em.print();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//System.out.println("asdfsjl");
		Employee em1 = null;
		try {
			em1 = new Employee("sung", "ss@gmail.cp,");
			em1.print();
		} catch (EmailcheckedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}
}

class Employee {
	String name;
	String email;
	
	public Employee() {}
	
	public Employee(String name, String email) throws EmailcheckedException{
		this.name = name;
/*		try {
			setEmail(email);
		} catch (EmailcheckedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}*/
		setEmail(email);		
	}
	
	void print() {
		System.out.println(name + " - " + email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email)
					throws EmailcheckedException {
		// throws -> 사용자 정의 예외 클래스
		if(email.indexOf("@") == -1) 		
			throw new EmailcheckedException();
		
		this.email = email;
	}
}

class EmailcheckedException extends Exception {
	EmailcheckedException() {
		super("유효하지 않는 이메일입니다.");
	}
	EmailcheckedException(String errMsg) {
		super(errMsg);
	}
}

