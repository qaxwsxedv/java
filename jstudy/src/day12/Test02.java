package day12;

public class Test02 {

	public Test02() {
		String[] blackpink = new String[4];
		
		blackpink[0] = "jennie";
		blackpink[1] = "lisa";
		blackpink[2] = "rose";
		blackpink[3] = "jisoo";
		
		System.out.println(blackpink[0]);
		
//		float[] num = new int[5]; // ==> Heap 타입이 다르기 때문에 절대로 안된다.
	}

	public static void main(String[] args) {
		new Test02();

	}

}
