package oday02;

import java.util.*;

public class Ex09 {
/*
	문제 7]
		산수 계산식을 입력받으면 
		그 결과를 처리해서 출력해주는 프로그램을 작성하세요.
		
		조건문, 반복문이 필요하면 사용하세요.
		
		예 ]
			123-23
			==> 100
 */
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 메세지 출력
			System.out.print("계산식 입력 : ");
			// 읽어서 기억하고
			String sik = sc.nextLine();
			
			// 반복 종료조건 추가
			if(sik.equals("q")) {
				System.out.println("*** 계산기가 종료됩니다. ***");
				break;
			}
			// 연산자 위치값 추출
			int idx=0;
			
			String sno1 = "";
			String sno2 = "";
			String giho = "";
			
			// 기호 꺼내고
			for(int i = 0 ; i < sik.length(); i++ ) {
				char ch = sik.charAt(i);
				
				if(ch < '0' || ch > '9') {
					// 추출한 문자가 연산기호인 경우
					idx = i;
					giho = ch + "";
				}
			}
			
			// 첫번째 숫자 꺼내고
			for(int i = 0 ; i < idx; i++ ) {
				sno1 = sno1 + sik.charAt(i);
			}
			// 두번째 숫자 꺼내고
			for(int i = idx + 1; i < sik.length() ; i++ ) {
				sno2 = sno2 + sik.charAt(i);
			}
			
			// 숫자 두개 만들고
			int no1 = Integer.parseInt(sno1);
			int no2 = Integer.parseInt(sno2);
			
			// 계산하고
			int result = 0;
			
			/*
			// 1. 번 방법
			if(giho.equals("+")) {
				result = no1 + no2;
			} else if(giho.equals("-")) {
				result = no1 - no2;
			} else if(giho.equals("*")) {
				result = no1 * no2;
			} else if(giho.equals("/")) {
				result = no1 / no2;
			}
			*/
			
			switch(giho) {
			case "+":
				result = no1 + no2;
				break;
			case "-":
				result = no1 - no2;
				break;
			case "*":
				result = no1 * no2;
				break;
			case "/":
				result = no1 / no2;
				break;
			}
			
			System.out.println("입력된 계산식 " + sik + " 의 결과는 " + result + " 입니다.");
			System.out.println("--------------------------------------------");
		}
		
		sc.close();
	}

}