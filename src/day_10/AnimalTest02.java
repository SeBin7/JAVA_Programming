package day_10;

public class AnimalTest02 {

	public static void main(String[] args) {
		
		Dog d = new Dog("강아지과", "진돗개", "꾸루");
		Dog d1 = new Dog();
		Dog d2 = new Dog("강아지과", "삽삽");
		Cat c = new Cat("고양이과", "으", "꾸아");
		
		Fish f1 = new Fish();
		//f1.breath();
		Fish f2 = new Fish("물고기", "쿠퍼");
		//f2.print();
		//((Animal)f2).breath();
		
		
		Animal[] animals = {d, d1, d2, c, f1, f2};
		
		for(int i=0; i<animals.length; i++) {
			animals[i].print();
		}
 		
	}

}
