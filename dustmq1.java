import java.util.Scanner;

public class dustmq1 {

	public static void main(String[] args) {
		// 사용자에게 정수 한개를 입력받습니다.
		// 정수는 1000이상의 값만 입력받아야만 합니다.
		// 만약 1000미만의 값을 입력하는 경우 다시 입력받습니다.

		// 1000이상의 값이 올바르게 입력된 경우
		// 1~ 입력된값까지의 합계를 계산합니다.
		// 1에서 입력된 값까지 합계를 계산하면서
		// 합계의 값이 175의 배수로 3번째 판별된 경우 프로그램을 종료하고
		// 현재까지의 합계를 출력하세요

		Scanner sc = new Scanner(System.in);

		int x;
		for (;;) {
			System.out.println("정수를 입력해주세요(1000이상) : ");
			if ((x = sc.nextInt()) >= 1000)
				break;
		}
		int total = 0;
		int count = 0;
		for (int i = 1; i < x; i++) {
			total += i;
			if (total % 175 == 0)
				count++;
			if (count == 3)
				break;
		}
		System.out.printf("total = %d\n", total);
		System.out.println("프로그램종료");

	}

}
