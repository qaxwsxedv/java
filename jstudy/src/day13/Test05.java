package day13;

public class Test05 {
/*
	랜덤하게 가로, 세로 길이를 만들어서
	사각형의 면적을 출력해주는 프로그램을 작성하세요.
	단,
		길이 반환
		면적 계산
		출력 기능
	은 함수로 제작해서 해결하세요.
 */
	public Test05() {
		int[] no = getLength();
		int area = getArea(no);
		// 출력
		toPrint(no, area);
	}

	public static void main(String[] args) {
		new Test05();

	}
	
	// 가로, 세로 길이 반환 함수
	public int[] getLength() {
		/*
			이 함수는 랜덤하게 가로와 세로를 만들어서
			두 데이터를 반환해주는 기능의 함수이다.
			그런데 함수는 반환값이 두개를 가지는 경우는 없으므로
			하나로 합쳐서 반환해줘야 한다.
			이 문제의 경우 두개의 타입이 모두 int 이므로
			int[]로 반환해주면 된다.
		*/
		
		// 반환값 변수 만들고
		int[] nums = new int[2];
		// 변수에 데이터 채우고
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random()*16 + 5);
		}
		// 데이터 반환해주고
		return nums;
	}
	
	public int getArea(int[] length) { // length = no;
		// 반환값 변수 만들고
		int result = 0;
		// 계산해서 변수 채우고
		result = length[0] * length[1];
		// 반환값 반환해주고
		return result;
	}
	
	// 출력기능 함수
	public void toPrint(int[] size, int area) {
		System.out.printf("가로가 %3d 이고 세로가 %3d 인 사각형의 넓이는 %4d 입니다.", size[0], size[1], area);
	}

}
