package day20;

import java.util.*;

public class Test02 {
/*
	Semo 객체 5개를 만들어서 
	TreeSet에서 관리하세요.
 */
	String[] woojoo = {
			"설아", "보나", "엑시", "수빈", "루다", "다원", "은서", "여름", "다영", "연정"
	};
	TreeSet set;
	public Test02() {
//		addWoojoo();
//		setLotto();
//		addSemo();
		addSamgak();
	}
	
	// 우주소녀 멤버로 채우기
	public void addWoojoo() {
		set = new TreeSet();
		// 데이터 채우고
		for(int i = 0 ; i < woojoo.length ; i++ ) {
			set.add(woojoo[i]);
		}
		set.add("은서");
		
		ArrayList<String> list = new ArrayList<String>(set);
		for(int i = 0 ; i < list.size(); i++ ) {
			System.out.println(list.get(i));
		}
	}
	
	// 로또번호 채우기
	public void setLotto() {
		set = new TreeSet();
		int cnt = 1;
		while(set.size() < 6 ) {
			System.out.print(cnt++ + " | ");
			set.add((int)(Math.random()* 45 + 1));
		}
		System.out.println();
		
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		for(int i = 0 ; i < list.size(); i++ ) {
			System.out.println(list.get(i));
		}
	}
	
	// 세모 클래스 채우기
	public void addSemo() {
		set = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Semo s1 = (Semo) o1;
				Semo s2 = (Semo) o2;
				// 면적 기준 내림차순 정렬
				int result = s1.getArea() == s2.getArea() ? 0 : (s1.getArea() < s2.getArea() ? 1 : -1);
				return result;
			}
		});
		Semo s1 = new Semo((int)(Math.random()*16 + 5), (int)(Math.random()*16 + 5));
		Semo s2 = new Semo((int)(Math.random()*16 + 5), (int)(Math.random()*16 + 5));
		Semo s3 = new Semo((int)(Math.random()*16 + 5), (int)(Math.random()*16 + 5));
		Semo s4 = new Semo((int)(Math.random()*16 + 5), (int)(Math.random()*16 + 5));
		Semo s5 = new Semo((int)(Math.random()*16 + 5), (int)(Math.random()*16 + 5));
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s5);
		
		// 출력
		/*
		// 1. Iterator
		Iterator<Semo> itor = set.iterator();
		
		while(itor.hasNext()) {
			Semo s = itor.next();
			System.out.printf("가로 : %3d, 세로 : %3d, 면적 : %5.2f\n", s.getWidth(), s.getHeight(), s.getArea());
		}
		*/
		
		// 2. ArrayList 로 해결하는 방법
		ArrayList<Semo> list = new ArrayList<Semo>(set);
		for(int i = 0 ; i < list.size(); i++ ) {
			Semo s = list.get(i);
			System.out.printf("가로 : %3d, 세로 : %3d, 면적 : %5.2f\n", s.getWidth(), s.getHeight(), s.getArea());
		}
	}
	
	// 삼각 클래스 5개 추가
	public void addSamgak() {
		set = new TreeSet();
		while(set.size() < 5) {
			set.add(new Samgak((int)(Math.random()*16 + 5), (int)(Math.random()*16 + 5)));
		}
		
		// 출력
		ArrayList<Samgak> list = new ArrayList<Samgak>(set);
		
		for(Samgak s : list) {
			System.out.printf("가로 : %3d, 세로 : %3d, 면적 : %5.2f\n", 
								s.getWidth(), s.getHeight(), s.getArea());
		}
	}
	public static void main(String[] args) {
		new Test02();
	}

}