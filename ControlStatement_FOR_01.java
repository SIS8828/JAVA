// ����� ���յȻ��
// �ݺ��� ������ �б⹮
// ����� ���� �ٸ� ��� ���ο� ���ԵǾ� �ۼ��� �� �ֽ��ϴ�.
public class ControlStatement_FOR_01 {

	public static void main(String[] args) {
		
		// 1~ 10������ ������ ¦���� ����ϼ���
		for (int i = 1 ; i <= 10 ; i++)
			if( i % 2 == 0)
				System.out.printf("i = %d\n", i);

		// for ���� Ư¡�� Ȱ���� ¦�� ��¹��
		// �����Ŀ��� ���Կ����ڸ�����Ͽ� ���� ������ �� �ֽ��ϴ�.
		for (int j = 2 ; j <= 10 ; j += 2)
			System.out.printf("j = %d\n", j);
		
	}

}
