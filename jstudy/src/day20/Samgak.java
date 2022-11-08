package day20;

public class Samgak implements Comparable {
	private int width, height;
	private double area;
	public Samgak() {}
	public Samgak(int width, int height) {
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
	// 오버로딩
	public void setArea() {
		area = width * height * 0.5;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public int compareTo(Object o) {
		int result =0;
		
		Samgak s = (Samgak) o;
		result = getArea() == s.getArea() ? 0 : ((getArea() < s.getArea()) ? 1 : -1);
		
		return result;
	}
}