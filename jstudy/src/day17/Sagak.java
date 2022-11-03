package day17;

public class Sagak extends Nemo {
	private int width, height;
	private double area;
	public Sagak() {}
	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	

	public Sagak(int garo, int sero) {
		super(garo, sero);
		
	}

}
