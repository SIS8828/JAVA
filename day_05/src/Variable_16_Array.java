
public class Variable_16_Array {

	public static void main(String[] args) {
		// 2���� �迭�� �ݺ���
		// 2���� �迭�� ��� ���� ��Ÿ���� 2���� �ε����� ����ϴ� �迭
		// ��ø�� ������ �ݺ����� ����Ͽ� 2������ �� ��Ҹ� ������ �� ����
		int [][] arr = new int[3][5];
		
		int value = 1;
		// 2���� �迭�� ���� �����ϱ� ���� �ܺ��� �ݺ���
		for( int i = 0 ; i < 3 ; i++ ) {
			
			// 2���� �迭�� �� ���� ���� �����ϱ� ���� ������ �ݺ���
			for( int j = 0 ; j < 5 ; j++ ) {
				
				arr[i][j] = value++;				
				System.out.printf("%d\t", arr[i][j]);
			}
			
			System.out.println();
		}

	}

}




