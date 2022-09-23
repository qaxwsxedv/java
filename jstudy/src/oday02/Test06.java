package oday02;

public class Test06 {

	public static void main(String[] args) {
		int no = sc.nextInt();
		int tmp = no;
		sc.close();
		int num = (int) Math.pow(10, (no + "").length() - 1);
		String result = "외문수이다.";
		for(int i = 0 ; i < (no + "").length() / 2 ; i++ ) {
			result = "회문수가 아니다.";
			break;
		}
		tmp = tmp % num / 10;
		num /= 100;
	}
	System.out.println("입력받은 숫자 [" + no + "] 는 " + result);
}
