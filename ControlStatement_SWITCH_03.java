
import java.util.Scanner;

public class ControlStatement_SWITCH_03 {

	public static void main(String[] args) {
		// ����ڿ��� ���� ���� 3���� �Է¹޾�
		// ������ ����� ȭ�鿡 ���
		// ��� ������ �������� ����� ����ϼ���.
		// ����� ����ġ���� ����Ͽ� ó���ϼ���.
		
		Scanner sc = new Scanner(System.in);
		// 1. �Է�
		int num1, num2, num3 ;
		System.out.print("���� ����: ");
		num1 = sc.nextInt();
		System.out.print("���� ����: ");
		num2 = sc.nextInt();
		System.out.print("���� ����: ");
		num3 = sc.nextInt();
		
		// 2. ó��
		int total;
		double avg;
		char grade;
		total= num1 + num2 + num3;
		avg = (double) total / 3 ;
		
		String num;
		
		// avg = 99
		// avg / 10
		switch( avg < 0 || avg > 100 ? -1 : (int) avg/10 ) {
		case 10:
		case 9 :
			grade = 'A' ; break;
		case 8:
			grade = 'B' ; break;
		case 7:
			grade = 'C' ; break;
		case 6:
			grade = 'D' ; break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			grade = 'F' ; break;
		default:
			grade = '?';
		
		}
		// ���
		System.out.printf("������ %d, ���: %f\n",total, avg);
		if(grade != '?')
			System.out.printf("������ '%c' �Դϴ�.\n", grade);
		else
			System.out.println("���� ������ Ȯ���ϼ���.");
	}

}
