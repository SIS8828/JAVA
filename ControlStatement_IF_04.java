package day_02;

// Ű�����Է��� ó���ϱ� ���ؼ� ������ import ��
import java.util.Scanner;

public class ControlStatement_IF_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ű���� �Է��� ���ؼ� ������ ����
		Scanner sc = new Scanner(System.in);
		
		int number;
		System.out.print("������ �Է��ϼ���: ");
		
		// Ű���忡�� �Էµ� ������ ���� int Ÿ������ �����ϴ� �޼ҵ�
		// int Ÿ���� �����ϴ� �޼ҵ�
		// nextInt : Ű���忡�� �Էµ� ���� ���� ����
		// nextDouble:�Ǽ���
		// next: ���ڿ�
		number = sc.nextInt();
		
		if (number % 2 == 0)
			System.out.printf("�ԷµȰ��� ¦���Դϴ�\n")
		else
			System.out.printf("�ԷµȰ��� Ȧ�� �Դϴ�.\n",);
	}
	

}
