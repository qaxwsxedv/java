package day17;

public class Dongle extends Figure {
	private int rad;
	private double arround, area;
	public Dongle() {}
	public Dongle(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	@Override
	public void setArea() {
		area = rad * rad * Math.PI;
	}

	@Override
	public void toPrint() {
		System.out.printf(
				"원\n\t반지름 : %2d\n\t원둘레 : %5.2f\n\t원넓이 : %5.2f\n\n", 
				rad, arround, area
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
	public void setArround() {
		arround = 2 * rad * Math.PI;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

}
