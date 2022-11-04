package day18;

import java.util.*;
public class Test03 {

	public Test03() {
		ArrayList list = new ArrayList();
		// 데이터 추가
		list.add("jennie");
		list.add("lisa");
		list.add("rose");
		list.add("jisoo");
		
		System.out.println(list);
		// 데이터 수정
		list.set(2, "Rose");
		list.add("rose");
		list.add("rose");
		System.out.println(list);
		
		Vector vec = new Vector(list);
		System.out.println(vec);
		System.out.println();
		
		Enumeration en = vec.elements();
		
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement() + ", ");
		}
		
		HashSet set = new HashSet(list);
		set.add("rese");
		System.out.println(set);
		
		
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
	}

	public static void main(String[] args) {
		new Test03();

	}

}
