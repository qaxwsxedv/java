package oday01;
import java.util.*;
public class Test03 {

	/*
 		키보드로 입력 받는 방법
 		
 		Scanner cs = new Scanner(System.in); // 입력도구....
 		
 		String str = sc.nextLine(); // 문자열로 꺼내기...
 		
 		int no = sc.nextInt(); // 정수 형태로 입력한 경우
 	 */
	public static void main(String[] args) {
		// 숫자를 입력받아서 입력된 숫자가 짝수인지 홀수인지를 판별하세요.
		
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		System.out.print("정수를 입력하세요!: ");
		
		// 입력한 정수 변수에 기억하고
		int no = sc.nextInt();
		
		sc.close(); // 사용을 마친 자원은 반환해주는 것이 원칙이다.
		
		// 짝수인지 홀수인지 판별하고
		String result = (no % 2 == 0) ? "짝수" : "홀수";
		
		// 결과 출력
		System.out.println("입력한 정수 [ "  + no + " ] 는 " + result + "입니다.");
	}

}
