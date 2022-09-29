package oday03;

/*
	문제 3 ]
		
		2x + 4y = 10
		의 방정식을 충족시키는 x, y 의 조합을 출력하세요.
		
		단, x, y 는 모두 0보다 크거나 같아야하고
			10보다는 작거나 같아야 한다.
			둘 모두 정수...
 */
public class Ex03 {

	public static void main(String[] args) {
		int x, y;
		for(x = 0 ; x < 10 ; x++ ) {
			for( y = 0; y < 10 ; y++ ) {
				if(2 * x + 4 * y == 10) {
					System.out.println("x 가 " + x + " 이고 y 가 " + y + " 일 때 2x + 4y = 10 을 만족합니다.");
				}
			}
		}
	}

}