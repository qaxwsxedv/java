package oday07;

public class Ex01 {
/*
	79456원을 샌드위치값으로 지불하려고 한다.
	이 금액은 우리나라 화폐가 각각 몇개로 지불해야하는지 계산해서 출력하세요.
 */
	public static void main(String[] args) {
		int pay = 79546;
		// 첫번째 방법 : 연산자로만 해결하는 방법
		
		// 각 화폐의 장 수를 기억할 변수
		int oman = 0;
		int man = 0;
		int ochun = 0;
		int chun = 0;
		int obaek = 0;
		int baek = 0;
		int osip = 0;
		int sip = 0;
		int il = 0;
		
		// 임시변수를 만든다. 왜?? 원 데이터는 기억해두는 것이 좋기 때문에...
		int tmp = pay;
		
		oman = tmp / 50000; //만원 지불 완료	1
		tmp = tmp % 50000; // 금액을 5만으로 나눈 나머지로 대체		29546
		
		man = tmp / 10000; // 만원권 지불 완료	2
		tmp = tmp % 10000; // 금액을 만원으로 나눈 나머지로 대체	9546
		
		ochun = tmp / 5000; // 오천원권 지불 완료	1
		tmp %= 5000; // 금액을 오천원으로 나눈 나머지로 대체	4546
		
		chun = tmp / 1000; // 천원권 지불 완료		4
		tmp %= 1000; // 금액을 천원으로 나눈 나머지로 대체		546
		
		obaek = tmp / 500; // 오백원권 지불 완료	1
		tmp %= 500; // 금액을 오백원으로 나눈 나머지로 대체		46
		
		baek = tmp / 100; // 백원권 지불 완료	0
		tmp %= 100; // 금액을 백원으로 나눈 나머지로 대체		46
		
		osip = tmp / 50; // 오십원권 지불 완료	0
		tmp %= 50; // 금액을 오십원으로 나눈 나머지로 대체		46
		
		sip = tmp / 10; // 십원권 지불 완료		4
		tmp %= 10; // 금액을 십원으로 나눈 나머지로 대체	6
		
		il = tmp / 1; // 일원권 지불 완료	6
		tmp %= 1; //금액을 십원으로 나눈 나머지로 대체	0		
		
		
		
		
		
		/*
		 * int pay = 79546; int[] won = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1
		 * };
		 * 
		 * int[] money = new int[9];
		 * 
		 * int tmp = pay;
		 * 
		 * for(int i = 0 ; i < won.length ; i++) { money[i] = tmp / won[i]; tmp %=
		 * won[i]; }
		 */
		
		System.out.println("50000원 : " + oman);
		System.out.println("10000원 : " + man);
		System.out.println("5000원 : " + ochun);
		System.out.println("1000원 : " + chun);
		System.out.println("500원 : " + obaek);
		System.out.println("100원 : " + baek);
		System.out.println("50원 : " + osip);
		System.out.println("10원 : " + sip);
		System.out.println("1원 : " + il);
		 
		
	}
}
