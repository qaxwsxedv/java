package day22;

import java.util.*;

public class Test03 {

	public Test03() {
		HashSet<String> names = new HashSet<String>();
		names.add("jennie");
		names.add("lisa");
		names.add("rose");
		names.add("jisoo");
		
		ArrayList list = new ArrayList(names);
		// names의 제너릭스가 전파되지 않는다.
		
		Iterator<String> itor = names.iterator();
		// 제너릭스는 전파되지 않으므로 새로운 컬렉션이 만들어질때 다시 선언해야 한다.
		while(itor.hasNext()) {
			String name = itor.next();
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
