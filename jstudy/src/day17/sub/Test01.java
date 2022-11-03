package day17.sub;

import static java.lang.Math.*;
public class Test01 {
	Figure[] arr;
	public Test01() {
		
	}
	// 배열 셋팅 함수
	public void setArr() {
		arr = new Figure[5];
		
		for(int i = 0 ; i < arr.length ; i++) {
			int rdn = (int)(random()*3);
			switch(rdn) {
			case 0:
				arr[i] = new Circle((int)(random()*16 + 5));
				break;
			case 1:
				arr[i] = new Semo(((int)random()*16 + 5), ((int)random()*16 + 5));
				break;
			case 2:
				arr[i] = new Nemo(((int)random()*16 + 5), ((int)random()*16 + 5));
				break;
			}
		}
	public void print() {
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].toPrint();
		}
	}
	}
	public static void main(String[] args) {
		new Test01();

	}

}
