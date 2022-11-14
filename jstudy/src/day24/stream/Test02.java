package day24.stream;

import java.io.*;
import java.util.Arrays;

public class Test02 {
/*
	Test01.java 파일을 읽어보자.
 */
	public Test02() {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day24/stream/Test01.java"); // byte단위 기본 스트림
			/*
			// 1. 한글자 읽기
			int ch = fin.read();
			// 출력
			System.out.println((char) ch);
			*/
			
			/*
			// 2. 여러글자 읽기
			byte[] buff = new byte[1024];
			int len = fin.read(buff); // 읽은 데이터를 buff 배열에 기억하고 읽은 갯수 반환해준다.
			
			String str = new String(buff, 0, len);
			// 출력
			System.out.println(str);
			*/
			
			// 파일 내용 전체를 읽어보자.
			// 몇글자를 꺼내야 할 지 모르므로
			byte[] buff = new byte[1024];
			while(true) {
				// 배열 0으로 채우고
				Arrays.fill(buff, (byte)0);
				// 읽고
				int len = fin.read(buff);
				// 문자열로 변화
				String str = new String(buff, 0, len);
				// 출력
				System.out.println(str);
			}
		} catch(Exception e) {}
	}

	public static void main(String[] args) {
		new Test02();

	}

}
