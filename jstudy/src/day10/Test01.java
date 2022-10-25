package day10;

import day08.*; // ==> day08 폴더내에 만들어져있는 클래스를 사용할 준비...

public class Test01 {
	
	// 생성자 ==>  생성자중 매개변수가 없는 형태의 생성자를 기본생성자라 한다.
	//				기본 생성자는 생성자를 하나라도 만들지 않으면 자바가상머신이 만들어 준다.
	public Test01() {
		/*
			랜덤하게 원, 세모, 네모를 만들어서
			내용을 출력해보자.
			단, 랜덤하게 만들어질 도형의 변수는 모든 도형을 입력할 수 있는 타입(Object)으로 한다.
		 */
		/*
		Object obj1 = new Won();
		Object obj2 = new Semo();
		Object obj3 = new Nemo();
		
		// 이렇게 작성한 클래스를 Object 타입 변수에 담게되면
		// 작성할 때 만들어둔 함수와 변수는 사용할 수 없게된다.
		// 왜??
		// 왜냐하면 Object 클래스에는 그 함수와 변수가 없기 때문이다.
		// 따라서 원래 작성한 함수와 변수를 사용하려면
		// 작성한 클래스 타입으로 강제 형변환 해줘야 사용할 수 있게된다.
		*/
		// 
//		Object obj = null;
		
		// 여러개의 도형을 기억해야 되므로
		// 배열이어야 하고 형태가 여러가지여야 하므로 타입은 Object 로 모아서 관리해야 한다.
		
		// ==> Object 데이터 10개를 관리할 배열을 만든다.
		Object[] arr = new Object[10]; // ==> 각 방에는 null 채워져 있다.
		
		// 반복해서 랜덤하게 도형 만들어서 각 방에 채워준다. 10번...
		
		for(int i = 0 ; i < 10 ; i++ ) {
			// 랜덤하게 0 ~ 2 까지의 숫자를 만든다. 0  : 원, 1 : 삼각형, 2 : 사각형
			int num = (int)(Math.random()*3);
			
			switch(num) {
			case 0:
				
				/*
				Won won = new Won();
				// 반지름 셋팅
				won.rad = (int)(Math.random()* 16 + 5);
				// 둘레셋팅
				won.setArround();
				// 면적셋팅
				won.setArea();
				arr[i] = won; // Object 타입으로 자동 형변환
				*/
				
				arr[i] = new Won();
				// 반지름 셋팅
				((Won)arr[i]).rad = (int)(Math.random()* 16 + 5);
				// 둘레셋팅
				((Won)arr[i]).setArround();
				// 면적
				((Won)arr[i]).setArea();
				
				
				/*
				won.toString();
				won.equals("Won");
				 */
				break;
			case 1:
				Semo semo = new Semo();	// 세모만들고..
				semo.width = (int)(Math.random()*16 + 5); // 밑변
				semo.height = (int)(Math.random()*16 + 5); // 높이
				// 면적 셋팅
				semo.setArea();
				
				arr[i] = semo;
				break;
			case 2:
				Nemo nemo = new Nemo();	// 세모만들고..
				nemo.width = (int)(Math.random()*16 + 5); // 밑변
				nemo.height = (int)(Math.random()*16 + 5); // 높이
				// 면적 셋팅
				nemo.setArea();
				
				arr[i] = nemo;
				break;
			}
		}
		
		// 정렬하기
		for(int i = 0 ; i < arr.length - 1 ; i++ ) {
			// 원본 면적 꺼내기
			double area1 = 0;
			if(arr[i] instanceof Won) {
				area1 = ((Won)arr[i]).area;
			} else if(arr[i] instanceof Semo) {
				area1 = ((Semo)arr[i]).area;
			} else if(arr[i] instanceof Nemo) {
				area1 = ((Nemo)arr[i]).area;
			}
			
			for(int j = i + 1; j < arr.length ; j++ ) {
				// 비교본 면적 꺼내기
				double area2 = 0;
				if(arr[j] instanceof Won) {
					area2 = ((Won)arr[j]).area;
				} else if(arr[j] instanceof Semo) {
					area2 = ((Semo)arr[j]).area;
				} else if(arr[j] instanceof Nemo) {
					area2 = ((Nemo)arr[j]).area;
				}
				
				if(area1 > area2) {
					// ==> j번째 꺼낸 데이터가 면적이 더 작은 경우이므로 위치를 서로 바꿔준다.
					Object tmp = arr[i]; // 기억시켜놓고
					arr[i] = arr[j]; // i번째와 j번째가 같은 데이터를 기억하게 된다.
					arr[j] = tmp;
					area1 = area2;
				}
			}
		}
		
		// 출력
		// 출력역시 반복해서 하나씩 꺼내서 처리해준다.
		for(int i = 0 ; i < arr.length ; i++ ) {
			/*
				arr  배열에는 Object 타입으로 데이터를 채웠으니
				하나씩 꺼내면 Object 타입의 데이터가 된다.
				Object 타입의 데이터를 실제 heap 에 만든 인스턴스의 형태로 
				만들어 줘야 면적, 반지름 등을 사용할 수 있게 된다.
				왜???
				<== Object 에는 반지름이나 면적등이 없으므로...
			 */
			
			Object obj = arr[i];
			
			if(obj instanceof Won) { // ==> 변수 obj 가 가리키는 것이 Won의 인스턴스니???
				System.out.println("원의 면적 : " + ((Won) obj).area); // obj를 Won타입으로 강제형변환해서 면적 꺼내서 출력
			} else if(obj instanceof Semo) {
				// 세모타입인 경우
				System.out.println("삼각형의 면적 : " + ((Semo) obj).area); // obj를 Semo 타입으로 강제형변환해서 면적 꺼내서 출력
			} else if(obj instanceof Nemo) {
				// 네모타입인 경우
				System.out.println("사각형의 면적 : " + ((Nemo) obj).area); // obj를 Nemo 타입으로 강제형변환해서 면적 꺼내서 출력
			}
		}
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}