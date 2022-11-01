package day15;

public class Student {
	private String name;
	private int java, db, web, total, rank;
	private double avg;
	
	public Student() {} // 데이터 입력없이 객체 만드는 방법

	public Student(String name, int java, int db, int web) {
		// 필요한 데이터 입력하면 객체만드는 방법
		this.name = name; // 입력된 이름으로 멤버 변수 셋팅
		this.java = java;
		this.db = db;
		this.web = web;
		rank = 1; // 초기화 
		setTotal(); // 총점 계산
		setAvg();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getDb() {
		return db;
	}

	public void setDb(int db) {
		this.db = db;
	}

	public int getWeb() {
		return web;
	}

	public void setWeb(int web) {
		this.web = web;
	}

	public int getTotal() {
		return total;
	}
	
	public void setTotal() { // 전역변수에 기억된 값으로 계산
		total = java + db + web;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public void setRank(Student other) {
		if(total < other.getTotal()) {
			rank += 1;
		}
	}

	public double getAvg() {
		return avg;
	}
	
	public void setAvg() {
		avg = total / (double)3;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}