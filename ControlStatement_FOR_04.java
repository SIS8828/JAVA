
public class ControlStatement_FOR_04 {

	public static void main(String[] args) {
		// 1~100 ���� �������� �ղ�
		// 1 + 2 + 3 + .. + 100 = ?
		
		// �ݺ��� ���ο��� ó���� ����� �ݺ����� ���� ���Ŀ�
		// ����ϴ� ��� �ش� ������ �ݵ�� �ݺ����� �ܺο��� �����ؾߵȴ�.
		int sum = 0;
		for(int i = 1; i <= 100 ; i++)
			// 0 + ~ + 100
			sum += i ;
		System.out.printf("sum -> %d\n", sum);
		/*
		// for �ݺ����� �ʱ�ȭ ��������
		// �ټ����� ������ ������ �� �ֽ��ϴ�. 
		for(int i = 1, sum = 0; i <= 100 ; i++)
			// 0 + ~ + 100s
			sum += i ;
		// ���� ���� ������ �����ϰ� �ִ� ������ �ݺ������� 
		// ����� ��� �ݺ����� �ܺο��� ����� �� ����.
		System.out.printf("sum -> %d\n", sum);
		*/
		
	}

}