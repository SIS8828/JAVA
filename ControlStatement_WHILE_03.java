
import java.util.Scanner;

public class ControlStatement_WHILE_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ������ ���� �����ϴ� ���α׷��� �ۼ��ϼ���.

		/*
		 * 1��° ������ �Է��ϼ���: 10 2��° ������ �Է��ϼ��� : 5 ��꿡 ����� ��ȣ�� �Է��ϼ��� : + ��� : 10 + 5 = 15
		 * ����Ͻðڽ��ϱ�(y/n)?: n > �ݺ� ���α׷� ����
		 */
		// ���α׷��� ���࿩�� ���� ������ ����
		// 'n'�� ���� ���ԵǸ� ���α׷� ����

		char isExit = 'y';

		while (isExit != 'n' && isExit != 'N') {
			// ���� ���� �� �Է�
			int n1, n2, result;
			char operator;
			System.out.print("1��°������ �Է��ϼ���.: ");
			n1 = sc.nextInt();
			System.out.print("2��°������ �Է��ϼ���.: ");
			n2 = sc.nextInt();
			System.out.print("��꿡 ����� ��ȣ�� �Է��ϼ���: ");
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
				System.out.printf("��� ��ȣ�� �߸� �Է� ����ϴ�.");


			System.out.print("����Ͻðڽ��ϱ�(y/n)?: ");
			isExit = sc.next().charAt(0);
		}
		System.out.println("���α׷� ����");

		/*
		 * int score1, score2 ; System.out.print("1��°������ �Է��ϼ���."); score1 =
		 * sc.nextInt(); System.out.print("2��°������ �Է��ϼ���."); score2 = sc.nextInt();
		 * String k; System.out.print("��꿡 ����� ��ȣ�� �Է��ϼ���: "); k = sc.next(); char kg =
		 * k.charAt(0);
		 * 
		 * System.out.printf("��� : %d '%c' %d = (%d+%c+%d) \n",score1,score2,kg);
		 * 
		 * String o; System.out.print("����Ͻðٽ��ϱ�?(y/n): "); o = sc.next();
		 */
	}

}
