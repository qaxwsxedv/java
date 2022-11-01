package day15;

public class Ex01 {
/*
	1. 
		다음 변수를 가지는 Stud 클래스를 만드세요.
		
		String name;
		int ban, no, kor, eng, math, total, rank;
		double avg;
		
	2. 생성자 함수를 정의 하세요.
		1) 반, 번호, 이름을 알려주면 객체를 만들 수 있는 기능
		2) 반, 번호, 이름, 3과목 점수를 알려주면 객체를 만들 수 있는 기능
		3) 반, 번호, 이름, 3과목 점수를 배열로 알려주면 객체를 만들 수 있는 기능
		
	3. 위 클래스에 다음 기능을 가지는 함수를 추가하세요.
		
		1. 총점을 반환해주는 getTotal()
		2. 평균을 반환해주는 getAvg()
			단, 평균은 소수점 이하 둘째 자리에서 반올림해서 반환
		3. 반, 번호, 이름, 3과목 점수, 총점 , 평균, 순위를 출력해주는 함수 toPrint()
		
		4. 순위를 계산해주는 함수 setRank()
		
 */
	public Ex01() {
		
		Stud s1 = new Stud();
		s1.setName("jennie");
		
		Stud s2 = new Stud("dooly", 2, 2);
		System.out.println(s2.getName());
	}
	public static void main(String[] args) {
		new Ex01();
	}

}