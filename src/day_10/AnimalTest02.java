package day_10;

public class AnimalTest02 {

	public static void main(String[] args) {
		
		Dog d = new Dog("��������", "������", "�ٷ�");
		Dog d1 = new Dog();
		Dog d2 = new Dog("��������", "���");
		Cat c = new Cat("����̰�", "��", "�پ�");
		
		Fish f1 = new Fish();
		//f1.breath();
		Fish f2 = new Fish("�����", "����");
		//f2.print();
		//((Animal)f2).breath();
		
		
		Animal[] animals = {d, d1, d2, c, f1, f2};
		
		for(int i=0; i<animals.length; i++) {
			animals[i].print();
		}
 		
	}

}
