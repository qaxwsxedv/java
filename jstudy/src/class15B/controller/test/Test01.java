package class15B.controller.test;

import class15B.dao.*;

import java.util.*;

import javax.swing.JOptionPane;
/*
	데이터베이스에서 데이터를 꺼내는 경우는
		1. 하나의 필드 한행으로 조회되는 결과
			ex) select count(*) from emp;
		2. 여러개의 필드가 한행으로 조회되는 결과
			ex ) select * from emp where ename = 'SMITH';
		3. 하나의 필드가 여러행으로 조회되는 결과
			ex) select ename from emp;
		4. 여러 필드가 여러행으로 조회되는 결과
			ex) select * from emp;
			
	추가기능 ]
		한 페이지에 4명의 리스트가 보여지도록 기능을 구현하세요.
 */
public class Test01 {
/*
	이 클래스가 컨트롤러 역할을 수행할 클래스...
 */
	private EmpDao eDao;
	private boolean bool = true;
	
	public EmpDao geteDao() {
		return eDao;
	}
	public void seteDao(EmpDao eDao) {
		this.eDao = eDao;
	}
	public boolean isBool() {
		return bool;
	}
	public void setBool(boolean bool) {
		this.bool = bool;
	}

	public Test01() {
		eDao = new EmpDao();
		EnameSearch eSrch = new EnameSearch(this);
//		eSrch.seteDao();
//		eSrch.satang();
		DnoSearch dSrch = new DnoSearch(this);
//		dSrch.satang();
		EditSal editSal = new EditSal(this);
//		editSal.satang();
		
		HashMap<String, Father> map = new HashMap<String, Father>();
		map.put("ename", eSrch);
		map.put("dno", dSrch);
		map.put("sal", editSal);
		map.put("elist", new EmpList(this));
		/*
		// map의 키값들만 모두 추출해서 처리
		Set<String> keys = map.keySet(); // map이 가지고 있는 키값들만 모두 추출해서 Set으로 반환해주는 함수
		
		// 꺼내서 실행
		Iterator<String> itor = keys.iterator();
		while(itor.hasNext()) {
			String key = itor.next();
			
			Father f = map.get(key);
			f.satang();
		}
		*/
		
		while(bool) {
			String key = JOptionPane.showInputDialog("이름 검색 : ename\n부서번호 검색 : dno\n급여수정 : sal\n리스트조회 : elist\n\n# 종 료 : q");
			if(key.equals("q")) {
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				break;
			} else {
				map.get(key).satang();
			}
		}
		/*
		switch(key) {
		case "ename":
			map.get(key).satang();
			break;
		case "dno":
			map.get(key).satang();
			
			break;
		case "sal":
			map.get(key).satang();
			
			break;
		case "q":
			break;
		}
		*/
	}

	public static void main(String[] args) {
		new Test01();
	}

}