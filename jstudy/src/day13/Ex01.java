package day13;

public class Ex01 {
/*
	반지름을 랜덤하게 입력한 후
	원의 넓이와 둘레를 계산해서
	출력해주는 프로그램을 제작하세요.
	단,
		반지름 셋팅
		넓이 계산
		둘레 계산
		출력 기능
	은 각각의 함수로 제작해서 하세요.
 */
	int rad;
	double arround, area;
	
	public Ex01() {
		// 반지름 셋팅 함수 호출
		setRad();
		// 면적 계산후 셋팅 함수 호출
		setArea();
		// 둘레 계산후 셋팅 함수 호출
		setArround();
		// 출력 함수 호출
		toPrint();
	}
	
	public static void main(String[] args) {
		new Ex01();

	}
	// 반지금 셋팅 함수
	public void setRad() {
		rad = (int)(Math.random()*16+5);
	}
	// 넓이 셋팅 함수
	public void setArea() {
		area = rad * rad * 3.14;
	}
	// 둘레 셋팅 함수
	public void setArround() {
		arround = 2 * rad * 3.14;
	}
	// 출력 함수
	public void toPrint() {
		System.out.printf("반지름이 %3d 이고 둘레가 %7.2f  이고 넓이가 %7.2f 입니다.", rad, arround, area);
	}

}
