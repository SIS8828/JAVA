package day_02;

// Ű���� �Է��� ���� import ����
import java.util.Scanner;


public class ControlStatement_IF_06 {

	public static void main(String[] args) {
		// ����ڷκ��� 3���Ǽ��� ������ �Է¹޾�
		// ������ ����� ����ϼ���
		Scanner sc = new Scanner(System.in);


		int num1;
		int num2;
		int num3;
		
		System.out.println("3���� ������ �Է����ּ��� : ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		int total = num1 + num2 + num3 ;
		double avg = total / 3.0 ;
		

		System.out.printf("������ %d�̰�, ����� %f�Դϴ�.\n",total,avg);
		int num;
		
		System.out.print("������ �Է����ּ���: ");
		
		num = sc.nextInt();
		
		if( num >= 90)
			System.out.println("����� ������ A �Դϴ�.");
		else if( num >= 80)
			System.out.println("����� ������ B �Դϴ�.");
		else if( num >= 70)
			System.out.println("����� ������ C �Դϴ�.");
		else if( num >= 60)
			System.out.println("����� ������ D �Դϴ�.");
		else if( num < 0 || num > 100 )
			System.out.println("��ȿ���� ���� �� �Դϴ�.");
		else
			System.out.println("����� ������ F �Դϴ�.");
	}

}
