
public class Variable_15_Array {
	public static void main(String[] args) {
		// 2���� �迭�� ���� �� �ʱ�ȭ ���
		// 1. 2���� �迭�� ������ ������ ��, �迭�� �Ҵ�
		int [][] arr1;
		arr1 = new int[2][3];
		
		// 2. 2���� �迭�� ���� ����� ���ÿ� �迭�� �Ҵ�
		int [][] arr2 = new int[2][3];
		
		// 1���� �迭�� ���������� 2������ HEAP �޸𸮿� 
		// �����ǹǷ� �ʱ�ȭ ���� 0 �Դϴ�.
		System.out.println(arr1[0][0]);
		System.out.println(arr2[0][0]);
		
		// 3. 2������ �迭�� �迭�� �����ϸ鼭 �ʱ�ȭ�ϴ� ���
		// �ʱ�ȭ ���� �����ϴ� ���
		// { {1��° ���� �ʱ�ȭ ��}, {2��° ���� �ʱ�ȭ ��} ... }
		// 2�� 3���� 2���� �迭�� �����ϸ鼭
		// 1��° ���� ��� ���� 1,2,3 ����
		// 2��° ���� ��� ���� 4,5,6 ���� ����
		int [][] arr3 = new int[][] {{1,2,3},{4,5,6}};
		System.out.println(arr3[0][2]);
		System.out.println(arr3[1][1]);
		
		int [][] arr4 = {{1,2,3},{4,5,6}};
		System.out.println(arr4[0][2]);
		System.out.println(arr4[1][1]);
	}
}















