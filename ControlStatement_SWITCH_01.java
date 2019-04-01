//switch 문
// 정수/정수를 리던하는 식을 사용해 분기하는 문법

/* switch ( 정수 / 정수식 ) {
  // 상수: 소스코드가 컴파일된 경우 변경하지 않는 값
    case 상수값1 :
    실행문1;
    break;
   ...
   default:
   	실행문3;
   }
 */

import java.util.Scanner;

public class ControlStatement_SWITCH_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int menu = 1;

		System.out.print("메뉴 번호를 입력하세요 (1~3) : ");
		menu = sc.nextInt();

		String output;
		// 입력된 menu번호를 비교하여
		// 분리처리할 수 있는 스위치문 작성
		switch (menu) {
		// switch로 전달된 menu변수가 가질수 있는
		// 값의 경우를 case로 작성
		case 1:
			output = "돈까스를 선택했습니다.";
			break;
		case 2:
			output = "도시락를 선택했습니다.";
			break;
		case 3:
			output = "제육볶음를 선택했습니다.";
			break;
		case 4:

		default:
			output = "메뉴번호를 잘못 선택했습니다.";
		}
		System.out.println(output);

	}

}
