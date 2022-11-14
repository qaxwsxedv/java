package day24.stream;

import java.io.*;
public class Test12 {
/*
 	jennie.jny 파일을 읽어보자
 */
	public Test12() {
		// 기본 스트림
		FileInputStream fin = null;
		// 보조 스트림 준비
		ObjectInputStream oin = null;
		try {
			fin = new FileInputStream("src/day24/stream/jennie.jny");
			oin = new ObjectInputStream(fin);
			
			// 데이터 읽어서 변수에 기억
			Member memb = (Member)oin.readObject();
			
			// 출력
			System.out.println("이름 : " + memb.getName());
			System.out.println("메일 : " + memb.getMail());
			System.out.println("나이 : " + memb.getAge());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test12();

	}

}
