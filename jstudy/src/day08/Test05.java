package day08;

public class Test05 {
/*
	원 5개를 기억할 배열을 만들고
	배열에 랜덤하게 반지름을 입력해서 
	정보를 출력해주는 프로그램을 작성해보자.
 */
	public static void main(String[] args) {
		Won[] circle = new Won[5];
		/*
			클래스 타입의 배열의 경우
			배열 변수를 만들게 되면
			배열의 각 방에 데이터를 바로 채울 수 있는 상태가 아니고
			배열의 각 방에 해당 클래스의 인스턴스를 채울 공간만 확보한 상태가 된다.
			따라서 변수를 만든 후
			반드시 인스턴스를 채우는 작업이 필요하다.
		 */
		
		// 아직 배열의 각방에 인스턴스는 채워져 있지 않으므로 먼저 인스턴스를 채워 넣는다.
		for(int i = 0 ; i < circle.length ; i++ ) {
			// 인스턴스 채우고
			circle[i] = new Won();
		}
		
		// 반지름 셋팅하고
		for(int i = 0 ; i < circle.length ; i++ ) {
			circle[i].rad = (int)(Math.random() * 16 + 5);
			circle[i].setArround();
			circle[i].setArea();
		}
		/*
		System.out.println(circle[0].rad);
		System.out.println(circle[0].arround);
		System.out.println(circle[0].area);
		*/
		
		for(Won w : circle) {
			System.out.printf("반지름이 %3d 이고\n둘레가 %7.2f 이고\n면적이 %7.2f\n인 원입니다.", w.rad, w.arround, w.area);
			System.out.println();
			System.out.println();
		}
	}

}
