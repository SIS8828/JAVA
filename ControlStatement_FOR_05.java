
public class ControlStatement_FOR_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break Ű����
		// �ݺ����� switch ���� ���ο��� ����� �� �ִ� Ű����
		// ���� ����ǰ� �ִ� ù��° ������ ���������� ���
		// break�� ���ΰ� �ִ� ù��° ����{}�� if���� ��� ����
		// if���� ������ ù��° ������ ���������� ���
		
		for (int i = 1 ; i <= 10 ; i++) {
			if ( i ==5) {
				// break Ű���带 ���ΰ� �ִ� if ���� ������
				// ù��° ����( for��)�� ���������� ���
				// - �ݺ��� �����ϴ� ���
				
				break;
			}
			
			
			System.out.printf("i = %d\n",i);
			
		}
	}

}
