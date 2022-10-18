package day04;

import java.util.Scanner;

public class Ex02 {
/*
	문제 2 ]
		하나의 숫자를 입력받은 후
		그 숫자를 반지름으로 하고
		원의 넓이와 원의 둘레를 구해서 출력해주는 프로그램을 작성하세요.
		
		원의 넓이 ]
			반지름 * 반지름 * 3.14
			
		원의 둘레 ]
			2 * 반지름 * 3.14
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력 : ");
		int aa = sc.nextInt();
		System.out.printf("원의 넓이 %f\n", aa * aa * 3.14);
		System.out.printf("원의 둘레 %f", aa * 2 * 3.14);
	}

}