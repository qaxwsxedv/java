package day08;

public class Test04 {
/*
 	원의 정보를 기억할
 	Won을 제작해서 
 	반지금을 5 ~ 20 사이의 값으로 랜덤하게 갖는
 	원 하나를 만들어서 출력해보세요.
 	
 	반지금, 둘레, 넓이
 	
 	둘레구하는 공식
 		2 * 3.14 * 반지름
 	넓이 구하는 공식
 		반지름 * 반지름 * 3.14
 */
	public static void main(String[] args) {
		// 원 객체 만들고
		Won c1 = new Won();
		
		// 만들어진 원에 반지름 입력
		c1.rad = (int)(Math.random() * (20 - 5 + 1) + 5);
		
		// 둘레 셋팅
		c1.setArround();
		
		// 면적 셋팅
		c1.setArea();
		
		// 출력
		System.out.printf("반지금이 %3d 이고\n둘레가 %7.2f 이고\n면적이 %7.2f\n인 원입니다.", c1.rad, c1.arround, c1.area);
		
		
	}

}
