package day16;

import java.util.*;
import day10.*;

public class Test04 {

	public Test04() {
		ArrayList list = new ArrayList();
		
		list.add(1); // 1 : int ---> Integer(Boxing) ---> Object(자동 형변환)
		list.add("jennie");
		list.add('F'); // 'F' : char ---> character(Box) ---> Object(자동 형변환)
		list.add(new Figure());
		
		((Figure)list.get(3)).toPrint();
		
		System.out.println("list.get(0) + 3 : " + ((int)list.get(0) + 3));
		/*
			list.get(0) --> Integer 강제 형변환 ---> int UnBoxing
		 */
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(20);
		
		System.out.println(list1.get(0) + 100);
		System.out.println(list1.get(0) + list1.get(1));
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
