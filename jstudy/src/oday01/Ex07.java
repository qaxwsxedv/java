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
		for(int i = 1 ; i < 2 ; i++) {
			for(int j = 2 ; j < 3 ; j++) {
				for(int k = 3 ; k < 4 ; k++) {
					for(int t = 4 ; t < 5 ; t++) {
						
						System.out.println("*");
					}
					
					System.out.println("**");
				}
				
				System.out.println("***");
			}
			System.out.println("****");
		}
		System.out.println("*****");
	}

}
