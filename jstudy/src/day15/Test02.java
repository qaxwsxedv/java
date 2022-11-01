package day15;

public class Test02 {
/*
	다양한 갯수의 정수를 입력받아서
	그 합을 구해주는 함수 getSum() 을 제작하고
	실행하세요.
 */
	public Test02() {
		int result1 = getSum(1, 2);
		System.out.println("getSum(1, 2) : " + result1);
		int result2 = getSum(10, 20, 30, 40, 50);
		System.out.println("getSum(10, 20, 30, 40, 50) : " + result2);
		
		int[] arr1 = {1, 2, 3};
		System.out.println("getSum(new int[]{1, 2, 3}) : " + getSum(arr1)); // ==> int[] 길이에 상관없이 호출할 수 있다.
	}
	
	// 다양한 갯수의 입력된 정수들의 합을 구해주는 함수
	public int getSum(int ... no) { // 이 함수의 매개변수의 경우 Heap Type이 int[]
		// 반환값 변수
		int result = 0;
		
		/*
			가변 인수 변수는
			자동적으로 배열 변수가 되므로
			배열처럼 데이터를 다뤄야 한다.
		 */
		
		// 데이터가 몇개가 입력되었는지는 
		// 입력된 데이터의 갯수만큼 배열을 만들것이므로
		for(int i = 0 ; i < no.length ; i++ ) {
			result += no[i];
		}
		
		// 반환값 반환하고
		return result;
	}
	
	public static void main(String[] args) {
		new Test02();
	}

}