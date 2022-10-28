package day13;

public class Test07 {
/*
	5 명의 학생의 자바, 디비, 웹, 점수를 랜덤하게 셋팅한후
	총점을 계산해서 추렭하는 프로그램을 작성하세요.
 */
	public Test07() {
		int[][] score = getStuds();
		// 총점 구하고
		int[] total = getTotal(score);
		// 출력
		toPrint(score, total);
	}

	public static void main(String[] args) {
		new Test07();
	}
	
	// 다섯학생의 과목점수를 랜덤하게 입력해서 반환해주는 함수
	public int[][] getStuds(){
		// 반환값 변수 만들고
		int[][] arr = new int[5][3];
		// 데이터 채우고
		for(int i = 0 ; i < arr.length ; i++) { // 각 학생 추출 반복문
			for(int j = 0 ; j < arr[i].length ; j++) { // 각 학생별 과목 추출 반복문
					arr[i][j] = (int)(Math.random()* 41 + 60 );
				
			}
		}
		// 데이터 반환해주고
		return arr;
	}
	
	// 총점 구해서 반환해주는 함수
	public int[] getTotal(int[][] n) {
		// 반환값 변수
		int[] total = new int[n.length];
		// 데이터 만들고
		for(int i = 0 ; i < n.length ; i++) { // 학생 한명 꺼내고
			for(int j = 0 ; j < n[i].length ; j++) { // 각 과목 꺼내고
				total[i] += n[i][j];
			}
		}
		// 반환해주고
		return total;
	}
	
	// 출력함수
	public void toPrint(int[][] subj, int[] total) {
		for(int i = 0 ; i < subj.length ; i++) {
			System.out.print(" | ");
			for(int j = 0; j < subj[i].length ; j++) {
				System.out.printf("%3d | ", subj[i][j]);
			}
			// 총점 출력
			System.out.println(" : 총점 - " + total[i]);
		}
	}

}
