package day_02;

import java.util.Scanner;

public class ControlStatement_IF_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �α��� ���α׷�
		// ID�� �н������ ��� ����
		// �Էµ� ID �� �н������� ���� 3 �Ǵ� 5�� ����ΰ�� �α��� ����
		// �ƴ϶�� �α��ν���
		
		Scanner sc = new Scanner(System.in);
		
		
		// �Է�
		int id;
		int password;
		// int total ;
		System.out.print("ID�� �Է����ּ���.: ");
		id = sc.nextInt();
		System.out.print("��й�ȣ�� �Է����ּ���.: ");		
		password = sc.nextInt();
		
		// ó��
		boolean result;
		/* total = id + password;
		
		if (total % 3 == 0 || total % 5 == 0)
			result = true;
		else
			result = false;
		*/
		
		// boolean ������ Ȱ���� if �� �ۼ�
		boolean flag_1 = (id + password) % 3 == 0 ;
		boolean flag_2 = (id + password) % 5 == 0 ;
		boolean flag = flag_1 || flag_2;
		
		if( flag)
			result = true;
		else
			result = false;
		
		if(result)
			System.out.println("�α��μ���");
		else
			System.out.println("�α��ν���");
		
		
	}

}
