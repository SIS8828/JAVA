
public class ControlStatement_FOR_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ø�� �ݺ����� Ȱ���� ������ ��¿���
		// �ܺ��� �ݺ����� �ܼ��� ���� (2~9)
		// ������ �ݺ����� �������� ���� ���� (1~9)

		for (int i = 2; i < 10; i++) {
			
			// ��ø�� �ݺ����� ���� ���� �������� �ܼ��� ���
			System.out.printf("<%d>���� ����մϴ�.\n", i);
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i * j);
			}
			
			//��ø�� �ݺ����� ���� �Ŀ� ����
			System.out.println();
		}

	}

}
