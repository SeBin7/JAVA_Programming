package day_11;

public class DrawShape {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(new Point(150, 150), 50, "Yellow");
		
		Point[] p = { new Point(100, 100),
					  new Point(140, 50),
					  new Point(200, 100)
					};

		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150, 150), 50);
		
		t.draw();
		c.draw();
	}

}

class Shape {
	String color = "black";
	void draw() {
		System.out.printf("[Color=%s] \n", color);
	}
}

class Point {
	int x;
	int y;
	
	Point() {
		this(0, 0);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		return "(" + x + "," + y + ")";
	}
	
}

class Circle extends Shape {
	Point center;
	int r;
	
	Circle() {
		this(new Point(0, 0), 100);
	}
	
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	Circle(Point center, int r, String s) {
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.printf("[center=(%d, %d), r=%d, color=%s] \n",
				center.x, center.y, r, color);
	}
}

class Triangle extends Shape {
	Point[] p = new Point[3];
	
	Triangle(Point[] p) {
		this.p = p;
	}
	
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s] \n",
				p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}










