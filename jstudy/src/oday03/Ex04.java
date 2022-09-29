package oday03;

/*
	문제 4 ]
		3 ~ 100사이의 숫자 하나를 랜덤하게 발생시켜서
		이 숫자가 소수인지 판별해주는 프로그램을 작성하세요.
		
		참고 ] 
			소수 : 1과 자기자신 이외에 나눌수 있는 수가 없는 수
 */

public class Ex04 {

	public static void main(String[] args) {
		int no = (int)(Math.random()*98 + 3);	// (큰수 - 작은수 + 1)+ 작은수
		
		// 소수인지 판별
		int i = 2;
		// 결과값 변수
		String result = "소수입니다.";
		for(; i < no; i++) {
			if(no % i == 0) {  //10  % 5 = 0
				// i로 나누어 떨어지는 경우
				System.out.println(i + "번째 횟수 돌고있음");
				result = "소수가 아닙니다.";
				// 반복작업에 의미가 없어졌으므로 즉시 종료시킨다.
				break;
			}
		}
		System.out.println(no + " 는 " + result);
	}

}
