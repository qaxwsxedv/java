package oday01;

public class Ex07 {
/*
 	문제 7 ]
 		*
 		**
 		***
 		****
 		*****

 */
	
	public static void main(String[] args) {
		for(int i = 1; i < 6 ; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
