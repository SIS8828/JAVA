import java.util.Scanner;

public class Variable_17_Array {
	public static void main(String[] args) {
		// 3���� �л� ������ ó���� �� �ִ� ���α׷��� �ۼ��ϼ���. 
		// ������ 5�����̸�, ����ڰ� �Է��� ������ �����մϴ�.
		// �Է��� ���� �Ŀ��� �� �л��� ������ ����� ����ϼ���.
		
		Scanner sc =  new Scanner(System.in);
		int [][] score = new int[3][5];
		
		// �л��� �ε����� �����ϴ� �ܺ��� �ݺ���
		for( int i = 0 ; i < 3 ; i++ ) {
			System.out.printf("%d ��° �л� ������ �Է¹޽��ϴ�.\n", i+1);			
			// �� �л��� ���� �ε����� �����ϴ� �ݺ���
			for( int j = 0 ; j < 5 ; j++ ) {
				System.out.printf("%d ��° �л��� %d ��° ������ �Է� : ",i+1, j+1);
				score[i][j] = sc.nextInt();
			}			
		}
		
		// �л��� �ε����� �����ϴ� �ܺ��� �ݺ���
		for( int i = 0 ; i < 3 ; i++ ) {
			System.out.printf("%d ��° �л� ���� ������ ����մϴ�.\n", i+1);
			int tot = 0;	// �� �л��� ����
			double avg;		// �� �л��� ���
			// �� �л��� ���� �ε����� �����ϴ� �ݺ���
			for( int j = 0 ; j < 5 ; j++ ) {
				tot += score[i][j];
			}
			avg = (double)tot / 5;
			System.out.printf("%d ��° �л��� ", i+1);
			System.out.printf("������ %d ��, ����� %.2f �� �Դϴ�.\n", tot, avg);
		}
		
	}
}





