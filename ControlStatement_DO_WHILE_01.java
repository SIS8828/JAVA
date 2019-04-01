
import java.util.Scanner;

public class ControlStatement_DO_WHILE_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for, while 반복문은 조건식을 기준으로 반복여부를 결점
		// for, while 반복문은 조건식의 결과에 따라 한번도 실행이 안될수 있음.

		// do ~ while 반복문은 한번의 실행을 보장하는 반복문

		/*
		 * do { 실행문; } while(조건식);
		 */
		Scanner sc = new Scanner(System.in);
		char isExit = 'y';
		do {

			while (isExit != 'n' && isExit != 'N') {
				// 변수 선언 및 입력
				int n1, n2, result;
				char operator;
				System.out.print("1번째정수를 입력하세요.: ");
				n1 = sc.nextInt();
				System.out.print("2번째정수를 입력하세요.: ");
				n2 = sc.nextInt();
				System.out.print("계산에 사용할 부호를 입력하세요: ");
				operator = sc.next().charAt(0);

				switch (operator) {
				case '+':
					result = n1 + n2;
					break;
				case '-':
					result = n1 - n2;
					break;
				case '*':
					result = n1 * n2;
					break;
				case '/':
					result = n1 / n2;
					break;
				case '%':
					result = n1 % n2;
					break;
				default:
					result = 0;
					operator = '?';
				}

				if (operator != '?')
					System.out.printf("%d %c %d = %d\n", n1, operator, n2, result);
				else
					System.out.printf("계산 부호를 잘못 입력 됬습니다.");
			
				System.out.print("계속하시겠습니까(y/n)?: ");
				isExit = sc.next().charAt(0);
			}
			
		} while (isExit == 'y');
		System.out.println("프로그램 종료");
	}
}
