import java.util.Scanner;
public class Variable_10_Array {
	public static void main(String[] args) {
		// �迭�� ũ��� ���α׷����� �߿��� �����Դϴ�.
		// �迭�� ũ�⿡ ���� �ݺ��� Ƚ����, Ư�� �ε����� ���� 
		// �����ϴ°���
		// ���÷� �ٲ�� �����Դϴ�.
		// �迭�� �̷��� ������ �ذ��ϱ� ���� length ��� �Ӽ���
		// �����մϴ�.
		// �迭���̸�.length -> �迭�� ũ�Ⱑ ���� Ÿ������ ����
		
		// 5 ������ ������ �Է¹޾�, ������ ����� ���
		Scanner sc = new Scanner(System.in);

		int [] score = new int[3];
		int tot = 0;
		
		// score �迭�� ũ�Ⱑ 5�̹Ƿ�, 
		// score.length -> 5�� ó���Ǿ� ����˴ϴ�.
		for( int i = 0 ; i < score.length ; i++ ) {
			System.out.printf("%d ��° ������ �Է��ϼ��� : ", i + 1);
			score[i] = sc.nextInt();
			tot += score[i];
		}	
		
		double avg = (double)tot / score.length;

		System.out.printf("���� : %d ��, ��� %.2f ��\n", tot, avg);
		
		
	}
}
