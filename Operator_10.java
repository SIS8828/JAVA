package day_02;

public class Operator_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ������ �� �ִ� gender ������ �����ϰ�,
		// gender ������ �ֹε�Ϲ�ȣ 7��° �ڸ��� ������ �ʱ�ȭ�ϼ���.
		// gender ������ ���� ���Ͽ�, ������ ����ϼ���

		int gender = 1;
		
		
		String sex;
		//sex = gender % 2 == 0 ? "����" : "����";
		sex = gender == 1 || gender == 3 ? "����":"����";
		System.out.printf("%d�� %s �Դϴ�.\n",gender,sex);
	}

}
