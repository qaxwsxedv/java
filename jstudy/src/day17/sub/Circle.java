package day17.sub;

public class Circle implements Figure {
	private int rad;
	private double arround, area;
	public Circle() {}
	public Circle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}

	@Override
	public void toPrint() {
		System.out.printf("%-6s - 반지름 : %2d, 둘  레 : %7.2f, 면  적 : %7.2f\n",
				"원", rad, arround, area
		);

	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArround() {
		return arround;
	}
	// 오버로딩
	public void setArround() {
		arround = 2 * rad * Math.PI;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public double getArea() {
		return area;
	}
	// 오버로딩
	public void setArea() {
		area = rad * rad * Math.PI;
	}
	public void setArea(double area) {
		this.area = area;
	}

}
