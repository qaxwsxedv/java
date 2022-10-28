package day13;

public class Test06 {
/*
 	정수 10개를 기억할 배열을 만들고
 	배열에 랜덤하게 숫자를 세팅하고
 	정령해서
 	출력해주는 프로그램을 작성하세요.
 	모두 함수처리하세요.
 */
	public Test06() {
		int[] arr = getArr(); // 정렬되지 않은 배열을 반환해주면 그것을 변수에서 기억한다.
		
		// 만들어진 배열을 정렬한다.
		desc(arr); // 내림차순 정령
		
		// 출력
		toPrint(arr);
		System.out.println();
		// 오름차순 정렬
		asc(arr);
		toPrint(arr);
	}

	public static void main(String[] args) {
		new Test06();

	}
	
	// 정수 10개 배열로 만들어주는 함수
	public int[] getArr() {
		// 반환값 변수
		int[] nums = new int[10];
		// 데이터 채우고
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random()*90 + 10);
		}
		// 반환해주고
		return nums;
	}
	
	// 내림차순 정렬함수
	public void desc(int[] nums) {
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i + 1 ; j < nums.length ; j++) {
				if(nums[i] < nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}
	}
	// 오름차순 정렬함수
	public void asc(int[] nums) {
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i + 1 ; j < nums.length ; j++) {
				if(nums[i] > nums[j]) {
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}
	}
	
	// 출력함수
	public void toPrint(int[] nums) {
		System.out.print("|");
		for(int i = 0; i < nums.length ; i++) {
			System.out.printf("%3d |", nums[i]);
		}
		System.out.println();
	}

}
