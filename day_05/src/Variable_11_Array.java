import java.util.Scanner;
public class Variable_11_Array {

	public static void main(String[] args) {
		// ����ڿ��� �迭�� ũ�⸦ �Է¹޾� �迭�� �����ϰ�,
		// �� ��ҿ� ���� �Է¹޾� ����/����� ����ϼ���.
		// �ִ밪, �ּҰ���  ����ϼ���.
		Scanner sc =  new Scanner(System.in);
		
		// �迭�� ũ�⸦ �Է¹޾�, �ش� ũ���� �迭�� ����
		int size;
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		size = sc.nextInt();
		
		int [] numbers = new int[size];
		
		// ������ �迭�� ũ�⸸ŭ �ݺ��� �����ϸ鼭
		// ���� �Է¹޴� �ڵ�
		for( int i = 0 ; i < numbers.length ; i++ ) {
			System.out.printf("%d ��° ���� ���� �Է� : ", i+1);
			numbers[i] = sc.nextInt();
		}
		
		int tot, max, min;
		double avg;
		// ����, �ִ밪, �ּҰ��� �迭�� ù��° ����� ���� ����
		tot = max = min = numbers[0];
		// �迭�� ù��° ����� ���� ���� �ڵ忡�� 
		// ����, �ִ밪, �ּҰ��� ���Ե� �����̹Ƿ�
		// �ε����� 1 ���� ����
		for( int i = 1 ; i < numbers.length ; i++ ) {
			tot += numbers[i];
			
			if( numbers[i] > max )
				max = numbers[i];
			
			if( min > numbers[i] )
				min = numbers[i];
		}
		avg = (double)tot / numbers.length;
		
		System.out.printf("�հ� : %d, ��� : %.2f\n", tot, avg);
		System.out.printf("�ִ밪 : %d, �ּҰ� : %d\n", max, min);
	}

}








