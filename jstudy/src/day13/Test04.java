package day13;

public class Test04 {
/*
	랜덤하게 가로, 세로 길이를 만들어서
	사각형의 면적을 출력해주는 프로그램을 작성하세요.
	단,
		길이셋팅
		면적계산
		출력기능
	은 함수로 제작해서 해결하세요.
 */
	
	int garo, sero, area; // 전역 변수이르로 클래스내의 어느 곳에서든지 접근 가은하게 된다.
	
	public Test04() {
		// 길이 셋팅 함수 호출
		setLength();
		// 면적 계산후 셋팅 함수 호출
		setArea();
		// 사각형 정보 출력 함수 호출
		toPrint();
		
		
	}

	public static void main(String[] args) {
		new Test04();

	}
	// 길이 셋팅 함수
	public void setLength() {
		garo = (int)(Math.random()*16+5);
		sero = (int)(Math.random()*16+5);
	}
	// 면적 계산 함수
	public void setArea() {
		area = garo * sero ;
	}
	
	// 출력 함수
	public void toPrint() {
		System.out.printf("가로가 %3d 이고 세로가 %3d 인 사각형의 넓이는 %4d 입니다.", garo, sero, area);
	}
}
