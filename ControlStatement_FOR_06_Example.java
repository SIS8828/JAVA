
import java.util.Scanner;

public class ControlStatement_FOR_06_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� ������ �Է¹޾� ���� ,����� ����Ͽ� ���
		// ����ڰ� ���Ḧ ���� ������ �ݺ�
		
		Scanner sc = new Scanner(System.in);
		
		for( ; ; ) {
			System.out.println("����ó���� �����մϴ�.");
			System.out.print("1��° ������ �Է��ϼ��� : ");
			int n1 = sc.nextInt();
			System.out.print("2��° ������ �Է��ϼ��� : ");
			int n2 = sc.nextInt();
			System.out.print("3��° ������ �Է��ϼ��� : ");
			int n3 = sc.nextInt();

			int total = n1 + n2 + n3;
			double avg = (double) total/ 3;
			
			System.out.printf("���� : %3d, ��� : %.2f\n", total, avg);

			System.out.print( "���α׷��� �����Ͻðڽ��ϴ�?(y/n) : ");
			// ���ڿ��� �Է¹��� Scanner Ŭ������ next �޼ҵ�
			String strExit = sc.next();
			// ���ڿ��� ���� ���ڰ��� ���� : char Ÿ���� ��ȯ 
			// 'y' �Ǵ� 'n' ��ȯ
			char isExit = strExit.charAt(0);
			// �ҹ��� y or �빮�� Y�� �Էµ� ��� �ݺ��� ����
			// ���α׷�����
			if (isExit == 'y' || isExit == 'Y')
				break;
		}
		
		System.out.println("���α׷� ����");
		
		
	}

}
