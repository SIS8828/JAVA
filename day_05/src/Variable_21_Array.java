
public class Variable_21_Array {
	public static void main(String[] args) {		
		// 2���� �迭�� ����
		int [][] arr1 = {{1,2,3}, {4,5,6}};
		
		System.out.println("arr1 : ");
		for( int i = 0 ; i < arr1.length ; i++ ) {
			for( int j = 0 ; j < arr1[i].length ; j++ )
				System.out.printf("%d   ", arr1[i][j]);
			System.out.println();
		}
		System.out.println();
		
		// �������迭(�������迭)�� clone �޼ҵ��� �����
		// ���� ������ �迭�� �����ϰ� �ִ� 2���� �迭���� �����մϴ�.
		// (2���� �迭�� ���ο� �ִ� 1���� �迭�� �������� ����)
		// (���¸� ����)
		int [][] arr2 = arr1.clone(); 
		
		System.out.println("arr1 : ");
		for( int i = 0 ; i < arr1.length ; i++ ) {
			for( int j = 0 ; j < arr1[i].length ; j++ )
				System.out.printf("%d   ", arr1[i][j]);
			System.out.println();
		}
		System.out.println();
		
		System.out.println("arr2 : ");
		for( int i = 0 ; i < arr2.length ; i++ ) {
			for( int j = 0 ; j < arr2[i].length ; j++ )
				System.out.printf("%d   ", arr2[i][j]);
			System.out.println();
		}
		System.out.println();
		
		// arr1 �� �����ϰ� �ִ� 1���� �迭�� ���� ����
		// ���� ����� ����� arr2�� ���� �����ϰ� �Ǹ�
		// arr1�� ����� ���� �����ϰ� ��
		arr2[1][0] = 400;
		
		System.out.println("arr1 : ");
		for( int i = 0 ; i < arr1.length ; i++ ) {
			for( int j = 0 ; j < arr1[i].length ; j++ )
				System.out.printf("%d   ", arr1[i][j]);
			System.out.println();
		}
		System.out.println();
		
		System.out.println("arr2 : ");
		for( int i = 0 ; i < arr2.length ; i++ ) {
			for( int j = 0 ; j < arr2[i].length ; j++ )
				System.out.printf("%d   ", arr2[i][j]);
			System.out.println();
		}
		System.out.println();
		
	}
}














