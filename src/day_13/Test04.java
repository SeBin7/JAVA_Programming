package day_13;

public class Test04 {
//람다식 == 익명함수
//람다식 변수에 함수 등록후 사용 가능
	public static void main(String[] args) {
		Controller delete = new Controller() {

			@Override
			public void exex() {
				System.out.println("Delete 수행");
			}
			
		};
		delete.exex();
		
		Controller update = () -> {
			System.out.println("Update 수행");
		};
		
		update.exex();
		
		Controller insert = () -> System.out.println("Insert 수행");
		Controller list = () -> System.out.println("List 수행");
		Controller modify = () -> System.out.println("Modify 수행");
		//Inner Class X, 함수이기 때문에 객체보다 부담 덜함
		
	}

}

//@Function
interface Controller {
	void exex();
}