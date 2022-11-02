package day16;

import day10.*;

public class Test03 {

	public Test03() {
		Figure[] arr = new Figure[5];
		
		arr[0] = new Figure();
		arr[1] = new Won(); // 자동 형변환
		arr[2] = new Semo(); // 자동 형변환
		arr[3] = new Nemo(); // 자동 형변환
		arr[4] = new Won(); // 자동 형변환
		
		for(int i = 0 ; i < arr.length ; i++ ) {
			Figure f = arr[i];
			
			if(f instanceof Won) {
				int rad = (int)(Math.random()*16 +5);
				((Won)f).rad = rad; // 반지름 셋팅
				((Won) f).setArround(); // 둘레 셋팅
				((Won) f).setArea();
			} else if(f instanceof Semo) {
				int width = (int)(Math.random()*16 +5);
				int height = (int)(Math.random()*16 +5);
				
				((Semo) f).width = width;
				((Semo) f).height = height;
				((Semo) f).setArea();
			} else if(f instanceof Nemo) {
				int width = (int)(Math.random()*16 +5);
				int height = (int)(Math.random()*16 +5);
				
				((Nemo) f).width = width;
				((Nemo) f).height = height;
				((Nemo) f).setArea();
			} else if(f instanceof Figure) {
			}
			
			f.toPrint();
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}