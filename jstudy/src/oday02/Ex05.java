
package oday02;

public class Ex05 {
/*
	문제 3 ]
		0 ~ 255 사이의 랜덤한 아스키 코드를 만들어서
		이 코드값에 해당하는 문자가 알파벳인지 아닌지 판별해주는 프로그램을 작성하세요.
 */
	public static void main(String[] args) {
//		char ch = (char)(Math.random()*(255 - 0 + 1) + 0);
//		char ch = (char)(Math.random()*256);
		int ch = (int)(Math.random()*256);
		String result = "알파벳이 아닙니다.";
		if(ch >= 'A' && ch <= 'Z') {
			// 대문자인 경우
			result = "알파벳 입니다.";
		} else if( ch >= 'a' && ch <= 'z') {
			// 소문자인 경우
			result = "알파벳 입니다.";
		} else {
			// 알파벳이 아닌경우...
//			result = "알파벳이 아닙니다."; // 굳이 하지 않아도 되는 코드 <== 내용 변화가 없기 때문에...
		}
		
		System.out.println(ch);
		System.out.printf("랜덤하게 만든 문자 [ %c ] 는 %s", (char) ch, result);
	}

}