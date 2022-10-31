public class Circle {
	private int rad;
	private double arround, area;
	public Circle() {
		// 아무것도 입력안한 경우에는 반지름을 1로 셋팅하기로 하자.
		this(1);
	}
	public Circle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
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
	// setArround() 오버로딩
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