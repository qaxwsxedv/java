package class15B.controller.test;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import class15B.dao.*;
import class15B.vo.EmpVO;

/*
	사원 이름으로 정보를 조회하는 기능의 클래스
 */
public class EnameSearch implements Father {
	private EmpDao eDao;
	private Test01 main;
	
	public EnameSearch() {
//		eDao = new EmpDao();
	}
	
	public EnameSearch(EmpDao eDao) {
		this.eDao = eDao;
	}
	
	public EnameSearch(Test01 main) {
		this.main = main;
		eDao = main.geteDao();
	}
/*
	// Dao 셋팅함수
	public void seteDao() {
		eDao = new EmpDao();
	}
*/
	@Override
	public void satang() {
		while(true) {
			// 회원 이름리스트 조회
			printNameList();
			System.out.println();
			// 조회할 사원이름 입력받고
			String name = JOptionPane.showInputDialog("조회할 사원이름\n상위메뉴로 이동 : UP\n프로그램종료 : EXIT");
			if(!name.equals("wooyoung")) {
				name = name.toUpperCase();
			}
			
			if(name.equals("UP")) {
				break;
			} else if(name.equals("EXIT")) {
				main.setBool(false);
				return;
			}
			// 이름으로 사원정보 조회
			printNameInfo(name);
		}
	}
	
	// 사원이름을 입력받아서 사원의 정보를 출력해주는 함수
	public void printNameInfo(String name) {
		EmpVO eVO = eDao.getNameInfo(name);
		
		String ename = eVO.getName();
		int mno = eVO.getMno();
		String job = eVO.getJob();
		String sname = eVO.getSname();
		int sal = eVO.getSal();
		int grade = eVO.getGrade();
		int comm = eVO.getComm();
		String dname = eVO.getDname();
		String sdate = eVO.getSdate();
		
		System.out.println("사원번호 : " + mno);
		System.out.println("사원이름 : " + ename);
		System.out.println("사원직급 : " + job);
		System.out.println("상사이름 : " + sname);
		System.out.println("사원급여 : " + sal);
		System.out.println("급여등급 : " + grade);
		System.out.println("커 미 션 : " + comm);
		System.out.println("부서이름 : " + dname);
		System.out.println("입 사 일 : " + sdate);
	}
	
	// 회원이름 리스트 조회해서 출력해주는 함수
	public void printNameList() {
		ArrayList nameList = eDao.getNameList();
		System.out.print("| ");
		for(int i = 0 ; i < nameList.size(); i++ ) {
			System.out.print((String) nameList.get(i) + " | ");
		}
		System.out.println();
	}
	
}