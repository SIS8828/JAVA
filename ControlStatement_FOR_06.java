
import java.util.Scanner;

public class ControlStatement_FOR_06 {

	public static void main(String[] args) {
		// ����ڰ� 100�� �Է��ϸ� ���ϸ������� �����ϼ���.
		// 100�� �Է����� ������ ����ؼ� �Է��� �䱸�մϴ�. 
		Scanner sc = new Scanner(System.in);
		// for���� Ȱ���� ���ѷ��� �ڵ�
		// for ������ ���ο��� break�� Ȱ������ ������ ������� ���� �ݺ���
		for (  ;  ;  ) {
			System.out.println("������ �Է�(100�� �Է��ϸ� ���α׷� ����)");
			int temp = sc.nextInt();
			
			if( temp == 100)
				break;
		}
		
		System.out.println("���α׷�����");
	}

}
