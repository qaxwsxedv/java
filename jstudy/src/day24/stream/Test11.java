package day24.stream;

import java.io.*;
public class Test11 {
/*
 	Member 클래스에 친구의 정보를 기록해서 파일에 저장해보자.
 	ObjectOutputStream 을 이용해서 저장..
 */
	public Test11() {
		// 데이터 만들고
		Member jennie = new Member();
		jennie.setName("제니");
		jennie.setMail("jennie@githrd.com");
		jennie.setAge(27);
		
		// 스트림 준비
		FileOutputStream fout = null;
		// 보조스트림
		ObjectOutputStream oout = null;
		try {
			fout = new FileOutputStream("src/day24/stream/jennie.jny");
			oout = new ObjectOutputStream(fout);
			
			// 데이터 흘려보내고
			oout.writeObject(jennie);
			// 이처럼 클래스 전체를 입출력하는 것을 직렬화라고 한다.
			System.out.println("*** 저장완료 ***");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test11();

	}

}
