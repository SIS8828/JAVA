package day_02;

public class Variable_06 {

	public static void main(String[] args) {
		// 3������ ������ �ֽ��ϴ�. (97, 79, 85)
		// �������� ������ ������ ��������,
		// ������ ����� ����Ͽ� ����ϼ���.
		
		//int n1 = 97, n2 = 79, n3 = 85;
		
		
		//System.out.printf("������ %d�̰�, ����� %d",n1 + n2 + n3,(n1 + n2 + n3)/3 );

		// 1. �Է� : Ű���� �Է�, ���� �Է�, ��Ʈ��ũ �Է�, �����ͺ��̽� �Է�
		// - ������ ���� ������ ����
		int n1 = 97;
		int n2 = 80;
		int n3 = 85;
		
		// 2. ó�� : �Էµ� �����͸� ����Ͽ� ����۾�
		// - ó������� �����ϱ� ���� ���� ����
		
		int total = n1 + n2 + n3;
		// �Ǽ� Ÿ���� ��� ���� ����
		// �Ǽ�Ÿ���� ���� ��ȯ�ޱ� ���Ͽ� ������ ���ʴ���� double�� ��ȯ
		// �Ǽ��� ���� ��ȯ���� �ʽ��ϴ�. 
		// double avg = (double)(total / 3)
		double avg = (double) total / 3;
		
		// 3. ���/����/���� : ����� ���, ���� ����, ��Ʈ��ũ ���, ����Ʈ ���
		// - ó���������� ������ ������ ����ؿ� ���
		// %f�� �⺻������ �Ҽ��� ���� 6�ڸ����� ���
		System.out.printf("���� : %d, ��� : %f\n", total, avg);
	}

}