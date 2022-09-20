package oday01;

public class Ex01 {
/*
	문제 1 ]
		구구단의 단을 랜덤하게 발생시켜서
		그 단의 구구단을 출력하는 프로그램을 작성하세요.
		
 */
	public static void main(String[] args) {
		
		int dan = (int) (Math.random() * (9 - 2 + 1) + 2);
		// 2 x 1 = 2 출력
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(dan + " x " + (i) + " = " + ( dan * i));
			
			/*
				dan == 5 , i == 7
				
				5 + " x " + 7 + " = " + (5 * 7)
				
				"5 x " + 7 + " = " + (5 * 7)
				"5 x 7" + " = " + (5 * 7)
				"5 x 7 = " + 35
				"5 x 7 = 35"
			 */
		}
	}

}