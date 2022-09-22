	
package oday02;

import java.util.*;

public class Ex10 {
/*
	문제 8 ]
		정수 3개를 입력받아서
		세 수중 제일 큰수만 출력해주는 프로그램을 작성하세요.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개를 입력하세요.");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		int no3 = sc.nextInt();
		
		int result = 0;
		if(no1 <= no2 && no2 <= no3) {
			result = no3;
		}else if(no2 <= no3 && no3 <= no1) {
			result = no1;
		}else if(no3 <= no1 && no1 <= no2) {
			result = no2;
		}else if(no1 <= no2 && no2 >= no3) {
			result = no2;
		}else if(no2 <= no3 && no3 >= no1) {
			result = no3;
		}else if(no3 <= no1 && no1 >= no2) {
			result = no1;
		}
		
		
		System.out.println("입력된 숫자 : " + result);
	}

}