package day_02;

public class ControlStatement_FOR_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// continue Ű����
		// if ���� ������ ù��° ���� ������������ �̵��ϴ� ���
		// ���� �ݺ����� �ǳ� �ٴ� ������� �ݺ��� ���ο����� ����� �� �ֽ��ϴ�. 
		
		for( int i = 1; i <= 10 ; i ++) {
			if( i == 6)
				continue;
			
			System.out.printf("i = %d\n", i);
		}
	}

}
