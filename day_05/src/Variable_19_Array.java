
public class Variable_19_Array {

	public static void main(String[] args) {
		// ���� �ٸ� ũ���� 1���� �迭�� �����ϴ� 2���� �迭
		// �ڹٿ��� ���Ǵ� ������ �迭�� ���� �ٸ� ũ���� ���� �迭��
		// ������ �� �ֽ��ϴ�.
		
		// 2���� �迭 ���� ����
		int [][] arr;
		
		// 1���� �迭�� �����ϴ� 2���� �迭�� ����
		// (1���� �迭�� �������� ����)
		arr = new int[3][];
		
		// 2���� �迭�� �� ��ҵ鿡��
		// ���� ���ָ� �����ϴ� ������ �迭�� �Ҵ�
		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[2];
		
		int value = 100;
		for( int i = 0 ; i < arr.length ; i++ ) {
			for( int j = 0 ; j < arr[i].length ; j++ ) {
				arr[i][j] = value++;
				System.out.printf("arr[%d][%d] = %d\n", i, j, arr[i][j]);
			}
			System.out.println();
		}

	}

}










