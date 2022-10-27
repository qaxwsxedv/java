package day12;

public class Ex00 {
/*

1.
 int[][] arr; 배열을 만들고
 반복문을 이용해서 아래 처럼 숫자를 채워넣고
 꺼내서 출력하세요.
 

	1	2	3	4	5
	6	7	8	9	10
	11	12	13	14	15
	16	17	18	19	20
	21	22	23	24	25
	
	
	
	2.
	
	int[][] nums; 를 만들고
	1번에서 완성한 arr 배열에서 데이터를 꺼내서
	nums에 채워서 출력하세요.
	
	1	6	11	16	21
	2	7	12	17	22
	3	8	13	18	23
	4	9	14	19	24
	5	10	15	20	25
	
	
	3. 2 이상의 숫자중에서 소수를 10개 찾아서 배열에 담고 출력하세요.
	
	
 */
	public Ex00() {
		int[][] arr = new int[5][5];
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				arr[i][j] = 5 * i + j + 1;
			}
		}
		System.out.println("1.");
		for(int[] n : arr) {
			for(int num : n) {
				System.out.printf("%3d", num);
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] nums = new int[5][5];
		for(int i = 0 ; i < nums.length ; i++) {
			for(int j = 0 ; j < nums[i].length ; j++) {
				nums[i][j] = i + 5 * j + 1;
			}
		}
		System.out.println("2.");
		for(int[] n : nums) {
			for(int num : n) {
				System.out.printf("%3d", num);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Ex00();

	}

}
