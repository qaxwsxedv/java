package day14;

public class Ex02 {
	Samgak[] semo;
	Nemo[] nemo;
	Circle[] won;
/*
	랜덤하게 0 ~ 2 사이의 숫자를 발생시켜서
		0 - 원
		1 - 삼각
		2 - 네모
	배열을 만드는데 5 ~ 10 사이의 데이터를 랜덤하게 가지는 배열로 만들고
	
	생성자를 통해서 도형이 객체가 되는 순간 기본 셋팅이 완료되도록 하고
	결과를 출력하세요.
 */
	public Ex02() {
		// 배열을 완성할 도형 결정
		int doh = (int)(Math.random()*3);
		// 배열 길이 랜덤하게 생성
		int len = (int)(Math.random()*6+5);
		
		switch(doh) {
		case 0:
			won = getCircle(len);
			break;
		case 1:
			semo = getSamgak(len);
			break;
		case 2:
			nemo = getNemo(len);
			break;
		
		}
			
	}
	
	// 입력된 길이만큼의 Circle 배열을 만들어서 반환해주는 함수
	public Circle[] getCircle(int len) {
		// 반환값 변수
		Circle[] c = new Circle[len]; // 아직 기억할 공간만 확보한 상태
		// ==> 아직 객체는 들어있지 않은 상태
		
		// 배열 완성하고
		for(int i = 0 ; i < len ; i++) {
			int rad = (int)(Math.random()*16+5);
			c[i] = new Circle(rad);
		}
		// 반환하고
		return c;
	}
	public Samgak[] getSamgak(int len) {
		Samgak[] s = new Samgak[len];
		for(int i = 0 ; i < len ; i++) {
			int width =(int)(Math.random()*16+5);
			int height =(int)(Math.random()*16+5);
			s[i] = new Samgak(width, height);
		}
	}
	public Nemo[] getNemo(int len) {
		Nemo[] n = new Nemo[len];
		for(int i = 0 ; i < len ; i++) {
			int width = (int)(Math.random()*16+5);
			int height = (int)(Math.random()*16+5);
			n[i] = new Nemo(width, height);
		}
	}
	

	public static void main(String[] args) {
		new Ex02();

	}

}
