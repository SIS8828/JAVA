
import java.util.Scanner;

public class ControlStatement_SWITCH_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자에게 1~10 사이의 정수를 입력받으세요
		// 입력된 정수부터 10 사이의 정수를 모두 출력하세요.
		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("1~10 사이의 정수를 입력 : ");
		num = sc.nextInt();
		// switch문의 동작방식
		// 입력된 정수의 값을 각 case를 순회하며 검색합니다.
		// 입력된 정수와 매칭되는 case 부터 시작하여
		// break 키워드를 만나거나, switch문이 종료되면
		// 실행을 마무리
		// break는 현재 영역을 빠져나가는 기능을 제공합니다. 
		// (첫번째 영역을 빠져나갑니다.)
		switch (num) {
		case 1:
			System.out.printf("%d", 1);
		case 2:
			System.out.printf("%d", 2);
		case 3:
			System.out.printf("%d", 3);
		case 4:
			System.out.printf("%d", 4);
		case 5:
			System.out.printf("%d", 5);
		case 6:
			System.out.printf("%d", 6);
		case 7:
			System.out.printf("%d", 7);
		case 8:
			System.out.printf("%d", 8);
		case 9:
			System.out.printf("%d", 9);
		case 10:
			System.out.printf("%d", 10);
			break;
		default :
			System.out.println("1~10 사이의 정수만 입력할 수 있습니다.");

		}
	}

}
