
import java.util.Scanner;
public class ControlStatement_FOR_10_Example_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ��ø�� �ݺ����� ȣ����Ͽ� �л��� ������ ó���ϴ� ���α׷��� �ۼ��ϼ���
		// �л����� �Է��ϼ��� : 3
		// ������� �Է��ϼ��� : 3
		// 1��° �л��� 1��° ������ �Է��ϼ��� : 100
		// 1��° �л��� 2��° ������ �Է��ϼ��� : 100
		// 1��° �л��� 3��° ������ �Է��ϼ��� : 100
		// 1��° �л��� ������ 100��, ����� 100.00�� �Դϴ�.
		// 2��° �л��� 1��° ������ �Է��ϼ��� : 100
		// 2��° �л��� 2��° ������ �Է��ϼ��� : 100
		// 2��° �л��� 3��° ������ �Է��ϼ��� : 100
		// 2��° �л��� ������ 100��, ����� 100.00�� �Դϴ�.
		// 3��° �л��� 1��° ������ �Է��ϼ��� : 100
		// 3��° �л��� 2��° ������ �Է��ϼ��� : 100
		// 3��° �л��� 3��° ������ �Է��ϼ��� : 100
		// 3��° �л��� ������ 100��, ����� 100.00�� �Դϴ�.
		
		//1 �Է�
		int students, subjects;
		System.out.print("�л����� �Է��ϼ��� : ");
		students = sc.nextInt();
		System.out.print("������� �Է��ϼ��� : ");
		subjects = sc.nextInt();
		
		// 2. ó��
		
		for (int i = 1 ; i <= students ; i++ ) {
			// 2-1. �Է�
			int total = 0;
			double avg;
			for(int j = 1 ; j <= subjects; j ++) {
				System.out.printf("%d��° �л��� %d��° ������ �Է��ϼ��� :", i,j);
				total += sc.nextInt();
				
			}
			avg = (double) total / subjects;
			// 2-2 ���
			System.out.printf("%d��° �л��� ������ %d��, ����� %f�� �Դϴ�. \n",i,total,avg);
			
			
		}	
		/*
		int student;
		System.out.print("�л����� �Է��ϼ��� : ");
		student = sc.nextInt();
		int object;
		System.out.print("������� �Է��ϼ��� : ");
		object = sc.nextInt();
		int n1;
		int n2;
		int n3;
		for( int i = 1; i < student; i++) {
			for(int j =1 ; j < object; j++) {
				System.out.printf("%d��° �л��� %d��° ������ �Է��ϼ���: \n",i,j);
				n1 = sc.nextInt();
			
			}
			 
		}
		*/
		System.out.println("���α׷�����.");
		
	}

}
