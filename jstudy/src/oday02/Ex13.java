package oday02;

import java.util.Scanner;

public class Ex13 {
/*
	문제 11]
		다섯자리의 숫자를 입력받아서
		그 숫자가 회문수 인지 아닌지를 판별해주는 프로그램을 작성하세요.
		
		참고 ]
			회문수란
				앞에서 읽으나 뒤에서 읽으나 같은 수를 회문수라 한다.
				
				예 ]
					12321	==> 회문수
					12312	==> 회문수가 아니다.
					
		해결방법 ]
			1. 쉬운방법 ] 문자열로 처리하는 방법
			
			2. 어려운방법 ] 숫자로 처리하는 방법
					
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("다섯자리 정수 입력 : ");
		/*
		// 1. 쉬운방법
		String sno = sc.nextLine();
		sc.close();
		String result = "회문수다.";
		for(int i = 0 ; i < sno.length() / 2 ; i++ ) {
			if(sno.charAt(i) != sno.charAt(sno.length() - 1 -i)) {
				result = "회문수가 아니다.";
				break;
			}
		}
		System.out.println("입력받은 숫자 [ " + sno + " ] 는 " + result);
		*/
		
		int no = sc.nextInt();
		int tmp = no;
		sc.close();
		int num = (int) Math.pow(10, (no + "").length() - 1);
		String result = "회문수이다.";
		for(int i = 0 ; i < (no + "").length() / 2 ; i++ ) {
			if((tmp / num) != (tmp % 10)) {
				result = "회문수가 아니다.";
				break;
			}
			tmp = tmp % num / 10;
			num /= 100;
		}
		System.out.println("입력받은 숫자 [ " + no + " ] 는 " + result);
	}

}