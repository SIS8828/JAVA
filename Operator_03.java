package day_02;

public class Operator_03 {

	public static void main(String[] args) {
		// ��������
		// &&(and), !(not), ||(or)
		// �ټ����� ������� �����Ͽ� �ϳ��� �θ� ���� ��ȣ���ϴ� ������
		
		// AND ������ (&&)
		System.out.printf("%b %s %b = %b\n",
				false, "&&", false, false && false);
		System.out.printf("%b %s %b = %b\n",
				false, "&&", true, false && true);
		System.out.printf("%5b %s %5b = %b\n",
				true, "&&", false, true && false);
		System.out.printf("%5b %s %5b = %b\n",
				true, "&&", true, true && true);
		
		// or ������ (||)
		System.out.printf("%b %s %b = %b\n",
				false, "||", false, false || false);
		System.out.printf("%b %s %b = %b\n",
				false, "||", true, false || true);
		System.out.printf("%5b %s %5b = %b\n",
				true, "||", false, true || false);
		System.out.printf("%5b %s %5b = %b\n",
				true, "||", true, true || true);

		// NOT������(!)
		// ���׿�����(�ǿ����� 1��)
		// ����� ����� �����Ͽ� ��ȯ
		// true ->false, false -> true
		
		System.out.printf("!%5b = %b\n",false, !false);
		System.out.printf("!%5b = %b\n",true, !true);
		
		int number = 18;
		
		// number ������ ���� ¦���� ���� Ȯ���Ͽ� ����� ����ϼ��� 
		// true / false�� ���� ���
		boolean result = number % 2 == 0;
		System.out.printf("result = %b\n",result);
		
		//number ������ ���� ¦���̸鼭 10���� ū ������
		// Ȯ���ϸ鼭 ����ϼ�
		// ��/��������
		
		boolean result2 = number % 2 == 0 && number > 10 ;
		System.out.printf("result2 = %b\n",result2);
		
	}

}
