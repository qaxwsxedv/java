package day08;

public class Test06 {
/*
	다섯개의 사각형을 기억할 배열을 만들고
	배열에 사각형을 입력해서 
	사각형들의 정보를 출력하세요.
 */
	public static void main(String[] args) {
		Nemo[] s1 = new Nemo[5]; // 각 방에는 null 로 채워져있다.
		
		// 각방에 Nemo 인스턴스를 채워준다.
		for(int i = 0 ; i < s1.length ; i++) {
			s1[i] = new Nemo();
			// i번째 방에는 인스턴스가 채워져있으므로...
			
			// 가로와 세로를 셋팅할 수 있게 된다.
			s1[i].width = (int)(Math.random()*16 + 5);
			s1[i].height = (int)(Math.random()*16 + 5);
			// 면적도 셋팅
			s1[i].setArea();
			
		}
		// 출력
		for(Nemo n : s1) {
			System.out.printf("가로가 %3d 이고\n세로가 %3d 이고\n넓이가 %7.2f\n인 사각형입니다.", n.width, n.height, n.area);
			System.out.println();
			System.out.println();
		}
	}

}
