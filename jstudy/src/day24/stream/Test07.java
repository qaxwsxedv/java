package day24.stream;

import java.io.*;
public class Test07 {
/*
	파일에 저장하는 프로그램을 BufferdStream을 이용해서 만드세요.
 */
	public Test07() {
		// 1. 기본(타겟) 스트림 준비
		FileOutputStream fout = null;
		// 2. 보조스트림 준비
		BufferedOutputStream bout = null;
		
		try {
			fout = new FileOutputStream("src/day24/stream/제니정보.txt");
			bout = new BufferedOutputStream(fout);
			
			String str = "이름 : 제니, 전화번호 : 010-1111-1111";
			byte[] buff = str.getBytes();
			// 보조스트림에 흘려준다.
			bout.write(buff);
			/*
				버퍼는 채워져야 기본스트림으로 데이터가 빠져나간다.
				아직 버퍼가 채워지지 않았으므로 데이터가 기본스트림으로 흘러가지 않은상태이다.
				따라서 버퍼를 강제로 비워준다.
			 */
			bout.flush();
			System.out.println("----저장 성공----");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bout.close();
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test07();

	}

}
