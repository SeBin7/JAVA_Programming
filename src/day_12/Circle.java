package day_12;

abstract class Shape {
	abstract double getArea(double r);
}

interface Drawable {
/*	public void draw() {
		// 사용 불가
	}*/
	
	void draw();					// abstract 필요없음, 자동 public
	
	void go();
}

interface Colorable {
	void drawColor();
	
	void go();
}

interface DrawAndColorable extends Drawable, Colorable{

}

public class Circle extends Shape implements DrawAndColorable{

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		
		Shape s = new Circle();
		((Drawable)s).draw();
		
		Drawable d = new Circle();
		d.draw();
		System.out.println(((Shape)d).getArea(5.0));
		
	}

	@Override
	double getArea(double r) {
		return r * r * Math.PI;
	}
	
	@Override
	public void draw() {
		System.out.println("draw...");
	}

	@Override
	public void drawColor() {
		System.out.println("color draw...");
		
	}

	@Override
	public void go() {
		System.out.println("No error");
	}
	
	
}
