package sub;

public class SemiProj implements PrintInter {
	private String name;
	public SemiProj() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void toPrint() {
		System.out.println(name + " 개인 프로젝트 열심하겠습니다.");
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
}
