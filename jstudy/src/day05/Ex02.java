package day05;

import java.util.*;
public class Ex02 {
/*
	문제 2 ]
		알파벳 문자 하나를 입력받아서
		그 문자가 대문자인지 소문자인지 판별해서 출력하고
		
		소문자면 대문자로 변환하고
		대문자면 소문자로 변환해서
		출력하세요.
		
		참고 ]
			문자열에서 문자 추출하는 방법
			
				문자열.charAt(위치값)
			
			이 문제의 경우는 하나의 문자만 입력할 예정이므로
			
				문자열.charAt(0)
				
			로 꺼내서 사용하면 된다.
 */
	public static void main(String[] args) {
		// 1. 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 2. 입력메세지 출력
		System.out.print("알파벳 문자 하나를 입력하세요 : ");
		// 3. 입력받아서 변수에 기억
		String no = sc.nextInt();
		// 입력도구 닫고
		sc.close();
		
	}

}
