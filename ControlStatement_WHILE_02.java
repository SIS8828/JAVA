
import java.util.Scanner;

public class ControlStatement_WHILE_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ����ڰ� 100�� �Է��ҋ����� ����ؼ� �Է¹޴� ���α׷��� �ۼ��ϼ���.
		
		
		// for���� Ȱ���Ͽ� ���ѷ����� ó��
		// �ʱ�ȣ��, ���ǽ� ,������ �κ��� ����д�.
		for(;;) {
			System.out.print("�������Է��ϼ��� :");
			int input = sc.nextInt();
			if ( input == 100)
				break;
		}
		
		// while �ϰ��
		// ���ǽ� �κ��� true �����Ͽ� ó���մϴ�.
		while ( true ) {
			System.out.print("�������Է��ϼ��� :");
			int input = sc.nextInt();
			if ( input == 100)
				break;		}
		
		
	}

}
