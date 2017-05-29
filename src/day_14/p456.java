package day_14;

import java.util.Arrays;

public class p456 {

	public static void main(String[] args) {
		int[] num = {55, 66 , 8, 6, 132};
		System.out.println(Arrays.toString(num));
		
		int[] backup1 = num.clone();
		System.out.println(Arrays.toString(backup1));
		System.out.println(num == backup1);
		
		Circle c = new Circle(new Point(5, 5), 4);
		System.out.println(c.toString());
		
		Employee emp1 = new Employee("sung", "999999-999999");
		try {
			Employee emp2 = (Employee) emp1.clone();
			System.out.println("emp2 Clone: " + emp2);
			
			Circle c2 = (Circle) c.clone();
			System.out.println("c1: " + c.toString());
			System.out.println("c2: " + c2.toString());
			System.out.println("===================");
			c.p = new Point(55,50);
			c.r = 4;

			System.out.println("c1: " + c.toString());
			System.out.println("c2: " + c2.toString());
			System.out.println();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		

	}

}

class Circle implements Cloneable {
	Point p;
	int r;
	
	public Circle() {}
	
	public Circle(Point p, int r) {
		super();
		this.p = p;
		this.r = r;
	}

	@Override
	public String toString() {
		String result = String.format("Circle [%s, ¹ÝÁö¸§=%d]", p.toString(), r);
		return result;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		Circle c = (Circle) obj;
		c.p = new Point(c.p.x, c.p.y);
		
		return c;
	}
	
}

class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}	
	
}








