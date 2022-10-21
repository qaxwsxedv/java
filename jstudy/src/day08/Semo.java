package day08;

public class Semo {
	int width, height;
	double area;
	// 밑변과 높이가 결정된 후 호출되면 면적을 계산해서 셋팅해주는 함수
	public void setArea() {
		area = width * height / 2.;
	}
}
