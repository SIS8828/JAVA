import java.util.Scanner;
public class Variable_08_Array {
	public static void main(String[] args) {
		// 3 ������ ������ �Է¹޾�, ������ ����� ���
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.printf("1 ��° ������ �Է��ϼ��� : ");
		n1 = sc.nextInt();
		System.out.printf("2 ��° ������ �Է��ϼ��� : ");
		n2 = sc.nextInt();
		System.out.printf("3 ��° ������ �Է��ϼ��� : ");
		n3 = sc.nextInt();
		
		int tot = n1 + n2 + n3;
		double avg = (double)tot / 3;
		
		System.out.printf("�Էµ� ���� : %d, %d, %d\n", n1, n2, n3);
		System.out.printf("���� : %d ��, ��� %.2f ��\n", tot, avg);
		
		
	}
}
