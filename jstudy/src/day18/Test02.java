package day18;

import java.util.*;
public class Test02 {

	public Test02() {
		Vector vec = new Vector();
		
		int cap = vec.capacity();
		
		System.out.println(cap);
		cap = vec.capacity();
		System.out.println("vec size : " + vec.size());
		System.out.println("vec.capacity : " + cap);
		for(int i = 0 ; i < 11 ; i++) {
			vec.add("jennie");
			
		}
		cap = vec.capacity();
		System.out.println("vec size : " + vec.size());
	}

	public static void main(String[] args) {
		new Test02();

	}

}
