//switch ��
// ����/������ �����ϴ� ���� ����� �б��ϴ� ����

/* switch ( ���� / ������ ) {
  // ���: �ҽ��ڵ尡 �����ϵ� ��� �������� �ʴ� ��
    case �����1 :
    ���๮1;
    break;
   ...
   default:
   	���๮3;
   }
 */

import java.util.Scanner;

public class ControlStatement_SWITCH_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int menu = 1;

		System.out.print("�޴� ��ȣ�� �Է��ϼ��� (1~3) : ");
		menu = sc.nextInt();

		String output;
		// �Էµ� menu��ȣ�� ���Ͽ�
		// �и�ó���� �� �ִ� ����ġ�� �ۼ�
		switch (menu) {
		// switch�� ���޵� menu������ ������ �ִ�
		// ���� ��츦 case�� �ۼ�
		case 1:
			output = "����� �����߽��ϴ�.";
			break;
		case 2:
			output = "���ö��� �����߽��ϴ�.";
			break;
		case 3:
			output = "���������� �����߽��ϴ�.";
			break;
		case 4:

		default:
			output = "�޴���ȣ�� �߸� �����߽��ϴ�.";
		}
		System.out.println(output);

	}

}
