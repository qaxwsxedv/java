package day20.ex01;

public class Dongle implements Figure{
	private int rad;
	private double arround, area;
	public Dongle() {}
	public Dongle(int rad) {
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
	public void setArround() {
		arround = 2 * rad * Math.PI;
	}
	public void setArround(double arround) {
		this.arround = arround;
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

}
