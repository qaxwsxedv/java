package day06;

import java.util.*;
public class Ex01 {
/*
	숫자 3개를 입력받아서
	가장 큰수를 선택해서 출력해주는 프로그램을
	if 조건연산자를 사용해서 구현하세요.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int no1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int no2 = sc.nextInt();
		System.out.print("세번째 숫자 : ");
		int no3 = sc.nextInt();
		sc.close();
		int result = 0;
		if (no1 > no2) {
			if (no1 > no3) {
				result = no1;	
			}  result = no3;
		} else if(no2 > no3) {
			
				result = no2; 
			
		}result = no3;
			
			System.out.print(result);
	}

}
