package day14;

public class Ex01_01 {
/*
	3 ~ 7 사이의 랜덤한 정수를 만들어서
	그 정수만큼의 Semo 객체를 만들어서 
	정보를 출력해주는 프로그램을 작성하세요.
	
 */
	
	public Ex01_01() {
		int cnt = (int)(Math.random()*5 + 3);
		
		for(int i = 0 ; i < cnt ; i++ ) {
			Semo s = new Semo();
			setWidth(s); // s 는 Semo 의 인스턴스의 주소를 기억하는 레퍼런스 변수
			setHeight(s);
			setArea(s);
			toPrint(s);
		}
	}
	
	// 삼각형의 밑변 셋팅해주는 함수
	public void setWidth(Semo semo) {
		semo.width = (int)(Math.random()*16 + 5);
	}
	
	// 높이 셋팅해주는 함수
	public void setHeight(Semo semo) {
		semo.height = (int)(Math.random()*16 + 5);
	}
	
	// 면적 셋팅해주는 함수
	public void setArea(Semo semo) {
		semo.area = semo.width * semo.height * 0.5;
	}
	
	// 정보 출력해주는 함수
	public void toPrint(Semo s) {
		System.out.printf("밑변이 %3d 이고\n높이가 %3d\n그리고 넓이가 %5.2f 인 삼각형\n\n", 
																s.width, s.height, s.area);
	}
	
	public static void main(String[] args) {
		new Ex01_01();
	}

}