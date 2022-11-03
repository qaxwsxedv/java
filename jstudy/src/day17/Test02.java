package day17;

import java.util.*;
public class Test02 {

	public Test02() {
//		Calendar cal = new Calendar(); 
		// Calendar 클래스는 추상 클래스이므로 new 시켜서 사용하지 못한다.
		Calendar cal = Calendar.getInstance();
		
		String stime = cal.getTime().toString();
		
		System.out.println(stime);
	}

	public static void main(String[] args) {
		new Test02();

	}

}
