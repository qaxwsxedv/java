package class15B.controller.test;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import class15B.dao.EmpDao;
import class15B.vo.EmpVO;

public class DnoSearch implements Father {
	private EmpDao eDao;
	private Test01 main;
	public DnoSearch() {
//		eDao = new EmpDao();
	}
	
	public DnoSearch(EmpDao eDao) {
		this.eDao = eDao;
	}
	
	public DnoSearch(Test01 main) {
		this.main = main;
		eDao = main.geteDao();
	}

	@Override
	public void satang() {
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
				main.setBool(false);
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

}