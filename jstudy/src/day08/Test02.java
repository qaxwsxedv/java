package day08;

public class Test02 {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5};
		// 꺼내서 10을 곱해서 출력
		for(int no : nums ) {
			// nums 배열에 담긴데이터 하나꺼내서 no에 기억시켜서 블럭을 실행한다. 매번... 데이서갯수만큼 반복해서...
			System.out.println(no * 10);
			System.out.println("*****************************");
		}
		
		int[][] num2 = {
				{1, 2, 3, 4, 5},
				{5, 6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15}
		};
		
		for(int[] n : num2) {
			for(int n2 : n) {
				System.out.print(n2 + ", ");
			}
			System.out.println();
		}
		
		
		
	}

}
