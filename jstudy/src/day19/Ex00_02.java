package day19;

import java.util.*;

public class Ex00_02 {
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
	public Ex00_02() {
		ArrayList names = new ArrayList();
		names.add("제니");
		names.add("리사");
		names.add("로제");
		names.add("지수");
		
		for(Object o : names) {
			String name = (String) o;
			System.out.print(name + " | ");
		}
		System.out.println();
		ArrayList ids = new ArrayList();
		ids.add("jennie");
		ids.add("risa");
		ids.add("rose");
		ids.add("jisoo");
		for(Object o : ids) {
			String id = (String) o;
			System.out.print(id + " | ");
		}
		System.out.println();
		
		ArrayList mails = new ArrayList();
		for(int i = 0 ; i < ids.size(); i ++) {
			String mail =((String) ids.get(i)) + "@githrd.com";
			mails.add(mail);
		}
		for(Object o : mails) {
			String mail = (String) o;
			System.out.print(mail + " | ");
		}
		System.out.println();
		ArrayList blackPink = new ArrayList();
		ArrayList tmp = new ArrayList();
		tmp.add(names);
		tmp.add(ids);
		tmp.add(mails);
		for(int i = 0 ; i < 4 ; i++) {
			ArrayList l = new ArrayList();
			l.add(names.get(i));
			l.add(ids.get(i));
			l.add(mails.get(i));
			blackPink.add(l);
		}
		for(Object o : blackPink) {
			ArrayList l = (ArrayList) o;
			for(Object obj : l) {
				String s = (String) obj;
				System.out.print(s + " | ");
			}
			System.out.println();
			ArrayList jennie = (ArrayList) blackPink.get(0);
			ArrayList lisa = (ArrayList) blackPink.get(1);
			ArrayList rose = (ArrayList) blackPink.get(2);
			ArrayList jisoo = (ArrayList) blackPink.get(3);
			System.out.println("++++++++++");
			for(Object o : jennie) {
				System.out.print((String)o + " | ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Ex00_02();

	}

}
