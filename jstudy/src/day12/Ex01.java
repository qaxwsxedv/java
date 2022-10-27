package day12;

public class Ex01 {

/*
 1.
 
1	2	3	4	5
3	4	5	6	7
5	6	7	8	9
7	8	9	10	11
9	10	11	12	13
 
2.

1	3	5	7	9
4	6	8	10	12
7	9	11	13	15
10	12	14	16	18
13	15	17	19	21





 */
	public Ex01() {
		int[][] no1 = new int[5][5];
		for(int i = 0 ; i < no1.length ; i++) {
			for(int j = 0 ; j < no1[i].length ; j++) {
				// i	: 1 --> 3 ===> i * 2 + 1
				// j	: 1 --> 2 ===> j + 1
				// ==> 2 * i + j + 1
				no1[i][j] = 2 * i + j + 1;
			}
		}
		System.out.println("1.");
		for(int[] n : no1) {
			for(int num : n) {
				System.out.printf("%3d", num);
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] no2 = new int[5][5];
		for(int i = 0 ; i < no2.length ; i++) {
			for(int j = 0 ; j < no2[i].length ; j++) {
				no2[i][j] = 3 * i + 2 * j + 1;
			}
		}
		System.out.println("2.");
		for(int[] n : no2) {
			for(int num : n) {
				System.out.printf("%3d", num);
			}
			System.out.println();
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		new Ex01();

	}

}