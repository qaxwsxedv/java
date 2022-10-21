package day08;

public class Ex01 {
/*
	Won 10개의 정보를 기억할 배열을 만들고
	원을 채워넣어서(5 ~ 20)
	반지름 기준 내림차순 정령해서 출력
 */
	public static void main(String[] args) {
		Won[] circle = new Won[10]; // 각 방에 null로 채워져있다
		for(int i = 0 ; i < circle.length; i++) {
			// 각방에 인스턴스 채우고
			circle[i] = new Won();
			circle[i].rad = (int)(Math.random() * 16 + 5);
			circle[i].setArround();
			circle[i].setArea();
		}
		// 출력
		for(Won w : circle) {
			System.out.print(w.rad + ", ");
		}
		System.out.println();
		// 정렬
		for(int i = 0; i < circle.length -1; i++) {
			
			// 뒷방에 있는 네모들 꺼내서 비교한다.
			for(int j = i + 1; j < circle.length; j++) {
				if(circle[i].rad < circle[j].rad) {
					Won tmp = circle[i];
					circle[i] = circle[j];
					circle[j] = tmp;
				}
			}
		}
		
		//출력
		for(Won w : circle) {
			System.out.print(w.rad + ", ");
		}
		System.out.println();
	}

}
