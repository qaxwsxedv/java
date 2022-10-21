package day08;

public abstract class Test03 {
/*
	Semo 클래스를 가져다 삼각형을 만들어보자.
	밑변과 높이는 랜덤하게 5 ~ 20 사이의 정수로 만들기로 한다.
 */
	public static void main(String[] args) {
		// 세모 만들기
		Semo s1 = new Semo();
		/*
		 	참고 ]
		 		위 명령에서
		 			Semo()
		 		는 생성자 함수를 호출하는 것이다
		 		위 처럼 매개변수에 데이터가 아무것도 입력되지 않는 형태의 생성자를
		 		기본 생성자 라고 부르고
		 		이 생성자는 제작한 틀래스에 생성하가 정의되지 않으면
		 		자바가상머신이 만들어서 호출해준다.
		 */
		
//		System.out.println("밑변 : " + s1.width);
// 		밑변과 높이 셋팅하기
		s1.width = (int)(Math.random() * (20 - 5 + 1) + 5);
		s1.height = (int)(Math.random() * (20 - 5 + 1) + 5);
		
		// 밑변과 높이 출력
		System.out.println("밑변 : " + s1.width);
		System.out.println("높이 : " + s1.height);
		
		// 밑변과 높이가 셋팅이 됬으므로 면적도 센팅해보자.
		// s1이 가지고 있는 면적 셋팅함수를 호출해준다.
		s1.setArea();
		
		// 결과출력
		System.out.println();
		System.out.println("밑변 : " + s1.width);
		System.out.println("높이 : " + s1.height);
		System.out.println("면적 : " + s1.area);
	}

}
