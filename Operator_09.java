package day_02;

public class Operator_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���⿬����
		// ���ǽĿ� �ٶ� ���̳� ���� �б��� �� �ִ� ������
		// ���ǽ� ? ������ ���� ����� ��, ���� : ���ǽ��� ������ ����� ��, ����
		// ���ǽ��� ���� ������ ���� ��ȯ�� �� �ִ� ��
		// (����, �� �����ڸ� �����Ͽ� �ۼ�
		
		int number = 11;
		
		// String Ÿ���� ������ ���ڿ� ���� ������ �� �ִ�.
		String msg;
		msg = number % 2 == 0 ? "¦��" : "Ȧ��";
		
		System.out.printf("%d ������ '%s' �Դϴ�.\n",number,msg);
	}

}
