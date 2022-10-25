package day10;

public class Ex01 {
	public Ex01() {
		/*
		Figure fig1 = new Won();
		Figure fig2 = new Semo();
		Figure fig3 = new Nemo();
		
		((Won)fig1).rad = (int)(Math.random()*16 + 5);
		((Won)fig1).setArround();
		((Won)fig1).setArea();
		
		fig1.toPrint();
		*/
		// 랜덤하게 도형을 만들어서 Figure 배열에 10를 채워넣고
		// 면적을 출력하세요.
		
		Figure[] fig = new Figure[10];
		
		for(int i = 0 ; i < fig.length ; i++ ) {
			// 도형 숫자만들고
			int no = (int)(Math.random()*3);
			
			int w1 = (int)(Math.random()* 16 + 5);
			int w2 = no != 0 ? (int)(Math.random()* 16 + 5) : 0;
			
			switch(no) {
			case 0:
				Won won = new Won();
				won.rad = w1;
				won.setArea();
				won.setArround();
				
				fig[i] = won;
				break;
			case 1:
				Semo semo = new Semo();
				semo.width = w1;
				semo.height = w2;
				semo.setArea();
				
				fig[i] = semo;
				break;
			case 2:
				Nemo nemo = new Nemo();
				nemo.width = w1;
				nemo.height = w2;
				nemo.setArea();
				
				fig[i] = nemo;
				break;
			}
		}
		
		// 출력
		for(Figure f : fig) {
			f.toPrint();
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}