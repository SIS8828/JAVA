
import java.util.Scanner;

public class ControlStatement_FOR_06_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������� ������ �Է¹޾� ���� ,����� ����Ͽ� ���
		// ����ڰ� ���Ḧ ���� ������ �ݺ�
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("1������ ������ �Է����ּ���: ");
			int n1 = sc.nextInt();
			System.out.println("2������ ������ �Է����ּ���: ");
			int n2 = sc.nextInt();
			System.out.println("3������ ������ �Է����ּ���: ");
			int n3 = sc.nextInt();
			int total = n1 + n2 + n3;
			double avg = (double) total / 3;
			System.out.printf("����: %d, ���:%f ",total, avg);
			System.out.print( "���α׷��� �����Ͻðڽ��ϴ�?(y/n) : ");
			String strExit = sc.next();
			char isExit = strExit.charAt(0);
			if (isExit == 'y' || isExit == 'Y')
				break;
						
		}
		System.out.println("���α׷� ����");
	}

}
