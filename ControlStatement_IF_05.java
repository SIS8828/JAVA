package day_02;

import java.util.Scanner;

public class ControlStatement_IF_05 {
	public static void main(String[] args) {
		//���ǽ��� �ټ����� ��� ó���� �� �ִ� if ���� ����
		// if (1��° ���ǽ�)
		// 		1���� ���ǽ��� ���ϰ�� ������ ����
		// else if(2��° ���ǽ�)
		// 		2��° ���ǽ��� ���ϰ�� ������ ����
		// ....
		// else
		//  	��繮���� ������ ��� ������ ����

	Scanner sc = new Scanner(System.in);
	
	int menu;
	
	System.out.println("1. �ѽ�");
	System.out.println("2. �Ͻ�");
	System.out.println("3. ���");
	System.out.println("�޴� ��ȣ�� �����ϼ��� : ");
	
	//����ڰ� �Էµ� ������ ���� ����
	
	menu = sc.nextInt();

	if( menu == 1)
		System.out.println("������ �ѽ��� �����");
	else if( menu == 2)
		System.out.println("������ �Ͻ��� �ʹ�");
	else if( menu == 3)
		System.out.println("������ ����� ������ũ");
	else
		System.out.println("�������� ���� ��ȣ");
	
	// �Էµ� �޴� ��ȣ�� ������ if���� ����Ͽ� ó���ϴ� ���
	
	/*
	if( menu == 1)
		System.out.println("������ �ѽ��� �����");
	if( menu == 2)
		System.out.println("������ �Ͻ��� �ʹ�");
	if( menu == 3)
		System.out.println("������ ����� ������ũ");
	*/
	
	
	}
}
