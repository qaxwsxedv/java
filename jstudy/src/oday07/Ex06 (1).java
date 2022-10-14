package oday07;

/*	
	문제 6 ]
		1년은 365.2426일이다.
		이것은 몇일 몇 시간 몇 분 몇 초인지를 계산해서 출력하세요.
		
	연산자 문제
	
	힌트 ]
		0.1 일은 
			0.1 * 24 * 60 * 60 
		초 이다.
 */
public class Ex06 {

	public static void main(String[] args) {
		double rYear = 365.2426;
		int year = (int) rYear;
		
		int total = (int)((rYear - year) * 24 * 60 * 60) ;
		
		int sec = total % 60;
		
		total /= 60;
	}
 
}
