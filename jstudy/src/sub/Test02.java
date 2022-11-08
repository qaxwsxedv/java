package sub;

import java.util.*;

public class Test02 {

	public Test02() {
		ArrayList<PrintInter> list = new ArrayList<PrintInter>();
		list.add(new BlackPink());
		list.add(new SemiProj());
		list.add(new SemiProj());
		list.add(new BlackPink());
		list.add(new BlackPink());
		
		for(int i = 0 ; i < list.size() ; i++ ) {
			list.get(i).toPrint();
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
