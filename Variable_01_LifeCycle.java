
public class Variable_01_LifeCycle {

	public static void main(String[] args) {
		// ������ ����
		// 1. ��������
		// - Ŭ������ ��� ����
		// 2. ��������
		// - �޼ҵ� ���ο� ����� ��� ����
		// - ���������� ����� �޼ҵ尡 ����Ǵ� ������
		//	 �޸� �ε�
		// - ���������� ����� �޼ҵ尡 ������ ������ ��
		// 	 �޸𸮿��� �Ҹ�
		// 3. �������� - �޼ҵ� ������ Ư�� ���� �ȿ��� ����� ����
		// - �޼ҵ� ������ Ư�� ���� �ȿ��� ����� ����
		// - ������ ����� Ư�� ������ ����� �� �޸𸮿� �ε�
		// - ������ ����� Ư�� ������ ����ɶ� �޸𸮿��� �Ҹ�
		
		
		// ���������� ����
		// - ����� ���Ŀ��� �ش� �޼ҵ� �����������
		// ��𿡼��� ������ �� �ֽ��ϴ�. 
		
		int localVariable = 10;
		
		System.out.printf("localVariable -> %d\n", localVariable);
		
		for( int innerLocalVariable = 1 ; innerLocalVariable < 3 ; innerLocalVariable++ )
			System.out.printf("localVariable -> %d\n", innerLocalVariable);
		
		// for ���� �����ϸ鼭 ����� ������ ������ ��
		
		//System.out.printf("localVariable -> %d\n", innerLocalVariable);
		
		// �����㤤�� 2�� ���� ���ǻ���
		while(true) {
			int innerLocalVariable = 1;
			// Ư�� ���� ���ο� ����� ������ �ش� ������ ����� ��
			// ������ �����˴ϴ�.
			// �Ʒ��� ������ �ݺ����� ����� �� ���� ���Ӱ� ����
			System.out.printf("localVariable -> %d\n", innerLocalVariable);
			if (innerLocalVariable == 3)
				break ;
			
			innerLocalVariable++;
		}
		
		// �ӽ��� ������ �����Ͽ� �������� 2�� ����ϴ� ���
		// �Ʒ��� innerLocalVariable�� �ش� ������ ����Ǹ�
		// �޸𸮿��� �Ҹ�˴ϴ�. 
		{
			int innerLocalVariable = 1;
			System.out.printf("localVariable -> %d\n", innerLocalVariable);
			
		}
		// System.out.printf("localVariable -> %d\n", innerLocalVariable);
		
	}

}
