package oday02;

public class Test01 {

	public static void main(String[] args) {
		// 숫자 형태의 문자 4개를 랜덤하게 만들어서 순서대로 나열하고
		// 그 숫자를 24로 나눈 몫과 나머지를 계산하세요.
		
		/*
		 * char ch = 'a' + 'a' ;
		 * 
		 * System.out.println(ch); System.out.println((int) ch);
		 */
		
		// 작업순서
		// 3. 4번 반복한다.
		
		String sno = "";
		for(int i = 0 ; i < 4 ; i++) {
			// 1. 랜덤하게 숫자형태의 문자를 만든다.
			// 숫자형태의 문자들의 아스키코드 값은 0 ~ 9 만들어진다.
			char ch = (char)(Math.random() * ('9' - '0' +1) + '0');
			
			if(i == 0 && ch == '0') {
				// 카운트 1감소시키고
				--i; // -1
				// i--; // i==0
				continue;
			}
			// 2. 만든 문자를 문자열에 덧붙인다.
			sno = sno + ch;
			
		}
		
		// 정수로 변환
		int num = Integer.parseInt(sno);
		
		// 계산한다.
		
		int mok = num / 24;
		int namuji = num % 24;
		
		System.out.printf("만든 숫자 : %s, \n24 나눈 몫 : %d, \n24로 나눈 나머지 : %d", sno, mok, namuji);
	}
	
}
