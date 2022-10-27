package day11;

import day10.*;

public class Ex01 {

	public Ex01() {
		// 여기서 코딩한 내용은 실행시 실행하게 된다.
		/*
			도형 10개를 기억할 배열을 만들고
			랜덤하게 숫자를 0 ~ 2 사이로 발생시켜서
				0 이면 원으로
				1 이면 삼각형으로
				2 이면 사각형으로
			배열에 모두 채워주고 내용을 출력해주는 프로그램을 작성하세요. 
		 */
		
		Figure[] fig = new Figure[10]; // 각 도형을 기억할 공간만 확보한 상태..
		
		// 10 칸을 채울 도형을 결정할 숫자 만들기
		int no = (int)(Math.random()*(2 - 0 + 1));
		
		// 10개의 칸에 도형을 채우고
		switch(no) {
		case 0:
			for(int i = 0 ; i < 10; i++ ) fig[i] = new Won();
			break;
		case 1:
			for(int i = 0 ; i < 10; i++ ) fig[i] = new Semo();
			break;
		case 2:
			for(int i = 0 ; i < 10; i++ ) fig[i] = new Nemo();
			break;
		}
		
		// 각 도형 사이즈 작업
		for(int i = 0 ; i < 10 ; i++ ) {
			Figure f = fig[i];
			switch(no) {
			case 0:
				Won w = (Won) f;
				w.rad = (int)(Math.random()*16 + 5); // 반지름
				// 둘레
				w.setArround();
				// 면적
				w.setArea();
				break;
			case 1:
				Semo s = (Semo) f;
				// 밑변
				s.width = (int)(Math.random()*16 + 5);
				// 높이
				s.height = (int)(Math.random()*16 + 5);
				// 면적
				s.setArea();
				break;
			case 2:
				Nemo n = (Nemo) f;
				// 가로
				n.width = (int)(Math.random()*16 + 5);
				// 세로
				n.height = (int)(Math.random()*16 + 5);
				// 면적
				n.setArea();
				break;
			}
		}
		
		/*
		// 방법 1 ]
		for(int i = 0 ; i < 10; i++ ) {
			switch(no) {
			case 0:
				// 원으로 채운다.
				Won won = new Won();
				won.rad = (int)(Math.random()*16 + 5);
				won.setArround();
				won.setArea();
				fig[i] = won;
				break;
			case 1:
				// 세모로 채운다.
				Semo s = new Semo();
				s.width = (int)(Math.random()*16 + 5);
				s.height = (int)(Math.random()*16 + 5); // 높이
				s.setArea(); // 면적
				fig[i] = s;
				break;
			case 2:
				// 네모로 채운다.
				Nemo n = new Nemo();
				n.width = (int)(Math.random()* 16 + 5);
				n.height = (int)(Math.random()* 16 + 5); // 높이
				n.setArea(); // 면적
				fig[i] = n;
				break;
			}
		}
		*/
		
		// 정렬하기( 면적기준 오름차순 정렬 )
		for(int i = 0 ; i < fig.length - 1 ; i++ ) {
			Figure f1 = fig[i];
			double area1 = 0;
			switch(no) {
			case 0:
				Won w = (Won) f1;
				area1 = w.area;
				break;
			case 1:
				Semo s = (Semo) f1;
				area1 = s.area;
				break;
			case 2:
				Nemo n = (Nemo) f1;
				area1 = n.area;
				break;
			}
			
			for(int j = i+1 ; j < fig.length ; j++ ) {
				Figure f2 = fig[j];
				double area2 = 0;
				switch(no) {
				case 0:
					Won w = (Won) f2;
					area2 = w.area;
					break;
				case 1:
					Semo s = (Semo) f2;
					area2 = s.area;
					break;
				case 2:
					Nemo n = (Nemo) f2;
					area2 = n.area;
					break;
				}
				
				// 비교
				if(area1 > area2) {
					Figure tmp = fig[i];
					fig[i] = fig[j];
					fig[j] = tmp;
					area1 = area2;
				}
				
			}
		}
		
		
		// 출력한다.
		for(Figure f : fig) {
			f.toPrint();
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}