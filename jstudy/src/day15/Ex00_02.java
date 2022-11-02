package day15;

public class Ex00_02 {
/*
	학생의 이름, java, db, web, total(총점), avg(평균) 점수, rank(순위)를 
	기억할 Student 클래스를 제작하고
	이 클래스가 객체가 될 때 필요한 데이터를 입력받아서 객체가 될 수 있도록 하고
	변수는 은닉화 하세요.
1.
	다섯명의 학생의 점수를 기억할 배열을 만들고
	학생을 입력하세요.
2. 
	1번문항의 학생들의 순위를 계산해서 셋팅하세요.
3. 
	총점 기준 내림차순 정렬하세요.
extra ]
	랜덤하게 3 ~ 7 명의 학생을 기억할 배열을 만들고
	학생들의 정보를 입력해서
	위 문항의 1 ~ 3 의 내용으로 해결하세요.
 */
	String[] woojoo = {
		"설아", "보나", "엑시", "수빈", "루다", "다원", "은서", "여름", "다영", "연정"
	};
	public Ex00_02() {
		Student[] stud = new Student[5];
		// 학생 정보 공간확보
		// 각 공간에 학생 객체를 만들어서채워줘야한다.
		for(int i = 0; i < stud.length ; i++) {
			stud[i] = new Student(
					woojoo[i],
					(int)(Math.random()*41+60),
					(int)(Math.random()*41+60),
					(int)(Math.random()*41+60)
					);
		}
		// 하나씩 꺼내서 출력
		for(int i = 0 ; i < stud.length ; i++) {
			Student s = stud[i];
			System.out.printf("학생이름 : %4s\n자바 : %3d\n디비 : %3d\n웹  : %3d\n총점 : %3d\n평균 : %5.2f\n석차 : %2d\n\n", 
					s.getName(), s.getJava(), s.getDb(), s.getWeb(), s.getTotal(), s.getAvg(), s.getRank()
				);
		}
		// 정렬하기
		for(int i = 0 ; i < stud.length -1 ; i++) {
			for(int j = i -1; j<stud.length ; j++) {
				if(stud[i].getTotal() < stud[j].getTotal()) {
					Student tmp = stud[i];
					stud[i] = stud[j];
					stud[j] = tmp;
				}
			}
		}
		
		System.out.println("----------------------------");
		// 하나씩 꺼내서 출력
		for(int i = 0 ; i < stud.length ; i++) {
			Student s = stud[i];
			System.out.printf("학생이름 : %4s - 총점 : %3d - 석차 : %2d\n\n", 
						s.getName(), s.getTotal(), s.getRank()
					);
		}
		//석차
		for(int i = 0 ; i < stud.length ; i++) {
			for(int j = 0 ; j < stud.length ; j++) {
				stud[i].setRank(stud[j]);
			}
		}
		System.out.println("-----------------------석차------");
		for(int i = 0 ; i < stud.length ; i++) {
			Student s = stud[i];
			System.out.printf("학생이름 : %4s - 총점 : %3d - 석차 : %2d\n\n", 
					s.getName(), s.getTotal(), s.getRank()
					);
			
		}
	}

	public static void main(String[] args) {
		new Ex00_02();

	}

}
