package oday02;

import java.util.Scanner;

public class Ex12 {
/*
	 문제 10 ]
	 	전기 요금을 계산해주는 프로그램을 작성하세요.
	 	
	 				코드		기본요금		사용요금
	 	가정용 		1			3800			245
	 	산업용 		2			2400			157
	 	교육용 		3			2900			169
	 	상업용  	4			3200			174
	 	
	 	계산식은 	기본요금 + 사용량 * 사용요금
	 	
	 	코드를 입력하고
	 	사용량을 입력하면 
	 	전기요금을 계산해주는 프로그램을 작성하세요.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("용도 코드\n1 - 가정용\n2 - 산업용\n3 - 교육용\n4 - 상업용\n9 - 프로그램 종료\n코드 입력 : ");
			int ucode = sc.nextInt();
			if(ucode == 9) {
				System.out.println("===============================");
				System.out.println("######## 프로그램 종료! #######");
				System.out.println("===============================");
				break;
			}
			System.out.print("사용량 입력 : ");
			int qt = sc.nextInt();
			
			int money = 0;
			String use = "가정용";
			switch(ucode) {
			case 1:
				money = 3800 + qt * 245;
				break;
			case 2:
				money = 2400 + qt * 157;
				use = "산업용";
				break;
			case 3:
				money = 2900 + qt * 169;
				use = "교육용";
				
				break;
			case 4:
				money = 3200 + qt * 174;
				use = "상업용";
				
				break;
			}
			
			System.out.println();
			System.out.println("--------------------------------------------");
			System.out.printf("사용용도 : %6s\n사 용 량 : %9d\n사용요금 : %9d\n", use, qt, money);
			System.out.println("--------------------------------------------");
		}
		sc.close();
	}

}