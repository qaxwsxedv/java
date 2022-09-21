package oday01;

public class Ex07_01 {
/*
 	문제 7-1 ]
 	
 *****
 ****
 ***
 **
 *
 	
 	문제 7-2 ]
 	
     *
    **
   ***
  ****
 *****
 	
 	문제 7-3 ]
 	
     *
    ***
   *****
  *******
 *********

 */
	public static void main(String[] args) {
		int num = "*";
		for(int j = 5 ; j >=0 ; j--) {
			for(int i = 0 ; i < 5 ; i++) {
				System.out.print(num +" ");
			}
			System.out.println();
			num++;
		}
	}

}
