package day18;


import java.util.*;
public class Test44_01 {

	public Test44_01() {
		ArrayList list = new ArrayList();
		for(int i = 0 ; i < 3 ; i++) {
			list.add(new ArrayList());
		}
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				((ArrayList)list.get(i)).add(10*i+j+1);
			}
		}
		for(int i = 0 ; i < list.size(); i++) {
			Object o = list.get(i);
			ArrayList l = (ArrayList) o;
			for(int j = 0 ; j < l.size(); j++) {
				Object obj = l.get(j);
				int no = (int)obj;
				System.out.print(no + ", ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Test44_01();

	}

}
