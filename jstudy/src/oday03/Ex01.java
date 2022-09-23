package oday03;


/*
 	문제 1 ] 
 		5자리 숫자를 랜덤하게 발햇시켜서
 		각자리수의 합을 구해주는 프로그램을 작성하세요. 
 */
public class Ex01 {

	public static void main(String[] args) {
		var nums = [];
		for(i = 0 ; i < 5 ; i++) {
			var no = Math.floor(Math.random() * (9 - 1 + 1) + 1);
			nums[i] = no;
		}
	}

}
