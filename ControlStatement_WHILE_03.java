
import java.util.Scanner;

public class ControlStatement_WHILE_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 다음과 같이 동작하는 프로그램을 작성하세요.

		/*
		 * 1번째 점수를 입력하세요: 10 2번째 점수를 입력하세요 : 5 계산에 사용할 부호를 입력하세요 : + 결과 : 10 + 5 = 15
		 * 계속하시겠습니까(y/n)?: n > 반복 프로그램 종료
		 */
		// 프로그램의 진행여부 값을 가지는 변수
		// 'n'의 값이 대입되면 프로그램 종료

		char isExit = 'y';

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
			
			if( operator != '?')
				System.out.printf("%d %c %d = %d\n", n1, operator, n2, result);
			else
				System.out.printf("계산 부호를 잘못 입력 됬습니다.");


			System.out.print("계속하시겠습니까(y/n)?: ");
			isExit = sc.next().charAt(0);
		}
		System.out.println("프로그램 종료");

		/*
		 * int score1, score2 ; System.out.print("1번째정수를 입력하세요."); score1 =
		 * sc.nextInt(); System.out.print("2번째정수를 입력하세요."); score2 = sc.nextInt();
		 * String k; System.out.print("계산에 사용할 부호를 입력하세요: "); k = sc.next(); char kg =
		 * k.charAt(0);
		 * 
		 * System.out.printf("결과 : %d '%c' %d = (%d+%c+%d) \n",score1,score2,kg);
		 * 
		 * String o; System.out.print("계속하시겟습니까?(y/n): "); o = sc.next();
		 */
	}

}
