package day_02;

// ������
// �����ڴ� �ڹ� ���� ����� �� �ִ� ��ȣ���� ����
// ex) +,-,/,*,%,<,=<&
// �����ڿ� ���ԵǴ� �ǿ����ڿ� �������� ��ȯ���� Ȯ���ؾ� �մϴ�.


public class Operator_01 {

	public static void main(String[] args) {
		// ���������
		// +,-,*,/,%
		int n1 = 10;
		int n2 = 7;
		int result;
		
		result = n1 + n2;
		System.out.printf("%d %c %d = %d\n ", n1, '+',n2, result);
		
		result = n1 - n2;
		System.out.printf("%d %c %d = %d\n ", n1, '-',n2, result);
		result = n1 * n2;
		System.out.printf("%d %c %d = %d\n ", n1, '*',n2, result);
		result = n1 / n2;
		System.out.printf("%d %c %d = %d\n ", n1, '/',n2, result);
		System.out.printf("%d %c %d = %f\n ", n1, '/',n2, (float)n1 / n2);
	
		//%�� ������������
		// ¦�� / Ȧ�� �Ǵ�, ��� �Ǵ�
		result = n1 % n2;
		System.out.printf("%d %c %d = %d\n ", n1, '/',n2, result);
		
		// ������ ������ ��� ������ �Ͼ�� ��ȯ�Ǵ� ���� int Ÿ���� �˴ϴ�. �Ʒ��� ���� byte, short Ÿ���� ������
		// ��������� ����� ���Թ޴� ��� ������ ������ �߻��մϴ�.
		byte b1 = 10;
		byte b2 = 5;
		// �Ʒ��� ���� ������ ����� �����Ͽ� ������ �� �ִ�.
		byte b3 = (byte) (b1 + b2);
		
		
	}

}
