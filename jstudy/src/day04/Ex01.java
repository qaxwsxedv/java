package day04;

import java.util.Scanner;

public class Ex01 {
/*
	문제 1 ]
		두 개의 숫자를 가로와 세로로 입력받아서
		그 숫자를 이용해서 사각형의 넓이와 삼각형의 넓이를 
		출력해주는 프로그램을 작성하세요.
		
		힌트 ]
			사각형 넓이 공식
				가로 * 세로
				
			삼각형 넓이 공식
				밑변 * 높이 * 0.5(또는 1 / 2.)
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 입력 : ");
		int aa = sc.nextInt();
		System.out.print("세로 입력 : ");
		int bb = sc.nextInt();
		System.out.printf("사각형의 넓이 %d\n", aa * bb);
		System.out.printf("삼각형의 넓이 %f", aa * bb * 0.5);
	}

}