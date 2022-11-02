package day16.ex;

public class Dongle extends Dohyung{
	private int rad;
	private double area, arround;
	public Dongle() {}
	public Dongle(int rad) {
		this.rad = rad;
		setArea();
		setArround();
	}
	
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		area = rad * rad * Math.PI;
	}
	public void setArea(double area) {
		this.area = area;
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
	
	@Override
	public void toPrint() {
		System.out.printf(
				"반지름 이 %3d 이고" + 
				"\n둘래가 %5.2f 이고" + 
				"\n넓이가 %5.2f 인 원형\n\n", 
				rad, arround, area
				);
	}

}
