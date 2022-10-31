package day14;

public class Ex01 {
/*
	3 ~ 7 사이의 랜덤한 정수를 만들어서
	그 정수만큼의 Semo 객체를 만들어서 
	정보를 출력해주는 프로그램을 작성하세요.
	
 */
	public Ex01() {
		// 랜덤하게 만들어질 세모의 갯수 만들고
		int cnt = (int)(Math.random()*5 + 3);
		
		// 갯수 만큼 반복해서
		for(int i = 0 ; i < cnt ; i++ ) {
			// 세모 만들고
			Semo s = new Semo();
			// 길이 셋팅하고
			s.width = (int)(Math.random() * 16 + 5);
			s.height = (int)(Math.random() * 16 + 5);
			
			// 면적 셋팅
			s.area = s.width * s.height * 0.5;
			
			// 정보 출력
			System.out.printf("밑변이 %3d 이고\n높이가 %3d\n그리고 넓이가 %5.2f 인 삼각형\n\n", 
																	s.width, s.height, s.area);
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}