
public class Variable_20_Array {
	public static void main(String[] args) {
		// �迭�� ����
		// 1. ���� ���� 
		// - �迭�� ���¸� ����
		// - ���� �������� ���簡 �Ͼ�� ����
		// 2. ���� ����
		// - �迭�� ���� �� ���� �������� ����
		
		// 1���� �迭�� ����
		// 1���� �迭�� ���� ���縦 �����մϴ�.
		int [] arr1 = {1,2,3,4,5};
		System.out.print("arr1 : ");
		for( int i = 0 ; i < arr1.length ; i++ )
			System.out.printf("%d   ", arr1[i]);
		System.out.println();
		
		// clone �޼ҵ带 ����� �迭�� ����
		// �迭��.clone()
		// �ش� �迭������ ���۷���(����)�ϰ� �ִ� ����� �迭��
		// ���ο� ������ �����մϴ�.
		
		// arr2�� arr1 �迭�� ������ �迭�� �����ϴ� ����
		int [] arr2 = arr1.clone();
		
		System.out.print("arr1 : ");
		for( int i = 0 ; i < arr1.length ; i++ )
			System.out.printf("%d   ", arr1[i]);
		System.out.println();
		
		System.out.print("arr2 : ");
		for( int i = 0 ; i < arr2.length ; i++ )
			System.out.printf("%d   ", arr2[i]);
		System.out.println();
		
		// ������ �迭�� ��� ���� ������ �� ��,
		// ���� �����Ϳ� �Բ� ���
		// 1���� �迭�� ��� �������簡 �����Ǳ� ������
		// arr2�� ��� ���� �����Ͽ���, arr1�� �����Ϳ���
		// ������ ����(���� �и��� ����)
		arr2[1] = 222;
		
		System.out.print("arr1 : ");
		for( int i = 0 ; i < arr1.length ; i++ )
			System.out.printf("%d   ", arr1[i]);
		System.out.println();
		
		System.out.print("arr2 : ");
		for( int i = 0 ; i < arr2.length ; i++ )
			System.out.printf("%d   ", arr2[i]);
		System.out.println();
		
		arr1[1] = 0;
		
		System.out.print("arr1 : ");
		for( int i = 0 ; i < arr1.length ; i++ )
			System.out.printf("%d   ", arr1[i]);
		System.out.println();
		
		System.out.print("arr2 : ");
		for( int i = 0 ; i < arr2.length ; i++ )
			System.out.printf("%d   ", arr2[i]);
		System.out.println();

	}
}














