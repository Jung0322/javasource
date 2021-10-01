package classTest;

public class Triangle {
	double height, bottom;
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBottom() {
		return bottom;
	}

	public void setBottom(double bottom) {
		this.bottom = bottom;
	}

	public Triangle(double height, double bottom) {
		// TODO Auto-generated constructor stub
		this.height = height;
		this.bottom = bottom;
	}
	
	double result() {
		return height * bottom / 2;
	}
	
}
