
import java.util.Scanner;

public class ControlStatement_DO_WHILE_02 {

	public static void main(String[] args) {
		// do~while �ݺ����� Ȱ���Ͽ�
		// ����ڰ� 100�� �Է��� �� ���� �ݺ��ؼ� �Է¹�������.
		
		Scanner sc = new Scanner(System.in);

		int input;
		do {
			System.out.print("���ڸ� �Է����ּ���: ");
			input = sc.nextInt();
		} while( input != 100 ); // do~while�ݺ��� ���ǽ� ���� ;�ٿ��ߵ�
		
		System.out.println("���α׷�����");
	}

}
