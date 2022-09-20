package oday01;

public class Ex03 {
/*
	문제 3 ]
		30 ~ 50 사이의 정수를 랜덤하게 발생시켜서
		2 부터 발생한 수 사이의 소수를 출력하세요.
		
		참고 ]
			소수 : 1과 자기자신 이외에 나눌수 있는 수가 없는 수
 */
	public static void main(String[] args) {
		int n = (int) (Math.random() * (50 - 30 + 1) + 30);
		System.out.println("꺼낸 숫자 : " + n);
		// 사이의 숫자를 하나씩 꺼내는 반복문
		loop: // 라벨, 레이블 이 붙은 for 명령
		for(int i = 2 ; i < n; i++ ) {
			boolean bool = true;
			
			// 꺼낸 숫자가 나누어 떨어지는 숫자가 있는지 판별해줘야 한다. 
			for(int j = 2 ; j < i; j++ ) {
				if(i % j == 0) {
					// 어떤수가 나눌수 있는 수라면
					// i는 소수가 아니라는 의미이므로
					// 더이상 나누는 수를 꺼내오는 의미가 없어진다.
					// 따라서 나눈 나머지를 계산할 필요도 없어진다.
					bool = false;
					continue;
				}
			}
			
			// 소수임을 출력
			if(bool) { // flag  기법
				System.out.println( i + " 는 소수입니다.");
			}
		}
	}

}
