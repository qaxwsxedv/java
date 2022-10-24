package day09;

public class Test02 {
	
	public Test02() {
		
		Nemo[] sagak = new Nemo[3];
		// new Nemo[3] :  ==> Heap타입 데이터를기억할 메모리 공강 3개 만들어주세요.
		
		Nemo nemo = new Nemo();
		nemo.width = 10;
		
		sagak[0] = nemo;
		sagak[1] = nemo;
		sagak[2] = nemo;
		
		nemo.width = 100;
		
		System.out.println(sagak[0].width);
		System.out.println(sagak[2].width);
		
//		System.out.println(nemo.toString());
		System.out.println(nemo);
	}
	
	public static void main(String[] args) {
		new Test02();
	}

}
