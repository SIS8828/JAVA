
public class Variable_05_Array {

	public static void main(String[] args) {
		// �迭�� ����� ���� ���
		// 1. �迭 ������ ���� ��, ���� �迭 ������ �Ҵ� �޴� ��� 
		int [] arr1 = null;
		arr1 = new int[5];
		
		// 2. �迭 ������ ����� �迭�� ������ ���ÿ� ����
		int [] arr2 = new int[5];
		
		// HEAP �޸��� Ư¡
		// �迭�� HEAP �޸𸮿� new �����ڸ� ���ؼ� �����Ǹ�
		// HEAP �޸𸮿� �����Ǵ� ��� ������ 0 �Ǵ� 0.0, null
		// ������ �ʱ�ȭ�˴ϴ�.
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
		// 3. �迭�� �����ϸ鼭 ������ ������ �ʱ�ȭ�ϴ� ���
		// ũ�Ⱑ 5 �� �迭�� �����ϸ鼭,
		// �� ����� ���� 1,2,3,4,5 �� �ʱ�ȭ�ϴ� �ڵ�
		int [] arr3 = new int[] {1,2,3,4,5};
		System.out.println(arr3[0]);	// �迭�� ù��°��� �� Ȯ��
		System.out.println(arr3[4]);	// �迭�� ��������� �� Ȯ��
		
		int [] arr4 = {1,2,3,4,5};
		System.out.println(arr4[1]);	// �迭�� 2��°��� �� Ȯ��
		System.out.println(arr4[3]);	// �迭�� 4��°��� �� Ȯ��
	}

}











