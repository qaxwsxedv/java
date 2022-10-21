package day08;

public class Ex02 {
/*
	원, 삼각형, 사각형을 기억할 Object 타입 배열을 만들어서
	10개를 랜덤하게 채워넣고
	넓이 기준 오름차순 정렬해서
	정보를 출력해주는 프로그램을 작성하세요.
	
	참고 ]
		갹채의 타입 확인해주는 연산자
		instanceof
			형식 ]
				변수	instanceof	클래스이름
			==> 변수의 타입이 클래스타입이냐??
				반환값을 논리값(true, false)으로 반환된다.
 */
	public static void main(String[] args) {
		Object[] moyang = new Object[10];
		
		Object o = new Nemo();
		
		if(o instanceof Nemo) {
			System.out.println(((Nemo) o).width);
			// Object 타입으로 변환된 객체는 사용할 때 반드시 원래 타입으로 강제 형변환 해줘야 한다.
		}
	}

}
