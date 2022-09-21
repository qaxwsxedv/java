package oday02;

public class Test05 {

	public static void main(String[] args) {
		char[] student = new char[10];
		
		for(int i = 0 ; i < 10 ; i++ ) {
			student[i] = (char)('A' = i);
		}
		
		int[] java = new int[10];
		int[] db = new int[10];
		
		for(int i = 0 ; i < java.length ; i++) {
			java[i] = (int)(Math.random()*41 + 60);
		}
		for(int i = 0 ; i < java.length ; i++) {
			db[i] = (int)(Math.random()*41 + 60);
		}
		for(int i = 0 ; i < java.length ; i++) {
			java[i] = (int)(Math.random()*41 + 60);
		}
	}

}
