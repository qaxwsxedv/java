package day11;

public class Ex02 {
/*
	Student 클래스를 이용해서
	학생들 10명의 점수를 기억할 배열을 만들고
	총점을 입력하고
	평균도 계산하고
	-------------------------- (1)
	순위도 계산해서
	-------------------------- (3)
	정렬하세요.
	-------------------------- (2)
 */
	String[] names = {
			"제니", "리사", "로제", "지수", "아이유",
			"경욱", "태윤", "우영", "경민", "혁주"
	};
	
	public Ex02() {
		/*
		int[] nums = new int[10]; // ==> int 타입의 정수 10개를 관리할 배열
		String[] pink = new String[10]; // ==> String 타입의 데이터 10개를 관리할 배열
		day10.Nemo[] nemo = new day10.Nemo[10]; // ==> Nemo 타입의 데이터 10개를 관리할 배열
		*/
		
		// 학생 10 명을 기억할 배열을 만든다.
		Student[] score = new Student[10];
		// 데이터를 셋팅한다.
		for(int i = 0 ; i < score.length ; i++ ) {
			// 아직 배열의 각 방에는 채워진 것이 아무것도 없으므로 Student 인스턴스를 채워준다.
			// Student  객체를 만든다.
			Student stud = new Student();
			// 데이터 셋팅하고
			// 이름 배열에서 이름 꺼내서 셋팅하고
			stud.name = names[i];
			// 각 과목 점수 셋팅하고
			stud.kor = (int)(Math.random()*41 + 60);
			stud.eng = (int)(Math.random()*41 + 60);
			stud.math = (int)(Math.random()*41 + 60);
			// 총점 셋팅하고
			stud.total = stud.kor + stud.eng + stud.math;
			// 평균 구하고
			stud.avg = stud.total / 3.0;
			
			// 데이터 셋팅이 완료된 Student객체를 학생배열의 각 방에 채워준다.
			score[i] = stud;
		}
		
		// 순위
		for(int i = 0 ; i < score.length ; i++ ) {
			score[i].rank = 1;
			for(int j = 0 ; j < score.length ; j++ ) {
				if(score[i].total < score[j].total) {
					score[i].rank += 1;
				}
			}
		}
		
		// 정렬한다.(총점기준 내림차순정렬 )
		for(int i = 0 ; i < score.length - 1 ; i++ ) {
			for(int j = i + 1; j < score.length ; j++ ) {
				if(score[i].total < score[j].total) {
					Student tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		
		/*
		// 순위
		for(int i = 0 ; i < score.length ; i++ ) {
			score[i].rank = 1 + i;
		}
		*/
		// 출력한다.
		for(Student s : score) {
			System.out.printf("%2d 등 - %3s : 국어 : %3d, 영어 : %3d, 수학 : %3d, 총점 : %3d, 평균 : %5.2f\n",
								s.rank, s.name, s.kor, s.eng, s.math, s.total, s.avg
					);
		}
	}

	public static void main(String[] args) {
		new Ex02();
	}

}