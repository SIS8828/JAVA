
import java.util.Scanner;

public class ControlStatement_FOR_02_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����ڿ��� 2���� ������ �Է¹޾�
		// 2���� ���� �� ���� ������ �����Ͽ�
		// ū�� ���� Ȧ���� ����ϼ���
		// 1��° ���� : 5
		// 2��° ���� : 10
		// ��� : 5, 7, 9

		// 1��° ���� :17
		// 2��° ���� : 7
		// ��� : 7, 9, 11, 13, 15, 17

		Scanner sc = new Scanner(System.in);

		int n1, n2;
		System.out.print("ù��°�� ������ �Է����ּ���: ");
		n1 = sc.nextInt();
		System.out.print("�ι�°�� ������ �Է����ּ���: ");
		n2 = sc.nextInt();
		
		// ó��
		// �Էµ� �ΰ��� ������ start(������), end(ū��)�� ����
		int start = n1 > n2 ? n2 : n1;
		int end = n1 > n2 ? n1 : n2;
		
		String output = "(";
		
		for( ; start <= end ; start ++ )
			if (start % 2 == 1)
				output += start +
				(start == end || start + 1 == end ? ")" : ",");
		
		System.out.printf("���: %s\n", output);
		
		/*
		if (num1 > num2) {
		for ( num1 ; num1 <= num2 ; num1 + 2)
			System.out.printf("i = %d\n", i);
			if( i % 2 == 0)
				System.out.printf("i = %d\n", i);
	} else
		for (num2 ; num2 <= num1 ; num2 + 2)
		*/
	}
}
