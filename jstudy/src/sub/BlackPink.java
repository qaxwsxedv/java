package sub;

public class BlackPink implements PrintInter {
	private String name;
	public BlackPink() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void toPrint() {
		System.out.println(name + " ] 제니가 있는 그룹");
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	
}
