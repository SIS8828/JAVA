package day_02;

public class Variable_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�پ��� Ÿ���� ���� �ʱ�ȭ ���
		// ����Ÿ��
		// ����Ÿ�� : �ϳ��� ����
		// ���ڿ��� �����ϱ� ���Ͽ� ''�� ���
		// (""�� ���ڿ��� �ǹ�)
		char ch = 'A';
		System.out.printf("ch -> %c\n",ch);
		System.out.printf("ch -< %d\n", (int)ch);
		//������ �������� �����ϱ� ���ؼ� ����ȯ
		// ����ȯ : ������ Ÿ���� �����ϴ� ����
		//System.out.println("A-> %d, a -> %d\n, (int)'A',(int)'a'");
		
		//��ҹ��� ��ȯ
		// �빮�� A ���� 32�� ���Ͽ� �ҹ��� a�� ����
		
		System.out.printf("ch -> %c\n", ch + 32);
		// �ҹ��� a�� �빮�� A ������ ������ ������ �빮�ڸ� �ҹ��ڷ� ����
		System.out.printf("ch -> %c\n", ch + ('a' - 'A'));
		
		// �Ǽ��� ������ �ʱ�ȭ
		// �ڹٿ����� ��� �Ǽ��� double Ÿ������ �����մϴ�.
		// 8byte�� ó��
		// float Ÿ������ �Ǽ��� �����ϱ� ���ؼ� float �� �Ǽ��� �����ؾ� �մϴ�.
		// �Ǽ��� f, �Ǥ��� F -> 4byte ũ���� �Ǽ��� ó��
		// �Ʒ��� �ڵ�� 8byte ũ��� double���� float �����ϴ� �ڵ� (����)
		
		//float f = 1.1 ;
		// float f = 1.1F ;
		float f = (float)1.1;
		// ����ȯ�� ����� float Ÿ�� ������ �ʱ�ȭ
		
	}

}
