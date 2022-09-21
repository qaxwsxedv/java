package oday02;

public class Ex07 {
/*
	문제 5 ]
	
		소수점이 있는 숫자를 입력한 후
		소수이하 세째자리에서 반올림한 결과를 계산해서 출력하세요.
		
*/
	public static void main(String[] args) {
		double no = 3.1415;
		
		double result = (int)(no * 100  + 0.5) / 100.0;
		/*
			3.1415
			==> 314.15
			==> 314.15 + 0.5
			==> (int)(314.65) ==> 314
			==> 314 / 100.0
			==> 3.14
		
		*/
		System.out.println(result);
	}

}
