import java.util.Scanner;

public class dustmq1 {

	public static void main(String[] args) {
		// ����ڿ��� ���� �Ѱ��� �Է¹޽��ϴ�.
		// ������ 1000�̻��� ���� �Է¹޾ƾ߸� �մϴ�.
		// ���� 1000�̸��� ���� �Է��ϴ� ��� �ٽ� �Է¹޽��ϴ�.

		// 1000�̻��� ���� �ùٸ��� �Էµ� ���
		// 1~ �ԷµȰ������� �հ踦 ����մϴ�.
		// 1���� �Էµ� ������ �հ踦 ����ϸ鼭
		// �հ��� ���� 175�� ����� 3��° �Ǻ��� ��� ���α׷��� �����ϰ�
		// ��������� �հ踦 ����ϼ���

		Scanner sc = new Scanner(System.in);

		int x;
		for (;;) {
			System.out.println("������ �Է����ּ���(1000�̻�) : ");
			if ((x = sc.nextInt()) >= 1000)
				break;
		}
		int total = 0;
		int count = 0;
		for (int i = 1; i < x; i++) {
			total += i;
			if (total % 175 == 0)
				count++;
			if (count == 3)
				break;
		}
		System.out.printf("total = %d\n", total);
		System.out.println("���α׷�����");

	}

}
