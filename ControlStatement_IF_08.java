import java.util.Scanner;

public class ControlStatement_IF_08 {

	public static void main(String[] args) {

		// 제어문의 중첩된 활용
		// 모든 제어문들은 중첩되서 사용할 수 있다.
		// 제어문 내부에 다른 제어문이 위치할 수 있음.

		// 로그인 프로그램
		// ID와 패스워드는 모두 정수
		// 입력된 ID가 3의 배수이고 패스워드가 5의 배수인경우 로그인 성공
		// 아니라면 로그인실패

		Scanner sc = new Scanner(System.in);

		// 입력
		int id;
		int password;
		System.out.print("ID를 입력해주세요.: ");
		id = sc.nextInt();
		System.out.print("비밀번호를 입력해주세요.: ");
		password = sc.nextInt();

		// 처리

		// id 조건
		boolean flag_1 = id % 3 == 0;
		// 패스워드 조건
		boolean flag_2 = password % 5 == 0;

		String loginResult;
		if (flag_1) {
			// id조건이 되는 참
			if (flag_2) {
				// 패스워드 조건의 참
				loginResult = "login 성공";
			} else {
				// password 조건이 거짓
				// ID의 조건은 만족한 상태
				loginResult = "패스워드를 확인하세요";
			}
		} else {
			// id 조건이 거짓
			loginResult = "ID를 확인하세요.";
		}
		System.out.println(loginResult);
	}
}