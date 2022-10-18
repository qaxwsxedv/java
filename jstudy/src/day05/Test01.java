package day05;

import java.util.Scanner;
public class Test01 {
/*
	예재 1 ]
		정수를 입력받아서 입력된 정수가
			짝수인지 홀수인지 아니면 0인지 판별하세요.
 */
	public static void main(String[] args) {
		// 작업순서
		// 1. 입력도구 준비한다.
		Scanner sc = new Scanner(System.in);
		// 2. 입력메세지를 출력
		System.out.print("정수 입력 : ");
		// 3. 입력받아서 변수에 기억
		int no = sc.nextInt();
		// 입력도구 닫고
		sc.close();
		// 4. 결과를 기억할 변수 만들어 놓고
		String result = "";
		// 5. 결과를 판별하고 변수에 기억시키고...
		//		(연산된 결과는 변수에 기억시켜놓지 않으면 사용할 수 없으므로...)
		result = (no == 0) ? "0 입니다." : (
					(no % 2 == 0) ? "짝수입니다." : "홀수입니다."
				);
		// 6. 출력하고
		System.out.println("입력받은 숫자 [ " + no + " ] 는 " + result);
	}

}
