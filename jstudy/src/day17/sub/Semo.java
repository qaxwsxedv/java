package day17.sub;

public class Semo implements Figure {
	private int width, height;
	private double area;
	public Semo() {}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	@Override
	public void toPrint() {
		System.out.printf("%-4s - 밑  변 : %2d, 높  이 : %7d, 면  적 : %7.2f\n",
				"삼각형", width, height, area
		);

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

}
