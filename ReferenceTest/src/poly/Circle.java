package poly;

public class Circle extends Shape {
	Point center = new Point();
	int r;

	public Circle() {
		this(new Point(0, 0), 100);
	}

	public Circle(Point point, int r) {
		super();
		this.center = center;
		this.r = r;
	}

	@Override
	void draw() {
		System.out.printf("[center=(%d,%d), r=%d, Color=%s\n", center.x, center.y, r, color);
	}
}
