package day16.ex;

public class Ex01 {
/*
	"여기는 도형 클래스" 를 출력하는 기능을 가징 Dohyung 클래스를 제작하고
	Dohyung 클래스를 상속 받아서
		Semo, Nemo, Dongle
	를 클래스를 제작하고
	
	0 ~ 2 랜덤하게 숫자를 5개를 발생시켜서
		0 - Dongle
		1 - Semo
		2 - Nemo
	의 인스턴스를 배열의 각 방에 채워넣어서
	내용을 출력해주는 프로그램을 작성하세요.
 */
	public Ex01() {
		Dohyung[] arr = new Dohyung[5]; // 배열에는 도형데이터를 기억할 공간만 확보한 상태
		
		// 위의 배열의 방에 각각 내용을 채워줘야 한다.
		for(int i = 0 ; i < arr.length ; i++) {
			int doh = (int)(Math.random()*3); // 어떤 도형을 채울지 결정
			
			switch(doh) {
			case 0:
				int rad = (int)(Math.random()*16 + 5);
				Dohyung d = new Dongle(rad);
				arr[i] = d;
				break;
			case 1:
				int width = (int)(Math.random()*16 + 5);
				int height = (int)(Math.random()*16 + 5);
				Dohyung s = new Semo(width, height);
				arr[i] = s;
				break;
			case 2:
				int no1 = (int)(Math.random()*16 + 5);
				int no2 = (int)(Math.random()*16 + 5);
				Dohyung n = new Nemo(no1, no2);
				arr[i] = n;
				break;
			}
		}
		
		// 배열의 내용을 출력하세요.
		// 단, 변수들을 각각 꺼내서 출력하세요.
		for(int i = 0 ; i < arr.length ; i++ ) {
			Dohyung d = arr[i];
			
			// 도형 확인 작업
			if(d instanceof Dongle) {
				Dongle dg = (Dongle) d;
				int rad = dg.getRad();
				double arround  = dg.getArround();
				double area = dg.getArea();
				System.out.printf("원의\n반지름 %3d\n둘래 %5.2f\n넓이%5.2f\n\n", rad, arround, area);
			} else if(d instanceof Semo) {
				Semo s = (Semo) d;
				int width = s.getWidth();
				int height = s.getHeight();
				double area = s.getArea();
				System.out.printf("삼각형\n밑변 %3d\n높이%3d\n넓이%5.2f\n\n",width, height, area);
			} else if (d instanceof Nemo) {
				Nemo n = (Nemo) d;
				int width = n.getWidth();
				int height = n.getHeight();
				double area = n.getArea();
				System.out.printf("사각형\n밑변 %3d\n높이%3d\n넓이%5.2f\n\n",width, height, area);
			}
		}
		
		
		// toPrint() 를 이용해서 내용을 출력하세요.
		for(int i = 0 ; i < arr.length ; i++) {
			Dohyung d = arr[i];
			d.toPrint();
			
		}
		
		
		
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
