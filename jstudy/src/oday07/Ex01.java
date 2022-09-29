package oday07;

public class Ex01 {
/*
	79456원을 샌드위치값으로 지불하려고 한다.
	이 금액은 우리나라 화폐가 각각 몇개로 지불해야하는지 계산해서 출력하세요.
 */
	public static void main(String[] args) {
		int pay = 79546;
		int[] won = {
			50000, 10000, 5000, 1000, 500, 100, 50, 10, 1	
		};
		
		int[] money = new int[9];
		
		int tmp = pay;
		
		for(int i = 0 ; i < won.length ; i++) {
			money[i] = tmp / won[i];
			tmp %= won[i];
		}
		
	}

}
