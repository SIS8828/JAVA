
public class Variable_22_Array {
	public static void main(String[] args) {		
		// 2���� �迭�� ����
		// 2���� �迭�� ���ؼ� clone �޼ҵ��� �����ϸ�
		// ���� ���簡 ����˴ϴ�.
		// (������ �迭�� ���簡 �ȵ�) 
		// 2���� �迭�� ���� ���縦 �����ϱ� ���ؼ���
		// ������ ������ �迭�� ���ؼ� clone �޼ҵ��� ȣ���� �ʿ���
		int [][] arr1 = {{1,2,3}, {4,5,6}};
		
		System.out.println("arr1 : ");
		for( int i = 0 ; i < arr1.length ; i++ ) {
			for( int j = 0 ; j < arr1[i].length ; j++ )
				System.out.printf("%d   ", arr1[i][j]);
			System.out.println();
		}
		System.out.println();
		
		// arr1�� ���¸� �����ϴ� clone �޼ҵ� ����
		int [][] arr2 = arr1.clone(); 
		
		// arr1�� ������ �迭���� �����ϴ� �������� ���� �ڵ�
		for( int i = 0 ; i < arr1.length ; i++ )
			arr2[i] = arr1[i].clone();
		
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














