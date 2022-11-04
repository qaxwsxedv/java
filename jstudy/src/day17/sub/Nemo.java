package day17.sub;

public class Nemo implements Figure {
	private int width, height;
	private double area;
	public Nemo() {}
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	@Override
	public void toPrint() {
		System.out.printf("%-4s - 가  로 : %2d, 세  로 : %7d, 면  적 : %7.2f\n",
				"사각형", width, height, area
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
		area = width * height;
	}
	public void setArea(double area) {
		this.area = area;
	}

}
