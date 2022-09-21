package oday02;

public class Ex08 {
/*
	문제 6 ]
	 	양의 정수 하나를 입력한 후  그 숫자보다 큰 가장가까운 10의 배수와
		입력한 숫자와의 차이를 출력하는 프로그램을 작성하세요.
 */
	public static void main(String[] args) {
		int no = (int)(Math.random()*90 +10);
		
		int result = (no + 10) - (no%10);
		
		int result2 = (no / 10 + 1 ) * 10;
		
		
	}

}
