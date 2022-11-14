package day24;

// Nemo.java 파일의 내용을 읽어보자.
import java.io.*;
import java.util.*;

public class Test04 {

	public Test04() {
		File file = new File("src/day24/Nemo.java");
		
		Scanner sc = null;
		System.out.println("Nemo.java ] \n");
		try {
			sc = new Scanner(file);
			while(true) {
				String str = sc.nextLine();
				if(str == null) {
					// 읽은 문자열이 없으므로 반복을 종료한다.
					break;
				}
				System.out.println(str);
			}
		} catch(Exception e) {}
	}

	public static void main(String[] args) {
		new Test04();

	}

}
