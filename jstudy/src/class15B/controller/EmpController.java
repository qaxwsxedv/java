package class15B.controller;

import class15B.dao.*;
import class15B.vo.*;

import java.util.*;

import javax.swing.*;

public class EmpController {
/*
	사원들의 데이터베이스 작업을 컨트롤할 컨트롤러 클래스
 */
	private EmpDao eDao;
	private boolean bool = true;
	
	public EmpController() {
		eDao = new EmpDao();
		mainWin();
	}
	
	public void mainWin() {
		while(bool) {
			String sno = JOptionPane.showInputDialog("1. 사원이름으로 조회\n2. 부서번호로 부서원 정보 조회\n3. 사원 추가\n4. wooyoung 사원 급여수정\n# 번호를 입력하세요!\n프로그램종료 : q");
			if(sno.equals("q")) {
				JOptionPane.showMessageDialog(null, "대다난프로그램종료!!!");
				break;
			}
			
			switch(sno) {
			case "1":
				while(true) {
					// 회원 이름리스트 조회
					printNameList();
					System.out.println();
					// 조회할 사원이름 입력받고
					String name = JOptionPane.showInputDialog("조회할 사원이름\n상위메뉴로 이동 : UP\n프로그램종료 : EXIT").toUpperCase();
					if(name.equals("UP")) {
						break;
					} else if(name.equals("EXIT")) {
						return;
					}
					// 이름으로 사원정보 조회
					printNameInfo(name);
				}
				break;
			case "2":
				getDnoMemberList();
				break;
			case "3":
				addEmp();
			case "4":
				editNameSal();
				break;
			}
		}
	}
	
	// 사원 추가 작업 처리 함수
	public void addEmp(String name, String job, String sname) {
		// 사용할 데이터 만들기
		EmpVO eVO = new EmpVO();
		eVO.setName(name);
		eVO.setJob(job);
		eVO.setSname(sname);
		eVO.setSal(500);
		eVO.setComm(-500);
		eVO.setMail(name + "@githrd.com");
		
		// db작업
		int cnt = eDao.addEmp(eVO);
		
		if(cnt == 1) {
			JOptionPane.showMessageDialog(null, eVO.getName() + " 사원이 입사했습니다.");
		} else {
			JOptionPane.showMessageDialog(null, eVO.getName() + " 사원의 입사가 취소되었습니다.");
		}
	}
	// 사원 추가 작업 처리 함수
	public void addEmp() {
		// 사용할 데이터 만들기
		EmpVO eVO = new EmpVO();
		eVO.setName("wooyoung");
		eVO.setJob("MANAGER");
		eVO.setSname("SMITH");
		eVO.setSal(500);
		eVO.setComm(-500);
		eVO.setMail("wooyoung@githrd.com");
		
		// db작업
		int cnt = eDao.addEmp(eVO);
		
		if(cnt == 1) {
			JOptionPane.showMessageDialog(null, eVO.getName() + " 사원이 입사했습니다.");
		} else {
			JOptionPane.showMessageDialog(null, eVO.getName() + " 사원의 입사가 취소되었습니다.");
		}
	}
	
	// 사원이름과 급여를 입력받아서 해당 사원의 급여 수정해주는 작업
	public void editNameSal() {
		String name = JOptionPane.showInputDialog("이름입력");
		int sal = Integer.parseInt(JOptionPane.showInputDialog("수정급여"));
		
		int cnt = eDao.editNameSal(name, sal);
		
		if(cnt == 0) {
			JOptionPane.showMessageDialog(null, "급여 인상에 실패했습니다!");
		} else {
			JOptionPane.showMessageDialog(null, cnt + " 명의 급여를 수정했습니다.");
		}
	}
	
	// 부서번호 리스트를 출력해주고 부서번호를 입력받아서
	// 부서원리스트를 보여주는 기능
	public void getDnoMemberList() {
		while(true) {
			// 부서번호리스트 조회
			ArrayList<Integer> dnoList = eDao.getDnoList();
			// 출력
			System.out.println();
			System.out.print("| ");
			for(int dno : dnoList) {
				System.out.print(dno + " | ");
			}
			System.out.println();
			
			// 부서번호 입력받기
			String sno = JOptionPane.showInputDialog("부서번호를 입력하세요!\n상위로 이동 : up\n프로그램 종료 : exit").toLowerCase();
			if(sno.equals("exit")) {
				bool = false;
				break;
			} else if(sno.equals("up")) {
				return;
			}
			
			
			int dno = Integer.parseInt(sno);
			// 부서원 정보 조회
			ArrayList<EmpVO> list = eDao.getDnoMemberList(dno);
			
			// 부서원 출력
			System.out.println("========== " + dno + " 번 부서 ==========");
			for(EmpVO vo : list) {
				System.out.printf("%5d ] %-10s 사원 - 직급 : %-12s, 급여 : %5d\n", 
						vo.getMno(), vo.getName(), vo.getJob(), vo.getSal()
						);
			}
			System.out.println("##### " + dno + " 번 부서 부서원 조회 종료 #####");
			System.out.println();
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
	
	public static void main(String[] args) {
		new EmpController();
	}

}