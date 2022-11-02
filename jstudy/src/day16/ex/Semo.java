package day16.ex;

public class Semo extends Dohyung {
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
	public void setArea() {
		area = width * height * 0.5;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public void toPrint() {
		System.out.printf(
				"밑변이 %3d 이고" + 
				"\n높이가 %3d 이고" + 
				"\n넓이가 %5.2f 인 삼각형\n\n", 
				width, height, area
				);
	}

}
