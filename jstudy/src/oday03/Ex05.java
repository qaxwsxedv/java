package oday03;

import javax.swing.JOptionPane;

/*
	문제 5 ]
		두 사람이 등산을 하는데
		한사람은 이제 등산을 시작하려고 하고
		다른 사람은 정상에서 하산을 시작하려고 한다.
		올라가는 속도는 0.54 m/s 이고
		내려가는 속도는 1.07 m/s 이다.
		
		두 사람이 만나는 시점은 몇분 몇초 뒤인지 출력하는 프로그램을 작성하세요.
		
		산의 높이는 7564m 이다.
		
 */
public class Ex05 {

	public static void main(String[] args) {
		int mt = 7564;
		
		int sec = 0;
		for(;;sec++) {
			if(0.54 * sec >= (mt - 1.07 * sec)) {
				break;
			}
		}
		
		int hour = sec / 60 /60;
		sec = sec % (60 * 60);
		int min = sec / 60;
		sec = sec % 60;
		
//		System.out.println("두사람이 만나는 시간은 " + hour + " 시간  " + min + " 분  " + sec + " 초 후에 만난다.");
		JOptionPane.showMessageDialog(null, "두사람이 만나는 시간은 \n" + hour + " 시간  " + min + " 분  " + sec + " 초 \n후에 만난다.");
		
		// 창으로 입력받아서 창으로 출력하기...
		String sno = JOptionPane.showInputDialog("정수를 입력하세요!");
		
		JOptionPane.showMessageDialog(null, "입력된 숫자 : " + Integer.parseInt(sno));
		
	}

}