package oday03;

import javax.swing.*;

/*
	문제 1 ]
		5자리 숫자를 랜덤하게 발생시켜서
		각자리수의 합을 구해주는 프로그램을 작성하세요.
 */
public class Ex01 {
	public static void main(String[] args) {
		// 숫자 입력받고
		String sno = JOptionPane.showInputDialog("다섯자리 숫자를 입력하세요!");
		// 문자열 정수로 변환하고
		int no = Integer.parseInt(sno);
		// 임시변수에 데이터 기억
		int tmp = no;
		
		// 결과값 변수
		int result = 0;
		
		/*
		// 1. 방법 1
		// 각자리수 꺼내서 더하고
		while(tmp > 0) {
			// 맨 뒷자리 꺼내고
			int num = tmp % 10;
			result += num;
			tmp /= 10;
		}
		*/
		
		/*
		// 2. 방법 2
		int gop = 10000;
		 while(tmp > 0) {
			 // 맨 앞자리 숫자 꺼내고
			 int num = tmp / gop;
			 result += num;
			 
			 tmp %= gop;
			 gop /= 10;
		 }
		*/
		
		// 3. 방법 3] 문자열에서 문자를 추출하는 방법
		
		for(int i = 0; i < sno.length() ; i++) {
			// 맨 앞자리부터 문자 하나씩 꺼내고
			char ch = sno.charAt(i);
			// 문자를 숫자로 만들고
			//int num = ch - '0';						//둘중하나
			int num = Integer.parseInt(ch + "");
			
			result += num;
		}
		
		// 결과 보여주고
		JOptionPane.showMessageDialog(null, no + " 의 각 자리수의 합은 [ " + result + " ] 입니다.");
	}
}