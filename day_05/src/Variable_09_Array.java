import java.util.Scanner;
public class Variable_09_Array {
	public static void main(String[] args) {
		// 5 ������ ������ �Է¹޾�, ������ ����� ���
		Scanner sc = new Scanner(System.in);
		// ���� ������ �Է¹޾� �����ϱ� ����
		// �迭 ������ ����
		int [] score = new int[5];
		
		// ������ �����ϱ� ���� ����
		// �ݺ��� ���ο��� �����Ǳ� ������
		// 0 ���� �ʱ�ȭ�� ������
		int tot = 0;
		
		// �ݺ����� Ȱ���Ͽ� ������ �Է¹޴� �ڵ�
		// �ε����� ���� ����Ǹ鼭 �ٸ� ��ġ�� ��ҿ�
		// Ű����� �Էµ� �����Ͱ� ���Ե˴ϴ�.
		for( int i = 0 ; i < 5 ; i++ ) {
			System.out.printf("%d ��° ������ �Է��ϼ��� : ", i + 1);
			score[i] = sc.nextInt();	
			// �Էµ� �����͸� �迭�� ������ ��,
			// ���� ������ �����ϴ� �ڵ�
			tot += score[i];
		}	
		
		double avg = (double)tot / 5;

		System.out.printf("���� : %d ��, ��� %.2f ��\n", tot, avg);
		
		
	}
}
