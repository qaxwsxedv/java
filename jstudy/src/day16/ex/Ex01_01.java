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
//				arr
			}
		}
	}

	public static void main(String[] args) {
		new Ex01_01();

	}

}
