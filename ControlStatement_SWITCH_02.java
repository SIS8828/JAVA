
import java.util.Scanner;

public class ControlStatement_SWITCH_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����ڿ��� 1~10 ������ ������ �Է¹�������
		// �Էµ� �������� 10 ������ ������ ��� ����ϼ���.
		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("1~10 ������ ������ �Է� : ");
		num = sc.nextInt();
		// switch���� ���۹��
		// �Էµ� ������ ���� �� case�� ��ȸ�ϸ� �˻��մϴ�.
		// �Էµ� ������ ��Ī�Ǵ� case ���� �����Ͽ�
		// break Ű���带 �����ų�, switch���� ����Ǹ�
		// ������ ������
		// break�� ���� ������ ���������� ����� �����մϴ�. 
		// (ù��° ������ ���������ϴ�.)
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
			System.out.println("1~10 ������ ������ �Է��� �� �ֽ��ϴ�.");

		}
	}

}
