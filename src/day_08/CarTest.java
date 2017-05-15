package day_08;

import java.util.Arrays;

public class CarTest {
	public static void main(String[] args) {
		//Car c1 = new Car();
		//c1.print();
		//System.out.println(Car.num);
		
		System.out.println(Arrays.toString(Car.num));
		
		Car t = null;
		Car c2 = new Car("Yellow", "AUTO", 4);
		System.out.println("======Main End=====");
		
		
		
/*		Car c2 = new Car("Yellow", "AUTO", 4);
		c2.print();
		
		Car c3 = new Car(c2);
		c3.print();

		System.out.println(c2 == c3);
		
		Car c4 = c2;
		System.out.println(c4 == c2);
		System.out.println(c4);
		System.out.println(c2);
		System.out.println(c3);*/
	}
}
