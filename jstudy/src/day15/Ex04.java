package day15;

public class Ex04 {
/*
	게시글 하나의 정보를 기억할 수 있는
	Board 클래스를 제작하고
	
	데이터를 셋팅하고
	
	꺼내서 출력해보세요.
	
	배열에 5개의 글을 담아서 출력해보세요.
 */
	public Ex04() {
		Board[] bor = new Board[5];
		for(int i = 0 ; i < bor.length ; i++) {
			bor[i] = new Board();
		}
		for(int i = 0 ; i < bor.length ; i++) {
			Board b = new bor[i];
			System.out.print(b.getTitle(), b.getBody(), b.getWdate(), b.getIsshow(),b.getBno(), b.getUpno(), b.getWriter(), b.getWriter(), b.getWcount(), b.getCate());
		}
	}

	public static void main(String[] args) {
		new Ex04();
	}

}
