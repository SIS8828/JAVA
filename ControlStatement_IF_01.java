package day_02;

// ���
// ���๮�� �帧�� ������ �� �ִ� ����
// 1. �б⹮
// - ������ ����� ���� ���๮�� ������ �����ϴ� ����
// - if, switch
// 2. �ݺ���
// - ������ ����� ���� ���๮�� �ݺ� ������ ������ �� �ִ� ����
// - for, while, do ~ while

//if ��
// ���ǽ��� �������� ���� ���� ������ ����� ������ �б��� �� �ִ� ����
// ���⿬���ڴ� ���� �б�, if���� ���๮�� ���� ���θ� �б�
// if (���ǽ� - ���� �������� �и��� ��)
// if���� ���ǽ��� ���ϰ�� ������ ���๮
public class ControlStatement_IF_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number ;
		number = 17;
		
		if(number % 2 ==0)
			System.out.println("¦���Դϴ�.");
		if(number % 2 ==1)
			System.out.println("Ȧ���Դϴ�.");
		
		//�ֹε�Ϲ�ȣ�� 7��° �ڸ��� ����
		int gender = 4;
		
		//if ���� ����Ͽ� ����/���ڸ� ����ϼ���
		if(gender == 2 || gender == 4)
			System.out.println("�����Դϴ�.");
		if(gender == 1 || gender == 3)
			System.out.println("�����Դϴ�.");
		
		
		
		
		
	}

}
