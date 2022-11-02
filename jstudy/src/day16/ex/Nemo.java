package day16.ex;

public class Nemo extends Dohyung {
	private int width, height;
	private double area;

	public Nemo() {}
	public Nemo(int width, int height) {
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
		area = width * height ;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public void toPrint() {
		System.out.printf(
				"가로가 %3d 이고" + 
				"\n세로가 %3d 이고" + 
				"\n넓이가 %5.2f 인 사각형\n\n", 
				width, height, area
				);
	}

}
