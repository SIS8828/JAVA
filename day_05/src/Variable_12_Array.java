import java.util.Scanner;
public class Variable_12_Array {
	public static void main(String[] args) {
		// ����ڿ��� �迭�� ũ�⸦ �Է¹޾� �迭�� �����ϰ�,
		// �� ��ҿ� ���� �Է¹޾� �Էµ� ������ ������� ���� ����ϼ���.
		// 1. �迭�� ��� ���� ������������ ������ ��, ����ϼ���
		// 2. �迭�� ��� ���� ������������ ������ ��, ����ϼ���
		Scanner sc =  new Scanner(System.in);
	
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");	
		// Ű����� �Էµ� ������ ���� ����Ͽ� �迭�� ����
		int [] numbers = new int[sc.nextInt()];		
		
		for( int i = 0 ; i < numbers.length ; i++ ) {
			System.out.printf("%d ��° ���� ���� �Է� : ", i+1);
			numbers[i] = sc.nextInt();
		}
		
		// �Էµ� ������� ������ ����� ������ ���� ���
		System.out.println("���� ���� ������ ���");
		for( int i = 0 ; i < numbers.length ; i++ )
			System.out.printf("%d\t", numbers[i]);
		System.out.println();
		
		// �������� ����
		// �ܺ��� �ݺ����� ���� �����ϰ��� �ϴ� ��ġ�� �ε����� ����
		for( int i = 0 ; i < numbers.length - 1 ; i++ ) {
			// ������ �ݺ����� �ܺ��� �ݺ����� �ε��� ���� ��ġ���� �����Ͽ�
			// �迭�� ������ �ݺ��� �����ϸ鼭 ���� ��, ���� ��ȯ�� ����
			for( int j = i + 1 ; j < numbers.length ; j++ ) {				
				if( numbers[i] > numbers[j] ) {
					// SWAP ���� - �� ������ ���� ��ȯ
					// �ӽú��� temp�� i ��° ��ġ�� ���� ����
					int temp = numbers[i];
					// i ��° ��ġ�� j ��° ��ġ�� ���� ����
					numbers[i] = numbers[j];
					// j ��° ��ġ�� temp ���� ����
					numbers[j] = temp;
				}				
			}
		}		
		System.out.println("�������� ���� ���� ������ ���");
		for( int i = 0 ; i < numbers.length ; i++ )
			System.out.printf("%d\t", numbers[i]);
		System.out.println();
		
		// �������� ����
		// �ܺ��� �ݺ����� ���� �����ϰ��� �ϴ� ��ġ�� �ε����� ����
		for( int i = 0 ; i < numbers.length - 1 ; i++ ) {
			// ������ �ݺ����� �ܺ��� �ݺ����� �ε��� ���� ��ġ���� �����Ͽ�
			// �迭�� ������ �ݺ��� �����ϸ鼭 ���� ��, ���� ��ȯ�� ����
			for( int j = i + 1 ; j < numbers.length ; j++ ) {
				
				if( numbers[i] < numbers[j] ) {
					// SWAP ���� - �� ������ ���� ��ȯ
					// �ӽú��� temp�� i ��° ��ġ�� ���� ����
					int temp = numbers[i];
					// i ��° ��ġ�� j ��° ��ġ�� ���� ����
					numbers[i] = numbers[j];
					// j ��° ��ġ�� temp ���� ����
					numbers[j] = temp;
				}
				
			}
		}
		
		System.out.println("�������� ���� ���� ������ ���");
		for( int i = 0 ; i < numbers.length ; i++ )
			System.out.printf("%d\t", numbers[i]);
		System.out.println();
	}

}








