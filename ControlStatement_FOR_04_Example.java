import java.util.Scanner;

public class ControlStatement_FOR_04_Example {

	public static void main(String[] args) {
		// ����ڿ��� 3���� ������ �Է¹޾�
		// �Էµ� ������ �հ�, ���, �ִ밪, �ּҰ��� ����ϼ���.
		// ���� �Է��� �ݺ������� ó���ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		double avg;
		int max = 0, min = 0;
		
		for(int i = 1 ; i <= 3 ; i++ ) {
			System.out.printf("%d ��° ������ �Է��ϼ���: ", i);
			int temp = sc.nextInt();
			
			total += temp;
			
			// ù��° �Է� �����ͷ� �ִ밪�� �ּҰ��� ����
			if( i == 1) {
				max = min = temp;
			} else {
				if (temp > max )
					max = temp;
				if(min > temp)
					min = temp;
			}
		}
		
		avg = (double)total / 3;
		
		
		
		System.out.printf("total: %d\n", total);
		System.out.printf("avg: %.2f\n", avg);
		System.out.printf("max: %d\n", max);
		System.out.printf("min: %d\n", min);
	}

}
