package day15;

public class Test03 {

	public Test03() {
		abc("dooly", 1, 2, 3, 4);
	}
	
	public void printSum(int...no) {
		System.out.println("printSum() : " + (no[0] + no[1] + no[2]));
	}
	
	public void abc(String name, int no1, int no2, int no3) {
		System.out.println(name + " : " + no1 + ", " + no2 + ", " + no3);
	}
	
	public void abc(String name, int...score) {
		System.out.println("가변인수");
		abc(name, score[0], score[1], score[2]);
//		System.out.println(name + " : " + score[0] + ", " + score[1] + ", " + score[2]);
	}
	
	public static void main(String[] args) {
		new Test03();
	}

}