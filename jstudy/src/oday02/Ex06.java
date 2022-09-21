	
package oday02;

public class Ex06 {
/*
	문제 4 ]
	
	화씨(Fahreheit)온도 100도는 
	섭씨(Celcius)온도 몇도인지를 출력해주는 프로그램을 작성하세요.
	
	참고 ]
		물리공식
		섭씨온도 = 5 / 9 x (화씨온도 - 32)
 */
	public static void main(String[] args) {
		double fah = 100; // 자동형변환
		double cel = 5 / 9d * (fah - 32);
		/*
		  	9 
			==>
				9.
				(double) 9
				9d
		 */
		
		System.out.println(cel);
	}

}