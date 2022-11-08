package day20;


public class Ex01 {
/*
	Figure 인터페이스를 만들고 그것을 구현하는 클래스
	Semo, Nemo, Dongle
	클래스를 만드세요.
	단, Comparable 인터페이스를 구현하지 않는 클래스로 제작하세요.
	
	0 ~ 2 사이의 숫자를 랜덤하게 발생시켜서
		0 - Dongle
		1 - Semo
		2 - Nemo
	를 채워넣을 TreeSet 을 만들어서 채우고
	
	면적기준으로 내림차순 정렬해서 출력하세요.
	
	1. Comparator 로 해결하는 방법
	
	2. Comparable 로 해결하는 방법
	
 */
	public Ex01() {
		ArrayList TreeSet = new ArrayList();
		int num = (int)(Math.random()*3);
		switch(num) {
		case 0:
			int no1 = (int)(Math.random()*16+5);
			
			break;
		}
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
