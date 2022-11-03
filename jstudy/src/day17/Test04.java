package day17;

public class Test04 {
	private Figure[] fig;
	public Test04() {
		// 배열 셋팅
		setFig();
		
		// 내용 출력
		printFig();
		
		Figure f = new Sagak(10, 20);
		f.toPrint();
	}

	// 배열 셋팅 전담 처리함수
	public void setFig() {
		// 배열 만들고
		int len = (int)(Math.random()*16 + 5); // 배열 길이 랜덤하게 만들고
		fig = new Figure[len]; // 배열 만들고
		
		//길이만큼 반복해서 배열에 채우고
		for(int i = 0; i < len ; i++) {
			// 채울 도형 결정하고
			int fType = (int)(Math.random()*3);
			
			switch(fType){
			case 0:
				int rad = (int)(Math.random()*16 + 5);
				fig[i] = new Dongle(rad);
				break;
			case 1:
				int width = (int)(Math.random()*16 + 5);
				int height = (int)(Math.random()*16 + 5);
				fig[i] = new Semo(width, height);
				break;
			case 2:
				int garo = (int)(Math.random()*16 + 5);
				int sero = (int)(Math.random()*16 + 5);
				fig[i] = new Nemo(garo, sero);
				break;
			}
		}
	}
	
	// 내열 내용 출력 전담 처리함수
	public void printFig() {
		for(int i = 0 ; i < fig.length ; i++) {
			fig[i].toPrint();
		}
	}
	public static void main(String[] args) {
		new Test04();

	}

}
