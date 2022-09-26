package oday04;

import java.util.Arrays;

public class Ex01 {
/*
	문제 1 ]
		
		String[] student = {"제니", "리사", "로제", "지수"};
		int[] java = {100, 80, 90, 95};
		int[] db = {90, 95, 80, 80};
		int[] web = {80, 80, 95, 100};
		
		
 */
	public static void main(String[] args) {
		String[] student = {"제니", "리사", "로제", "지수"};
		int[] java = {100, 80, 90, 95};
		int[] db = {90, 95, 80, 80};
		int[] web = {80, 80, 95, 100};
		
		// 문제 이차원배열 score 에 자바, 디비, 웹 점수를 학생별로 기억시키세요.
		// int[][] score = new int[4][3];
		int[][] score = new int[4][3];
		for(int i = 0 ; i < 4; i++) {
			score[i][0] = java[i];
			score[i][1] = db[i];
			score[i][2] = web[i];
		}
		
		// 출력
		/*
		for(int i = 0 ; i < 4 ; i++ ) {
			System.out.printf("%s : ", student[i]);
			for(int j = 0 ; j < score[i].length ; j++) {
				System.out.printf((j != 2) ? "%4d," : "%4d", score[i][j]);
			}
			System.out.println();
		}
		*/
		
		System.out.println("****************************************");
		for(int[] n : score) {
			System.out.print("| ");
			for(int no : n) {
				System.out.print(no + "| ");
			}
			System.out.println();
		}
		System.out.println("****************************************");
		
		
		// 각 학생의 총점을 score 배열을 이용해서 구하고 입력하세요.
		// int[] total = new int[4];
		int[] total = new int[4];
		
		for(int i = 0 ; i < score.length; i++ ) {
			for(int j = 0 ; j < score[i].length; j++ ) {
				total[i] += score[i][j];
			}
		}
		
		System.out.println("총점들 : " + Arrays.toString(total));
		
		String[] memb = {"제니", "리사", "로제", "지수", "과목총점"};
		String[] subj = {"java", "db", "web", "학생총점"};
		// int score2[][] = new int[4][5];
		// 의 형태로 과목별 학생들 점수를 기억하는 배열(score)을 학생별 과목점수를 기억하는 배열을 이용해서 완성하세요.
		// 총점도 추가해서 완성하세요.
		
		int[][] score2 = new int[4][5];
		
		for(int i = 0 ; i < score2.length - 1 ; i++ ) {
			for(int j = 0 ; j < score2[i].length - 1; j++ ) {
				score2[i][j] = score[j][i];
				score2[i][score2[i].length - 1] += score[j][i];
				score2[score2.length - 1][j] += score[j][i];
			}
		}
		
		for(int[] s : score2) {
			for(int no : s) {
				System.out.printf("%4d |", no);
			}
			System.out.println();
		}
		/*
		int[] count = new int[10];
		
		System.out.println("count : " + Arrays.toString(count));
		
		System.out.println("################ forEach ###################");
		for(int n : count) {
			// 향상된 for명령(forEach명령)
			// 배열과 같은 시쿼스 자료형에서 사용할 수 있는 반복문
			// 배열에 기억된 데이터를 하나씩 꺼내서 앞에 선언한 변수 n에 순차적으로 대입해준다.
			
			System.out.print(n + " | ");
		}
		System.out.println();
		
		
		String[][] black = new String[4][2];
		
		for(int i = 0 ; i < black.length ; i++ ) {
			black[i][0] = student[i];
		}
		System.out.println();
		for(String[] m : black) {
			System.out.println(m[0] +  " - " + m[1]);
		}
		*/
	}

}