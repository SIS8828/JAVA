
public class ControlStatement_FOR_10_Example_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������
		// ���� : ¦���ܸ�

		for (int i = 2; i < 10; i++) {
			
			// if( i % 2 ==1)
			//		continue;
			if (i % 2 == 0) {
				System.out.printf("<%d>���� ����մϴ�.\n", i);
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d X %d = %d\n", i, j, i * j);
				}
			}
			System.out.println();
		}

	}

}
