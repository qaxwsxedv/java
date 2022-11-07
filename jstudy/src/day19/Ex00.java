package day19;

import java.util.*;
public class Ex00 {
/*
	1.
		blackpink 멤버들의 
			이름을 기억할 ArrayList names를 만들고 데이터를 추가
			아이디를 기억할 ArrayList ids를 만들고 데이터를 추가
			메일을 기억할 ArrayList mails를 만들고 데이터 추가하세요.
			
	2. 위 문항에서 완성한 ArrayList에서 데이터를 추출해서
		각 멤버별 ArrayList를 완성하세요.
		
	3. 위 문항에서 완성한 ArrayList를 기억할 ArrayList blackpink를 완성하세요.
	
----------------------------------------------------------------------------------------------
	2 - 1. 
		멤버 한명의 데이터를 기억할 VO BlackPink를 만들고
		1번 문항에서 완성한  ArrayList에서 데이터를 추출해서
		채워넣어서
		
		네 명의 데이터를 기억할 ArrayList에 기억시키세요.
		
	결과도 출력하세요.
		
 */
	public Ex00() {
		ArrayList names = new ArrayList();
		// 데이터 추가
		names.add("제니");
		names.add("리사");
		names.add("로제");
		names.add("지수");
		/*
		Object arr = names.toArray();
		System.out.println(arr);
		*/
		for(Object o : names) { // ArrayList는 모든 데이터를 Object 타입으로 기억한다.
			String name = (String) o; // 강제형변환
			System.out.print(name + " | ");
		}
		System.out.println();
		
		ArrayList ids = new ArrayList();
		ids.add("jennie");
		ids.add("lisa");
		ids.add("rose");
		ids.add("jisoo");
		
		for(Object o : ids) {
			String id = (String) o;
			System.out.print(id + " | ");
		}
		System.out.println();
		
		ArrayList mails = new ArrayList();
		for(int i = 0 ; i < ids.size(); i++ ) {
			String mail = ((String) ids.get(i)) + "@githrd.com";
			mails.add(mail);
		}
		
		for(Object o : mails) {
			String mail = (String) o;
			System.out.print(mail + " | ");
		}
		System.out.println();
		
		// 모든 멤버 기억할 ArrayList
		ArrayList blackPink = new ArrayList();
		// 임시 ArrayList
		ArrayList tmp = new ArrayList();
		tmp.add(names);
		tmp.add(ids);
		tmp.add(mails);
		
		for(int i = 0 ; i < 4 ; i++ ) {
			ArrayList l = new ArrayList();
			
			l.add(names.get(i));
			l.add(ids.get(i));
			l.add(mails.get(i));
			
			blackPink.add(l);
		}
		// 출력
		for(Object o : blackPink) {
			ArrayList l = (ArrayList) o;
			for(Object obj : l) {
				String s = (String) obj;
				System.out.print(s + " | ");
			}
			System.out.println();
		}
		
		// 위에서 만든 ArrayList 에서 추출
		
		ArrayList jennie = (ArrayList) blackPink.get(0);
		ArrayList lisa = (ArrayList) blackPink.get(1);
		ArrayList rose = (ArrayList) blackPink.get(2);
		ArrayList jisoo = (ArrayList) blackPink.get(3);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		for(Object o : jennie) {
			System.out.print((String)o + " | ");
		}
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		ArrayList blackpink = new ArrayList(); // VO가 채워질 ArrayList
		for(int i = 0 ; i < blackPink.size(); i++ ) {
			// 데이터꺼내고
			String name = (String) ((ArrayList)blackPink.get(i)).get(0); // 이름
			String id = (String) ((ArrayList)blackPink.get(i)).get(1); // 아이디
			String mail = (String) ((ArrayList)blackPink.get(i)).get(2); // 메일
			
			// 데이터채울 VO 만들고
			BlackPink vo = new BlackPink();
			// VO에 데이터 채우고
			vo.setName(name);
			vo.setId(id);
			vo.setMail(mail); // VO에 데이터가 모두 채워졌다.
			
			// 채워진 VO 를 ArrayList에 기억시킨다.
			blackpink.add(vo);
		}
		
		// 출력
		for(int i = 0 ; i < blackpink.size() ; i++ ) {
			Object o = blackpink.get(i);
			BlackPink vo = (BlackPink) o;
			String name = vo.getName();
			String id = vo.getId();
			String mail = vo.getMail();
			
			// 출력
			System.out.printf("%-6s - %-8s - %-20s\n", name, id, mail);
		}
	}

	public static void main(String[] args) {
		new Ex00();
	}

}