
public class ControlStatement_FOR_03 {

	public static void main(String[] args) {
		// �ݺ��� ���� ���ǻ���
		// Ư���������� ����� ������ 
		// �ش翵���� ������ ����Ǹ� ��� �Ҹ�Ǵ� �����Դϴ�.
		int outer = 10;
				
		// for���� �ʱ�ȭ �������� ������ inner������
		// �ش� for �������� ����� ������ �����Դϴ�.
		for(int inner = 1 ; inner <= 10 ; inner ++)
			System.out.printf("%d, %d\n", outer, inner);
		
		System.out.println("�ݺ��� ����");
		
		// for���� ����� ���Ŀ��� for������ �����
		// inner ������ ����� �� ����. 
		
		// ������ �̸��� ������ ������ ������.
		// int outer = 20;
		
		// ���� �ݺ������� ������ inner ������ �̹� �Ҹ�� �����̹Ƿ�
		// ���ο� �ݺ������� ������ �̸��� ������ ����� �� �ֽ��ϴ�.
		for(int inner = 1 ; inner <= 10 ; inner ++)
			System.out.printf("%d, %d\n", outer, inner);
		
	}

}
