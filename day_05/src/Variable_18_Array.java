
public class Variable_18_Array {

	public static void main(String[] args) {
		// ������ �迭�� length ������ �����ϴ� ���
		// 2���� �迭�� �ε����� 2�� ���Ǵ� �迭
		// 2���� �迭�� ���� ��ȯ���� �� �ִ� length �Ӽ���
		// 2���� �˴ϴ�.
		// (3���� �迭�� 3��)		
		int [][] arr = new int[2][3];
		
		// ������ �迭�� length �Ӽ��� 1���� �迭�� ������ ��ȯ�˴ϴ�.
		System.out.printf("arr.length -> %d\n", arr.length);
		// ������ �迭�� �� ��ҿ� ���ؼ� �ε��� �������� ������ ��,
		// length �Ӽ��� ����ϸ� �� ������ �迭�� ũ�Ⱑ ��ȯ�˴ϴ�.
		System.out.printf("arr[0].length -> %d\n", arr[0].length);
		System.out.printf("arr[1].length -> %d\n", arr[1].length);

		// ������ �迭�� ��ȸ�� �� �ִ� �ݺ���(length ���)
		// ���� �ε����� �����ϴ� �ܺ��� �ݺ���
		for( int i = 0 ; i < arr.length ; i++ ) {
			// ���� �ε����� �����ϴ� ������ �ݺ���
			for( int j = 0 ; j < arr[i].length ; j++ ) {
				arr[i][j] = i * j + 1;
				System.out.printf("arr[%d][%d] = %d\n", i, j, arr[i][j]);
			}
		}
	}

}

















