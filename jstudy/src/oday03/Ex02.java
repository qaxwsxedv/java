package oday03;

/*
	문제 2 ]
		두자리 숫자 두개를 입력받아서
		두수의 최소공배수를 구해서 출력해주는 프로그램을 작성하세요.
		
		참고 ]
			최소공배수
				두수의 배수중 최소 숫자.
				
			최대공약수
				두수의 공통 약수중 최대 숫자.
 */

import java.util.*;

import javax.swing.*;
public class Ex02 {

	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 메세지 출력
//		System.out.print("첫번째 정수 : ");
//		int no1 = sc.nextInt(); // 첫번째 정수 입력받아서 기억...
//		System.out.print("두번째 정수 : ");
//		int no2 = sc.nextInt(); // 두번째 정수 입력받아서 기억...
		
		int no1 = Integer.parseInt(JOptionPane.showInputDialog("첫번째 정수 입력!"));
		int no2 = Integer.parseInt(JOptionPane.showInputDialog("두번째 정수 입력!"));
		/*
			참고 ]
				String JOptionPane.showInputDialog("메세지..") 
				==> 키보드로 입력한 내용을 문자열로 반환해주는 기능을 가지고 있는 함수...
		 */
		
		
		
		/*
			no1 작은 수 기억할 변수
			no2 큰수 기억할 변수
		 */
		// 먼저 두수 중 큰수와 작은수를 판별해준다.
		if(no1 > no2) {
			int tmp = no1; // 큰수 임시 저장
			no1 = no2;		// 작은수에 no2 기억
			no2 = tmp;		// 큰수에 임시저장된 숫자 기억...
		}
		
		// 작은 수부터 1씩 감소시켜가면서 두수를 나눠서 검사한다.
		System.out.println(no1 + " - " + no2);
		for(int i = no1 ; i > 0 ; i-- ) {
			if(no1 % i == 0 && no2 % i == 0) {
//				System.out.println("입력한 두 수 " + no1 + " 과 " + no2 + " 의 \n 최소공약수는 " + i + " 입니다.");
				String msg = "입력한 두 수 " + no1 + " 과 " + no2 + " 의 \n 최대공약수는 " + i + " 입니다.";
				JOptionPane.showMessageDialog(null, msg);
				// 반복문 즉시 종료
				// <== 최대 공약수 찾아서...
				break;
			}
		}
		
		// 최소 공배수
		int result = no2;
		while(true) {
			if(result % no1 == 0 && result % no2 == 0) {
				// 공통 배수를 찾은 경우
				break;
			}
			result++;
		}
		
		// 결과 출력
		JOptionPane.showMessageDialog(null, no1 + " 과 " + no2 + " 의 최소공배수는 [ " + result + " ] 입니다." );
	}

}