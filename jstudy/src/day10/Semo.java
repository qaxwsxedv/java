package day10;

public class Semo extends Figure{
	public int width, height;
	// 밑변과 높이가 결정된 후 호출되면 면적을 계산해서 셋팅해주는 함수
	public void setArea() {
		area = width * height / 2.;
	}
	
	@Override
	public void toPrint() {
		System.out.println("이 원은 밑변이 " + width + 
								"\n높이가 " + height +
								"\n넓이가 " + area
							);
	}
}
