package day10;

public class Won extends Figure{
	public int rad;
	public double arround;
	
	// 둘레 셋팅함수
	public void setArround() {
		arround = 2 * rad * 3.14;
		
	}
	
	// 면적 셋팅함수
	public void setArea() {
		area = rad * rad * 3.14;
	}
	
	// toPrint 함수를 고쳐서 정의해보자.
	@Override
	public void toPrint() {
		System.out.println("이 원은 반지름이 " + rad + 
								"\n둘래가 " + arround +
								"\n넓이가 " + area
							);
	}
}
