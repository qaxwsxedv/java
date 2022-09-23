package oday02;

public class Ex11 {
/*
	문제 9]
		게시판에 게시글을 게시할 예정이다.
		한페이지에 15개의 게시글을 게시할 수 있다.
		게시글의 갯수를 랜덤하게 발생시켜서
		필요한 게시판 페이지가 몇 페이지 인지를 출력해주는 프로그램을 작성하세요.
 */
	public static void main(String[] args) {
		int contnt = (int) (Math.random()*101);
		/*
		int page = 0;
		if(content == 0) {
			page = 1;
		}else if(content % 15 == 0) {
			page = content / 15;
		}else {
			page = content / 15 + 1;
		}
		*/
		int page = (content == 0 ) ? 1 : (
					cintent % 15 == 0 ? content / 15 : content / 15 + 1
				);
	}
	System.out.print();
}

