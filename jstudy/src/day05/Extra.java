package day05;

public class Extra {
/*
	랜덤하게 0 ~ 100 사이의 정수를 발생시켜서
	그 정수를 점수로 갖는 학생의 학점을 출력해주는 프로그램을 작성하세요.
	학점은
				F <	60
		60 <=	D <	70
		70 <=	C < 80
		80 <=	B < 90
		90 <=	A <= 100
		
	으로 처리하는 것으로 하고
	3항 조건 연산자로 처리하세요.
	
	주의 ]
		스트레스가 많은 문제이니 심약한 사람은 피하시기 바랍니다.
 */
	public static void main(String[] args) {
		int score = (int)(Math.random() * 101);
		char grade = (score < 60) ? 'F' : (
					(score < 70) ? 'D' : 'C'
				);
	}

}
