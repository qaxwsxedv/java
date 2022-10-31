package day14;

public class Ex01_02 {
/*
	3 ~ 7 사이의 랜덤한 정수를 만들어서
	그 정수만큼의 Samgak 객체를 만들어서 
	정보를 출력해주는 프로그램을 작성하세요.
	
 */
	public Ex01_02() {
		// 랜덤한 삼각형 갯수 만들고
		int cnt = (int)(Math.random()*5 + 3);
		
		for(int i = 0 ; i < cnt ; i++ ) {
			int width = (int)(Math.random()*16 + 5); // 밑변
			int height = (int)(Math.random()*16 + 5); // 높이
			Samgak s = new Samgak(width, height);
			System.out.println(s);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Ex01_02();
	}

}