
import java.util.Scanner;

public class ControlStatement_SWITCH_04 {

	public static void main(String[] args) {
		// ����ڿ��� 1~ 12 ������ ������ �Է¹�������
		// �Էµ� ������ �ش�Ǵ� ���� ��¥���� ����ϼ���.
		// EX) 1~12
		// 		5����  '31'�� ���� �ֽ��ϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("1~12 ������ ������ �Է��ϼ���.");
		num = sc.nextInt();
		
		int day;
		
		switch(num) {
		case 12:
			day = 31; break;
		case 11:
			day = 30; break;
		case 10:
			day = 31; break;
		case 9:
			day = 30; break;
		case 8:
			day = 31; break;
		case 7:
			day = 31; break;
		case 6:
			day = 30; break;
		case 5:
			day = 31; break;
		case 4:
			day = 30; break;
		case 3:
			day = 31; break;
		case 2:
			day = 28; break;
		case 1:
			day = 31; break;
		
		default :
			day = -1 ;
		}
		if( day != -1)
			System.out.printf("�Էµ� �� %d�� '%d'�� ���� �ֽ��ϴ�.\n", num, day);
		else
			System.out.println("�߸��� �Է� ���Դϴ�. \n");
	}

}
