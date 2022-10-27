package day11;

import java.util.*;
public class Ex04 {
/*
	문제 4 ]
		계산식을 입력받아서
		그 식을 숫자와 연산기호를 기억할 배열을 만들어서 기억시키고
		그 배열을 이용한 계산기 프로그램을 작성해서 실행하세요.
		
		예 ]
			1+1
			==> 
			sik[0] = "1";
			sik[1] = "+";
			sik[2] = "1";
			
		참고 ]
			문자열에서 공백 제거하는 방법
			==>
				문자열.replaceAll(" ", "");
 */
	public Ex04() {
		String[] sik = new String[4];
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		System.out.print("계산식 입력 : ");
		String str = sc.nextLine().replaceAll(" ", "");
		
		int idx = 0;
		for(int i = 0 ; i < str.length() ; i++ ) {
			if(str.charAt(i) < '0' || str.charAt(i) > '9') {
				idx = i;
				break;
			}
		}
		
		sik[0] = str.substring(0, idx);
		sik[1] = str.substring(idx, idx + 1);
		sik[2] = str.substring(idx + 1);
		// 
		/*
		String str = "  a  bc   d   ";
		String str1 = str.replaceAll(" ", "");
		System.out.println(str1);
		 */
	}

	public static void main(String[] args) {
		new Ex04();
	}

}