package day08;

public class Semo {
	public int width, height;
	public double area;
	// 밑변과 높이가 결정된 후 호출되면 면적을 계산해서 셋팅해주는 함수
	public void setArea() {
		area = width * height / 2.;
	}
}
