package day07;

public class Test01 {

	public static void main(String[] args) {
		// 렌덤하게 정수 발생
		int no = (int)(Math.random()*10);
		
		//결과값 변수
		String result = "";
		
		// switch ~ case 처리
		switch(no) {
		case	0:
			System.out.println(no);
			result = "영";
			break;
		case	1:
			System.out.println(no);
			result = "하나";
			break;
		case	2:
			System.out.println(no);
			result = "둘";
			break;
		case	3:
			System.out.println(no);
			result = "셋";
			break;
		case	4:
			System.out.println(no);
			result = "넷";
			break;
		case	5:
			System.out.println(no);
			result = "다섯";
			break;
		case	6:
			System.out.println(no);
			result = "여섯";
			break;
		case	7:
			System.out.println(no);
			result = "일곱";
			break;
		case	8:
			System.out.println(no);
			result = "여덟";
			break;
		case	9:
			System.out.println(no);
			result = "아홉";
			break;
		}
											
		System.out.println("입력된 정수 [ " + no + " ] 이고 [ " + result + " ] 입니다.");
	}

}
