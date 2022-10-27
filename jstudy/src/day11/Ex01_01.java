package day11;

import day10.*;

public class Ex01_01 {
	public Ex01_01(){
		/*
			도형 10개를 기억할 배열을 만들고
			랜덤하게 숫자를 0 ~ 2 사이로 발생시켜서
				0 이면 원으로
				1 이면 삼각형으로
				2 이면 사각형으로
			배열에 모두 채워주고 내용을 출력해주는 프로그램을 작성하세요. 
		 */
		Figure[] fig = new Figure[10]; // 각 도형을 기억할 공간
		// 10 칸을 채울 도형을 결정할 숫자
		int no = (int)(Math.random()* (2 - 0 + 1));
		
		switch(no) {
		case 0:
			for(int i = 0 ; i < 10; i++) fig[i] = new Won();
			break;
		case 1:
			for(int i = 0 ; i < 10; i++) fig[i] = new Semo();
			break;
		case 2:
			for(int i = 0 ; i < 10 ; i++) fig[i] = new Nemo();
			break;
		}
		for(int i = 0 ; i < 10 ; i++) {
			Figure f = fig[i];
			switch(no) {
			case 0:
				Won w = (Won) f;
				w.rad = (int)(Math.random()* 16 + 5);
				w.setArround();
				w.setArea();
				break;
			case 1:
				Semo s = (Semo) f;
				s.width = (int)(Math.random()*16 + 5);
				s.height = (int)(Math.random()*16 + 5);
				s.setArea();
				break;
			case 2:
				Nemo n = (Nemo) f;
				n.width = (int)(Math.random()*16+ 5);
				n.height = (int)(Math.random()*16+5);
				n.setArea();
				break;
			}
		}
		/*
		for(int i = 0 ; i < 10; i++) {
			switch(no) {
			case 0:
				// 원으로 채운다
				Won won = new Won();
				won.rad = (int)(Math.random()*16 + 5);
				won.setArround();
				won.setArea();
				fig[i] = won;
				break;
			case 1:
				// 세모로
				Semo s = new Semo();
				s.width = (int)(Math.random()*16 + 5);
				s.height = (int)(Math.random()*16+5);
				s.setArea();
				fig[i] = s;
				break;
			case 2:
				Nemo n = new Nemo();
				n.width = (int)(Math.random()*16 + 5);
				n.height = (int)(Math.random()* 16 + 5);
				n.setArea();
				fig[i] = n;
				break;
			}
		}
		*/
		// 출력
		for(Figure f : fig) {
			f.toPrint();
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Ex01_01();

	}

}
