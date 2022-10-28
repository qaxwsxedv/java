package day13;

public class Test01 {

	public Test01() {
		Nemo sagak = new Nemo();
		sagak.setGaro((int)(Math.random()*16 + 5)); // 가로 셋팅
		sagak.setSero((int)(Math.random()*16 + 5)); // 세로 셋팅
		// 면적 셋팅
		sagak.setArea();
		System.out.println(sagak.getGaro()); 
		
	}

	public static void main(String[] args) {
		new Test01();

	}

}
