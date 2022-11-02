package day16;

public class Test01 {

	public Test01() {
		Grand g = new Grand();
		
		Father f = new Father();
		
		Son s = new Son();
		
		// 각각의 함수들 호출
		// Grand
		g.abc();
		System.out.println();
		// Father
		f.abc();
		f.xyz();
		System.out.println("father money : " + f.money);
		System.out.println();
		
		// Son
		s.abc();
		s.xyz();
		s.toPlay();
		System.out.println("son money : " + s.money);
		
		Grand g2 = f;
		Father f2 = s;
		Grand g3 = s;
		
		System.out.println("----------------------------------");
		g2.abc(); // 맨마지막 오버라이드 된 Father 의 함수를 호출한다.
		
		g3.abc();
		((Son)g3).toPlay();
		
		System.out.println("--------------abc()호출----------");
		
		Grand g7 = g;
		g7.abc();
		g7 = f;
		g7.abc();
		g7 = s;
		g7.abc();
		
		System.out.println();
		System.out.println("--------------abc()호출----------");
		Grand[] gArr = new Grand[3];
		gArr[0] = g;
		gArr[1] = f;
		gArr[2] = s;
		
		for(Grand h : gArr) {
			h.abc();
		}
		
		
		System.out.println("=========== MONEY ==========");
		System.out.println("money : " + f2.money);
	}

	public static void main(String[] args) {
		new Test01();

	}

}
