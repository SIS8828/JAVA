import java.util.Scanner;

public class ControlStatement_IF_08 {

	public static void main(String[] args) {

		// ����� ��ø�� Ȱ��
		// ��� ������� ��ø�Ǽ� ����� �� �ִ�.
		// ��� ���ο� �ٸ� ����� ��ġ�� �� ����.

		// �α��� ���α׷�
		// ID�� �н������ ��� ����
		// �Էµ� ID�� 3�� ����̰� �н����尡 5�� ����ΰ�� �α��� ����
		// �ƴ϶�� �α��ν���

		Scanner sc = new Scanner(System.in);

		// �Է�
		int id;
		int password;
		System.out.print("ID�� �Է����ּ���.: ");
		id = sc.nextInt();
		System.out.print("��й�ȣ�� �Է����ּ���.: ");
		password = sc.nextInt();

		// ó��

		// id ����
		boolean flag_1 = id % 3 == 0;
		// �н����� ����
		boolean flag_2 = password % 5 == 0;

		String loginResult;
		if (flag_1) {
			// id������ �Ǵ� ��
			if (flag_2) {
				// �н����� ������ ��
				loginResult = "login ����";
			} else {
				// password ������ ����
				// ID�� ������ ������ ����
				loginResult = "�н����带 Ȯ���ϼ���";
			}
		} else {
			// id ������ ����
			loginResult = "ID�� Ȯ���ϼ���.";
		}
		System.out.println(loginResult);
	}
}