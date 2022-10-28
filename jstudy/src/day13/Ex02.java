package day13;

public class Ex02 {
/*
	10개의 원을 기억할 Circle 배열을 입력받아서
	반지름을 랜덤하게 셋팅하고 둘려와 넓이를 계산해서 채워서
	배열을 완성해서
	출력해주는 프로그램을 작성하세요.
	
	단, 각 기능은 함수를 제작해서 처리하세요.
 */
	public Ex02() {
		Circle[] won;
		
		won = getCircles();
		
		toPrint(won);
	}

	public static void main(String[] args) {
		new Ex02();

	}
	
	// 출력함수
	public void toPrint(Circle[] c) {
		for(int i = 0 ; i < c.length ; i++) {
			System.out.printf("반지름이 %3d 이고\n둘레가 %5.2f 이고\n면적이 %5.2f 인 원\n", c[i].getRad(), c[i].getArround(), c[i].getArea());
			System.out.println();
		}
	}
	
	public Circle[] getCircles() {
		Circle[] c = new Circle[10];
		
		for(int i = 0 ; i < c.length ; i++) {
			// Circle 인스턴스 채우고
			c[i] = new Circle();
			
			// 반지름 셋팅하고
			c[i].setRad((int)(Math.random()*16 + 5));
			
			// 방법1
			c[i].setArround(getArnd(c[i].getRad()));
			c[i].setArea(getArea(c[i].getRad()));
			
			/*
			// 방법 2 - 멤버 함수로 처리하는 방법
			c[i].setArea();
			c[i].setArround();
			 */
		}
		
		return c;
	}
	
	// 둘레 계산해서 반환해주는 함수
	public double getArnd(int r) {
		double result = 0;
		result = 2 * r * Math.PI;
		return result;
	}
	
	// 면적 계산해서 반환해주는 함수
	public double getArea(int r) {
		double result = 0;
		result = r * r * Math.PI;
		return result;
	}

}
