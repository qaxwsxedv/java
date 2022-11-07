package day19;

import java.util.*;

public class Test04 {
	private ArrayList<String> names;
	private ArrayList<PinkScore> blackpink;
	public Test04() {
		blackpink = new ArrayList<PinkScore>();
		
		names = new ArrayList<String>();
		names.add("jennie");
		names.add("lisa");
		names.add("rose");
		names.add("jisoo");
		
		for(int i = 0 ; i < 4 ; i++ ) {
			int kor = (int)(Math.random()*41 + 60);
			int eng = (int)(Math.random()*41 + 60);
			int math = (int)(Math.random()*41 + 60);
			String name = names.get(i);
			PinkScore score = new PinkScore(name, kor, eng, math);
			
			blackpink.add(score);
		}
		
		// 출력
		printBlackpink("정렬 전");
		/*
		System.out.println("####### 정렬 전 #######");
		for(PinkScore p : blackpink) {
			String name = p.getName();
			int kor = p.getKor();
			int eng = p.getEng();
			int math = p.getMath();
			int total = p.getTotal();
			double avg = p.getAvg();
			
			System.out.printf("%-8s : k - %3d, e - %3d, m - %3d, t - %4d, avg - %5.2f\n",
							name, kor, eng, math, total, avg
					);
		}
		*/
		
		
		Collections.sort(blackpink, new TotalDesc());
		
		// 출력
		printBlackpink("총점 기준 정렬 후");
		/*
		System.out.println("####### 정렬 전 #######");
		for(PinkScore p : blackpink) {
			String name = p.getName();
			int kor = p.getKor();
			int eng = p.getEng();
			int math = p.getMath();
			int total = p.getTotal();
			double avg = p.getAvg();
			
			System.out.printf("%-8s : k - %3d, e - %3d, m - %3d, t - %4d, avg - %5.2f\n",
					name, kor, eng, math, total, avg
					);
		}
		*/
		// 국어점수 기준 내림차순 정렬
		
		// 평균기준 내림차순 정렬
		Collections.sort(blackpink, new AvgDesc());
		// 출력
		printBlackpink("평균 기준 정렬 후");
		/*
		System.out.println("####### 평균 정렬 후 #######");
		for(PinkScore p : blackpink) {
			String name = p.getName();
			int kor = p.getKor();
			int eng = p.getEng();
			int math = p.getMath();
			int total = p.getTotal();
			double avg = p.getAvg();
			
			System.out.printf("%-8s : k - %3d, e - %3d, m - %3d, t - %4d, avg - %5.2f\n",
					name, kor, eng, math, total, avg
					);
		}
		*/
		// 이름순 오름차순 정렬
		System.out.println("cB".compareTo("A"));
	}

	// 출력함수
	public void printBlackpink(String str) {
		System.out.println("####### " + str + " #######");
		for(PinkScore p : blackpink) {
			String name = p.getName();
			int kor = p.getKor();
			int eng = p.getEng();
			int math = p.getMath();
			int total = p.getTotal();
			double avg = p.getAvg();
			
			System.out.printf("%-8s : k - %3d, e - %3d, m - %3d, t - %4d, avg - %5.2f\n",
							name, kor, eng, math, total, avg
					);
		}
	}
	public static void main(String[] args) {
		new Test04();
	}
}

// 내림차순정렬해주는 클래스
class TotalDesc implements Comparator {
	public int compare(Object o1, Object o2) {
		// 반환값 변수
		int result = 0 ;
		// 원래 리스트에 입력된 타입으로 형변환
		PinkScore p1 = (PinkScore) o1;
		PinkScore p2 = (PinkScore) o2;
		// 총점 꺼내고
		int no1 = p1.getTotal();
		int no2 = p2.getTotal();
		// 결과값 계산하고
		result = no1 - no2; // -1 * (no1 - no2) == no2 - no1
		// 반환해주고
		return -result;
	}
}

class AvgDesc implements Comparator {
	public int compare(Object o1, Object o2) {
		PinkScore p1 = (PinkScore) o1;
		PinkScore p2 = (PinkScore) o2;
		
		return (p1.getAvg() < p2.getAvg() ? 1 : -1);
	}
}