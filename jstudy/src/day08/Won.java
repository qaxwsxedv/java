package day08;

public class Won {
	int rad;
	double arround, area;
	
	// 둘레 셋팅함수
	public void setArround() {
		arround = 2 * rad * 3.14;
		
	}
	
	// 면적 셋팅함수
	public void setArea() {
		area = rad * rad * 3.14;
	}
}
