package day14;

public class Samgak {
	public int width, height;
	public double area;
	
	public Samgak() { // 기본 생성자. 생성자가 하나도 정의되지 않으면 자바가상머신이 만들어서 호출해준다.
		this(1, 1); // 아래의 Samgak(int width, int height) 을 호출...
	}
	public Samgak(int width, int height) { // 생성자 오버로딩
		// 밑변과 높이를 셋팅해주면서 객체를 만들어주는 생성자
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public void setArea() {
		area = width * height * 0.5;
	}
	
	public void setArea(double area) { // setArea() 오버로딩
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "밑변이 " + width + " 이고\n높이가 " + height + " 이고\n면적이 " +
				area + " 인 삼각형입니다.";
	}
}