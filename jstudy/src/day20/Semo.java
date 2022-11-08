package day20;

public class Semo {
	private int width, height;
	private double area;
	public Semo() {}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea() {
		return area;
	}
	// 오버로딩
	public void setArea() {
		area = width * height * 0.5;
	}
	public void setArea(double area) {
		this.area = area;
	}

}
