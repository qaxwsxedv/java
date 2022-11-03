package day16.ex;

public class Ex01_01 {

	public Ex01_01() {
		Dohyung[] arr = new Dohyung[5];
		
		for(int i =0; i < arr.length; i++) {
			int num = (int)(Math.random()*3);
			switch(num){
			case 0:
				int rad = (int)(Math.random()*16+5);
				Dohyung d = new Dongle(rad);
				arr[i] = d;
				break;
			case 1:
				int no1 = (int)(Math.random()*16+5);
				int no2 = (int)(Math.random()*16+5);
				Dohyung s = new Semo(no1, no2);
				arr[i] = s;
				break;
			case 2:
				int no3 = (int)(Math.random()*16+5);
				int no4 = (int)(Math.random()*16+5);
				Dohyung n = new Nemo(no3, no4);
				arr[i] = n;
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		new Ex01_01();

	}

}
