package day12;

public class Ex01_01 {
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
	public Ex01_01() {
		int arr[][] = new int[5][5];
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				int no = 2 * i + j + 1;
				arr[i][j] = no;
			}
		}
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				int no = arr[i][j];
				System.out.print(no + ", ");
			}
			System.out.println();
			
		}
		int num[][] = new int[5][5];
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				int no = 3 * i + 2 * j + 1;
				num[i][j] = no;
			}
		}
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				int no = num[i][j];
				System.out.print(no + ", ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Ex01_01();

	}

}
