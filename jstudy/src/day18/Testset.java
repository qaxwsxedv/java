package day18;

import java.util.*;

public class Testset {
/*
	ArrayList에
		1 ~ 5 까지를 기억하는 ArrayList
		11 ~ 15 까지를 기억하는 ArrayList
		21 ~ 25 까지를 기억하는 ArrayList
	채워서 완성하고
	꺼내서 출력하세요.
 */

	public Testset() {
		// 방법1
		// ==> 안쪽 리스트부터 만든다.
		
		// 1 ~ 5
		ArrayList l1 = new ArrayList();
		for(int i = 1 ; i < 6 ; i++) {
			l1.add(i);
		}
		// 11 ~ 15
		ArrayList l2 = new ArrayList();
		for(int i = 11 ; i < 16 ; i++) {
			l2.add(i);
		}
		// 21 ~ 25
		ArrayList l3 = new ArrayList();
		for(int i = 21 ; i < 26 ; i++) {
			l3.add(i);
		}
		
		ArrayList list = new ArrayList();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		
		// 출력
		for(int i = 0 ; i < list.size(); i++) {
			// 하나꺼내고
			Object o = list.get(i);
			// 원래 ArrayList로 변환
			ArrayList l = (ArrayList) o;
			System.out.println("꺼낸 리스트의 데이터 갯수 : " + l.size());
			for(int j = 0 ; j < l.size(); j++) {
				// size() : 리스트에 추가된 데이터 갯수 반환해주는 함수
				System.out.println((int)l.get(j));
			}
		}
		
	}

	public static void main(String[] args) {
		new Testset();
	}

}
