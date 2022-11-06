package day18;

import java.util.*;

public class Test55 {
/*
	ArrayList에
		1 ~ 5 까지를 기억하는 ArrayList
		11 ~ 15 까지를 기억하는 ArrayList
		21 ~ 25 까지를 기억하는 ArrayList
	채워서 완성하고
	꺼내서 출력하세요.
 */
	public Test55() {
		ArrayList l1 = new ArrayList();
		for(int i = 1 ; i < 6 ; i++) {
			l1.add(i);
		}
		ArrayList l2 = new ArrayList();
		for(int i = 11 ; i < 16 ; i++) {
			l2.add(i);
		}
		ArrayList l3 = new ArrayList();
		for(int i = 21 ; i < 26 ; i++) {
			l3.add(i);
		}
		
		ArrayList list = new ArrayList();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		
		for(int i = 0 ; i < list.size(); i++) {
			Object o = list.get(i);
			ArrayList l = (ArrayList) o;
			System.out.println("꺼낸 리스트의 데이터 갯수 : " + l.size());
			for(int j = 0 ; j < l.size(); j++) {
				System.out.println((int)l.get(j));
			}
		}
	}

	public static void main(String[] args) {
		new Test55();

	}

}
