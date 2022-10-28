package day13;

public class Ex04 {
/*
	nums 배열에 정수 10개를 기억시키고
	합을 구하고
	평균을 구해서
	출력해주는 프로그램을 제작하세요.
	
	단,
		배열 셋팅
		합 계산
		평균 계산
		출력 기능
	은 함수로 구현하세요.
	배열 셋팅 함수는 반환값을가지는 함수로 구형하세요.
 */
	int[] nums;
	public Ex04() {
		int[] nums = getNo();
		int xx = getHap(nums);
		int zz = getAvg(nums);
		toPrint(nums, xx, zz);
	}

	public static void main(String[] args) {
		new Ex04();

	}
	public int[] getNo() {
		int[] num = new int[10];
		for(int i = 0 ; i < 10 ; i++) {
		num[0] = (int)(Math.random()*(99 - 10 + 1) + 10);
		}
		return num;
	}
	public int getHap(int[] no) {
		int result = 0;
		result = no[0] + no[1] + no[2] + no[3] + no[4] + no[5] + no[6] + no[7] + no[8] + no[9];
		result result;
	}
	public int getAvg(int[] no) {
		int result = 0;
		result = (no[0] + no[1] + no[2] + no[3] + no[4] + no[5] + no[6] + no[7] + no[8] + no[9])/10;
		result result;
	}
	public void toPrint(int[] s, int x, int z) {
		System.out.print(s[0], x, z);
	}

}
