package sub;

public class Test01 {

	/*
			1	2	3	4	5
			6	7	8	9	10
			11	12	13	14	15
			16	17	18	19	20
			21	22	23	24	25
			
			배열에 담으세요.
	 */
	public Test01() {
		// 먼저 작업순서부터 정한다.
		// 데이터를 기억할 배열 부터 준비
		int[][] no = new int[5][5];
		
		/*
			no[0] ==> int[]
			...
			no[4] ==> int[]
		 */
		
		// 각 방에 데이터 채운다.
		for(int i = 0; i < 5 ; i++ ) {
			for(int j = 0 ; j < 5 ; j++ ) {
				//	실제 필요한 숫자를 만든다.
				int num = 5*i + j +1;
				// 숫자가 만들어 졌으면 숫자를 각 방에 채운다.
				no[i][j] = num;
			}
		}
		
		// 출력
		// 배열을 관리하는 배열에서 각 방의 배열을 꺼낸다.
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j < 5; j++ ) {
				// 데이터 꺼내고
				int num2 = no[i][j];
				// 출력
				System.out.print(num2 + ", ");
			}
			// 데이터 꺼내는 다섯번 반복이 완료된 상태
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
