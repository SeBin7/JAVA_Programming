package day_13;

public class Test04 {
//���ٽ� == �͸��Լ�
//���ٽ� ������ �Լ� ����� ��� ����
	public static void main(String[] args) {
		Controller delete = new Controller() {

			@Override
			public void exex() {
				System.out.println("Delete ����");
			}
			
		};
		delete.exex();
		
		Controller update = () -> {
			System.out.println("Update ����");
		};
		
		update.exex();
		
		Controller insert = () -> System.out.println("Insert ����");
		Controller list = () -> System.out.println("List ����");
		Controller modify = () -> System.out.println("Modify ����");
		//Inner Class X, �Լ��̱� ������ ��ü���� �δ� ����
		
	}

}

//@Function
interface Controller {
	void exex();
}