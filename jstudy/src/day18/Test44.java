package day18;

import java.util.*;

public class Test44 {
/*
	ArrayList에
		1 ~ 5 까지를 기억하는 ArrayList
		11 ~ 15 까지를 기억하는 ArrayList
		21 ~ 25 까지를 기억하는 ArrayList
	채워서 완성하고
	꺼내서 출력하세요.
 */
	public Test44() {
		// 방법 2
		// ==> 리스트르 먼저 준비하고 나중에 채우는 방법
		
		ArrayList list = new ArrayList();
		for(int i = 0 ; i < 3 ; i++) {
			list.add(new ArrayList());
		}
		
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				((ArrayList)list.get(i)).add(10 * i + j + 1);
			}
		}
		
		// 출력
		for(int i = 0 ; i < list.size(); i++) {
			Object o = list.get(i); // i번째 데이터꺼내고
			ArrayList l = (ArrayList) o; // 강제형변환
			for(int j = 0 ; j < l.size(); j++) { // 안쪽 ArrayList에 채워진 데이터갯수만큼 반복
				Object obj = l.get(j); // 안쪽 ArrayList에 채워진 데이터 한개 꺼내고
				int no = (int) obj; // 원래 정수를 채웟으니 정수로 강제 형변환해주고
				System.out.print(no + ", ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		new Test44();

	}

}
