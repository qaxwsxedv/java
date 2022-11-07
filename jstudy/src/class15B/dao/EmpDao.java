package class15B.dao;

import java.sql.*;
import db.*;
import class15B.sql.*;
import class15B.vo.*;

import java.util.*;
import java.util.Date;

/**
 * 이 클래스는 사원정보 데이터베이스 작업 전담 처리 클래스
 * @author	전은석
 * @since	2022/11/07
 *
 */
public class EmpDao {
/*
	이 클래스가 new 되는 경우는 
	emp 테이블에 접근해서 데이터베이스 작업이 필요한 경우이다.
	따라서 이 클래스가 new 되는 순간 오라클을 사용할 준비가 끝나 있어야 한다.
 */
	private SmartJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private EmpSQL eSQL;
	
	public EmpDao() {
		db = new SmartJDBC();
		eSQL = new EmpSQL();
	}
	
/*

	참고]
	-- 한개의 타입, 1개의 데이터
	SELECT COUNT(*) FROM emp; -- ==> 해당타입으로 반환
	
	-- 한개의 타입으로 여러데이터(여러행)
	SELECT empno FROM emp; -- ==> 데이터들을 ArrayList 담아서 반환
	
	-- 여러타입의 한행의 데이터
	SELECT * FROM emp WHERE ename = 'SMITH'; -- ==> VO에 담아서 반환
	
	-- 여러타입이 여러행으로 조회된 결과
	SELECT * FROM emp; -- ==> VO 를 ArrayList담아서 반환해준다.
 */
	
	// 사원이름리스트 조회 전담 처리함수
	public ArrayList getNameList() {
		// 작업순서
		// 0. 반환값 변수 만들고
		ArrayList list = new ArrayList();
		// 1. 커넥션 꺼내오고
		con = db.getCon("scott", "tiger");
		// 2. 질의명령 가져오고
		String sql = eSQL.getSQL(eSQL.SEL_NAME_LIST);
		// 3. 명령전달도구 준비하고 : 이미 완성된 질의명령(? 가 없는 질의명령)이므로 Statement가 필요하다.
		stmt = db.getStmt(con);
		//  필요한 질의명령이 채워야할 데이터가 없는 완성된 질의명령이므로 
		// 	질의명령 완성작업은 필요없다.
		try {
			// 4. 질의명령 보내고 결과받고
			rs = stmt.executeQuery(sql); // stmt : 질의명령 실어서 보내는 명령 전달 도구..
			// 5. 조회결과에서 데이터꺼내고
			// 만들어진 inline 테이블이 여러행이므로 반복처리하면 된다.
			while(rs.next()) {
				/*
					rs.next()
					==> ResultSet이 기억하고 있는 인라인테이블의 가상레코드포인터를
						한행 밑으로 내려주는 명령
						반환값은 꺼낼 데이터가 있으면 true, 없으면 false
						==> EOF로 이동하는 순간 false 를 반환
				 */
				// 조건식에서 rs.next() 레코드포인터를 데이터를 꺼내올 행으로 이동시켰으니
				// 데이터를 꺼내서 처리해주면 된다.
				
				// 지금의 경우 사원들의 이름들만 조회를 하고 있으니 한가지타입의 한개의 데이터가 여러행 조회된다.
				// 따라서 문자열을 꺼낸후 리스트에 채워주면 된다.
				String name = rs.getString("ename");
				
				// 6. 꺼낸데이터 ArrayList에 채우고
				list.add(name);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		// 7. ArrayList 반환해주고
		return list;
	}
	
	// 사원이름을 전달받아서 사원 정보 조회 전담 처리함수
	public EmpVO getNameInfo(String name) {
		// 할일
		// 0. 반환값 변수 만들고
		EmpVO eVO = new EmpVO();
		// 1. 커넥션 얻어오고
		con = db.getCon("scott", "tiger");
		// 2. 질의명령 가져오고
		String sql = eSQL.getSQL(eSQL.SEL_NAME_INFO);
		// 3. 명령전달도구 꺼내오고
		pstmt = db.getPstmt(con, sql);
		try {
			// 4. 질의명령 완성하고
			pstmt.setString(1, name);
			// 5. 질의명령 보내고 결과받고
			rs = pstmt.executeQuery();
			// 6. 결과 꺼내서 VO에 담고
			rs.next(); // 레코드포인터 한행 내리고
			int mno = rs.getInt("mno");
			String ename = rs.getString("name");
			String job = rs.getString("job");
			String sname = rs.getString("sname");
			int sal = rs.getInt("sal");
			int grade = rs.getInt("grade");
			int comm = rs.getInt("comm");
			String dname = rs.getString("dname");
			Date hdate = rs.getDate("hdate");
			
			eVO.setMno(mno);
			eVO.setName(ename);
			eVO.setJob(job);
			eVO.setSname(sname);
			eVO.setSal(sal);
			eVO.setGrade(grade);
			eVO.setComm(comm);
			eVO.setDname(dname);
			eVO.setHdate(hdate);
			eVO.setSdate();
			// VO 에 받아온 데이터를 채우는 작업이 완료...
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		// 7. VO 반환해주고
		return eVO;
	}
}