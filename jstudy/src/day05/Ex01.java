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
		/*
		int result = 0;
		result = (no1 <= no2 && no2 <= no3) ? no3 : 
				(no2 <= no3 && no3 <= no1) ? no1 : 
				(no3 <= no1 && no1 <= no2) ? no2 : 
				(no1 <= no2 && no2 >= no3) ? no2 :
				(no2 <= no3 && no3 >= no1) ? no3 : no1;
		System.out.print(result);
		*/
		int max = (no1 > no2) ? (
				// no1이 no2보다 큰 경우이므로
				// 이제는 no1이 no3보다 크면 no1이 제일 큰수이고, 아니면 no3가 제일큰수
					(no1 > no3) ? no1 : no3
				): (
				// no2가 no1보다 큰 경우이므로 ....
					(no2 > no3) ? no2 : no3	
				);
		System.out.printf("입력받은 세 수\n\tno1 : %5d\n\tno2 : %5d\n\tno3 : 5%d\n중 제일 큰수는 \n[ %d ] 입니다.", no1, no2, no3, max);		
	}

}
