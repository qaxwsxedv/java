package day10;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
//		int[] arr1 = new int[] {1, 2, 3, 4, 5};
		
		int[] tmp = arr1;
		
		tmp[0] = 3;
		
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("tmp : " + Arrays.toString(tmp));

	}

}
