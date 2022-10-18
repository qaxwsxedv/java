package day05;

import java.util.*; // java/util 폴더에 만들어져있는 모든 클래스를 사용할 준비하는 작업
public class Ex01 {
/*
	숫자 3개를 입력받아서
	가장 큰수를 선택해서 출력해주는 프로그램을
	3항 조건연산자를 사용해서 구현하세요.
 */
	public static void main(String[] args) {
		// 세개의 숫자를 입력받는 방법
		// 1. 입력도구준비
		Scanner sc = new Scanner(System.in);
		// 2. 메세지 출력
		System.out.print("첫번째 숫자 : ");
		// 3. 입력데이터 꺼내서 변수 기억
		int no1 = sc.nextInt();
		// 2. 메세지 출력
		System.out.print("두번째 숫자 : ");
		// 3. 입력데이터 꺼내서 변수 기억
		int no2 = sc.nextInt();
		// 2. 메세지 출력
		System.out.print("세번째 숫자 : ");
		// 3. 입력데이터 꺼내서 변수 기억
		int no3 = sc.nextInt();
		sc.close(); // 사용이 끝난 자원반환...
		int result = 0;
		result = (no1 <= no2 && no2 <= no3) ? no3 : 
				(no2 <= no3 && no3 <= no1) ? no1 : 
				(no3 <= no1 && no1 <= no2) ? no2 : 
				(no1 <= no2 && no2 >= no3) ? no2 :
				(no2 <= no3 && no3 >= no1) ? no3 : no1;
		
		System.out.println(result);
	}

}
