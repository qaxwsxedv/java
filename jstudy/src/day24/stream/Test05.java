package day24.stream;

import java.io.*;

import javax.swing.JOptionPane;

public class Test05 {
/*
	1. 폴더 하나를 강제로 만들어보자.
	2. 계층화된 폴더하나를 강제로 만들어보자.
	3. 만들어진 폴더하나를 삭제해보자.
 */
	public Test05() {
		/*
		// 1. 폴더 만들기
		File file = new File("src/day24/stream/test01");
		file.mkdir();
		*/
		
		/*
		// 2. 계층화된 폴더 만들기
		File file = new File("src/day24/stream/test02/t01/t02");
		if(file.mkdirs()) {
			JOptionPane.showMessageDialog(null, "폴더 생성 성공");
		} else {
			JOptionPane.showMessageDialog(null, "폴더 생성 실패");
		}
		*/
		
		/*
		// 폴더 삭제
		File file = new File("src/day24/stream/test02/t01/t02");
		if(file.delete()) {
			JOptionPane.showMessageDialog(null, "폴더 삭제 성공");
		} else {
			JOptionPane.showMessageDialog(null, "폴더 삭제 실패");
			
		}
		*/
		
		// 폴더이름 변경
		// 1. 현재폴더와 변경될 폴더를 File로 만들어 둔다.
		File oldF = new File("src/day24/stream/test02/t01");
		File newF = new File("src/day24/stream/test02/T01");
		// 2. 바꾼다.( renameTO()
		oldF.renameTo(newF);
	}

	public static void main(String[] args) {
		new Test05();

	}

}
