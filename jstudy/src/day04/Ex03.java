package day04;

public class Ex03 {
/*
	54232원을 지불해야 한다.
	우리나라 화폐단위로 각각 몇개씩 필요한지 계산해서 출력하세요.
		화폐단위 ]
			50000, 10000, 5000, 1000, 500, 100, 50, 10, 1
 */
	public static void main(String[] args) {
		int pay = 54232;
		
		int oman = 0;
		int man = 0;
		int ochun = 0;
		int chun = 0;
		int obaek = 0;
		int baek = 0;
		int osip = 0;
		int sip = 0;
		int il = 0;
		
		int tmp = pay;
		
		oman = tmp / 50000;
		tmp = tmp % 50000;
		
		man = tmp / 10000;
		tmp = tmp % 10000;
		
		ochun = tmp / 5000;
		tmp %= 5000;
		
		chun = tmp / 1000;
		tmp %= 1000;
		
		obaek = tmp / 500;
		tmp %= 500;
		
		baek = tmp / 100;
		tmp %= 100;
		
		osip = tmp / 50;
		tmp %= 50;
		
		sip = tmp / 10;
		tmp %= 10;
		
		il = tmp / 1;
		tmp %= 1;
		
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