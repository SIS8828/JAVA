
public class PrintMethods {

	public static void main(String[] args) {

		// �ڹ� ���α׷��� �⺻ ��� �޼ҵ�
		// (System.ot ��ü�� �����ϴ� �޼ҵ�)
		// �⺻ ��� ����� ���α׷��� �帧�� Ȯ���ϱ� ���� �뵵��
		// �����, ���� ����� ���� ����� ������ �� ���
		
		// 1. print �޼ҵ�
		// �Ű������� ���� ���� ���� ���
		// �ڵ� ���������� ����
		System.out.print("Hello ");
		// ���๮�� : \n
		// ���๮�ڰ� ���Ǹ� �ش� ��ġ���� Ŀ���� ���������� �̵�
		// \t 4ĭ�̵� \b �齺���̽�
		System.out.print("Wolrd/n");
		
		//println
		// �ڵ����� �����Ѵ�.
		System.out.println("hello");
		System.out.println("world");

		//3. printf �޼ҵ�
		// (print format �޼ҵ�
		// printf("���Ĺ��ڿ�", ��1,��2,...);
		// ���Ĺ��ڿ� ���ο��� ���Ǵ� ���� ����
		// %d : 10���� ������ ���� ���
		// %f : �ε��Ҽ���
		// %s : ���ڿ�
		// %b ; ������
		// %c : ���ڰ� ���
		System.out.printf("%d + %d -> %d/n", 10, 5, 15);
		System.out.printf("������ %d�� %d�� %c���� �Դϴ�.", 2, 25, '��');
	}

}
