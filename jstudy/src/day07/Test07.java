package day07;

public class Test07 {

	public static void main(String[] args) {
		//Myinfo jennie = new MyInfo();
		
		Myinfo jennie = new Myinfo();
		jennie.name = "jennie";
		jennie.height = 165.5;
		jennie.gen = 'F';
		
		System.out.println("name : " + jennie.name);
		System.out.println("height : " + jennie.height);
		System.out.println("gen : " + jennie.gen);
		
		Myinfo euns = new Myinfo();
		euns.name = "전은석";
		System.out.println("name : " + euns.name);
	}

}
