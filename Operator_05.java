package day_02;

public class Operator_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ����/���� ������
		// ����/���� ������
		// ++/-- ������ �� �Ǵ� �ڿ� ��ġ
		// ������ ���� ��� ���� ������ ���ϰ�� ����
		
		
		// ���� ����/���� �����ڴ� �������� ���� ������ 1�� ���缭�����մϴ�. 
		//e ex) x = x+ 1 x�� 1������ ������ x�� 1�� �������ִ�.
	
		int num1 = 10;
		int num2 = num1++;
		
		System.out.printf("num1 = %d, num2 = %d\n",num1,num2);
		
		// ������ ��� �����Ѵ�.
		
		int num4 = 100;
		int num5 = ++num4;
		
		System.out.printf("num4 = %d, num5 = %d\n",num4,num5);

		// 10 12 12 12 12
		
		int temp = 10;
		System.out.printf("%d %d %d %d %d\n",
				temp++, ++temp, temp--, ++temp, temp++);

	}

}
