package day24.stream;

import java.io.*;
public class Test10 {
/*
	휘파랑.txt파일을  바이트기반 기본스트림과 문자기반 보조스트림을 이용해서 읽어보자.
 */
	public Test10() {
		// 기본 스트림
		FileInputStream fin = null;
		// 바이트 기반과 문자기반을 연결해줄 보조 스트림
		InputStreamReader isr = null;
		// 보조 스트림
		BufferedReader br = null;
		
		try {
			fin = new FileInputStream("src/day24/stream/휘파람.txt");
			isr = new InputStreamReader(fin); // 기본스트림에 연결해서 만들고
			br = new BufferedReader(isr); // 연결 보조스트림에 연결해서 만들고
			
			while(true) {
				String line = br.readLine(); // 줄바꿈 기호는 읽어오지 않는다.
				if(line == null) {
					// 읽어온 데이터가 없을 경우 종료
					break;
				}
				System.out.println(line); // 강제로 줄바꿈 해줘야 한다.
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
				fin.close();
			} catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new Test10();

	}

}
