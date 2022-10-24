package day09;

public class Test03 {
	public Test03() {
//		int[] no1 = new float[3];
//		float[] no2 = new int[3];
		// Heap type 이 다르기때문에 안된다.
		
		int[] no3 = new int[10]; // Heap 타입이 같기 때문에 문제 없다.
		// ==> no3에 채워진 데이터는 자동 초기화가 되서 0 으로 채워진다.
		for(int no : no3) {
			System.out.print(no + ", ");
		}
		System.out.println();
		
		Nemo[] nemo = new Nemo[5];
		for(Nemo n : nemo) {
			System.out.print(n + ", ");
		}
		
		
		
		
	}
	public static void main(String[] args) {
		new Test03();
	}

}
