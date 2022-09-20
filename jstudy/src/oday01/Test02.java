package oday01;

public class Test02 {

	public static void main(String[] args) {
		/*
		  	10 ~ 99 사이의 랜덤한 숫자 다섯개를 발생시켜서
		  	각 숫자가 홀수인지 짝수인지를 판별해서 출력하세요.
		*/
		
		// 1. 랜덤함 숫자를 만든다.
		
		// 2. 홀수인지 짝수인지 판별한다.
		
		// 4. 결과 출력한다.
		
		// 4. 다섯번 반복한다.
		for(int i = 0; i < 5; i++) {
			int no = (int)(Math.random() * (99 - 10 + 1) + 1);
			
			System.out.println(no);
		}
	}

	void abc() {
		System.out.println("start!!!");
	}
	
	/*
	void getPerson() {
		Person p1 = new Person();
		p1.name = "jennie";
		p1.age = 27;
		
		Person na = new Person();
		na.name = "전은석";
		na.age = 29;
	}
	*/
}
