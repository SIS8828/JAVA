package day_02;

public class ControlStatement_IF_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if ~ else ����
		// if(���ǽ�)
		//     ���ǽ��� ���ϰ�� ���๮ ;
		// else
		// 		���ǽ��� ������ ��� ���๮ ;
		int number ;
		number = 17;
		
		if(number % 2 ==0)
			System.out.println("¦���Դϴ�.");
		else
			System.out.println("Ȧ���Դϴ�.");
		
		int gender = 4;
		
		if(gender == 2 || gender == 4)
			System.out.println("�����Դϴ�.");
		else
			System.out.println("�����Դϴ�.");
	}

}
