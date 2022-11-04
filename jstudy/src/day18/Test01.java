package day18;

import java.util.*;

public class Test01 {

	public Test01() {
		// StringBuffer 객체 만들고
		StringBuffer buff = new StringBuffer("name=");
		// 데이터 덧붙이고
		buff.append("jennie");
		buff.append("&id=jennie");
		buff.append("&pw=12345");
		buff.append("&mail=jennie@githrd.com");
		// 문자열로 변환해서 출력하고...
		String param = buff.toString();
		System.out.println(param);
		
		// 데이터 분리 : StringTokenizer 로 처리
		//				분리 문자 : &
		StringTokenizer token = new StringTokenizer(param, "&");
//		StringTokenizer token = new StringTokenizer(param, "&", true);
		// 잘린갯수 
		int len = token.countTokens();
		// 배열만들고
		String[] arr = new String[len];
		
		String[][] params = new String[len][];
//		String[][] params = new String[len][2];
		int i = 0 ;
		while(token.hasMoreElements()) {
			/*
			Object o = token.nextElement();
			arr[i++] = (String) o;
			*/
			arr[i] = token.nextToken();
			
			StringTokenizer tk = new StringTokenizer(arr[i], "=");
			int l = tk.countTokens();
			String[] p = new String[l];
			for(int j = 0 ; j < l ; j++ ) {
				p[j] = tk.nextToken();
//				params[i][j] = tk.nextToken();
			}
//			i++;
			params[i++] = p;
		}
		
		// 출력
//		System.out.println(Arrays.toString(arr));
		
		// 배열 안의 결과를 다시 길이가 2인 배열로 만드세요. 
		// 구분 문자는 = 를 기준으로 자르세요.
		
		for(String[] s : params) {
			System.out.println(Arrays.toString(s));
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}