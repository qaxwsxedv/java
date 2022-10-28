package day13;

import static java.lang.Math.*;
public class Circle {
	private int rad;
	private double arround, area;
	
	public void setRad(int rad) {
		this.rad = rad;
	}
	public int getRad() {
		return rad;
	}
	public void setArround() {
		arround = 2 * rad * PI ;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public double getArround() {
		return arround;
	}
	public void setArea() {
		area = rad * rad * PI ;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getArea() {
		return area;
	}
}
