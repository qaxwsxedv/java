package day20;

import java.util.*;

public class Test01 {
/*
	10명의 이름을 HashSet에 기억시킨수 꺼내서 사용해보자.
 */
	String[] woojoo = {
			"설아", "보나", "엑시", "수빈", "루다", "다원", "은서", "여름", "다영", "연정"
		};
	public Test01() {
		// HashSet 만들고
		HashSet set = new HashSet();
		// 데이터 채우고
		for(int i = 0 ; i < woojoo.length; i++) {
			set.add(woojoo[i]);
		}
		
		// 입력된 갯수 출력
		int size = set.size();
		System.out.println("set에 입력된 갯수 : " + size);
		
		/*
			Set 계열은 데이터를 꺼내는 기능이 존재하지 않는다.
			왜냐하면 데이터의 기억 위치를 개발자가 알 수 없기 때문이다.
			따라서 꺼낼때는
				1. Iterator 로 변환시켜서 꺼내는 방법
				2. ArrayList 로 변환시켜서 꺼내는 방법
		 */
		
		// 1. Iterator로 변환시켜서 꺼내는 방법
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			// itor.hasNext(): 꺼낼 데이터가 아직 남아있는지 알아보는 함수. 반환값은 꺼낼데이터가 있으면 true, 없으면 false
			String name = (String) itor.next(); // itor.next(): 데이터 꺼내는 함수. 반환값타입 : Object
			System.out.println(name);
		}
		
		// 2. ArrayList로 변환해서 사용하는 방법
		System.out.println("list 출력");
		ArrayList list = new ArrayList(set);
		for(int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i);
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		new Test01();

	}

}
