package day_02;

public class Operator_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���Կ�����
		// ������ ���׿� ������ �Ŀ� ������ ���� ��ȯ�մϴ�.

		int num;
		num = 10;
		System.out.printf("num = %d\n", num);

		num = 10 + 5;
		System.out.printf("num = %d\n", num);

		// ���� �����ڴ� ������ ���� ���׿� ������ ��, ���� ��ġ�� ������ ���� ��ȯ ��ŵ�ϴ�.
		System.out.println(num = 77);

		// num ������ 100�� ���Ѱ���� ������ �� 200 �̻����� Ȯ���ϼ���.
		/*
		 * num = num *100 ; boolean result = num >= 200 ; System.out.println(result);
		 * 
		 * System.out.println((num = num * 100)>= 200);
		 */

		System.out.println((num = num * 100) >= 200);

		// ������ ������ ���Կ�����
		// �ڱ� �ڽſ� ���� ������ ����� ���Թ޴� ���
		// �ߺ��Ǵº����� �̸��� ������ �� �ִ� ���

		// num ������ ���� 10�����Ͽ� ����
		num = num + 10;
		num += 10;
		
		
		
	}

}
