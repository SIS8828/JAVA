
import java.util.Scanner;

public class ControlStatement_DO_WHILE_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for, while �ݺ����� ���ǽ��� �������� �ݺ����θ� ����
		// for, while �ݺ����� ���ǽ��� ����� ���� �ѹ��� ������ �ȵɼ� ����.

		// do ~ while �ݺ����� �ѹ��� ������ �����ϴ� �ݺ���

		/*
		 * do { ���๮; } while(���ǽ�);
		 */
		Scanner sc = new Scanner(System.in);
		char isExit = 'y';
		do {

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

				if (operator != '?')
					System.out.printf("%d %c %d = %d\n", n1, operator, n2, result);
				else
					System.out.printf("��� ��ȣ�� �߸� �Է� ����ϴ�.");
			
				System.out.print("����Ͻðڽ��ϱ�(y/n)?: ");
				isExit = sc.next().charAt(0);
			}
			
		} while (isExit == 'y');
		System.out.println("���α׷� ����");
	}
}
