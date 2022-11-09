package class15B.controller.test;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import class15B.dao.*;
import class15B.util.PageUtil;
import class15B.vo.EmpVO;

public class EmpList implements Father {
/*
	EmpDao, boolean bool 
	을 이곳에서도 사용해야 한다.
	따라서 두개를 가지고 있는 Test01 객체를 전달 받아서
	이 클래스가 new 되는 순간 접근할 수 있어야 한다.
	다시말해서 이 클래스가 객체가 되는 순간
	Test01의 멤버에 접근할 수 있어야 한다.
 */
	private Test01 main;
	private EmpDao eDao;
	public EmpList() {}
	public EmpList(Test01 main) {
		this.main = main;
		eDao = main.geteDao();
	}

	@Override
	public void satang() {
		int nowPage = 1;
		int total = 0;
		int pageRow = 4;
		int pageGroup = 5;
		PageUtil page = new PageUtil(nowPage, total, pageRow, pageGroup);
		ArrayList<EmpVO> list = null;
		
		while(true) {
			// 총 사원수 조회
			total = eDao.getTotal();
			// 페이지 정보 객체 셋팅
			page.setPageUtil(nowPage, total, pageRow, pageGroup);
			// 리스트 가져오고
			list = eDao.getEmpList(page);
			// 출력
			printEmpList(list, page);
			
			// 이동 페이지번호 입력 받고
			String msg = JOptionPane.showInputDialog("페이지 번호를 입력하세요!\n상위메뉴 : UP\n프로그램 종료 : EXIT");
			// 메세지내용에 따라서 조건처리 한다.
			if(msg.toUpperCase().equals("UP")) {
				break;
			} else if(msg.toUpperCase().equals("EXIT")) {
				main.setBool(false);
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				break;
			} else {
				nowPage = Integer.parseInt(msg);
			}
		}
	}
	/*
	public void satang() {
		// 총 사원수 조회
		int total = eDao.getTotal();
		int pageRow = 4;
		int pageGroup = 5;
		PageUtil page = new PageUtil(nowPage, total, pageRow, pageGroup);
		boolean isNotStart = false;
		
		// 기본 페이지 출력
		ArrayList<EmpVO> list = eDao.getEmpList(page);
//		// 출력
//		printEmpList(list, page);
		
		while(true) {
			// 할일
			// 총 사원수 조회
			if(isNotStart) {
				total = eDao.getTotal();
				page.setPageUtil(nowPage, total); 
				// PageUtil 을 객체로 만들려면 
				// 필수적으로 필요한 데이터가 nowPage, totalCount, pageRow, pageGroup 은 필수적으로 필요하다.
				list = eDao.getEmpList(page);
//				// 결과 출력
//				printEmpList(list, page);
			} else {
				isNotStart= true;
			}
			
			// 결과 출력
			printEmpList(list, page);
			
			// 메세지 입력받고
			String msg = JOptionPane.showInputDialog("페이지 번호를 입력하세요!\n상위메뉴 : UP\n프로그램 종료 : EXIT");
			// 메세지내용에 따라서 조건처리 한다.
			if(msg.toUpperCase().equals("UP")) {
				break;
			} else if(msg.toUpperCase().equals("EXIT")) {
				main.setBool(false);
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				break;
			} else {
				nowPage = Integer.parseInt(msg);
			}
		}
	}
	*/
	// 사원정보 출력 전담 처리함수
	public void printEmpList(ArrayList<EmpVO> list, PageUtil page) {
		// 리스트에 채워진 길이만큼 반복해서 내용을 출력해준다.
		System.out.println("==================================");
		for(int i = 0 ; i < list.size(); i++ ) {
			EmpVO eVO = list.get(i);
			
			// 출력데이터 꺼내고
			int mno = eVO.getMno();
			int dno = eVO.getDno();
			String name = eVO.getName();
			String sdate = eVO.getSdate();
			
			// 출력
			System.out.printf(
					"%-5d | %-10s | %15s | %2d\n", 
					mno, name, sdate, dno
			);
		}
		System.out.println("---------------------------------------");
		printPage(page);
	}
	
	// 이동 가능한 페이지 번호 출력하기
	public void printPage(PageUtil page) {
		System.out.print("*** 이동가능 페이지 : | ");
		for(int i = page.getStartPage() ; i < page.getEndPage() + 1 ; i++) {
			if(i == page.getNowPage()) {
				System.out.print("* | ");
				continue;
			}
			System.out.print(i + " | ");
		}
		System.out.println("***");
	}

}