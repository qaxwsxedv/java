package day10;

public class Nemo extends Figure{ // Figure 라는 클래스를 상속받아서 Nemo 클래스를 만든다.
	public int width, height;
	public void setArea() {
		area = width * height;
	}
	
	@Override
	public void toPrint() {
		System.out.println("이 원은 가로가 " + width + 
								"\n세로가 " + height +
								"\n넓이가 " + area
							);
	}
}
